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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.util.BundleUtility;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author <a href="mailto:melanie.bats@obeo.fr">Melanie Bats</a>
 */
public final class SpecificationParserActivator extends AbstractUIPlugin {
	/**
	 * The plugin ID.
	 */
	public static final String PLUGIN_ID = "fr.obeo.intent.specification.parser"; //$NON-NLS-1$

	/**
	 * The shared instance of the plugin.
	 */
	private static SpecificationParserActivator plugin;

	/**
	 * The images and icons related to this plugin.
	 */
	private Map<String, Image> imageMap = new HashMap<String, Image>();

	/**
	 * {@inheritDoc}
	 */
	public void start(final BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;

	}

	/**
	 * {@inheritDoc}
	 */
	public void stop(final BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
		Iterator<Image> imageIterator = imageMap.values().iterator();
		while (imageIterator.hasNext()) {
			Image image = imageIterator.next();
			image.dispose();
		}
		imageMap.clear();
	}

	/**
	 * Returns the image at the given plug-in relative path ; if this image
	 * hasn't been loaded yet, load this image and add it to the imageMap.
	 * 
	 * @param path
	 *            path of the image to load (plug-in relative path)
	 * @return the image corresponding to the given path
	 */
	public Image getImage(final String path) {
		Image result = imageMap.get(path);
		if (result == null) {
			ImageDescriptor descriptor = getImageDescriptor(path);
			if (descriptor != null) {
				result = descriptor.createImage();
				imageMap.put(path, result);
			}
		}
		return result;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path.
	 * 
	 * @param imagePath
	 *            path of the image to load (plug-in relative path)
	 * @return the image descriptor of the image corresponding to the given path
	 */
	@SuppressWarnings("restriction")
	private ImageDescriptor getImageDescriptor(final String imagePath) {
		URL fullPathString = BundleUtility.find(getBundle(), imagePath);
		if (fullPathString == null) {
			try {
				fullPathString = new URL(imagePath);
			} catch (MalformedURLException e) {
				return null;
			}
		}
		return ImageDescriptor.createFromURL(fullPathString);
	}

	/**
	 * Returns the shared instance of this activator.
	 * 
	 * @return the shared instance of this activator
	 */
	public static SpecificationParserActivator getDefault() {
		return plugin;
	}

	/**
	 * A helper to log plugin errors.
	 * 
	 * @param severity
	 *            the error severity.
	 * @param message
	 *            the error message.
	 * @param exception
	 *            the error exception.
	 */
	public static void log(final int severity, final String message,
			final Throwable exception) {
		getDefault().getLog().log(
				new Status(severity, PLUGIN_ID, message, exception));
	}
}
