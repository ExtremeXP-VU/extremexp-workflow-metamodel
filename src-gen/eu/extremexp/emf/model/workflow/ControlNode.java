/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.ControlNode#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControlNode()
 * @model
 * @generated
 */
public interface ControlNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(ExperimentSpace)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControlNode_Space()
	 * @model
	 * @generated
	 */
	ExperimentSpace getSpace();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.ControlNode#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(ExperimentSpace value);

} // ControlNode
