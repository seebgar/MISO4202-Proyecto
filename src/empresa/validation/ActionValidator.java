/**
 *
 * $Id$
 */
package empresa.validation;

import empresa.PositionOptions;

/**
 * A sample validator interface for {@link empresa.Action}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActionValidator {
	boolean validate();

	boolean validateColumnTitle(String value);
	boolean validateAdd(boolean value);
	boolean validateFilter(boolean value);
	boolean validateEdit(boolean value);
	boolean validateDelete(boolean value);
	boolean validatePosition(PositionOptions value);
	boolean validateName(String value);
}