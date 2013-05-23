/*
 * generated by Xtext
 */
package csep.example.cake.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import csep.example.cake.ui.internal.CakefileActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CakefileExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CakefileActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CakefileActivator.getInstance().getInjector(CakefileActivator.CSEP_EXAMPLE_CAKE_CAKEFILE);
	}
	
}
