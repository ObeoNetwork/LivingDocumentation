/*****************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *****************************************************************************/
package fr.obeo.intent.specification.parser;

import org.eclipse.emf.common.util.URI;

import fr.obeo.intent.specification.NamedElement;

/**
 * Provides some utilities on specification models.
 * 
 * @author <a href="mailto:melanie.bats@obeo.fr">Melanie Bats</a>
 */
public final class SpecificationUtils {

	/**
	 * Utilities classes do not provide default constructor.
	 */
	private SpecificationUtils() {
		// Nothing to do
	}

	/**
	 * Get the uri of the test file associated to a named element.
	 * 
	 * @param namedElement
	 *            Named element
	 * @return URI of the corresponding test file
	 */
	public static URI getTestURI(final NamedElement namedElement) {
		// TODO Implement same logic as test generator
		URI uri = URI.createPlatformResourceURI(
				"platform://org.obeonetwork.dsl.uml2.design.tests/"
						+ namedElement.getName() + ".java", true);

		return uri;
	}
}
