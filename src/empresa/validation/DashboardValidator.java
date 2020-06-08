/**
 *
 * $Id$
 */
package empresa.validation;

import empresa.Panel;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link empresa.Dashboard}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DashboardValidator {
	boolean validate();

	boolean validatePanels(EList<Panel> value);
	boolean validateName(String value);
}
