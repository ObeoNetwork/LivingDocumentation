/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.intent.spec2test.services;

import com.google.common.base.CaseFormat;

import fr.obeo.intent.specification.NamedElement;

/**
 * Utilities for named element.
 * 
 * @author <a href="mailto:melanie.bats@obeo.fr">Melanie Bats</a>
 */
public class NamedElementUtils {
	/**
	 * Returns the element name in camel case
	 * 
	 * @param namedElement
	 *            Named element
	 * @return the element name in camel case
	 */
	public String getCamelCaseName(NamedElement namedElement) {
		String name = namedElement.getName().replaceAll(" ", "_");
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name);
	}
}
