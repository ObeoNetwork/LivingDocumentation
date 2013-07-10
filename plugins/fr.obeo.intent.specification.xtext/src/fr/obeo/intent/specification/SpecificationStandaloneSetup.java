
package fr.obeo.intent.specification;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpecificationStandaloneSetup extends SpecificationStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecificationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

