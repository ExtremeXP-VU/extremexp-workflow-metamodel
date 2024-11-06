/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.extremexp.emf.model.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OUTPUTS = 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.NodeImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.InputDataImpl <em>Input Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.InputDataImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getInputData()
	 * @generated
	 */
	int INPUT_DATA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.OutputDataImpl <em>Output Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.OutputDataImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getOutputData()
	 * @generated
	 */
	int OUTPUT_DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.MetricImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__KIND = 1;

	/**
	 * The feature id for the '<em><b>Metric Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METRIC_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ParameterImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Valueconstraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUECONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ParameterTypeImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ArrayImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LENGTH = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.StructureImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__NAME = PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FIELDS = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.FieldImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.TaskImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_ABSTRACT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primitive Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIMITIVE_IMPLEMENTATION = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__METADATA = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.OperatorImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 11;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.LinkImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 12;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INPUT = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ConditionalLinkImpl <em>Conditional Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ConditionalLinkImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getConditionalLink()
	 * @generated
	 */
	int CONDITIONAL_LINK = 13;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LINK__OUTPUT = LINK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LINK__INPUT = LINK__INPUT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LINK__CONDITION = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.RegularLinkImpl <em>Regular Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.RegularLinkImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getRegularLink()
	 * @generated
	 */
	int REGULAR_LINK = 14;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_LINK__OUTPUT = LINK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_LINK__INPUT = LINK__INPUT;

	/**
	 * The number of structural features of the '<em>Regular Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ExceptionalLinkImpl <em>Exceptional Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ExceptionalLinkImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExceptionalLink()
	 * @generated
	 */
	int EXCEPTIONAL_LINK = 15;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONAL_LINK__OUTPUT = LINK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONAL_LINK__INPUT = LINK__INPUT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONAL_LINK__EVENT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exceptional Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exceptional Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.GroupImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__METADATA = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.MetaDataImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ParallelImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 18;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ExclusiveImpl <em>Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ExclusiveImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExclusive()
	 * @generated
	 */
	int EXCLUSIVE = 19;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__CONDITION = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.InclusiveImpl <em>Inclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.InclusiveImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getInclusive()
	 * @generated
	 */
	int INCLUSIVE = 20;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE__CONDITIONS = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.JoinImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 21;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.EventImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.PrimitiveTypeImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ROOTImpl <em>ROOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ROOTImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getROOT()
	 * @generated
	 */
	int ROOT = 24;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parametertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PARAMETERTYPES = 2;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__WORKFLOW = 3;

	/**
	 * The number of structural features of the '<em>ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ConditionImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 25;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CASES = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ExperimentImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 26;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__INTENT = 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__SPACES = 2;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__WORKFLOW = 3;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.CaseImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 27;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CASE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.AssembledWorflowImpl <em>Assembled Worflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.AssembledWorflowImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getAssembledWorflow()
	 * @generated
	 */
	int ASSEMBLED_WORFLOW = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_WORFLOW__NAME = WORKFLOW__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_WORFLOW__INPUTS = WORKFLOW__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_WORFLOW__OUTPUTS = WORKFLOW__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Substituted Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_WORFLOW__SUBSTITUTED_TASK = WORKFLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_WORFLOW__PARENT = WORKFLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembled Worflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_WORFLOW_FEATURE_COUNT = WORKFLOW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assembled Worflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_WORFLOW_OPERATION_COUNT = WORKFLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.SubstitutedTaskImpl <em>Substituted Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.SubstitutedTaskImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getSubstitutedTask()
	 * @generated
	 */
	int SUBSTITUTED_TASK = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_TASK__TASK = 1;

	/**
	 * The number of structural features of the '<em>Substituted Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Substituted Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.CompositeWorkflowImpl <em>Composite Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.CompositeWorkflowImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getCompositeWorkflow()
	 * @generated
	 */
	int COMPOSITE_WORKFLOW = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW__NAME = WORKFLOW__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW__INPUTS = WORKFLOW__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW__OUTPUTS = WORKFLOW__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW__NODE = WORKFLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW__LINKS = WORKFLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW__DATA_LINKS = WORKFLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW_FEATURE_COUNT = WORKFLOW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WORKFLOW_OPERATION_COUNT = WORKFLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.TaskSpecificationImpl <em>Task Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.TaskSpecificationImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTaskSpecification()
	 * @generated
	 */
	int TASK_SPECIFICATION = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION__NAME = WORKFLOW__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION__INPUTS = WORKFLOW__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION__OUTPUTS = WORKFLOW__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION__IMPLEMENTATION = WORKFLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION__METRICS = WORKFLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION__PARAMETERS = WORKFLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION_FEATURE_COUNT = WORKFLOW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SPECIFICATION_OPERATION_COUNT = WORKFLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.IntentRefImpl <em>Intent Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.IntentRefImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getIntentRef()
	 * @generated
	 */
	int INTENT_REF = 32;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_REF__REF = 0;

	/**
	 * The number of structural features of the '<em>Intent Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Intent Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ControlImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 33;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__KIND = 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROL = 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl <em>Experimentation Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExperimentationSpace()
	 * @generated
	 */
	int EXPERIMENTATION_SPACE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Worflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_SPACE__WORFLOW = 1;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_SPACE__STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_SPACE__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_SPACE__CONFIGURATIONS = 4;

	/**
	 * The number of structural features of the '<em>Experimentation Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_SPACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Experimentation Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ParameterValueImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.TaskConfigurationImpl <em>Task Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.TaskConfigurationImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTaskConfiguration()
	 * @generated
	 */
	int TASK_CONFIGURATION = 36;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION__TASK = 1;

	/**
	 * The number of structural features of the '<em>Task Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ControlElementImpl <em>Control Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ControlElementImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getControlElement()
	 * @generated
	 */
	int CONTROL_ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__SPACE = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.DataLinkImpl <em>Data Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.DataLinkImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getDataLink()
	 * @generated
	 */
	int DATA_LINK = 38;

	/**
	 * The feature id for the '<em><b>Inputdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__INPUTDATA = 0;

	/**
	 * The feature id for the '<em><b>Outputdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__OUTPUTDATA = 1;

	/**
	 * The feature id for the '<em><b>Task Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK__TASK_DATA = 2;

	/**
	 * The number of structural features of the '<em>Data Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.TaskDataImpl <em>Task Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.TaskDataImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTaskData()
	 * @generated
	 */
	int TASK_DATA = 39;

	/**
	 * The feature id for the '<em><b>Data Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DATA__DATA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DATA__TASK = 1;

	/**
	 * The number of structural features of the '<em>Task Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.impl.ValueConstraintImpl <em>Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.impl.ValueConstraintImpl
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getValueConstraint()
	 * @generated
	 */
	int VALUE_CONSTRAINT = 40;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.EventValue <em>Event Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.EventValue
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getEventValue()
	 * @generated
	 */
	int EVENT_VALUE = 41;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.Primitive
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 42;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.ControlKind <em>Control Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.ControlKind
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getControlKind()
	 * @generated
	 */
	int CONTROL_KIND = 43;

	/**
	 * The meta object id for the '{@link eu.extremexp.emf.model.workflow.MetricKind <em>Metric Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.extremexp.emf.model.workflow.MetricKind
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getMetricKind()
	 * @generated
	 */
	int METRIC_KIND = 44;

	/**
	 * The meta object id for the '<em>New Data Type3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getNewDataType3()
	 * @generated
	 */
	int NEW_DATA_TYPE3 = 45;

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see eu.extremexp.emf.model.workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Workflow#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see eu.extremexp.emf.model.workflow.Workflow#getInputs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Workflow#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see eu.extremexp.emf.model.workflow.Workflow#getOutputs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Outputs();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see eu.extremexp.emf.model.workflow.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.InputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Data</em>'.
	 * @see eu.extremexp.emf.model.workflow.InputData
	 * @generated
	 */
	EClass getInputData();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.InputData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.InputData#getName()
	 * @see #getInputData()
	 * @generated
	 */
	EAttribute getInputData_Name();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.OutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Data</em>'.
	 * @see eu.extremexp.emf.model.workflow.OutputData
	 * @generated
	 */
	EClass getOutputData();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.OutputData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.OutputData#getName()
	 * @see #getOutputData()
	 * @generated
	 */
	EAttribute getOutputData_Name();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see eu.extremexp.emf.model.workflow.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Metric#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see eu.extremexp.emf.model.workflow.Metric#getKind()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Kind();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Metric#getMetricType <em>Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Type</em>'.
	 * @see eu.extremexp.emf.model.workflow.Metric#getMetricType()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_MetricType();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see eu.extremexp.emf.model.workflow.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see eu.extremexp.emf.model.workflow.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.extremexp.emf.model.workflow.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eu.extremexp.emf.model.workflow.Parameter#getValueconstraint <em>Valueconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valueconstraint</em>'.
	 * @see eu.extremexp.emf.model.workflow.Parameter#getValueconstraint()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Valueconstraint();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see eu.extremexp.emf.model.workflow.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Name();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see eu.extremexp.emf.model.workflow.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Array#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see eu.extremexp.emf.model.workflow.Array#getLength()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Length();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Array#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.extremexp.emf.model.workflow.Array#getType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Type();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see eu.extremexp.emf.model.workflow.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Structure#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see eu.extremexp.emf.model.workflow.Structure#getFields()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Fields();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see eu.extremexp.emf.model.workflow.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.extremexp.emf.model.workflow.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Task#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task#isIsAbstract()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Task#getPrimitiveImplementation <em>Primitive Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Implementation</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task#getPrimitiveImplementation()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_PrimitiveImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Task#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see eu.extremexp.emf.model.workflow.Task#getMetadata()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Metadata();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see eu.extremexp.emf.model.workflow.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see eu.extremexp.emf.model.workflow.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Link#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see eu.extremexp.emf.model.workflow.Link#getOutput()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Output();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Link#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see eu.extremexp.emf.model.workflow.Link#getInput()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Input();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ConditionalLink <em>Conditional Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Link</em>'.
	 * @see eu.extremexp.emf.model.workflow.ConditionalLink
	 * @generated
	 */
	EClass getConditionalLink();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ConditionalLink#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see eu.extremexp.emf.model.workflow.ConditionalLink#getCondition()
	 * @see #getConditionalLink()
	 * @generated
	 */
	EAttribute getConditionalLink_Condition();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.RegularLink <em>Regular Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Link</em>'.
	 * @see eu.extremexp.emf.model.workflow.RegularLink
	 * @generated
	 */
	EClass getRegularLink();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ExceptionalLink <em>Exceptional Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exceptional Link</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExceptionalLink
	 * @generated
	 */
	EClass getExceptionalLink();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ExceptionalLink#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExceptionalLink#getEvent()
	 * @see #getExceptionalLink()
	 * @generated
	 */
	EAttribute getExceptionalLink_Event();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see eu.extremexp.emf.model.workflow.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Group#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see eu.extremexp.emf.model.workflow.Group#getMetadata()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Metadata();

	/**
	 * Returns the meta object for the reference list '{@link eu.extremexp.emf.model.workflow.Group#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see eu.extremexp.emf.model.workflow.Group#getTasks()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Tasks();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see eu.extremexp.emf.model.workflow.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.MetaData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.MetaData#getName()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.MetaData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.extremexp.emf.model.workflow.MetaData#getValue()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Value();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see eu.extremexp.emf.model.workflow.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Exclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive</em>'.
	 * @see eu.extremexp.emf.model.workflow.Exclusive
	 * @generated
	 */
	EClass getExclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Exclusive#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see eu.extremexp.emf.model.workflow.Exclusive#getCondition()
	 * @see #getExclusive()
	 * @generated
	 */
	EReference getExclusive_Condition();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Inclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive</em>'.
	 * @see eu.extremexp.emf.model.workflow.Inclusive
	 * @generated
	 */
	EClass getInclusive();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Inclusive#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see eu.extremexp.emf.model.workflow.Inclusive#getConditions()
	 * @see #getInclusive()
	 * @generated
	 */
	EReference getInclusive_Conditions();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see eu.extremexp.emf.model.workflow.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see eu.extremexp.emf.model.workflow.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see eu.extremexp.emf.model.workflow.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.extremexp.emf.model.workflow.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ROOT <em>ROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROOT</em>'.
	 * @see eu.extremexp.emf.model.workflow.ROOT
	 * @generated
	 */
	EClass getROOT();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.ROOT#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see eu.extremexp.emf.model.workflow.ROOT#getGroups()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_Groups();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ROOT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.ROOT#getName()
	 * @see #getROOT()
	 * @generated
	 */
	EAttribute getROOT_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.ROOT#getParametertypes <em>Parametertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametertypes</em>'.
	 * @see eu.extremexp.emf.model.workflow.ROOT#getParametertypes()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_Parametertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.ROOT#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow</em>'.
	 * @see eu.extremexp.emf.model.workflow.ROOT#getWorkflow()
	 * @see #getROOT()
	 * @generated
	 */
	EReference getROOT_Workflow();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see eu.extremexp.emf.model.workflow.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see eu.extremexp.emf.model.workflow.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Condition#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see eu.extremexp.emf.model.workflow.Condition#getCases()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Cases();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see eu.extremexp.emf.model.workflow.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the containment reference '{@link eu.extremexp.emf.model.workflow.Experiment#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intent</em>'.
	 * @see eu.extremexp.emf.model.workflow.Experiment#getIntent()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Intent();

	/**
	 * Returns the meta object for the containment reference '{@link eu.extremexp.emf.model.workflow.Experiment#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see eu.extremexp.emf.model.workflow.Experiment#getControl()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Experiment#getSpaces <em>Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spaces</em>'.
	 * @see eu.extremexp.emf.model.workflow.Experiment#getSpaces()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Spaces();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Experiment#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow</em>'.
	 * @see eu.extremexp.emf.model.workflow.Experiment#getWorkflow()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Workflow();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see eu.extremexp.emf.model.workflow.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Case#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see eu.extremexp.emf.model.workflow.Case#getCase()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Case();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.Case#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eu.extremexp.emf.model.workflow.Case#getTarget()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Target();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.AssembledWorflow <em>Assembled Worflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembled Worflow</em>'.
	 * @see eu.extremexp.emf.model.workflow.AssembledWorflow
	 * @generated
	 */
	EClass getAssembledWorflow();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.AssembledWorflow#getSubstitutedTask <em>Substituted Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substituted Task</em>'.
	 * @see eu.extremexp.emf.model.workflow.AssembledWorflow#getSubstitutedTask()
	 * @see #getAssembledWorflow()
	 * @generated
	 */
	EReference getAssembledWorflow_SubstitutedTask();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.AssembledWorflow#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see eu.extremexp.emf.model.workflow.AssembledWorflow#getParent()
	 * @see #getAssembledWorflow()
	 * @generated
	 */
	EReference getAssembledWorflow_Parent();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.SubstitutedTask <em>Substituted Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substituted Task</em>'.
	 * @see eu.extremexp.emf.model.workflow.SubstitutedTask
	 * @generated
	 */
	EClass getSubstitutedTask();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.SubstitutedTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.SubstitutedTask#getName()
	 * @see #getSubstitutedTask()
	 * @generated
	 */
	EAttribute getSubstitutedTask_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.SubstitutedTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see eu.extremexp.emf.model.workflow.SubstitutedTask#getTask()
	 * @see #getSubstitutedTask()
	 * @generated
	 */
	EReference getSubstitutedTask_Task();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.CompositeWorkflow <em>Composite Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Workflow</em>'.
	 * @see eu.extremexp.emf.model.workflow.CompositeWorkflow
	 * @generated
	 */
	EClass getCompositeWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.CompositeWorkflow#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see eu.extremexp.emf.model.workflow.CompositeWorkflow#getNode()
	 * @see #getCompositeWorkflow()
	 * @generated
	 */
	EReference getCompositeWorkflow_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.CompositeWorkflow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see eu.extremexp.emf.model.workflow.CompositeWorkflow#getLinks()
	 * @see #getCompositeWorkflow()
	 * @generated
	 */
	EReference getCompositeWorkflow_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.CompositeWorkflow#getDataLinks <em>Data Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Links</em>'.
	 * @see eu.extremexp.emf.model.workflow.CompositeWorkflow#getDataLinks()
	 * @see #getCompositeWorkflow()
	 * @generated
	 */
	EReference getCompositeWorkflow_DataLinks();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.TaskSpecification <em>Task Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Specification</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskSpecification
	 * @generated
	 */
	EClass getTaskSpecification();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.TaskSpecification#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskSpecification#getImplementation()
	 * @see #getTaskSpecification()
	 * @generated
	 */
	EAttribute getTaskSpecification_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.TaskSpecification#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskSpecification#getMetrics()
	 * @see #getTaskSpecification()
	 * @generated
	 */
	EReference getTaskSpecification_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.TaskSpecification#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskSpecification#getParameters()
	 * @see #getTaskSpecification()
	 * @generated
	 */
	EReference getTaskSpecification_Parameters();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.IntentRef <em>Intent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Ref</em>'.
	 * @see eu.extremexp.emf.model.workflow.IntentRef
	 * @generated
	 */
	EClass getIntentRef();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.IntentRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see eu.extremexp.emf.model.workflow.IntentRef#getRef()
	 * @see #getIntentRef()
	 * @generated
	 */
	EAttribute getIntentRef_Ref();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see eu.extremexp.emf.model.workflow.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.Control#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see eu.extremexp.emf.model.workflow.Control#getKind()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.Control#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see eu.extremexp.emf.model.workflow.Control#getControl()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Control();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace <em>Experimentation Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimentation Space</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExperimentationSpace
	 * @generated
	 */
	EClass getExperimentationSpace();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExperimentationSpace#getName()
	 * @see #getExperimentationSpace()
	 * @generated
	 */
	EAttribute getExperimentationSpace_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getWorflow <em>Worflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worflow</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExperimentationSpace#getWorflow()
	 * @see #getExperimentationSpace()
	 * @generated
	 */
	EReference getExperimentationSpace_Worflow();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExperimentationSpace#getStrategy()
	 * @see #getExperimentationSpace()
	 * @generated
	 */
	EAttribute getExperimentationSpace_Strategy();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExperimentationSpace#getParameters()
	 * @see #getExperimentationSpace()
	 * @generated
	 */
	EReference getExperimentationSpace_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see eu.extremexp.emf.model.workflow.ExperimentationSpace#getConfigurations()
	 * @see #getExperimentationSpace()
	 * @generated
	 */
	EReference getExperimentationSpace_Configurations();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see eu.extremexp.emf.model.workflow.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.extremexp.emf.model.workflow.ParameterValue#getValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ParameterValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.ParameterValue#getName()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Name();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.TaskConfiguration <em>Task Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Configuration</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskConfiguration
	 * @generated
	 */
	EClass getTaskConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.TaskConfiguration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskConfiguration#getParameters()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_Parameters();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.TaskConfiguration#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskConfiguration#getTask()
	 * @see #getTaskConfiguration()
	 * @generated
	 */
	EReference getTaskConfiguration_Task();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ControlElement <em>Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Element</em>'.
	 * @see eu.extremexp.emf.model.workflow.ControlElement
	 * @generated
	 */
	EClass getControlElement();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.ControlElement#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Space</em>'.
	 * @see eu.extremexp.emf.model.workflow.ControlElement#getSpace()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_Space();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.ControlElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see eu.extremexp.emf.model.workflow.ControlElement#getNext()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_Next();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.DataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Link</em>'.
	 * @see eu.extremexp.emf.model.workflow.DataLink
	 * @generated
	 */
	EClass getDataLink();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.DataLink#getInputdata <em>Inputdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputdata</em>'.
	 * @see eu.extremexp.emf.model.workflow.DataLink#getInputdata()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Inputdata();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.DataLink#getOutputdata <em>Outputdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputdata</em>'.
	 * @see eu.extremexp.emf.model.workflow.DataLink#getOutputdata()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_Outputdata();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.extremexp.emf.model.workflow.DataLink#getTaskData <em>Task Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Data</em>'.
	 * @see eu.extremexp.emf.model.workflow.DataLink#getTaskData()
	 * @see #getDataLink()
	 * @generated
	 */
	EReference getDataLink_TaskData();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.TaskData <em>Task Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Data</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskData
	 * @generated
	 */
	EClass getTaskData();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.TaskData#getDataName <em>Data Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Name</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskData#getDataName()
	 * @see #getTaskData()
	 * @generated
	 */
	EAttribute getTaskData_DataName();

	/**
	 * Returns the meta object for the reference '{@link eu.extremexp.emf.model.workflow.TaskData#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see eu.extremexp.emf.model.workflow.TaskData#getTask()
	 * @see #getTaskData()
	 * @generated
	 */
	EReference getTaskData_Task();

	/**
	 * Returns the meta object for class '{@link eu.extremexp.emf.model.workflow.ValueConstraint <em>Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Constraint</em>'.
	 * @see eu.extremexp.emf.model.workflow.ValueConstraint
	 * @generated
	 */
	EClass getValueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link eu.extremexp.emf.model.workflow.ValueConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see eu.extremexp.emf.model.workflow.ValueConstraint#getConstraint()
	 * @see #getValueConstraint()
	 * @generated
	 */
	EAttribute getValueConstraint_Constraint();

	/**
	 * Returns the meta object for enum '{@link eu.extremexp.emf.model.workflow.EventValue <em>Event Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Value</em>'.
	 * @see eu.extremexp.emf.model.workflow.EventValue
	 * @generated
	 */
	EEnum getEventValue();

	/**
	 * Returns the meta object for enum '{@link eu.extremexp.emf.model.workflow.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see eu.extremexp.emf.model.workflow.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

	/**
	 * Returns the meta object for enum '{@link eu.extremexp.emf.model.workflow.ControlKind <em>Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Kind</em>'.
	 * @see eu.extremexp.emf.model.workflow.ControlKind
	 * @generated
	 */
	EEnum getControlKind();

	/**
	 * Returns the meta object for enum '{@link eu.extremexp.emf.model.workflow.MetricKind <em>Metric Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Kind</em>'.
	 * @see eu.extremexp.emf.model.workflow.MetricKind
	 * @generated
	 */
	EEnum getMetricKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>New Data Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>New Data Type3</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getNewDataType3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__INPUTS = eINSTANCE.getWorkflow_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OUTPUTS = eINSTANCE.getWorkflow_Outputs();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.NodeImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.InputDataImpl <em>Input Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.InputDataImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getInputData()
		 * @generated
		 */
		EClass INPUT_DATA = eINSTANCE.getInputData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_DATA__NAME = eINSTANCE.getInputData_Name();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.OutputDataImpl <em>Output Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.OutputDataImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getOutputData()
		 * @generated
		 */
		EClass OUTPUT_DATA = eINSTANCE.getOutputData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DATA__NAME = eINSTANCE.getOutputData_Name();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.MetricImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__KIND = eINSTANCE.getMetric_Kind();

		/**
		 * The meta object literal for the '<em><b>Metric Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__METRIC_TYPE = eINSTANCE.getMetric_MetricType();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ParameterImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Valueconstraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUECONSTRAINT = eINSTANCE.getParameter_Valueconstraint();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ParameterTypeImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ArrayImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__LENGTH = eINSTANCE.getArray_Length();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__TYPE = eINSTANCE.getArray_Type();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.StructureImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__FIELDS = eINSTANCE.getStructure_Fields();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.FieldImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.TaskImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_ABSTRACT = eINSTANCE.getTask_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Primitive Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIMITIVE_IMPLEMENTATION = eINSTANCE.getTask_PrimitiveImplementation();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__METADATA = eINSTANCE.getTask_Metadata();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.OperatorImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.LinkImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__OUTPUT = eINSTANCE.getLink_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INPUT = eINSTANCE.getLink_Input();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ConditionalLinkImpl <em>Conditional Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ConditionalLinkImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getConditionalLink()
		 * @generated
		 */
		EClass CONDITIONAL_LINK = eINSTANCE.getConditionalLink();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_LINK__CONDITION = eINSTANCE.getConditionalLink_Condition();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.RegularLinkImpl <em>Regular Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.RegularLinkImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getRegularLink()
		 * @generated
		 */
		EClass REGULAR_LINK = eINSTANCE.getRegularLink();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ExceptionalLinkImpl <em>Exceptional Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ExceptionalLinkImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExceptionalLink()
		 * @generated
		 */
		EClass EXCEPTIONAL_LINK = eINSTANCE.getExceptionalLink();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTIONAL_LINK__EVENT = eINSTANCE.getExceptionalLink_Event();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.GroupImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__METADATA = eINSTANCE.getGroup_Metadata();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__TASKS = eINSTANCE.getGroup_Tasks();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.MetaDataImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__NAME = eINSTANCE.getMetaData_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__VALUE = eINSTANCE.getMetaData_Value();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ParallelImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ExclusiveImpl <em>Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ExclusiveImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExclusive()
		 * @generated
		 */
		EClass EXCLUSIVE = eINSTANCE.getExclusive();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE__CONDITION = eINSTANCE.getExclusive_Condition();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.InclusiveImpl <em>Inclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.InclusiveImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getInclusive()
		 * @generated
		 */
		EClass INCLUSIVE = eINSTANCE.getInclusive();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSIVE__CONDITIONS = eINSTANCE.getInclusive_Conditions();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.JoinImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.EventImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.PrimitiveTypeImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE = eINSTANCE.getPrimitiveType_Type();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ROOTImpl <em>ROOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ROOTImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getROOT()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getROOT();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__GROUPS = eINSTANCE.getROOT_Groups();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__NAME = eINSTANCE.getROOT_Name();

		/**
		 * The meta object literal for the '<em><b>Parametertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PARAMETERTYPES = eINSTANCE.getROOT_Parametertypes();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__WORKFLOW = eINSTANCE.getROOT_Workflow();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ConditionImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CASES = eINSTANCE.getCondition_Cases();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ExperimentImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__INTENT = eINSTANCE.getExperiment_Intent();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__CONTROL = eINSTANCE.getExperiment_Control();

		/**
		 * The meta object literal for the '<em><b>Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__SPACES = eINSTANCE.getExperiment_Spaces();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__WORKFLOW = eINSTANCE.getExperiment_Workflow();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.CaseImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__CASE = eINSTANCE.getCase_Case();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__TARGET = eINSTANCE.getCase_Target();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.AssembledWorflowImpl <em>Assembled Worflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.AssembledWorflowImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getAssembledWorflow()
		 * @generated
		 */
		EClass ASSEMBLED_WORFLOW = eINSTANCE.getAssembledWorflow();

		/**
		 * The meta object literal for the '<em><b>Substituted Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLED_WORFLOW__SUBSTITUTED_TASK = eINSTANCE.getAssembledWorflow_SubstitutedTask();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLED_WORFLOW__PARENT = eINSTANCE.getAssembledWorflow_Parent();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.SubstitutedTaskImpl <em>Substituted Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.SubstitutedTaskImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getSubstitutedTask()
		 * @generated
		 */
		EClass SUBSTITUTED_TASK = eINSTANCE.getSubstitutedTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTED_TASK__NAME = eINSTANCE.getSubstitutedTask_Name();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTED_TASK__TASK = eINSTANCE.getSubstitutedTask_Task();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.CompositeWorkflowImpl <em>Composite Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.CompositeWorkflowImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getCompositeWorkflow()
		 * @generated
		 */
		EClass COMPOSITE_WORKFLOW = eINSTANCE.getCompositeWorkflow();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WORKFLOW__NODE = eINSTANCE.getCompositeWorkflow_Node();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WORKFLOW__LINKS = eINSTANCE.getCompositeWorkflow_Links();

		/**
		 * The meta object literal for the '<em><b>Data Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WORKFLOW__DATA_LINKS = eINSTANCE.getCompositeWorkflow_DataLinks();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.TaskSpecificationImpl <em>Task Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.TaskSpecificationImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTaskSpecification()
		 * @generated
		 */
		EClass TASK_SPECIFICATION = eINSTANCE.getTaskSpecification();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SPECIFICATION__IMPLEMENTATION = eINSTANCE.getTaskSpecification_Implementation();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SPECIFICATION__METRICS = eINSTANCE.getTaskSpecification_Metrics();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SPECIFICATION__PARAMETERS = eINSTANCE.getTaskSpecification_Parameters();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.IntentRefImpl <em>Intent Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.IntentRefImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getIntentRef()
		 * @generated
		 */
		EClass INTENT_REF = eINSTANCE.getIntentRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_REF__REF = eINSTANCE.getIntentRef_Ref();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ControlImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__KIND = eINSTANCE.getControl_Kind();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CONTROL = eINSTANCE.getControl_Control();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl <em>Experimentation Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getExperimentationSpace()
		 * @generated
		 */
		EClass EXPERIMENTATION_SPACE = eINSTANCE.getExperimentationSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENTATION_SPACE__NAME = eINSTANCE.getExperimentationSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Worflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTATION_SPACE__WORFLOW = eINSTANCE.getExperimentationSpace_Worflow();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENTATION_SPACE__STRATEGY = eINSTANCE.getExperimentationSpace_Strategy();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTATION_SPACE__PARAMETERS = eINSTANCE.getExperimentationSpace_Parameters();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTATION_SPACE__CONFIGURATIONS = eINSTANCE.getExperimentationSpace_Configurations();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ParameterValueImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__VALUE = eINSTANCE.getParameterValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__NAME = eINSTANCE.getParameterValue_Name();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.TaskConfigurationImpl <em>Task Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.TaskConfigurationImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTaskConfiguration()
		 * @generated
		 */
		EClass TASK_CONFIGURATION = eINSTANCE.getTaskConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__PARAMETERS = eINSTANCE.getTaskConfiguration_Parameters();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_CONFIGURATION__TASK = eINSTANCE.getTaskConfiguration_Task();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ControlElementImpl <em>Control Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ControlElementImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getControlElement()
		 * @generated
		 */
		EClass CONTROL_ELEMENT = eINSTANCE.getControlElement();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__SPACE = eINSTANCE.getControlElement_Space();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__NEXT = eINSTANCE.getControlElement_Next();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.DataLinkImpl <em>Data Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.DataLinkImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getDataLink()
		 * @generated
		 */
		EClass DATA_LINK = eINSTANCE.getDataLink();

		/**
		 * The meta object literal for the '<em><b>Inputdata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__INPUTDATA = eINSTANCE.getDataLink_Inputdata();

		/**
		 * The meta object literal for the '<em><b>Outputdata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__OUTPUTDATA = eINSTANCE.getDataLink_Outputdata();

		/**
		 * The meta object literal for the '<em><b>Task Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LINK__TASK_DATA = eINSTANCE.getDataLink_TaskData();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.TaskDataImpl <em>Task Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.TaskDataImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getTaskData()
		 * @generated
		 */
		EClass TASK_DATA = eINSTANCE.getTaskData();

		/**
		 * The meta object literal for the '<em><b>Data Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DATA__DATA_NAME = eINSTANCE.getTaskData_DataName();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DATA__TASK = eINSTANCE.getTaskData_Task();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.impl.ValueConstraintImpl <em>Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.impl.ValueConstraintImpl
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getValueConstraint()
		 * @generated
		 */
		EClass VALUE_CONSTRAINT = eINSTANCE.getValueConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONSTRAINT__CONSTRAINT = eINSTANCE.getValueConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.EventValue <em>Event Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.EventValue
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getEventValue()
		 * @generated
		 */
		EEnum EVENT_VALUE = eINSTANCE.getEventValue();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.Primitive
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.ControlKind <em>Control Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.ControlKind
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getControlKind()
		 * @generated
		 */
		EEnum CONTROL_KIND = eINSTANCE.getControlKind();

		/**
		 * The meta object literal for the '{@link eu.extremexp.emf.model.workflow.MetricKind <em>Metric Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.extremexp.emf.model.workflow.MetricKind
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getMetricKind()
		 * @generated
		 */
		EEnum METRIC_KIND = eINSTANCE.getMetricKind();

		/**
		 * The meta object literal for the '<em>New Data Type3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see eu.extremexp.emf.model.workflow.impl.WorkflowPackageImpl#getNewDataType3()
		 * @generated
		 */
		EDataType NEW_DATA_TYPE3 = eINSTANCE.getNewDataType3();

	}

} //WorkflowPackage