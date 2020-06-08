/**
 */
package empresa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see empresa.EmpresaFactory
 * @model kind="package"
 * @generated
 */
public interface EmpresaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "empresa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ProyectoGrupo1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProyectoGrupo1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmpresaPackage eINSTANCE = empresa.impl.EmpresaPackageImpl.init();

	/**
	 * The meta object id for the '{@link empresa.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.CompanyImpl
	 * @see empresa.impl.EmpresaPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 0;

	/**
	 * The feature id for the '<em><b>Dashboards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__DASHBOARDS = 0;

	/**
	 * The feature id for the '<em><b>DB Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__DB_SERVERS = 1;

	/**
	 * The feature id for the '<em><b>Nit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.DashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.DashboardImpl
	 * @see empresa.impl.EmpresaPackageImpl#getDashboard()
	 * @generated
	 */
	int DASHBOARD = 1;

	/**
	 * The feature id for the '<em><b>Panels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__PANELS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.PanelImpl
	 * @see empresa.impl.EmpresaPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.ElementImpl
	 * @see empresa.impl.EmpresaPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.TableImpl
	 * @see empresa.impl.EmpresaPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Registers Per Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REGISTERS_PER_PAGE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ACTIONS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SEARCH = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ADD = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.GraphicImpl <em>Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.GraphicImpl
	 * @see empresa.impl.EmpresaPackageImpl#getGraphic()
	 * @generated
	 */
	int GRAPHIC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__TITLE = ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__DATA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__LEGEND_POSITION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__LABELS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.DBServerImpl <em>DB Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.DBServerImpl
	 * @see empresa.impl.EmpresaPackageImpl#getDBServer()
	 * @generated
	 */
	int DB_SERVER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>System Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__SYSTEM_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Related Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER__RELATED_COLLECTIONS = 4;

	/**
	 * The number of structural features of the '<em>DB Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>DB Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.CollectionImpl
	 * @see empresa.impl.EmpresaPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__DOCUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.DocumentImpl
	 * @see empresa.impl.EmpresaPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.ActionImpl
	 * @see empresa.impl.EmpresaPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COLUMN_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ADD = 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FILTER = 2;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EDIT = 3;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DELETE = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__POSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.ColumnImpl
	 * @see empresa.impl.EmpresaPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FILTER = 2;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__EDITABLE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.MenuImpl
	 * @see empresa.impl.EmpresaPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__TITLE = ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__OPTIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.OptionImpl
	 * @see empresa.impl.EmpresaPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ICON = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Url Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__URL_COMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.Graphic2DImpl <em>Graphic2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.Graphic2DImpl
	 * @see empresa.impl.EmpresaPackageImpl#getGraphic2D()
	 * @generated
	 */
	int GRAPHIC2_D = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__NAME = GRAPHIC__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__TITLE = GRAPHIC__TITLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__DATA = GRAPHIC__DATA;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__LEGEND_POSITION = GRAPHIC__LEGEND_POSITION;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__LABELS = GRAPHIC__LABELS;

	/**
	 * The feature id for the '<em><b>Label String XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__LABEL_STRING_XAXES = GRAPHIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Grid Lines XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES = GRAPHIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color Grid Lines XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__COLOR_GRID_LINES_XAXES = GRAPHIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label String YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__LABEL_STRING_YAXES = GRAPHIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display Grid Lines YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES = GRAPHIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Color Grid Lines YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__COLOR_GRID_LINES_YAXES = GRAPHIC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Graphic2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D_FEATURE_COUNT = GRAPHIC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Graphic2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D_OPERATION_COUNT = GRAPHIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.LineChartImpl <em>Line Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.LineChartImpl
	 * @see empresa.impl.EmpresaPackageImpl#getLineChart()
	 * @generated
	 */
	int LINE_CHART = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__NAME = GRAPHIC2_D__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__TITLE = GRAPHIC2_D__TITLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__DATA = GRAPHIC2_D__DATA;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__LEGEND_POSITION = GRAPHIC2_D__LEGEND_POSITION;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__LABELS = GRAPHIC2_D__LABELS;

	/**
	 * The feature id for the '<em><b>Label String XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__LABEL_STRING_XAXES = GRAPHIC2_D__LABEL_STRING_XAXES;

	/**
	 * The feature id for the '<em><b>Display Grid Lines XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__DISPLAY_GRID_LINES_XAXES = GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES;

	/**
	 * The feature id for the '<em><b>Color Grid Lines XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__COLOR_GRID_LINES_XAXES = GRAPHIC2_D__COLOR_GRID_LINES_XAXES;

	/**
	 * The feature id for the '<em><b>Label String YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__LABEL_STRING_YAXES = GRAPHIC2_D__LABEL_STRING_YAXES;

	/**
	 * The feature id for the '<em><b>Display Grid Lines YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__DISPLAY_GRID_LINES_YAXES = GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES;

	/**
	 * The feature id for the '<em><b>Color Grid Lines YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__COLOR_GRID_LINES_YAXES = GRAPHIC2_D__COLOR_GRID_LINES_YAXES;

	/**
	 * The number of structural features of the '<em>Line Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FEATURE_COUNT = GRAPHIC2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_OPERATION_COUNT = GRAPHIC2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.BarChartImpl <em>Bar Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.BarChartImpl
	 * @see empresa.impl.EmpresaPackageImpl#getBarChart()
	 * @generated
	 */
	int BAR_CHART = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__NAME = GRAPHIC2_D__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__TITLE = GRAPHIC2_D__TITLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__DATA = GRAPHIC2_D__DATA;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__LEGEND_POSITION = GRAPHIC2_D__LEGEND_POSITION;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__LABELS = GRAPHIC2_D__LABELS;

	/**
	 * The feature id for the '<em><b>Label String XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__LABEL_STRING_XAXES = GRAPHIC2_D__LABEL_STRING_XAXES;

	/**
	 * The feature id for the '<em><b>Display Grid Lines XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__DISPLAY_GRID_LINES_XAXES = GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES;

	/**
	 * The feature id for the '<em><b>Color Grid Lines XAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__COLOR_GRID_LINES_XAXES = GRAPHIC2_D__COLOR_GRID_LINES_XAXES;

	/**
	 * The feature id for the '<em><b>Label String YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__LABEL_STRING_YAXES = GRAPHIC2_D__LABEL_STRING_YAXES;

	/**
	 * The feature id for the '<em><b>Display Grid Lines YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__DISPLAY_GRID_LINES_YAXES = GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES;

	/**
	 * The feature id for the '<em><b>Color Grid Lines YAxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__COLOR_GRID_LINES_YAXES = GRAPHIC2_D__COLOR_GRID_LINES_YAXES;

	/**
	 * The feature id for the '<em><b>Bar Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__BAR_PERCENTAGE = GRAPHIC2_D_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FEATURE_COUNT = GRAPHIC2_D_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_OPERATION_COUNT = GRAPHIC2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.RadarChartImpl <em>Radar Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.RadarChartImpl
	 * @see empresa.impl.EmpresaPackageImpl#getRadarChart()
	 * @generated
	 */
	int RADAR_CHART = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART__NAME = GRAPHIC__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART__TITLE = GRAPHIC__TITLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART__DATA = GRAPHIC__DATA;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART__LEGEND_POSITION = GRAPHIC__LEGEND_POSITION;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART__LABELS = GRAPHIC__LABELS;

	/**
	 * The feature id for the '<em><b>Angle Lines Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART__ANGLE_LINES_DISPLAY = GRAPHIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART_FEATURE_COUNT = GRAPHIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Radar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_CHART_OPERATION_COUNT = GRAPHIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.PieChartImpl <em>Pie Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.PieChartImpl
	 * @see empresa.impl.EmpresaPackageImpl#getPieChart()
	 * @generated
	 */
	int PIE_CHART = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__NAME = GRAPHIC__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__TITLE = GRAPHIC__TITLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__DATA = GRAPHIC__DATA;

	/**
	 * The feature id for the '<em><b>Legend Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__LEGEND_POSITION = GRAPHIC__LEGEND_POSITION;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__LABELS = GRAPHIC__LABELS;

	/**
	 * The number of structural features of the '<em>Pie Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FEATURE_COUNT = GRAPHIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pie Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_OPERATION_COUNT = GRAPHIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empresa.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.DataImpl
	 * @see empresa.impl.EmpresaPackageImpl#getData()
	 * @generated
	 */
	int DATA = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA = 2;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BORDER_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BACKGROUND_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__FILL = 5;

	/**
	 * The feature id for the '<em><b>Border Dash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BORDER_DASH = 6;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.LabelImpl
	 * @see empresa.impl.EmpresaPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.impl.AttributeImpl
	 * @see empresa.impl.EmpresaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link empresa.DBSystem <em>DB System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.DBSystem
	 * @see empresa.impl.EmpresaPackageImpl#getDBSystem()
	 * @generated
	 */
	int DB_SYSTEM = 21;

	/**
	 * The meta object id for the '{@link empresa.PositionOptions <em>Position Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.PositionOptions
	 * @see empresa.impl.EmpresaPackageImpl#getPositionOptions()
	 * @generated
	 */
	int POSITION_OPTIONS = 22;

	/**
	 * The meta object id for the '{@link empresa.Colors <em>Colors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empresa.Colors
	 * @see empresa.impl.EmpresaPackageImpl#getColors()
	 * @generated
	 */
	int COLORS = 23;


	/**
	 * Returns the meta object for class '{@link empresa.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see empresa.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Company#getDashboards <em>Dashboards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dashboards</em>'.
	 * @see empresa.Company#getDashboards()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Dashboards();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Company#getDBServers <em>DB Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DB Servers</em>'.
	 * @see empresa.Company#getDBServers()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_DBServers();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Company#getNit <em>Nit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nit</em>'.
	 * @see empresa.Company#getNit()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Nit();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for class '{@link empresa.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see empresa.Dashboard
	 * @generated
	 */
	EClass getDashboard();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Dashboard#getPanels <em>Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panels</em>'.
	 * @see empresa.Dashboard#getPanels()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Panels();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Dashboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Dashboard#getName()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Name();

	/**
	 * Returns the meta object for class '{@link empresa.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see empresa.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Panel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see empresa.Panel#getElements()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Elements();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Panel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Panel#getName()
	 * @see #getPanel()
	 * @generated
	 */
	EAttribute getPanel_Name();

	/**
	 * Returns the meta object for class '{@link empresa.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see empresa.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Element#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see empresa.Element#getTitle()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Title();

	/**
	 * Returns the meta object for class '{@link empresa.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see empresa.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Table#getRegistersPerPage <em>Registers Per Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registers Per Page</em>'.
	 * @see empresa.Table#getRegistersPerPage()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RegistersPerPage();

	/**
	 * Returns the meta object for the containment reference '{@link empresa.Table#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see empresa.Table#getActions()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see empresa.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Table#isSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search</em>'.
	 * @see empresa.Table#isSearch()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Search();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Table#isAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add</em>'.
	 * @see empresa.Table#isAdd()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Add();

	/**
	 * Returns the meta object for class '{@link empresa.Graphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic</em>'.
	 * @see empresa.Graphic
	 * @generated
	 */
	EClass getGraphic();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Graphic#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see empresa.Graphic#getData()
	 * @see #getGraphic()
	 * @generated
	 */
	EReference getGraphic_Data();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Graphic#getLegendPosition <em>Legend Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Position</em>'.
	 * @see empresa.Graphic#getLegendPosition()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_LegendPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Graphic#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see empresa.Graphic#getLabels()
	 * @see #getGraphic()
	 * @generated
	 */
	EReference getGraphic_Labels();

	/**
	 * Returns the meta object for class '{@link empresa.DBServer <em>DB Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Server</em>'.
	 * @see empresa.DBServer
	 * @generated
	 */
	EClass getDBServer();

	/**
	 * Returns the meta object for the attribute '{@link empresa.DBServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.DBServer#getName()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link empresa.DBServer#getSystemManager <em>System Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Manager</em>'.
	 * @see empresa.DBServer#getSystemManager()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_SystemManager();

	/**
	 * Returns the meta object for the attribute '{@link empresa.DBServer#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see empresa.DBServer#getToken()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Token();

	/**
	 * Returns the meta object for the attribute '{@link empresa.DBServer#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see empresa.DBServer#getPassword()
	 * @see #getDBServer()
	 * @generated
	 */
	EAttribute getDBServer_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.DBServer#getRelatedCollections <em>Related Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Collections</em>'.
	 * @see empresa.DBServer#getRelatedCollections()
	 * @see #getDBServer()
	 * @generated
	 */
	EReference getDBServer_RelatedCollections();

	/**
	 * Returns the meta object for class '{@link empresa.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see empresa.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Collection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Collection#getName()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Collection#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see empresa.Collection#getDocuments()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Documents();

	/**
	 * Returns the meta object for class '{@link empresa.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see empresa.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Document#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see empresa.Document#getAttributes()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Attributes();

	/**
	 * Returns the meta object for class '{@link empresa.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see empresa.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Action#getColumnTitle <em>Column Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Title</em>'.
	 * @see empresa.Action#getColumnTitle()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ColumnTitle();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Action#isAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add</em>'.
	 * @see empresa.Action#isAdd()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Add();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Action#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see empresa.Action#isFilter()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Filter();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Action#isEdit <em>Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit</em>'.
	 * @see empresa.Action#isEdit()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Edit();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Action#isDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see empresa.Action#isDelete()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Delete();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Action#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see empresa.Action#getPosition()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Position();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for class '{@link empresa.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see empresa.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Column#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see empresa.Column#getTitle()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Title();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Column#isFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see empresa.Column#isFilter()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Filter();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Column#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see empresa.Column#isEditable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Editable();

	/**
	 * Returns the meta object for the reference '{@link empresa.Column#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see empresa.Column#getSource()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Source();

	/**
	 * Returns the meta object for class '{@link empresa.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see empresa.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link empresa.Menu#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see empresa.Menu#getOptions()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Options();

	/**
	 * Returns the meta object for class '{@link empresa.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see empresa.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Option#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see empresa.Option#getIcon()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Icon();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Option#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see empresa.Option#getTitle()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Title();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Option#getUrlComponent <em>Url Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Component</em>'.
	 * @see empresa.Option#getUrlComponent()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_UrlComponent();

	/**
	 * Returns the meta object for class '{@link empresa.LineChart <em>Line Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Chart</em>'.
	 * @see empresa.LineChart
	 * @generated
	 */
	EClass getLineChart();

	/**
	 * Returns the meta object for class '{@link empresa.BarChart <em>Bar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Chart</em>'.
	 * @see empresa.BarChart
	 * @generated
	 */
	EClass getBarChart();

	/**
	 * Returns the meta object for the attribute '{@link empresa.BarChart#getBarPercentage <em>Bar Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bar Percentage</em>'.
	 * @see empresa.BarChart#getBarPercentage()
	 * @see #getBarChart()
	 * @generated
	 */
	EAttribute getBarChart_BarPercentage();

	/**
	 * Returns the meta object for class '{@link empresa.RadarChart <em>Radar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radar Chart</em>'.
	 * @see empresa.RadarChart
	 * @generated
	 */
	EClass getRadarChart();

	/**
	 * Returns the meta object for the attribute '{@link empresa.RadarChart#isAngleLinesDisplay <em>Angle Lines Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle Lines Display</em>'.
	 * @see empresa.RadarChart#isAngleLinesDisplay()
	 * @see #getRadarChart()
	 * @generated
	 */
	EAttribute getRadarChart_AngleLinesDisplay();

	/**
	 * Returns the meta object for class '{@link empresa.PieChart <em>Pie Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie Chart</em>'.
	 * @see empresa.PieChart
	 * @generated
	 */
	EClass getPieChart();

	/**
	 * Returns the meta object for class '{@link empresa.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see empresa.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Data#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see empresa.Data#getCategory()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Category();

	/**
	 * Returns the meta object for the reference list '{@link empresa.Data#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see empresa.Data#getData()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Data();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Data#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see empresa.Data#getBorderColor()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Data#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see empresa.Data#getBackgroundColor()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Data#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see empresa.Data#isFill()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Fill();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Data#getBorderDash <em>Border Dash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Dash</em>'.
	 * @see empresa.Data#getBorderDash()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_BorderDash();

	/**
	 * Returns the meta object for class '{@link empresa.Graphic2D <em>Graphic2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic2 D</em>'.
	 * @see empresa.Graphic2D
	 * @generated
	 */
	EClass getGraphic2D();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Graphic2D#getLabelStringXAxes <em>Label String XAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label String XAxes</em>'.
	 * @see empresa.Graphic2D#getLabelStringXAxes()
	 * @see #getGraphic2D()
	 * @generated
	 */
	EAttribute getGraphic2D_LabelStringXAxes();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Graphic2D#isDisplayGridLinesXAxes <em>Display Grid Lines XAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Grid Lines XAxes</em>'.
	 * @see empresa.Graphic2D#isDisplayGridLinesXAxes()
	 * @see #getGraphic2D()
	 * @generated
	 */
	EAttribute getGraphic2D_DisplayGridLinesXAxes();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Graphic2D#getColorGridLinesXAxes <em>Color Grid Lines XAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Grid Lines XAxes</em>'.
	 * @see empresa.Graphic2D#getColorGridLinesXAxes()
	 * @see #getGraphic2D()
	 * @generated
	 */
	EAttribute getGraphic2D_ColorGridLinesXAxes();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Graphic2D#getLabelStringYAxes <em>Label String YAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label String YAxes</em>'.
	 * @see empresa.Graphic2D#getLabelStringYAxes()
	 * @see #getGraphic2D()
	 * @generated
	 */
	EAttribute getGraphic2D_LabelStringYAxes();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Graphic2D#isDisplayGridLinesYAxes <em>Display Grid Lines YAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Grid Lines YAxes</em>'.
	 * @see empresa.Graphic2D#isDisplayGridLinesYAxes()
	 * @see #getGraphic2D()
	 * @generated
	 */
	EAttribute getGraphic2D_DisplayGridLinesYAxes();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Graphic2D#getColorGridLinesYAxes <em>Color Grid Lines YAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Grid Lines YAxes</em>'.
	 * @see empresa.Graphic2D#getColorGridLinesYAxes()
	 * @see #getGraphic2D()
	 * @generated
	 */
	EAttribute getGraphic2D_ColorGridLinesYAxes();

	/**
	 * Returns the meta object for class '{@link empresa.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see empresa.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for class '{@link empresa.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see empresa.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see empresa.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link empresa.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empresa.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for enum '{@link empresa.DBSystem <em>DB System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DB System</em>'.
	 * @see empresa.DBSystem
	 * @generated
	 */
	EEnum getDBSystem();

	/**
	 * Returns the meta object for enum '{@link empresa.PositionOptions <em>Position Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Options</em>'.
	 * @see empresa.PositionOptions
	 * @generated
	 */
	EEnum getPositionOptions();

	/**
	 * Returns the meta object for enum '{@link empresa.Colors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colors</em>'.
	 * @see empresa.Colors
	 * @generated
	 */
	EEnum getColors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmpresaFactory getEmpresaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link empresa.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.CompanyImpl
		 * @see empresa.impl.EmpresaPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Dashboards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__DASHBOARDS = eINSTANCE.getCompany_Dashboards();

		/**
		 * The meta object literal for the '<em><b>DB Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__DB_SERVERS = eINSTANCE.getCompany_DBServers();

		/**
		 * The meta object literal for the '<em><b>Nit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NIT = eINSTANCE.getCompany_Nit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '{@link empresa.impl.DashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.DashboardImpl
		 * @see empresa.impl.EmpresaPackageImpl#getDashboard()
		 * @generated
		 */
		EClass DASHBOARD = eINSTANCE.getDashboard();

		/**
		 * The meta object literal for the '<em><b>Panels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__PANELS = eINSTANCE.getDashboard_Panels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__NAME = eINSTANCE.getDashboard_Name();

		/**
		 * The meta object literal for the '{@link empresa.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.PanelImpl
		 * @see empresa.impl.EmpresaPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__ELEMENTS = eINSTANCE.getPanel_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANEL__NAME = eINSTANCE.getPanel_Name();

		/**
		 * The meta object literal for the '{@link empresa.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.ElementImpl
		 * @see empresa.impl.EmpresaPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TITLE = eINSTANCE.getElement_Title();

		/**
		 * The meta object literal for the '{@link empresa.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.TableImpl
		 * @see empresa.impl.EmpresaPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Registers Per Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__REGISTERS_PER_PAGE = eINSTANCE.getTable_RegistersPerPage();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ACTIONS = eINSTANCE.getTable_Actions();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SEARCH = eINSTANCE.getTable_Search();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ADD = eINSTANCE.getTable_Add();

		/**
		 * The meta object literal for the '{@link empresa.impl.GraphicImpl <em>Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.GraphicImpl
		 * @see empresa.impl.EmpresaPackageImpl#getGraphic()
		 * @generated
		 */
		EClass GRAPHIC = eINSTANCE.getGraphic();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC__DATA = eINSTANCE.getGraphic_Data();

		/**
		 * The meta object literal for the '<em><b>Legend Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__LEGEND_POSITION = eINSTANCE.getGraphic_LegendPosition();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC__LABELS = eINSTANCE.getGraphic_Labels();

		/**
		 * The meta object literal for the '{@link empresa.impl.DBServerImpl <em>DB Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.DBServerImpl
		 * @see empresa.impl.EmpresaPackageImpl#getDBServer()
		 * @generated
		 */
		EClass DB_SERVER = eINSTANCE.getDBServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__NAME = eINSTANCE.getDBServer_Name();

		/**
		 * The meta object literal for the '<em><b>System Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__SYSTEM_MANAGER = eINSTANCE.getDBServer_SystemManager();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__TOKEN = eINSTANCE.getDBServer_Token();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SERVER__PASSWORD = eINSTANCE.getDBServer_Password();

		/**
		 * The meta object literal for the '<em><b>Related Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_SERVER__RELATED_COLLECTIONS = eINSTANCE.getDBServer_RelatedCollections();

		/**
		 * The meta object literal for the '{@link empresa.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.CollectionImpl
		 * @see empresa.impl.EmpresaPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__NAME = eINSTANCE.getCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__DOCUMENTS = eINSTANCE.getCollection_Documents();

		/**
		 * The meta object literal for the '{@link empresa.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.DocumentImpl
		 * @see empresa.impl.EmpresaPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ATTRIBUTES = eINSTANCE.getDocument_Attributes();

		/**
		 * The meta object literal for the '{@link empresa.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.ActionImpl
		 * @see empresa.impl.EmpresaPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Column Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__COLUMN_TITLE = eINSTANCE.getAction_ColumnTitle();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ADD = eINSTANCE.getAction_Add();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FILTER = eINSTANCE.getAction_Filter();

		/**
		 * The meta object literal for the '<em><b>Edit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__EDIT = eINSTANCE.getAction_Edit();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DELETE = eINSTANCE.getAction_Delete();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__POSITION = eINSTANCE.getAction_Position();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '{@link empresa.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.ColumnImpl
		 * @see empresa.impl.EmpresaPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TITLE = eINSTANCE.getColumn_Title();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__FILTER = eINSTANCE.getColumn_Filter();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__EDITABLE = eINSTANCE.getColumn_Editable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__SOURCE = eINSTANCE.getColumn_Source();

		/**
		 * The meta object literal for the '{@link empresa.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.MenuImpl
		 * @see empresa.impl.EmpresaPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__OPTIONS = eINSTANCE.getMenu_Options();

		/**
		 * The meta object literal for the '{@link empresa.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.OptionImpl
		 * @see empresa.impl.EmpresaPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__ICON = eINSTANCE.getOption_Icon();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TITLE = eINSTANCE.getOption_Title();

		/**
		 * The meta object literal for the '<em><b>Url Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__URL_COMPONENT = eINSTANCE.getOption_UrlComponent();

		/**
		 * The meta object literal for the '{@link empresa.impl.LineChartImpl <em>Line Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.LineChartImpl
		 * @see empresa.impl.EmpresaPackageImpl#getLineChart()
		 * @generated
		 */
		EClass LINE_CHART = eINSTANCE.getLineChart();

		/**
		 * The meta object literal for the '{@link empresa.impl.BarChartImpl <em>Bar Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.BarChartImpl
		 * @see empresa.impl.EmpresaPackageImpl#getBarChart()
		 * @generated
		 */
		EClass BAR_CHART = eINSTANCE.getBarChart();

		/**
		 * The meta object literal for the '<em><b>Bar Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAR_CHART__BAR_PERCENTAGE = eINSTANCE.getBarChart_BarPercentage();

		/**
		 * The meta object literal for the '{@link empresa.impl.RadarChartImpl <em>Radar Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.RadarChartImpl
		 * @see empresa.impl.EmpresaPackageImpl#getRadarChart()
		 * @generated
		 */
		EClass RADAR_CHART = eINSTANCE.getRadarChart();

		/**
		 * The meta object literal for the '<em><b>Angle Lines Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADAR_CHART__ANGLE_LINES_DISPLAY = eINSTANCE.getRadarChart_AngleLinesDisplay();

		/**
		 * The meta object literal for the '{@link empresa.impl.PieChartImpl <em>Pie Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.PieChartImpl
		 * @see empresa.impl.EmpresaPackageImpl#getPieChart()
		 * @generated
		 */
		EClass PIE_CHART = eINSTANCE.getPieChart();

		/**
		 * The meta object literal for the '{@link empresa.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.DataImpl
		 * @see empresa.impl.EmpresaPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__CATEGORY = eINSTANCE.getData_Category();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA = eINSTANCE.getData_Data();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__BORDER_COLOR = eINSTANCE.getData_BorderColor();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__BACKGROUND_COLOR = eINSTANCE.getData_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__FILL = eINSTANCE.getData_Fill();

		/**
		 * The meta object literal for the '<em><b>Border Dash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__BORDER_DASH = eINSTANCE.getData_BorderDash();

		/**
		 * The meta object literal for the '{@link empresa.impl.Graphic2DImpl <em>Graphic2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.Graphic2DImpl
		 * @see empresa.impl.EmpresaPackageImpl#getGraphic2D()
		 * @generated
		 */
		EClass GRAPHIC2_D = eINSTANCE.getGraphic2D();

		/**
		 * The meta object literal for the '<em><b>Label String XAxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC2_D__LABEL_STRING_XAXES = eINSTANCE.getGraphic2D_LabelStringXAxes();

		/**
		 * The meta object literal for the '<em><b>Display Grid Lines XAxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC2_D__DISPLAY_GRID_LINES_XAXES = eINSTANCE.getGraphic2D_DisplayGridLinesXAxes();

		/**
		 * The meta object literal for the '<em><b>Color Grid Lines XAxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC2_D__COLOR_GRID_LINES_XAXES = eINSTANCE.getGraphic2D_ColorGridLinesXAxes();

		/**
		 * The meta object literal for the '<em><b>Label String YAxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC2_D__LABEL_STRING_YAXES = eINSTANCE.getGraphic2D_LabelStringYAxes();

		/**
		 * The meta object literal for the '<em><b>Display Grid Lines YAxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC2_D__DISPLAY_GRID_LINES_YAXES = eINSTANCE.getGraphic2D_DisplayGridLinesYAxes();

		/**
		 * The meta object literal for the '<em><b>Color Grid Lines YAxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC2_D__COLOR_GRID_LINES_YAXES = eINSTANCE.getGraphic2D_ColorGridLinesYAxes();

		/**
		 * The meta object literal for the '{@link empresa.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.LabelImpl
		 * @see empresa.impl.EmpresaPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '{@link empresa.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.impl.AttributeImpl
		 * @see empresa.impl.EmpresaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link empresa.DBSystem <em>DB System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.DBSystem
		 * @see empresa.impl.EmpresaPackageImpl#getDBSystem()
		 * @generated
		 */
		EEnum DB_SYSTEM = eINSTANCE.getDBSystem();

		/**
		 * The meta object literal for the '{@link empresa.PositionOptions <em>Position Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.PositionOptions
		 * @see empresa.impl.EmpresaPackageImpl#getPositionOptions()
		 * @generated
		 */
		EEnum POSITION_OPTIONS = eINSTANCE.getPositionOptions();

		/**
		 * The meta object literal for the '{@link empresa.Colors <em>Colors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empresa.Colors
		 * @see empresa.impl.EmpresaPackageImpl#getColors()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getColors();

	}

} //EmpresaPackage
