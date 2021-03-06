/**
 *
 * $Id$
 */
package empresa.validation;

import empresa.Attribute;
import empresa.Colors;
import empresa.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link empresa.Data}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateCategory(String value);
	boolean validateData(EList<Entity> value);
	boolean validateBorderColor(Colors value);
	boolean validateBackgroundColor(Colors value);
	boolean validateFill(boolean value);
	boolean validateBorderDash(int value);
	boolean validateAttribute(Attribute value);
}
