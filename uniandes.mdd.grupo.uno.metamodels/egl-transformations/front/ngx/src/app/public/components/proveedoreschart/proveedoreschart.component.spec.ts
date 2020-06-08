import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { CUSTOM_ELEMENTS_SCHEMA } from "@angular/core";

import { HttpClientModule } from '@angular/common/http';
import { NbToastrService, NbDialogService } from '@nebular/theme';



import { ProveedoresChartComponent } from './proveedoreschart.component';

describe('ProveedoresChartComponent', () => {
  let component: ProveedoresChartComponent;
  let fixture: ComponentFixture<ProveedoresChartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProveedoresChartComponent ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
      imports: [HttpClientModule, NbToastrService, NbDialogService],
      providers: [NbToastrService, NbDialogService],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProveedoresChartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
