/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
/*
* generated by Xtext
*/
package org.eclipse.gemoc.moccml.mapping.xtext.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gemoc.moccml.mapping.xtext.ui.contentassist.AbstractEclProposalProvider;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class EclProposalProvider extends AbstractEclProposalProvider {

	
//	@Override
//	protected void lookupCrossReference(EObject model, EReference reference,
//			ICompletionProposalAcceptor acceptor,
//			Predicate<IEObjectDescription> filter,
//			Function<IEObjectDescription, ICompletionProposal> proposalFactory) {
////		System.out.println("    lookupCrossReference: " + reference.getEContainingClass().getName() + "::" + reference.getName());
//		super.lookupCrossReference(model, reference, acceptor, filter, proposalFactory);
//	}
}