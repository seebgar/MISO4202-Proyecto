import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";
import Chart from "chart.js";

 	
@Component({
  selector: "app-proveedoreschart",
  template: `<canvas id="proveedoreschart" style="width: 100%;"></canvas>`,
  //styleUrls: ["./proveedoreschart.component.scss"],
})

export class ProveedoresChartComponent implements OnInit, OnDestroy {
  /* Manejo de Usuario */
  public user: any = {};

  /* Titulo en HTML */
  public titulo = "ProveedoresChart";

  /* Indica el estado de carga */
  public cargando: boolean = false;

  /* API Routes */
  readonly API_ALL: string = "api/proveedoreschart";

  /* Observables - Async */
  public allObervable: Observable<any>;

  /* Manejo de subscripcion para evitar Memory Leaks */
  // disclamer: HTTP Request manejan su propio unsubscribe por lo que no generan leaks.
  public subscriptions: Subscription[] = [];

  /* Atributos del gr�fico */
  public chart: any;
  public data: {};
  public options: any;
  
  public totalLabels:Number

  /* Objeto creado a partir de un Form */
  public objetoCreado: any = {};

  /* Referencia al chart en HTML */
  @ViewChild("proveedoreschart", { static: true }) chartRef: ElementRef;

  /* Dialog que se encuentra abierto */
  public dialogActivo: any;
  
  constructor(
    private authService: AuthService,
    private mainService: MainService,
    private toastrService: NbToastrService,
    private dialogService: NbDialogService,
    private router: Router
  ) { }

  ngOnInit() {
    this.user = this.authService.user;

    if (this.isAdmin()) {
      this.getAll();
    }
    this.generateData();
    this.generateChart();
  }

  ngOnDestroy() {
    this.subscriptions.forEach(subs => subs.unsubscribe());
  }

  // =================================
  // Metodos
  // ================================

  /**
   * Verifica si el usuario en sesi�n tiene
   * permisos de administrador
   * @returns {boolean}
   */
  public isAdmin(): boolean {
    return true;
  }

  /**
   * Organiza por fecha de creadcion en el servidor
   * @param a primer objeto
   * @param b segundo objeto
   */
  private sortCreatedAt(a, b): number {
    const dateA: Date = a ? new Date(a.createdAt) : new Date();
    const dateB: Date = b ? new Date(b.createdAt) : new Date();
    return dateB.getTime() - dateA.getTime();
  }

  // =================================
  // Metodos Handlers
  // ================================

  /**
   * De abrir el dialog que le permite al usuario
   * registar un nuevo objeto
   * @returns void
   */
  public handleModalAgregar(): void {
    this.showDialog({ dialog: this.dialogAgregar });
  }

  /**
   * Muestra un mensaje cuando el servidor responde NULL
   */
  private handleResponseNull(): void {
    this.showToastr({
      title: "No se ha establecido una conexi�n con el servidor.",
      status: "basic",
    });
  }

  /**
   * Muestra un mensaje con el error
   * @param {any} error generado por el request
   */
  private handleError({ error }: { error: any }): void {
    this.showToastr({
      title: "Se han encontrado errores.",
      status: "warning",
      message: error.message || error || "not found",
    });
  }

  /**
   * Muestra un mensaje de success
   * @param {string} title del mensaje
   */
  private handleSuccess({ title }: { title: string }): void {
    this.showToastr({
      title: `${title}`,
      status: "success",
    });
  }

  // =================================
  // Metodos CRUD
  // ================================

  /**
   * Obtiene los objeto del servidor
   * @returns void
   */
  private getAll(): void {
    this.cargando = true;

    this.allObervable = this.mainService.get({
      api: this.API_ALL,
    });

    const subs = this.allObervable.subscribe(
      response => {
        if (response) {
          if (response.errors) {
            this.handleError({ error: response.errors });
          } else {
            const objetos = response as any[];
            this.source.load(objetos.sort(this.sortCreatedAt));
          }
        } else {
          this.handleResponseNull();
          this.source.load([]);
        }
      },
      error => {
        this.handleError({ error });
        this.cargando = false;
        this.source.load([]);
      },
      () => {
        this.cargando = false;
      }
    );

    this.subscriptions.push(subs);
  }

 //Construye el grafico a partir de un camvas que se establece en el HTML
  private generateChart(): void {
    const graph = this.chartRef.nativeElement.getContext("2d");
    this.chart = new Chart(graph, {
      type: "pie",
      data: this.data,
      options: this.chartOptionsPie(),
    });
  }
  
 // Actualiza la informacion de la chart se le asignan nuevos labels globalmente se mantienen los datasets que se mostraran
  private updateChartData(): void {
    // asignacion de nuevos valores - falta
    this.chart.update();
  }
  

 
// Configuracion del chart pie
  private chartOptionsPie(): {} {
    return{
    	responsive: true,
        legend: {
        	position: "bottom",
        	labels: {
          		fontColor: "#2d3436",
        	},
      	},
    }; 
  }

// Generar data para el chart
  private generateData(): void {
    this.data = {
      labels: ["""org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3501279b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@68bb5720 (name: Label) (instanceClassName: null) (abstract: false, interface: false))"],
      datasets: [
        {
          label: "Ordenes",
          data: [
            this.random(),
          ],
          borderColor: "#FFFFFF",
          backgroundColor: "#000080",
          fill: false,
          borderDash: [1, 1],
          pointRadius: 8,
          pointHoverRadius: 10,
        },
        {
          label: "Ordenes",
          data: [
            this.random(),
          ],
          borderColor: "#FFFFFF",
          backgroundColor: "#000080",
          fill: false,
          borderDash: [1, 1],
          pointRadius: 8,
          pointHoverRadius: 10,
        },
      ]; 
    };
  }  
  
  // =================================
  // Metodos Genericos
  // ================================
 
 
  /**
   * Filtra la Samrt Table de modo que solo se muestren las entradas
   * que contienen los caracteres buscados
   * @param  {string=""} query cadena de caracteres a buscar
   * @returns void
   */
  public onSearch({ query }: { query: string }): void {
    if (!query) this.source.reset();
    else {
      this.source.setFilter(
        [
          {
            field: "nombre",
            search: query,
          },
        ],
        false
      );
    }
  }

  /**
   * Muestra una notificacion estilo Toastr en la pantalla actual
   * @param  {string} position determina en que parte de la pantalla se representar� el Toastr
   * @param  {any} title titulo del Toastr
   * @param  {any} message contenido del Toastr
   * @param  {any} status puede ser (basic, primary, success, info, warning, danger, control)
   * @returns void
   */
  private showToastr({
    position,
    title,
    message,
    status,
  }: {
    position?: any;
    title: string;
    message?: string;
    status: any;
  }): void {
    let realPosition = position ? position : "top-end";
    let realMessage = message ? message : "";
    let duractionMilisec = 4500;
    this.toastrService.show(`${realMessage}`, `${title}`, {
      position: realPosition,
      status,
      duration: duractionMilisec,
    });
  }

  /**
   * Se encarga de navegar a la URL especificada
   * @param {string} path -> "/dashboard/inventario/:id"
   * @return void
   */
  public routerNavigateTo({ path }: { path: string }): void {
    this.router.navigate([path]).then(fulfilled => {
      if (!fulfilled) {
        this.showToastr({
          title: "Direcci�n URL no v�lida.",
          status: "basic",
        });
      }
    });
  }

  /**
   * Abre un dialogo estilo nebular
   * @param  {any} dialog referencia al template en html
   * que contiene el dialogo. Deber�a der tipye ElementRef o TypeReference
   * @returns void
   */
  public showDialog({ dialog }: { dialog: any }): void {
    this.dialogActivo = this.dialogService.open(dialog, { context: "" });
  }
}