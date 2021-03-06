/**
 *
 * $Id$
 */
package empresa.validation;

import empresa.Data;
import empresa.Label;
import empresa.PositionOptions;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link empresa.Graphic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GraphicValidator {
	boolean validate();

	boolean validateData(EList<Data> value);
	boolean validateLegendPosition(PositionOptions value);
	boolean validateLabels(EList<Label> value);
}
