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

import org.eclipse.mylyn.docs.intent.core.document.IntentSection;

import fr.obeo.intent.specification.NamedElement;

/**
 * Element parsed by the specification parser.
 * 
 * @author <a href="mailto:melanie.bats@obeo.fr">Melanie Bats</a>
 */
public final class ParsedElement {
	/**
	 * Intent section associated to the parsed element.
	 */
	private IntentSection intentSection;

	/**
	 * The specification element.
	 */
	private NamedElement namedElement;

	/**
	 * Default constructor.
	 * 
	 * @param intentSection
	 *            Intent section
	 * @param namedElement
	 *            Named element
	 */
	public ParsedElement(final IntentSection intentSection,
			final NamedElement namedElement) {
		this.intentSection = intentSection;
		this.namedElement = namedElement;
	}

	/**
	 * Get intent section.
	 * 
	 * @return Intent section
	 */
	public IntentSection getIntentSection() {
		return intentSection;
	}

	/**
	 * Get named element.
	 * 
	 * @return The named element
	 */
	public NamedElement getNamedElement() {
		return namedElement;
	}
}
