/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Condition#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getCondition_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Condition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getCondition_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Case> getCases();

} // Condition
