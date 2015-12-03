/**
 */
package org.servicifi.gelato.language.cobol.paragraphs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Computer Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph#getWithDebuggingMode <em>With Debugging Mode</em>}</li>
 * </ul>
 *
 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getSourceComputerParagraph()
 * @model
 * @generated
 */
public interface SourceComputerParagraph extends ConfigurationSectionParagraph {
	/**
	 * Returns the value of the '<em><b>With Debugging Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Debugging Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Debugging Mode</em>' containment reference.
	 * @see #setWithDebuggingMode(DebuggingMode)
	 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage#getSourceComputerParagraph_WithDebuggingMode()
	 * @model containment="true"
	 * @generated
	 */
	DebuggingMode getWithDebuggingMode();

	/**
	 * Sets the value of the '{@link org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph#getWithDebuggingMode <em>With Debugging Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Debugging Mode</em>' containment reference.
	 * @see #getWithDebuggingMode()
	 * @generated
	 */
	void setWithDebuggingMode(DebuggingMode value);

} // SourceComputerParagraph
