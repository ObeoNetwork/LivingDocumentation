/*******************************************************************************
 * Copyright (c) 2010, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.intent.spec2test.ui;

import fr.obeo.intent.spec2test.main.GenTests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * An handler allowing to export an intent document / Intent Project as an HTML Document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class GenerateFromSpecificationModelAction extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection)selection).getFirstElement();
			if (firstElement instanceof IFile
					&& "specification".equals(((IFile)firstElement).getFileExtension())) {
				Resource resource = new ResourceSetImpl().getResource(
						URI.createFileURI(((IFile)firstElement).getFullPath().toOSString()), true);
				try {
					File targetFolder = new File(ResourcesPlugin.getWorkspace().getRoot()
							.getProject("org.obeonetwork.dsl.uml2.design.tests").getLocationURI().getPath()
							.toString());
					assert (targetFolder.exists());

					new GenTests(EcoreUtil.getURI(resource.getContents().iterator().next()), targetFolder,
							new ArrayList<Object>()).doGenerate(BasicMonitor
							.toMonitor(new NullProgressMonitor()));
				} catch (IOException e) {
					throw new ExecutionException("Could not generate files from specifications", e);
				}
			}

		}
		return null;
	}
}
