/*
 * generated by Xtext
 */
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.services.FSMDslGrammarAccess;

public class FSMDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FSMDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.parser.antlr.internal.InternalFSMDslParser createParser(XtextTokenStream stream) {
		return new org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.parser.antlr.internal.InternalFSMDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "StateMachineDefinition";
	}
	
	public FSMDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FSMDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}