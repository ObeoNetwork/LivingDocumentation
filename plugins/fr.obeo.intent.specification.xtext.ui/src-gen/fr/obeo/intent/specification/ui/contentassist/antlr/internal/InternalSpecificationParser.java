package fr.obeo.intent.specification.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.obeo.intent.specification.services.SpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecificationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Specification:'", "'Roles ('", "')'", "','", "'Capabilities ('", "'Benefits ('", "'Contexts ('", "'Actions ('", "'Behaviors ('", "'Feature:'", "'linked to '", "'Story:'", "'As '", "'I want '", "'So that '", "'Scenario:'", "'Given '", "'When '", "'Then '"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g"; }


     
     	private SpecificationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SpecificationGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSpecification"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:60:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:61:1: ( ruleSpecification EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:62:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpecification_in_entryRuleSpecification61);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpecification68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:69:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:73:2: ( ( ( rule__Specification__Group__0 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:74:1: ( ( rule__Specification__Group__0 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:74:1: ( ( rule__Specification__Group__0 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:75:1: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:76:1: ( rule__Specification__Group__0 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:76:2: rule__Specification__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__0_in_ruleSpecification94);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleAutomationLayer"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:88:1: entryRuleAutomationLayer : ruleAutomationLayer EOF ;
    public final void entryRuleAutomationLayer() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:89:1: ( ruleAutomationLayer EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:90:1: ruleAutomationLayer EOF
            {
             before(grammarAccess.getAutomationLayerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAutomationLayer_in_entryRuleAutomationLayer121);
            ruleAutomationLayer();

            state._fsp--;

             after(grammarAccess.getAutomationLayerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAutomationLayer128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutomationLayer"


    // $ANTLR start "ruleAutomationLayer"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:97:1: ruleAutomationLayer : ( ( rule__AutomationLayer__Group__0 ) ) ;
    public final void ruleAutomationLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:101:2: ( ( ( rule__AutomationLayer__Group__0 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:102:1: ( ( rule__AutomationLayer__Group__0 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:102:1: ( ( rule__AutomationLayer__Group__0 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:103:1: ( rule__AutomationLayer__Group__0 )
            {
             before(grammarAccess.getAutomationLayerAccess().getGroup()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:104:1: ( rule__AutomationLayer__Group__0 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:104:2: rule__AutomationLayer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__0_in_ruleAutomationLayer154);
            rule__AutomationLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutomationLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutomationLayer"


    // $ANTLR start "entryRuleContext"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:116:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:117:1: ( ruleContext EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:118:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext181);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:125:1: ruleContext : ( ( rule__Context__NameAssignment ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:129:2: ( ( ( rule__Context__NameAssignment ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:130:1: ( ( rule__Context__NameAssignment ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:130:1: ( ( rule__Context__NameAssignment ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:131:1: ( rule__Context__NameAssignment )
            {
             before(grammarAccess.getContextAccess().getNameAssignment()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:132:1: ( rule__Context__NameAssignment )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:132:2: rule__Context__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Context__NameAssignment_in_ruleContext214);
            rule__Context__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleAction"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:144:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:145:1: ( ruleAction EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:146:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction241);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:153:1: ruleAction : ( ( rule__Action__NameAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:157:2: ( ( ( rule__Action__NameAssignment ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:158:1: ( ( rule__Action__NameAssignment ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:158:1: ( ( rule__Action__NameAssignment ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:159:1: ( rule__Action__NameAssignment )
            {
             before(grammarAccess.getActionAccess().getNameAssignment()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:160:1: ( rule__Action__NameAssignment )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:160:2: rule__Action__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__NameAssignment_in_ruleAction274);
            rule__Action__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleBehaviour"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:172:1: entryRuleBehaviour : ruleBehaviour EOF ;
    public final void entryRuleBehaviour() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:173:1: ( ruleBehaviour EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:174:1: ruleBehaviour EOF
            {
             before(grammarAccess.getBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_entryRuleBehaviour301);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getBehaviourRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehaviour308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:181:1: ruleBehaviour : ( ( rule__Behaviour__NameAssignment ) ) ;
    public final void ruleBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:185:2: ( ( ( rule__Behaviour__NameAssignment ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:186:1: ( ( rule__Behaviour__NameAssignment ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:186:1: ( ( rule__Behaviour__NameAssignment ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:187:1: ( rule__Behaviour__NameAssignment )
            {
             before(grammarAccess.getBehaviourAccess().getNameAssignment()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:188:1: ( rule__Behaviour__NameAssignment )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:188:2: rule__Behaviour__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behaviour__NameAssignment_in_ruleBehaviour334);
            rule__Behaviour__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleFeature"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:200:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:201:1: ( ruleFeature EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:202:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature361);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:209:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:213:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:214:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:214:1: ( ( rule__Feature__Group__0 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:215:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:216:1: ( rule__Feature__Group__0 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:216:2: rule__Feature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__0_in_ruleFeature394);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStory"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:228:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:229:1: ( ruleStory EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:230:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStory_in_entryRuleStory421);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStory428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:237:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:241:2: ( ( ( rule__Story__Group__0 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:242:1: ( ( rule__Story__Group__0 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:242:1: ( ( rule__Story__Group__0 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:243:1: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:244:1: ( rule__Story__Group__0 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:244:2: rule__Story__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__0_in_ruleStory454);
            rule__Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleScenario"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:256:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:257:1: ( ruleScenario EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:258:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_entryRuleScenario481);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenario488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:265:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:269:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:270:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:270:1: ( ( rule__Scenario__Group__0 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:271:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:272:1: ( rule__Scenario__Group__0 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:272:2: rule__Scenario__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__0_in_ruleScenario514);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleRole"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:284:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:285:1: ( ruleRole EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:286:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole541);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:293:1: ruleRole : ( ( rule__Role__NameAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:297:2: ( ( ( rule__Role__NameAssignment ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:298:1: ( ( rule__Role__NameAssignment ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:298:1: ( ( rule__Role__NameAssignment ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:299:1: ( rule__Role__NameAssignment )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:300:1: ( rule__Role__NameAssignment )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:300:2: rule__Role__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_in_ruleRole574);
            rule__Role__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleCapability"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:312:1: entryRuleCapability : ruleCapability EOF ;
    public final void entryRuleCapability() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:313:1: ( ruleCapability EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:314:1: ruleCapability EOF
            {
             before(grammarAccess.getCapabilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapability_in_entryRuleCapability601);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getCapabilityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCapability608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:321:1: ruleCapability : ( ( rule__Capability__NameAssignment ) ) ;
    public final void ruleCapability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:325:2: ( ( ( rule__Capability__NameAssignment ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:326:1: ( ( rule__Capability__NameAssignment ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:326:1: ( ( rule__Capability__NameAssignment ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:327:1: ( rule__Capability__NameAssignment )
            {
             before(grammarAccess.getCapabilityAccess().getNameAssignment()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:328:1: ( rule__Capability__NameAssignment )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:328:2: rule__Capability__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Capability__NameAssignment_in_ruleCapability634);
            rule__Capability__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleBenefit"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:340:1: entryRuleBenefit : ruleBenefit EOF ;
    public final void entryRuleBenefit() throws RecognitionException {
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:341:1: ( ruleBenefit EOF )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:342:1: ruleBenefit EOF
            {
             before(grammarAccess.getBenefitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBenefit_in_entryRuleBenefit661);
            ruleBenefit();

            state._fsp--;

             after(grammarAccess.getBenefitRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBenefit668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBenefit"


    // $ANTLR start "ruleBenefit"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:349:1: ruleBenefit : ( ( rule__Benefit__NameAssignment ) ) ;
    public final void ruleBenefit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:353:2: ( ( ( rule__Benefit__NameAssignment ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:354:1: ( ( rule__Benefit__NameAssignment ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:354:1: ( ( rule__Benefit__NameAssignment ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:355:1: ( rule__Benefit__NameAssignment )
            {
             before(grammarAccess.getBenefitAccess().getNameAssignment()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:356:1: ( rule__Benefit__NameAssignment )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:356:2: rule__Benefit__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Benefit__NameAssignment_in_ruleBenefit694);
            rule__Benefit__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBenefitAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBenefit"


    // $ANTLR start "rule__Specification__Group__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:370:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:374:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:375:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__0__Impl_in_rule__Specification__Group__0728);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__1_in_rule__Specification__Group__0731);
            rule__Specification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:382:1: rule__Specification__Group__0__Impl : ( 'Specification:' ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:386:1: ( ( 'Specification:' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:387:1: ( 'Specification:' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:387:1: ( 'Specification:' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:388:1: 'Specification:'
            {
             before(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Specification__Group__0__Impl759); 
             after(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:401:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:405:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:406:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__1__Impl_in_rule__Specification__Group__1790);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__2_in_rule__Specification__Group__1793);
            rule__Specification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:413:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__NameAssignment_1 ) ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:417:1: ( ( ( rule__Specification__NameAssignment_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:418:1: ( ( rule__Specification__NameAssignment_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:418:1: ( ( rule__Specification__NameAssignment_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:419:1: ( rule__Specification__NameAssignment_1 )
            {
             before(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:420:1: ( rule__Specification__NameAssignment_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:420:2: rule__Specification__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__NameAssignment_1_in_rule__Specification__Group__1__Impl820);
            rule__Specification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Specification__Group__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:430:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:434:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:435:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__2__Impl_in_rule__Specification__Group__2850);
            rule__Specification__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__3_in_rule__Specification__Group__2853);
            rule__Specification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2"


    // $ANTLR start "rule__Specification__Group__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:442:1: rule__Specification__Group__2__Impl : ( ( rule__Specification__Group_2__0 )? ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:446:1: ( ( ( rule__Specification__Group_2__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:447:1: ( ( rule__Specification__Group_2__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:447:1: ( ( rule__Specification__Group_2__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:448:1: ( rule__Specification__Group_2__0 )?
            {
             before(grammarAccess.getSpecificationAccess().getGroup_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:449:1: ( rule__Specification__Group_2__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:449:2: rule__Specification__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__0_in_rule__Specification__Group__2__Impl880);
                    rule__Specification__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2__Impl"


    // $ANTLR start "rule__Specification__Group__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:459:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl rule__Specification__Group__4 ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:463:1: ( rule__Specification__Group__3__Impl rule__Specification__Group__4 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:464:2: rule__Specification__Group__3__Impl rule__Specification__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__3__Impl_in_rule__Specification__Group__3911);
            rule__Specification__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__4_in_rule__Specification__Group__3914);
            rule__Specification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__3"


    // $ANTLR start "rule__Specification__Group__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:471:1: rule__Specification__Group__3__Impl : ( ( rule__Specification__Group_3__0 )? ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:475:1: ( ( ( rule__Specification__Group_3__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:476:1: ( ( rule__Specification__Group_3__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:476:1: ( ( rule__Specification__Group_3__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:477:1: ( rule__Specification__Group_3__0 )?
            {
             before(grammarAccess.getSpecificationAccess().getGroup_3()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:478:1: ( rule__Specification__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:478:2: rule__Specification__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__0_in_rule__Specification__Group__3__Impl941);
                    rule__Specification__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__3__Impl"


    // $ANTLR start "rule__Specification__Group__4"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:488:1: rule__Specification__Group__4 : rule__Specification__Group__4__Impl rule__Specification__Group__5 ;
    public final void rule__Specification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:492:1: ( rule__Specification__Group__4__Impl rule__Specification__Group__5 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:493:2: rule__Specification__Group__4__Impl rule__Specification__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__4__Impl_in_rule__Specification__Group__4972);
            rule__Specification__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__5_in_rule__Specification__Group__4975);
            rule__Specification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__4"


    // $ANTLR start "rule__Specification__Group__4__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:500:1: rule__Specification__Group__4__Impl : ( ( rule__Specification__Group_4__0 )? ) ;
    public final void rule__Specification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:504:1: ( ( ( rule__Specification__Group_4__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:505:1: ( ( rule__Specification__Group_4__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:505:1: ( ( rule__Specification__Group_4__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:506:1: ( rule__Specification__Group_4__0 )?
            {
             before(grammarAccess.getSpecificationAccess().getGroup_4()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:507:1: ( rule__Specification__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:507:2: rule__Specification__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__0_in_rule__Specification__Group__4__Impl1002);
                    rule__Specification__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__4__Impl"


    // $ANTLR start "rule__Specification__Group__5"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:517:1: rule__Specification__Group__5 : rule__Specification__Group__5__Impl rule__Specification__Group__6 ;
    public final void rule__Specification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:521:1: ( rule__Specification__Group__5__Impl rule__Specification__Group__6 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:522:2: rule__Specification__Group__5__Impl rule__Specification__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__5__Impl_in_rule__Specification__Group__51033);
            rule__Specification__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__6_in_rule__Specification__Group__51036);
            rule__Specification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__5"


    // $ANTLR start "rule__Specification__Group__5__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:529:1: rule__Specification__Group__5__Impl : ( ( rule__Specification__AutomationLayerAssignment_5 )? ) ;
    public final void rule__Specification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:533:1: ( ( ( rule__Specification__AutomationLayerAssignment_5 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:534:1: ( ( rule__Specification__AutomationLayerAssignment_5 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:534:1: ( ( rule__Specification__AutomationLayerAssignment_5 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:535:1: ( rule__Specification__AutomationLayerAssignment_5 )?
            {
             before(grammarAccess.getSpecificationAccess().getAutomationLayerAssignment_5()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:536:1: ( rule__Specification__AutomationLayerAssignment_5 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:536:2: rule__Specification__AutomationLayerAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Specification__AutomationLayerAssignment_5_in_rule__Specification__Group__5__Impl1063);
                    rule__Specification__AutomationLayerAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getAutomationLayerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__5__Impl"


    // $ANTLR start "rule__Specification__Group__6"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:546:1: rule__Specification__Group__6 : rule__Specification__Group__6__Impl rule__Specification__Group__7 ;
    public final void rule__Specification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:550:1: ( rule__Specification__Group__6__Impl rule__Specification__Group__7 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:551:2: rule__Specification__Group__6__Impl rule__Specification__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__6__Impl_in_rule__Specification__Group__61094);
            rule__Specification__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__7_in_rule__Specification__Group__61097);
            rule__Specification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__6"


    // $ANTLR start "rule__Specification__Group__6__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:558:1: rule__Specification__Group__6__Impl : ( ( rule__Specification__FeaturesAssignment_6 )* ) ;
    public final void rule__Specification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:562:1: ( ( ( rule__Specification__FeaturesAssignment_6 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:563:1: ( ( rule__Specification__FeaturesAssignment_6 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:563:1: ( ( rule__Specification__FeaturesAssignment_6 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:564:1: ( rule__Specification__FeaturesAssignment_6 )*
            {
             before(grammarAccess.getSpecificationAccess().getFeaturesAssignment_6()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:565:1: ( rule__Specification__FeaturesAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:565:2: rule__Specification__FeaturesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Specification__FeaturesAssignment_6_in_rule__Specification__Group__6__Impl1124);
            	    rule__Specification__FeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getFeaturesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__6__Impl"


    // $ANTLR start "rule__Specification__Group__7"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:575:1: rule__Specification__Group__7 : rule__Specification__Group__7__Impl ;
    public final void rule__Specification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:579:1: ( rule__Specification__Group__7__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:580:2: rule__Specification__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group__7__Impl_in_rule__Specification__Group__71155);
            rule__Specification__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__7"


    // $ANTLR start "rule__Specification__Group__7__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:586:1: rule__Specification__Group__7__Impl : ( ( rule__Specification__StoriesAssignment_7 )* ) ;
    public final void rule__Specification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:590:1: ( ( ( rule__Specification__StoriesAssignment_7 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:591:1: ( ( rule__Specification__StoriesAssignment_7 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:591:1: ( ( rule__Specification__StoriesAssignment_7 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:592:1: ( rule__Specification__StoriesAssignment_7 )*
            {
             before(grammarAccess.getSpecificationAccess().getStoriesAssignment_7()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:593:1: ( rule__Specification__StoriesAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:593:2: rule__Specification__StoriesAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Specification__StoriesAssignment_7_in_rule__Specification__Group__7__Impl1182);
            	    rule__Specification__StoriesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getStoriesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__7__Impl"


    // $ANTLR start "rule__Specification__Group_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:619:1: rule__Specification__Group_2__0 : rule__Specification__Group_2__0__Impl rule__Specification__Group_2__1 ;
    public final void rule__Specification__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:623:1: ( rule__Specification__Group_2__0__Impl rule__Specification__Group_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:624:2: rule__Specification__Group_2__0__Impl rule__Specification__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__0__Impl_in_rule__Specification__Group_2__01229);
            rule__Specification__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__1_in_rule__Specification__Group_2__01232);
            rule__Specification__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__0"


    // $ANTLR start "rule__Specification__Group_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:631:1: rule__Specification__Group_2__0__Impl : ( 'Roles (' ) ;
    public final void rule__Specification__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:635:1: ( ( 'Roles (' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:636:1: ( 'Roles (' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:636:1: ( 'Roles (' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:637:1: 'Roles ('
            {
             before(grammarAccess.getSpecificationAccess().getRolesKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Specification__Group_2__0__Impl1260); 
             after(grammarAccess.getSpecificationAccess().getRolesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__0__Impl"


    // $ANTLR start "rule__Specification__Group_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:650:1: rule__Specification__Group_2__1 : rule__Specification__Group_2__1__Impl rule__Specification__Group_2__2 ;
    public final void rule__Specification__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:654:1: ( rule__Specification__Group_2__1__Impl rule__Specification__Group_2__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:655:2: rule__Specification__Group_2__1__Impl rule__Specification__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__1__Impl_in_rule__Specification__Group_2__11291);
            rule__Specification__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__2_in_rule__Specification__Group_2__11294);
            rule__Specification__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__1"


    // $ANTLR start "rule__Specification__Group_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:662:1: rule__Specification__Group_2__1__Impl : ( ( rule__Specification__RolesAssignment_2_1 ) ) ;
    public final void rule__Specification__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:666:1: ( ( ( rule__Specification__RolesAssignment_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:667:1: ( ( rule__Specification__RolesAssignment_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:667:1: ( ( rule__Specification__RolesAssignment_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:668:1: ( rule__Specification__RolesAssignment_2_1 )
            {
             before(grammarAccess.getSpecificationAccess().getRolesAssignment_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:669:1: ( rule__Specification__RolesAssignment_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:669:2: rule__Specification__RolesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__RolesAssignment_2_1_in_rule__Specification__Group_2__1__Impl1321);
            rule__Specification__RolesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getRolesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__1__Impl"


    // $ANTLR start "rule__Specification__Group_2__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:679:1: rule__Specification__Group_2__2 : rule__Specification__Group_2__2__Impl rule__Specification__Group_2__3 ;
    public final void rule__Specification__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:683:1: ( rule__Specification__Group_2__2__Impl rule__Specification__Group_2__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:684:2: rule__Specification__Group_2__2__Impl rule__Specification__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__2__Impl_in_rule__Specification__Group_2__21351);
            rule__Specification__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__3_in_rule__Specification__Group_2__21354);
            rule__Specification__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__2"


    // $ANTLR start "rule__Specification__Group_2__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:691:1: rule__Specification__Group_2__2__Impl : ( ( rule__Specification__Group_2_2__0 )* ) ;
    public final void rule__Specification__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:695:1: ( ( ( rule__Specification__Group_2_2__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:696:1: ( ( rule__Specification__Group_2_2__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:696:1: ( ( rule__Specification__Group_2_2__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:697:1: ( rule__Specification__Group_2_2__0 )*
            {
             before(grammarAccess.getSpecificationAccess().getGroup_2_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:698:1: ( rule__Specification__Group_2_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:698:2: rule__Specification__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2_2__0_in_rule__Specification__Group_2__2__Impl1381);
            	    rule__Specification__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__2__Impl"


    // $ANTLR start "rule__Specification__Group_2__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:708:1: rule__Specification__Group_2__3 : rule__Specification__Group_2__3__Impl ;
    public final void rule__Specification__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:712:1: ( rule__Specification__Group_2__3__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:713:2: rule__Specification__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2__3__Impl_in_rule__Specification__Group_2__31412);
            rule__Specification__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__3"


    // $ANTLR start "rule__Specification__Group_2__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:719:1: rule__Specification__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Specification__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:723:1: ( ( ')' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:724:1: ( ')' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:724:1: ( ')' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:725:1: ')'
            {
             before(grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_2_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Specification__Group_2__3__Impl1440); 
             after(grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2__3__Impl"


    // $ANTLR start "rule__Specification__Group_2_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:746:1: rule__Specification__Group_2_2__0 : rule__Specification__Group_2_2__0__Impl rule__Specification__Group_2_2__1 ;
    public final void rule__Specification__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:750:1: ( rule__Specification__Group_2_2__0__Impl rule__Specification__Group_2_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:751:2: rule__Specification__Group_2_2__0__Impl rule__Specification__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2_2__0__Impl_in_rule__Specification__Group_2_2__01479);
            rule__Specification__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2_2__1_in_rule__Specification__Group_2_2__01482);
            rule__Specification__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2_2__0"


    // $ANTLR start "rule__Specification__Group_2_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:758:1: rule__Specification__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Specification__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:762:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:763:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:763:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:764:1: ','
            {
             before(grammarAccess.getSpecificationAccess().getCommaKeyword_2_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Specification__Group_2_2__0__Impl1510); 
             after(grammarAccess.getSpecificationAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2_2__0__Impl"


    // $ANTLR start "rule__Specification__Group_2_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:777:1: rule__Specification__Group_2_2__1 : rule__Specification__Group_2_2__1__Impl ;
    public final void rule__Specification__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:781:1: ( rule__Specification__Group_2_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:782:2: rule__Specification__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_2_2__1__Impl_in_rule__Specification__Group_2_2__11541);
            rule__Specification__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2_2__1"


    // $ANTLR start "rule__Specification__Group_2_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:788:1: rule__Specification__Group_2_2__1__Impl : ( ( rule__Specification__RolesAssignment_2_2_1 ) ) ;
    public final void rule__Specification__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:792:1: ( ( ( rule__Specification__RolesAssignment_2_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:793:1: ( ( rule__Specification__RolesAssignment_2_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:793:1: ( ( rule__Specification__RolesAssignment_2_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:794:1: ( rule__Specification__RolesAssignment_2_2_1 )
            {
             before(grammarAccess.getSpecificationAccess().getRolesAssignment_2_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:795:1: ( rule__Specification__RolesAssignment_2_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:795:2: rule__Specification__RolesAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__RolesAssignment_2_2_1_in_rule__Specification__Group_2_2__1__Impl1568);
            rule__Specification__RolesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getRolesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_2_2__1__Impl"


    // $ANTLR start "rule__Specification__Group_3__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:809:1: rule__Specification__Group_3__0 : rule__Specification__Group_3__0__Impl rule__Specification__Group_3__1 ;
    public final void rule__Specification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:813:1: ( rule__Specification__Group_3__0__Impl rule__Specification__Group_3__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:814:2: rule__Specification__Group_3__0__Impl rule__Specification__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__0__Impl_in_rule__Specification__Group_3__01602);
            rule__Specification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__1_in_rule__Specification__Group_3__01605);
            rule__Specification__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__0"


    // $ANTLR start "rule__Specification__Group_3__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:821:1: rule__Specification__Group_3__0__Impl : ( 'Capabilities (' ) ;
    public final void rule__Specification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:825:1: ( ( 'Capabilities (' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:826:1: ( 'Capabilities (' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:826:1: ( 'Capabilities (' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:827:1: 'Capabilities ('
            {
             before(grammarAccess.getSpecificationAccess().getCapabilitiesKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Specification__Group_3__0__Impl1633); 
             after(grammarAccess.getSpecificationAccess().getCapabilitiesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__0__Impl"


    // $ANTLR start "rule__Specification__Group_3__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:840:1: rule__Specification__Group_3__1 : rule__Specification__Group_3__1__Impl rule__Specification__Group_3__2 ;
    public final void rule__Specification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:844:1: ( rule__Specification__Group_3__1__Impl rule__Specification__Group_3__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:845:2: rule__Specification__Group_3__1__Impl rule__Specification__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__1__Impl_in_rule__Specification__Group_3__11664);
            rule__Specification__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__2_in_rule__Specification__Group_3__11667);
            rule__Specification__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__1"


    // $ANTLR start "rule__Specification__Group_3__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:852:1: rule__Specification__Group_3__1__Impl : ( ( rule__Specification__CapabilitiesAssignment_3_1 ) ) ;
    public final void rule__Specification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:856:1: ( ( ( rule__Specification__CapabilitiesAssignment_3_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:857:1: ( ( rule__Specification__CapabilitiesAssignment_3_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:857:1: ( ( rule__Specification__CapabilitiesAssignment_3_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:858:1: ( rule__Specification__CapabilitiesAssignment_3_1 )
            {
             before(grammarAccess.getSpecificationAccess().getCapabilitiesAssignment_3_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:859:1: ( rule__Specification__CapabilitiesAssignment_3_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:859:2: rule__Specification__CapabilitiesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__CapabilitiesAssignment_3_1_in_rule__Specification__Group_3__1__Impl1694);
            rule__Specification__CapabilitiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getCapabilitiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__1__Impl"


    // $ANTLR start "rule__Specification__Group_3__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:869:1: rule__Specification__Group_3__2 : rule__Specification__Group_3__2__Impl rule__Specification__Group_3__3 ;
    public final void rule__Specification__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:873:1: ( rule__Specification__Group_3__2__Impl rule__Specification__Group_3__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:874:2: rule__Specification__Group_3__2__Impl rule__Specification__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__2__Impl_in_rule__Specification__Group_3__21724);
            rule__Specification__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__3_in_rule__Specification__Group_3__21727);
            rule__Specification__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__2"


    // $ANTLR start "rule__Specification__Group_3__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:881:1: rule__Specification__Group_3__2__Impl : ( ( rule__Specification__Group_3_2__0 )* ) ;
    public final void rule__Specification__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:885:1: ( ( ( rule__Specification__Group_3_2__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:886:1: ( ( rule__Specification__Group_3_2__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:886:1: ( ( rule__Specification__Group_3_2__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:887:1: ( rule__Specification__Group_3_2__0 )*
            {
             before(grammarAccess.getSpecificationAccess().getGroup_3_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:888:1: ( rule__Specification__Group_3_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:888:2: rule__Specification__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3_2__0_in_rule__Specification__Group_3__2__Impl1754);
            	    rule__Specification__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__2__Impl"


    // $ANTLR start "rule__Specification__Group_3__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:898:1: rule__Specification__Group_3__3 : rule__Specification__Group_3__3__Impl ;
    public final void rule__Specification__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:902:1: ( rule__Specification__Group_3__3__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:903:2: rule__Specification__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3__3__Impl_in_rule__Specification__Group_3__31785);
            rule__Specification__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__3"


    // $ANTLR start "rule__Specification__Group_3__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:909:1: rule__Specification__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Specification__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:913:1: ( ( ')' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:914:1: ( ')' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:914:1: ( ')' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:915:1: ')'
            {
             before(grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_3_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Specification__Group_3__3__Impl1813); 
             after(grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3__3__Impl"


    // $ANTLR start "rule__Specification__Group_3_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:936:1: rule__Specification__Group_3_2__0 : rule__Specification__Group_3_2__0__Impl rule__Specification__Group_3_2__1 ;
    public final void rule__Specification__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:940:1: ( rule__Specification__Group_3_2__0__Impl rule__Specification__Group_3_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:941:2: rule__Specification__Group_3_2__0__Impl rule__Specification__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3_2__0__Impl_in_rule__Specification__Group_3_2__01852);
            rule__Specification__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3_2__1_in_rule__Specification__Group_3_2__01855);
            rule__Specification__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3_2__0"


    // $ANTLR start "rule__Specification__Group_3_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:948:1: rule__Specification__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Specification__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:952:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:953:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:953:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:954:1: ','
            {
             before(grammarAccess.getSpecificationAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Specification__Group_3_2__0__Impl1883); 
             after(grammarAccess.getSpecificationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3_2__0__Impl"


    // $ANTLR start "rule__Specification__Group_3_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:967:1: rule__Specification__Group_3_2__1 : rule__Specification__Group_3_2__1__Impl ;
    public final void rule__Specification__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:971:1: ( rule__Specification__Group_3_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:972:2: rule__Specification__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_3_2__1__Impl_in_rule__Specification__Group_3_2__11914);
            rule__Specification__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3_2__1"


    // $ANTLR start "rule__Specification__Group_3_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:978:1: rule__Specification__Group_3_2__1__Impl : ( ( rule__Specification__CapabilitiesAssignment_3_2_1 ) ) ;
    public final void rule__Specification__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:982:1: ( ( ( rule__Specification__CapabilitiesAssignment_3_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:983:1: ( ( rule__Specification__CapabilitiesAssignment_3_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:983:1: ( ( rule__Specification__CapabilitiesAssignment_3_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:984:1: ( rule__Specification__CapabilitiesAssignment_3_2_1 )
            {
             before(grammarAccess.getSpecificationAccess().getCapabilitiesAssignment_3_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:985:1: ( rule__Specification__CapabilitiesAssignment_3_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:985:2: rule__Specification__CapabilitiesAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__CapabilitiesAssignment_3_2_1_in_rule__Specification__Group_3_2__1__Impl1941);
            rule__Specification__CapabilitiesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getCapabilitiesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_3_2__1__Impl"


    // $ANTLR start "rule__Specification__Group_4__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:999:1: rule__Specification__Group_4__0 : rule__Specification__Group_4__0__Impl rule__Specification__Group_4__1 ;
    public final void rule__Specification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1003:1: ( rule__Specification__Group_4__0__Impl rule__Specification__Group_4__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1004:2: rule__Specification__Group_4__0__Impl rule__Specification__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__0__Impl_in_rule__Specification__Group_4__01975);
            rule__Specification__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__1_in_rule__Specification__Group_4__01978);
            rule__Specification__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__0"


    // $ANTLR start "rule__Specification__Group_4__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1011:1: rule__Specification__Group_4__0__Impl : ( 'Benefits (' ) ;
    public final void rule__Specification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1015:1: ( ( 'Benefits (' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1016:1: ( 'Benefits (' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1016:1: ( 'Benefits (' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1017:1: 'Benefits ('
            {
             before(grammarAccess.getSpecificationAccess().getBenefitsKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Specification__Group_4__0__Impl2006); 
             after(grammarAccess.getSpecificationAccess().getBenefitsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__0__Impl"


    // $ANTLR start "rule__Specification__Group_4__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1030:1: rule__Specification__Group_4__1 : rule__Specification__Group_4__1__Impl rule__Specification__Group_4__2 ;
    public final void rule__Specification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1034:1: ( rule__Specification__Group_4__1__Impl rule__Specification__Group_4__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1035:2: rule__Specification__Group_4__1__Impl rule__Specification__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__1__Impl_in_rule__Specification__Group_4__12037);
            rule__Specification__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__2_in_rule__Specification__Group_4__12040);
            rule__Specification__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__1"


    // $ANTLR start "rule__Specification__Group_4__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1042:1: rule__Specification__Group_4__1__Impl : ( ( rule__Specification__BenefitsAssignment_4_1 ) ) ;
    public final void rule__Specification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1046:1: ( ( ( rule__Specification__BenefitsAssignment_4_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1047:1: ( ( rule__Specification__BenefitsAssignment_4_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1047:1: ( ( rule__Specification__BenefitsAssignment_4_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1048:1: ( rule__Specification__BenefitsAssignment_4_1 )
            {
             before(grammarAccess.getSpecificationAccess().getBenefitsAssignment_4_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1049:1: ( rule__Specification__BenefitsAssignment_4_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1049:2: rule__Specification__BenefitsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__BenefitsAssignment_4_1_in_rule__Specification__Group_4__1__Impl2067);
            rule__Specification__BenefitsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getBenefitsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__1__Impl"


    // $ANTLR start "rule__Specification__Group_4__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1059:1: rule__Specification__Group_4__2 : rule__Specification__Group_4__2__Impl rule__Specification__Group_4__3 ;
    public final void rule__Specification__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1063:1: ( rule__Specification__Group_4__2__Impl rule__Specification__Group_4__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1064:2: rule__Specification__Group_4__2__Impl rule__Specification__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__2__Impl_in_rule__Specification__Group_4__22097);
            rule__Specification__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__3_in_rule__Specification__Group_4__22100);
            rule__Specification__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__2"


    // $ANTLR start "rule__Specification__Group_4__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1071:1: rule__Specification__Group_4__2__Impl : ( ( rule__Specification__Group_4_2__0 )* ) ;
    public final void rule__Specification__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1075:1: ( ( ( rule__Specification__Group_4_2__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1076:1: ( ( rule__Specification__Group_4_2__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1076:1: ( ( rule__Specification__Group_4_2__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1077:1: ( rule__Specification__Group_4_2__0 )*
            {
             before(grammarAccess.getSpecificationAccess().getGroup_4_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1078:1: ( rule__Specification__Group_4_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1078:2: rule__Specification__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4_2__0_in_rule__Specification__Group_4__2__Impl2127);
            	    rule__Specification__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__2__Impl"


    // $ANTLR start "rule__Specification__Group_4__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1088:1: rule__Specification__Group_4__3 : rule__Specification__Group_4__3__Impl ;
    public final void rule__Specification__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1092:1: ( rule__Specification__Group_4__3__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1093:2: rule__Specification__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4__3__Impl_in_rule__Specification__Group_4__32158);
            rule__Specification__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__3"


    // $ANTLR start "rule__Specification__Group_4__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1099:1: rule__Specification__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Specification__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1103:1: ( ( ')' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1104:1: ( ')' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1104:1: ( ')' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1105:1: ')'
            {
             before(grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_4_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Specification__Group_4__3__Impl2186); 
             after(grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__3__Impl"


    // $ANTLR start "rule__Specification__Group_4_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1126:1: rule__Specification__Group_4_2__0 : rule__Specification__Group_4_2__0__Impl rule__Specification__Group_4_2__1 ;
    public final void rule__Specification__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1130:1: ( rule__Specification__Group_4_2__0__Impl rule__Specification__Group_4_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1131:2: rule__Specification__Group_4_2__0__Impl rule__Specification__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4_2__0__Impl_in_rule__Specification__Group_4_2__02225);
            rule__Specification__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4_2__1_in_rule__Specification__Group_4_2__02228);
            rule__Specification__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4_2__0"


    // $ANTLR start "rule__Specification__Group_4_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1138:1: rule__Specification__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Specification__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1142:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1143:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1143:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1144:1: ','
            {
             before(grammarAccess.getSpecificationAccess().getCommaKeyword_4_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Specification__Group_4_2__0__Impl2256); 
             after(grammarAccess.getSpecificationAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4_2__0__Impl"


    // $ANTLR start "rule__Specification__Group_4_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1157:1: rule__Specification__Group_4_2__1 : rule__Specification__Group_4_2__1__Impl ;
    public final void rule__Specification__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1161:1: ( rule__Specification__Group_4_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1162:2: rule__Specification__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__Group_4_2__1__Impl_in_rule__Specification__Group_4_2__12287);
            rule__Specification__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4_2__1"


    // $ANTLR start "rule__Specification__Group_4_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1168:1: rule__Specification__Group_4_2__1__Impl : ( ( rule__Specification__CapabilitiesAssignment_4_2_1 ) ) ;
    public final void rule__Specification__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1172:1: ( ( ( rule__Specification__CapabilitiesAssignment_4_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1173:1: ( ( rule__Specification__CapabilitiesAssignment_4_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1173:1: ( ( rule__Specification__CapabilitiesAssignment_4_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1174:1: ( rule__Specification__CapabilitiesAssignment_4_2_1 )
            {
             before(grammarAccess.getSpecificationAccess().getCapabilitiesAssignment_4_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1175:1: ( rule__Specification__CapabilitiesAssignment_4_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1175:2: rule__Specification__CapabilitiesAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Specification__CapabilitiesAssignment_4_2_1_in_rule__Specification__Group_4_2__1__Impl2314);
            rule__Specification__CapabilitiesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getCapabilitiesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4_2__1__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1189:1: rule__AutomationLayer__Group__0 : rule__AutomationLayer__Group__0__Impl rule__AutomationLayer__Group__1 ;
    public final void rule__AutomationLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1193:1: ( rule__AutomationLayer__Group__0__Impl rule__AutomationLayer__Group__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1194:2: rule__AutomationLayer__Group__0__Impl rule__AutomationLayer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__0__Impl_in_rule__AutomationLayer__Group__02348);
            rule__AutomationLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__1_in_rule__AutomationLayer__Group__02351);
            rule__AutomationLayer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__0"


    // $ANTLR start "rule__AutomationLayer__Group__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1201:1: rule__AutomationLayer__Group__0__Impl : ( 'Contexts (' ) ;
    public final void rule__AutomationLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1205:1: ( ( 'Contexts (' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1206:1: ( 'Contexts (' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1206:1: ( 'Contexts (' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1207:1: 'Contexts ('
            {
             before(grammarAccess.getAutomationLayerAccess().getContextsKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__AutomationLayer__Group__0__Impl2379); 
             after(grammarAccess.getAutomationLayerAccess().getContextsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__0__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1220:1: rule__AutomationLayer__Group__1 : rule__AutomationLayer__Group__1__Impl rule__AutomationLayer__Group__2 ;
    public final void rule__AutomationLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1224:1: ( rule__AutomationLayer__Group__1__Impl rule__AutomationLayer__Group__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1225:2: rule__AutomationLayer__Group__1__Impl rule__AutomationLayer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__1__Impl_in_rule__AutomationLayer__Group__12410);
            rule__AutomationLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__2_in_rule__AutomationLayer__Group__12413);
            rule__AutomationLayer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__1"


    // $ANTLR start "rule__AutomationLayer__Group__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1232:1: rule__AutomationLayer__Group__1__Impl : ( ( rule__AutomationLayer__ContextAssignment_1 ) ) ;
    public final void rule__AutomationLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1236:1: ( ( ( rule__AutomationLayer__ContextAssignment_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1237:1: ( ( rule__AutomationLayer__ContextAssignment_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1237:1: ( ( rule__AutomationLayer__ContextAssignment_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1238:1: ( rule__AutomationLayer__ContextAssignment_1 )
            {
             before(grammarAccess.getAutomationLayerAccess().getContextAssignment_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1239:1: ( rule__AutomationLayer__ContextAssignment_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1239:2: rule__AutomationLayer__ContextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__ContextAssignment_1_in_rule__AutomationLayer__Group__1__Impl2440);
            rule__AutomationLayer__ContextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomationLayerAccess().getContextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__1__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1249:1: rule__AutomationLayer__Group__2 : rule__AutomationLayer__Group__2__Impl rule__AutomationLayer__Group__3 ;
    public final void rule__AutomationLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1253:1: ( rule__AutomationLayer__Group__2__Impl rule__AutomationLayer__Group__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1254:2: rule__AutomationLayer__Group__2__Impl rule__AutomationLayer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__2__Impl_in_rule__AutomationLayer__Group__22470);
            rule__AutomationLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__3_in_rule__AutomationLayer__Group__22473);
            rule__AutomationLayer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__2"


    // $ANTLR start "rule__AutomationLayer__Group__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1261:1: rule__AutomationLayer__Group__2__Impl : ( ( rule__AutomationLayer__Group_2__0 )* ) ;
    public final void rule__AutomationLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1265:1: ( ( ( rule__AutomationLayer__Group_2__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1266:1: ( ( rule__AutomationLayer__Group_2__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1266:1: ( ( rule__AutomationLayer__Group_2__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1267:1: ( rule__AutomationLayer__Group_2__0 )*
            {
             before(grammarAccess.getAutomationLayerAccess().getGroup_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1268:1: ( rule__AutomationLayer__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1268:2: rule__AutomationLayer__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_2__0_in_rule__AutomationLayer__Group__2__Impl2500);
            	    rule__AutomationLayer__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAutomationLayerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__2__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1278:1: rule__AutomationLayer__Group__3 : rule__AutomationLayer__Group__3__Impl rule__AutomationLayer__Group__4 ;
    public final void rule__AutomationLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1282:1: ( rule__AutomationLayer__Group__3__Impl rule__AutomationLayer__Group__4 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1283:2: rule__AutomationLayer__Group__3__Impl rule__AutomationLayer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__3__Impl_in_rule__AutomationLayer__Group__32531);
            rule__AutomationLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__4_in_rule__AutomationLayer__Group__32534);
            rule__AutomationLayer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__3"


    // $ANTLR start "rule__AutomationLayer__Group__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1290:1: rule__AutomationLayer__Group__3__Impl : ( ')' ) ;
    public final void rule__AutomationLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1294:1: ( ( ')' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1295:1: ( ')' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1295:1: ( ')' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1296:1: ')'
            {
             before(grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AutomationLayer__Group__3__Impl2562); 
             after(grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__3__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__4"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1309:1: rule__AutomationLayer__Group__4 : rule__AutomationLayer__Group__4__Impl rule__AutomationLayer__Group__5 ;
    public final void rule__AutomationLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1313:1: ( rule__AutomationLayer__Group__4__Impl rule__AutomationLayer__Group__5 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1314:2: rule__AutomationLayer__Group__4__Impl rule__AutomationLayer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__4__Impl_in_rule__AutomationLayer__Group__42593);
            rule__AutomationLayer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__5_in_rule__AutomationLayer__Group__42596);
            rule__AutomationLayer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__4"


    // $ANTLR start "rule__AutomationLayer__Group__4__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1321:1: rule__AutomationLayer__Group__4__Impl : ( 'Actions (' ) ;
    public final void rule__AutomationLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1325:1: ( ( 'Actions (' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1326:1: ( 'Actions (' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1326:1: ( 'Actions (' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1327:1: 'Actions ('
            {
             before(grammarAccess.getAutomationLayerAccess().getActionsKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__AutomationLayer__Group__4__Impl2624); 
             after(grammarAccess.getAutomationLayerAccess().getActionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__4__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__5"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1340:1: rule__AutomationLayer__Group__5 : rule__AutomationLayer__Group__5__Impl rule__AutomationLayer__Group__6 ;
    public final void rule__AutomationLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1344:1: ( rule__AutomationLayer__Group__5__Impl rule__AutomationLayer__Group__6 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1345:2: rule__AutomationLayer__Group__5__Impl rule__AutomationLayer__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__5__Impl_in_rule__AutomationLayer__Group__52655);
            rule__AutomationLayer__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__6_in_rule__AutomationLayer__Group__52658);
            rule__AutomationLayer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__5"


    // $ANTLR start "rule__AutomationLayer__Group__5__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1352:1: rule__AutomationLayer__Group__5__Impl : ( ( rule__AutomationLayer__ActionsAssignment_5 ) ) ;
    public final void rule__AutomationLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1356:1: ( ( ( rule__AutomationLayer__ActionsAssignment_5 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1357:1: ( ( rule__AutomationLayer__ActionsAssignment_5 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1357:1: ( ( rule__AutomationLayer__ActionsAssignment_5 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1358:1: ( rule__AutomationLayer__ActionsAssignment_5 )
            {
             before(grammarAccess.getAutomationLayerAccess().getActionsAssignment_5()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1359:1: ( rule__AutomationLayer__ActionsAssignment_5 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1359:2: rule__AutomationLayer__ActionsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__ActionsAssignment_5_in_rule__AutomationLayer__Group__5__Impl2685);
            rule__AutomationLayer__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAutomationLayerAccess().getActionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__5__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__6"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1369:1: rule__AutomationLayer__Group__6 : rule__AutomationLayer__Group__6__Impl rule__AutomationLayer__Group__7 ;
    public final void rule__AutomationLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1373:1: ( rule__AutomationLayer__Group__6__Impl rule__AutomationLayer__Group__7 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1374:2: rule__AutomationLayer__Group__6__Impl rule__AutomationLayer__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__6__Impl_in_rule__AutomationLayer__Group__62715);
            rule__AutomationLayer__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__7_in_rule__AutomationLayer__Group__62718);
            rule__AutomationLayer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__6"


    // $ANTLR start "rule__AutomationLayer__Group__6__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1381:1: rule__AutomationLayer__Group__6__Impl : ( ( rule__AutomationLayer__Group_6__0 )* ) ;
    public final void rule__AutomationLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1385:1: ( ( ( rule__AutomationLayer__Group_6__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1386:1: ( ( rule__AutomationLayer__Group_6__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1386:1: ( ( rule__AutomationLayer__Group_6__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1387:1: ( rule__AutomationLayer__Group_6__0 )*
            {
             before(grammarAccess.getAutomationLayerAccess().getGroup_6()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1388:1: ( rule__AutomationLayer__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1388:2: rule__AutomationLayer__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_6__0_in_rule__AutomationLayer__Group__6__Impl2745);
            	    rule__AutomationLayer__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAutomationLayerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__6__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__7"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1398:1: rule__AutomationLayer__Group__7 : rule__AutomationLayer__Group__7__Impl rule__AutomationLayer__Group__8 ;
    public final void rule__AutomationLayer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1402:1: ( rule__AutomationLayer__Group__7__Impl rule__AutomationLayer__Group__8 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1403:2: rule__AutomationLayer__Group__7__Impl rule__AutomationLayer__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__7__Impl_in_rule__AutomationLayer__Group__72776);
            rule__AutomationLayer__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__8_in_rule__AutomationLayer__Group__72779);
            rule__AutomationLayer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__7"


    // $ANTLR start "rule__AutomationLayer__Group__7__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1410:1: rule__AutomationLayer__Group__7__Impl : ( ')' ) ;
    public final void rule__AutomationLayer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1414:1: ( ( ')' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1415:1: ( ')' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1415:1: ( ')' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1416:1: ')'
            {
             before(grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AutomationLayer__Group__7__Impl2807); 
             after(grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__7__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__8"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1429:1: rule__AutomationLayer__Group__8 : rule__AutomationLayer__Group__8__Impl rule__AutomationLayer__Group__9 ;
    public final void rule__AutomationLayer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1433:1: ( rule__AutomationLayer__Group__8__Impl rule__AutomationLayer__Group__9 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1434:2: rule__AutomationLayer__Group__8__Impl rule__AutomationLayer__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__8__Impl_in_rule__AutomationLayer__Group__82838);
            rule__AutomationLayer__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__9_in_rule__AutomationLayer__Group__82841);
            rule__AutomationLayer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__8"


    // $ANTLR start "rule__AutomationLayer__Group__8__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1441:1: rule__AutomationLayer__Group__8__Impl : ( 'Behaviors (' ) ;
    public final void rule__AutomationLayer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1445:1: ( ( 'Behaviors (' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1446:1: ( 'Behaviors (' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1446:1: ( 'Behaviors (' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1447:1: 'Behaviors ('
            {
             before(grammarAccess.getAutomationLayerAccess().getBehaviorsKeyword_8()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__AutomationLayer__Group__8__Impl2869); 
             after(grammarAccess.getAutomationLayerAccess().getBehaviorsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__8__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__9"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1460:1: rule__AutomationLayer__Group__9 : rule__AutomationLayer__Group__9__Impl rule__AutomationLayer__Group__10 ;
    public final void rule__AutomationLayer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1464:1: ( rule__AutomationLayer__Group__9__Impl rule__AutomationLayer__Group__10 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1465:2: rule__AutomationLayer__Group__9__Impl rule__AutomationLayer__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__9__Impl_in_rule__AutomationLayer__Group__92900);
            rule__AutomationLayer__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__10_in_rule__AutomationLayer__Group__92903);
            rule__AutomationLayer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__9"


    // $ANTLR start "rule__AutomationLayer__Group__9__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1472:1: rule__AutomationLayer__Group__9__Impl : ( ( rule__AutomationLayer__BehavioursAssignment_9 ) ) ;
    public final void rule__AutomationLayer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1476:1: ( ( ( rule__AutomationLayer__BehavioursAssignment_9 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1477:1: ( ( rule__AutomationLayer__BehavioursAssignment_9 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1477:1: ( ( rule__AutomationLayer__BehavioursAssignment_9 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1478:1: ( rule__AutomationLayer__BehavioursAssignment_9 )
            {
             before(grammarAccess.getAutomationLayerAccess().getBehavioursAssignment_9()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1479:1: ( rule__AutomationLayer__BehavioursAssignment_9 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1479:2: rule__AutomationLayer__BehavioursAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__BehavioursAssignment_9_in_rule__AutomationLayer__Group__9__Impl2930);
            rule__AutomationLayer__BehavioursAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAutomationLayerAccess().getBehavioursAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__9__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__10"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1489:1: rule__AutomationLayer__Group__10 : rule__AutomationLayer__Group__10__Impl rule__AutomationLayer__Group__11 ;
    public final void rule__AutomationLayer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1493:1: ( rule__AutomationLayer__Group__10__Impl rule__AutomationLayer__Group__11 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1494:2: rule__AutomationLayer__Group__10__Impl rule__AutomationLayer__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__10__Impl_in_rule__AutomationLayer__Group__102960);
            rule__AutomationLayer__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__11_in_rule__AutomationLayer__Group__102963);
            rule__AutomationLayer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__10"


    // $ANTLR start "rule__AutomationLayer__Group__10__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1501:1: rule__AutomationLayer__Group__10__Impl : ( ( rule__AutomationLayer__Group_10__0 )* ) ;
    public final void rule__AutomationLayer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1505:1: ( ( ( rule__AutomationLayer__Group_10__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1506:1: ( ( rule__AutomationLayer__Group_10__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1506:1: ( ( rule__AutomationLayer__Group_10__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1507:1: ( rule__AutomationLayer__Group_10__0 )*
            {
             before(grammarAccess.getAutomationLayerAccess().getGroup_10()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1508:1: ( rule__AutomationLayer__Group_10__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1508:2: rule__AutomationLayer__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_10__0_in_rule__AutomationLayer__Group__10__Impl2990);
            	    rule__AutomationLayer__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAutomationLayerAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__10__Impl"


    // $ANTLR start "rule__AutomationLayer__Group__11"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1518:1: rule__AutomationLayer__Group__11 : rule__AutomationLayer__Group__11__Impl ;
    public final void rule__AutomationLayer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1522:1: ( rule__AutomationLayer__Group__11__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1523:2: rule__AutomationLayer__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group__11__Impl_in_rule__AutomationLayer__Group__113021);
            rule__AutomationLayer__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__11"


    // $ANTLR start "rule__AutomationLayer__Group__11__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1529:1: rule__AutomationLayer__Group__11__Impl : ( ')' ) ;
    public final void rule__AutomationLayer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1533:1: ( ( ')' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1534:1: ( ')' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1534:1: ( ')' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1535:1: ')'
            {
             before(grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_11()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__AutomationLayer__Group__11__Impl3049); 
             after(grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group__11__Impl"


    // $ANTLR start "rule__AutomationLayer__Group_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1572:1: rule__AutomationLayer__Group_2__0 : rule__AutomationLayer__Group_2__0__Impl rule__AutomationLayer__Group_2__1 ;
    public final void rule__AutomationLayer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1576:1: ( rule__AutomationLayer__Group_2__0__Impl rule__AutomationLayer__Group_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1577:2: rule__AutomationLayer__Group_2__0__Impl rule__AutomationLayer__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_2__0__Impl_in_rule__AutomationLayer__Group_2__03104);
            rule__AutomationLayer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_2__1_in_rule__AutomationLayer__Group_2__03107);
            rule__AutomationLayer__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_2__0"


    // $ANTLR start "rule__AutomationLayer__Group_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1584:1: rule__AutomationLayer__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AutomationLayer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1588:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1589:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1589:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1590:1: ','
            {
             before(grammarAccess.getAutomationLayerAccess().getCommaKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AutomationLayer__Group_2__0__Impl3135); 
             after(grammarAccess.getAutomationLayerAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_2__0__Impl"


    // $ANTLR start "rule__AutomationLayer__Group_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1603:1: rule__AutomationLayer__Group_2__1 : rule__AutomationLayer__Group_2__1__Impl ;
    public final void rule__AutomationLayer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1607:1: ( rule__AutomationLayer__Group_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1608:2: rule__AutomationLayer__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_2__1__Impl_in_rule__AutomationLayer__Group_2__13166);
            rule__AutomationLayer__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_2__1"


    // $ANTLR start "rule__AutomationLayer__Group_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1614:1: rule__AutomationLayer__Group_2__1__Impl : ( ( rule__AutomationLayer__ContextAssignment_2_1 ) ) ;
    public final void rule__AutomationLayer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1618:1: ( ( ( rule__AutomationLayer__ContextAssignment_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1619:1: ( ( rule__AutomationLayer__ContextAssignment_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1619:1: ( ( rule__AutomationLayer__ContextAssignment_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1620:1: ( rule__AutomationLayer__ContextAssignment_2_1 )
            {
             before(grammarAccess.getAutomationLayerAccess().getContextAssignment_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1621:1: ( rule__AutomationLayer__ContextAssignment_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1621:2: rule__AutomationLayer__ContextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__ContextAssignment_2_1_in_rule__AutomationLayer__Group_2__1__Impl3193);
            rule__AutomationLayer__ContextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomationLayerAccess().getContextAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_2__1__Impl"


    // $ANTLR start "rule__AutomationLayer__Group_6__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1635:1: rule__AutomationLayer__Group_6__0 : rule__AutomationLayer__Group_6__0__Impl rule__AutomationLayer__Group_6__1 ;
    public final void rule__AutomationLayer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1639:1: ( rule__AutomationLayer__Group_6__0__Impl rule__AutomationLayer__Group_6__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1640:2: rule__AutomationLayer__Group_6__0__Impl rule__AutomationLayer__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_6__0__Impl_in_rule__AutomationLayer__Group_6__03227);
            rule__AutomationLayer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_6__1_in_rule__AutomationLayer__Group_6__03230);
            rule__AutomationLayer__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_6__0"


    // $ANTLR start "rule__AutomationLayer__Group_6__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1647:1: rule__AutomationLayer__Group_6__0__Impl : ( ',' ) ;
    public final void rule__AutomationLayer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1651:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1652:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1652:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1653:1: ','
            {
             before(grammarAccess.getAutomationLayerAccess().getCommaKeyword_6_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AutomationLayer__Group_6__0__Impl3258); 
             after(grammarAccess.getAutomationLayerAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_6__0__Impl"


    // $ANTLR start "rule__AutomationLayer__Group_6__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1666:1: rule__AutomationLayer__Group_6__1 : rule__AutomationLayer__Group_6__1__Impl ;
    public final void rule__AutomationLayer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1670:1: ( rule__AutomationLayer__Group_6__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1671:2: rule__AutomationLayer__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_6__1__Impl_in_rule__AutomationLayer__Group_6__13289);
            rule__AutomationLayer__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_6__1"


    // $ANTLR start "rule__AutomationLayer__Group_6__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1677:1: rule__AutomationLayer__Group_6__1__Impl : ( ( rule__AutomationLayer__ActionsAssignment_6_1 ) ) ;
    public final void rule__AutomationLayer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1681:1: ( ( ( rule__AutomationLayer__ActionsAssignment_6_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1682:1: ( ( rule__AutomationLayer__ActionsAssignment_6_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1682:1: ( ( rule__AutomationLayer__ActionsAssignment_6_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1683:1: ( rule__AutomationLayer__ActionsAssignment_6_1 )
            {
             before(grammarAccess.getAutomationLayerAccess().getActionsAssignment_6_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1684:1: ( rule__AutomationLayer__ActionsAssignment_6_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1684:2: rule__AutomationLayer__ActionsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__ActionsAssignment_6_1_in_rule__AutomationLayer__Group_6__1__Impl3316);
            rule__AutomationLayer__ActionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomationLayerAccess().getActionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_6__1__Impl"


    // $ANTLR start "rule__AutomationLayer__Group_10__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1698:1: rule__AutomationLayer__Group_10__0 : rule__AutomationLayer__Group_10__0__Impl rule__AutomationLayer__Group_10__1 ;
    public final void rule__AutomationLayer__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1702:1: ( rule__AutomationLayer__Group_10__0__Impl rule__AutomationLayer__Group_10__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1703:2: rule__AutomationLayer__Group_10__0__Impl rule__AutomationLayer__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_10__0__Impl_in_rule__AutomationLayer__Group_10__03350);
            rule__AutomationLayer__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_10__1_in_rule__AutomationLayer__Group_10__03353);
            rule__AutomationLayer__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_10__0"


    // $ANTLR start "rule__AutomationLayer__Group_10__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1710:1: rule__AutomationLayer__Group_10__0__Impl : ( ',' ) ;
    public final void rule__AutomationLayer__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1714:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1715:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1715:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1716:1: ','
            {
             before(grammarAccess.getAutomationLayerAccess().getCommaKeyword_10_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AutomationLayer__Group_10__0__Impl3381); 
             after(grammarAccess.getAutomationLayerAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_10__0__Impl"


    // $ANTLR start "rule__AutomationLayer__Group_10__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1729:1: rule__AutomationLayer__Group_10__1 : rule__AutomationLayer__Group_10__1__Impl ;
    public final void rule__AutomationLayer__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1733:1: ( rule__AutomationLayer__Group_10__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1734:2: rule__AutomationLayer__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__Group_10__1__Impl_in_rule__AutomationLayer__Group_10__13412);
            rule__AutomationLayer__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_10__1"


    // $ANTLR start "rule__AutomationLayer__Group_10__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1740:1: rule__AutomationLayer__Group_10__1__Impl : ( ( rule__AutomationLayer__BehavioursAssignment_10_1 ) ) ;
    public final void rule__AutomationLayer__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1744:1: ( ( ( rule__AutomationLayer__BehavioursAssignment_10_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1745:1: ( ( rule__AutomationLayer__BehavioursAssignment_10_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1745:1: ( ( rule__AutomationLayer__BehavioursAssignment_10_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1746:1: ( rule__AutomationLayer__BehavioursAssignment_10_1 )
            {
             before(grammarAccess.getAutomationLayerAccess().getBehavioursAssignment_10_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1747:1: ( rule__AutomationLayer__BehavioursAssignment_10_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1747:2: rule__AutomationLayer__BehavioursAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AutomationLayer__BehavioursAssignment_10_1_in_rule__AutomationLayer__Group_10__1__Impl3439);
            rule__AutomationLayer__BehavioursAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomationLayerAccess().getBehavioursAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__Group_10__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1761:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1765:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1766:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__03473);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__03476);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1773:1: rule__Feature__Group__0__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1777:1: ( ( 'Feature:' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1778:1: ( 'Feature:' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1778:1: ( 'Feature:' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1779:1: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Feature__Group__0__Impl3504); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1792:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1796:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1797:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__13535);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__13538);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1804:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1808:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1809:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1809:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1810:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1811:1: ( rule__Feature__NameAssignment_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1811:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl3565);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1821:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1825:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1826:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__23595);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__23598);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1833:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1837:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1838:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1838:1: ( ( rule__Feature__Group_2__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1839:1: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1840:1: ( rule__Feature__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1840:2: rule__Feature__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_2__0_in_rule__Feature__Group__2__Impl3625);
                    rule__Feature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1850:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1854:1: ( rule__Feature__Group__3__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1855:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__33656);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1861:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__StoriesAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1865:1: ( ( ( rule__Feature__StoriesAssignment_3 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1866:1: ( ( rule__Feature__StoriesAssignment_3 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1866:1: ( ( rule__Feature__StoriesAssignment_3 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1867:1: ( rule__Feature__StoriesAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getStoriesAssignment_3()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1868:1: ( rule__Feature__StoriesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1868:2: rule__Feature__StoriesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Feature__StoriesAssignment_3_in_rule__Feature__Group__3__Impl3683);
            	    rule__Feature__StoriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getStoriesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1886:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1890:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1891:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_2__0__Impl_in_rule__Feature__Group_2__03722);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_2__1_in_rule__Feature__Group_2__03725);
            rule__Feature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0"


    // $ANTLR start "rule__Feature__Group_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1898:1: rule__Feature__Group_2__0__Impl : ( 'linked to ' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1902:1: ( ( 'linked to ' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1903:1: ( 'linked to ' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1903:1: ( 'linked to ' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1904:1: 'linked to '
            {
             before(grammarAccess.getFeatureAccess().getLinkedToKeyword_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Feature__Group_2__0__Impl3753); 
             after(grammarAccess.getFeatureAccess().getLinkedToKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0__Impl"


    // $ANTLR start "rule__Feature__Group_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1917:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1921:1: ( rule__Feature__Group_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1922:2: rule__Feature__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_2__1__Impl_in_rule__Feature__Group_2__13784);
            rule__Feature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1"


    // $ANTLR start "rule__Feature__Group_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1928:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__RefFeaturesAssignment_2_1 )* ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1932:1: ( ( ( rule__Feature__RefFeaturesAssignment_2_1 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1933:1: ( ( rule__Feature__RefFeaturesAssignment_2_1 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1933:1: ( ( rule__Feature__RefFeaturesAssignment_2_1 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1934:1: ( rule__Feature__RefFeaturesAssignment_2_1 )*
            {
             before(grammarAccess.getFeatureAccess().getRefFeaturesAssignment_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1935:1: ( rule__Feature__RefFeaturesAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1935:2: rule__Feature__RefFeaturesAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Feature__RefFeaturesAssignment_2_1_in_rule__Feature__Group_2__1__Impl3811);
            	    rule__Feature__RefFeaturesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getRefFeaturesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1__Impl"


    // $ANTLR start "rule__Story__Group__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1949:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1953:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1954:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__0__Impl_in_rule__Story__Group__03846);
            rule__Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__1_in_rule__Story__Group__03849);
            rule__Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0"


    // $ANTLR start "rule__Story__Group__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1961:1: rule__Story__Group__0__Impl : ( 'Story:' ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1965:1: ( ( 'Story:' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1966:1: ( 'Story:' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1966:1: ( 'Story:' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1967:1: 'Story:'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Story__Group__0__Impl3877); 
             after(grammarAccess.getStoryAccess().getStoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1980:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1984:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1985:2: rule__Story__Group__1__Impl rule__Story__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__1__Impl_in_rule__Story__Group__13908);
            rule__Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__2_in_rule__Story__Group__13911);
            rule__Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1"


    // $ANTLR start "rule__Story__Group__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1992:1: rule__Story__Group__1__Impl : ( ( rule__Story__NameAssignment_1 ) ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1996:1: ( ( ( rule__Story__NameAssignment_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1997:1: ( ( rule__Story__NameAssignment_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1997:1: ( ( rule__Story__NameAssignment_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1998:1: ( rule__Story__NameAssignment_1 )
            {
             before(grammarAccess.getStoryAccess().getNameAssignment_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1999:1: ( rule__Story__NameAssignment_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:1999:2: rule__Story__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__NameAssignment_1_in_rule__Story__Group__1__Impl3938);
            rule__Story__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2009:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2013:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2014:2: rule__Story__Group__2__Impl rule__Story__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__2__Impl_in_rule__Story__Group__23968);
            rule__Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__3_in_rule__Story__Group__23971);
            rule__Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2"


    // $ANTLR start "rule__Story__Group__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2021:1: rule__Story__Group__2__Impl : ( ( rule__Story__Group_2__0 )? ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2025:1: ( ( ( rule__Story__Group_2__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2026:1: ( ( rule__Story__Group_2__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2026:1: ( ( rule__Story__Group_2__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2027:1: ( rule__Story__Group_2__0 )?
            {
             before(grammarAccess.getStoryAccess().getGroup_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2028:1: ( rule__Story__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2028:2: rule__Story__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Story__Group_2__0_in_rule__Story__Group__2__Impl3998);
                    rule__Story__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2038:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2042:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2043:2: rule__Story__Group__3__Impl rule__Story__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__3__Impl_in_rule__Story__Group__34029);
            rule__Story__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__4_in_rule__Story__Group__34032);
            rule__Story__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3"


    // $ANTLR start "rule__Story__Group__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2050:1: rule__Story__Group__3__Impl : ( ( rule__Story__Group_3__0 )? ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2054:1: ( ( ( rule__Story__Group_3__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2055:1: ( ( rule__Story__Group_3__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2055:1: ( ( rule__Story__Group_3__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2056:1: ( rule__Story__Group_3__0 )?
            {
             before(grammarAccess.getStoryAccess().getGroup_3()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2057:1: ( rule__Story__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2057:2: rule__Story__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Story__Group_3__0_in_rule__Story__Group__3__Impl4059);
                    rule__Story__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__3__Impl"


    // $ANTLR start "rule__Story__Group__4"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2067:1: rule__Story__Group__4 : rule__Story__Group__4__Impl rule__Story__Group__5 ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2071:1: ( rule__Story__Group__4__Impl rule__Story__Group__5 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2072:2: rule__Story__Group__4__Impl rule__Story__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__4__Impl_in_rule__Story__Group__44090);
            rule__Story__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__5_in_rule__Story__Group__44093);
            rule__Story__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4"


    // $ANTLR start "rule__Story__Group__4__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2079:1: rule__Story__Group__4__Impl : ( ( rule__Story__Group_4__0 )? ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2083:1: ( ( ( rule__Story__Group_4__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2084:1: ( ( rule__Story__Group_4__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2084:1: ( ( rule__Story__Group_4__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2085:1: ( rule__Story__Group_4__0 )?
            {
             before(grammarAccess.getStoryAccess().getGroup_4()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2086:1: ( rule__Story__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2086:2: rule__Story__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Story__Group_4__0_in_rule__Story__Group__4__Impl4120);
                    rule__Story__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__4__Impl"


    // $ANTLR start "rule__Story__Group__5"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2096:1: rule__Story__Group__5 : rule__Story__Group__5__Impl ;
    public final void rule__Story__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2100:1: ( rule__Story__Group__5__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2101:2: rule__Story__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group__5__Impl_in_rule__Story__Group__54151);
            rule__Story__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5"


    // $ANTLR start "rule__Story__Group__5__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2107:1: rule__Story__Group__5__Impl : ( ( rule__Story__ScenariosAssignment_5 )* ) ;
    public final void rule__Story__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2111:1: ( ( ( rule__Story__ScenariosAssignment_5 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2112:1: ( ( rule__Story__ScenariosAssignment_5 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2112:1: ( ( rule__Story__ScenariosAssignment_5 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2113:1: ( rule__Story__ScenariosAssignment_5 )*
            {
             before(grammarAccess.getStoryAccess().getScenariosAssignment_5()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2114:1: ( rule__Story__ScenariosAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2114:2: rule__Story__ScenariosAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Story__ScenariosAssignment_5_in_rule__Story__Group__5__Impl4178);
            	    rule__Story__ScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStoryAccess().getScenariosAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__5__Impl"


    // $ANTLR start "rule__Story__Group_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2136:1: rule__Story__Group_2__0 : rule__Story__Group_2__0__Impl rule__Story__Group_2__1 ;
    public final void rule__Story__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2140:1: ( rule__Story__Group_2__0__Impl rule__Story__Group_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2141:2: rule__Story__Group_2__0__Impl rule__Story__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_2__0__Impl_in_rule__Story__Group_2__04221);
            rule__Story__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_2__1_in_rule__Story__Group_2__04224);
            rule__Story__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_2__0"


    // $ANTLR start "rule__Story__Group_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2148:1: rule__Story__Group_2__0__Impl : ( 'As ' ) ;
    public final void rule__Story__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2152:1: ( ( 'As ' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2153:1: ( 'As ' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2153:1: ( 'As ' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2154:1: 'As '
            {
             before(grammarAccess.getStoryAccess().getAsKeyword_2_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Story__Group_2__0__Impl4252); 
             after(grammarAccess.getStoryAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_2__0__Impl"


    // $ANTLR start "rule__Story__Group_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2167:1: rule__Story__Group_2__1 : rule__Story__Group_2__1__Impl ;
    public final void rule__Story__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2171:1: ( rule__Story__Group_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2172:2: rule__Story__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_2__1__Impl_in_rule__Story__Group_2__14283);
            rule__Story__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_2__1"


    // $ANTLR start "rule__Story__Group_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2178:1: rule__Story__Group_2__1__Impl : ( ( rule__Story__AsAssignment_2_1 ) ) ;
    public final void rule__Story__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2182:1: ( ( ( rule__Story__AsAssignment_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2183:1: ( ( rule__Story__AsAssignment_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2183:1: ( ( rule__Story__AsAssignment_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2184:1: ( rule__Story__AsAssignment_2_1 )
            {
             before(grammarAccess.getStoryAccess().getAsAssignment_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2185:1: ( rule__Story__AsAssignment_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2185:2: rule__Story__AsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__AsAssignment_2_1_in_rule__Story__Group_2__1__Impl4310);
            rule__Story__AsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getAsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_2__1__Impl"


    // $ANTLR start "rule__Story__Group_3__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2199:1: rule__Story__Group_3__0 : rule__Story__Group_3__0__Impl rule__Story__Group_3__1 ;
    public final void rule__Story__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2203:1: ( rule__Story__Group_3__0__Impl rule__Story__Group_3__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2204:2: rule__Story__Group_3__0__Impl rule__Story__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_3__0__Impl_in_rule__Story__Group_3__04344);
            rule__Story__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_3__1_in_rule__Story__Group_3__04347);
            rule__Story__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_3__0"


    // $ANTLR start "rule__Story__Group_3__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2211:1: rule__Story__Group_3__0__Impl : ( 'I want ' ) ;
    public final void rule__Story__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2215:1: ( ( 'I want ' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2216:1: ( 'I want ' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2216:1: ( 'I want ' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2217:1: 'I want '
            {
             before(grammarAccess.getStoryAccess().getIWantKeyword_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Story__Group_3__0__Impl4375); 
             after(grammarAccess.getStoryAccess().getIWantKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_3__0__Impl"


    // $ANTLR start "rule__Story__Group_3__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2230:1: rule__Story__Group_3__1 : rule__Story__Group_3__1__Impl ;
    public final void rule__Story__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2234:1: ( rule__Story__Group_3__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2235:2: rule__Story__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_3__1__Impl_in_rule__Story__Group_3__14406);
            rule__Story__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_3__1"


    // $ANTLR start "rule__Story__Group_3__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2241:1: rule__Story__Group_3__1__Impl : ( ( rule__Story__IWantAssignment_3_1 ) ) ;
    public final void rule__Story__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2245:1: ( ( ( rule__Story__IWantAssignment_3_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2246:1: ( ( rule__Story__IWantAssignment_3_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2246:1: ( ( rule__Story__IWantAssignment_3_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2247:1: ( rule__Story__IWantAssignment_3_1 )
            {
             before(grammarAccess.getStoryAccess().getIWantAssignment_3_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2248:1: ( rule__Story__IWantAssignment_3_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2248:2: rule__Story__IWantAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__IWantAssignment_3_1_in_rule__Story__Group_3__1__Impl4433);
            rule__Story__IWantAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getIWantAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_3__1__Impl"


    // $ANTLR start "rule__Story__Group_4__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2262:1: rule__Story__Group_4__0 : rule__Story__Group_4__0__Impl rule__Story__Group_4__1 ;
    public final void rule__Story__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2266:1: ( rule__Story__Group_4__0__Impl rule__Story__Group_4__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2267:2: rule__Story__Group_4__0__Impl rule__Story__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_4__0__Impl_in_rule__Story__Group_4__04467);
            rule__Story__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_4__1_in_rule__Story__Group_4__04470);
            rule__Story__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_4__0"


    // $ANTLR start "rule__Story__Group_4__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2274:1: rule__Story__Group_4__0__Impl : ( 'So that ' ) ;
    public final void rule__Story__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2278:1: ( ( 'So that ' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2279:1: ( 'So that ' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2279:1: ( 'So that ' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2280:1: 'So that '
            {
             before(grammarAccess.getStoryAccess().getSoThatKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Story__Group_4__0__Impl4498); 
             after(grammarAccess.getStoryAccess().getSoThatKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_4__0__Impl"


    // $ANTLR start "rule__Story__Group_4__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2293:1: rule__Story__Group_4__1 : rule__Story__Group_4__1__Impl ;
    public final void rule__Story__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2297:1: ( rule__Story__Group_4__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2298:2: rule__Story__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__Group_4__1__Impl_in_rule__Story__Group_4__14529);
            rule__Story__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_4__1"


    // $ANTLR start "rule__Story__Group_4__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2304:1: rule__Story__Group_4__1__Impl : ( ( rule__Story__SoThatAssignment_4_1 ) ) ;
    public final void rule__Story__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2308:1: ( ( ( rule__Story__SoThatAssignment_4_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2309:1: ( ( rule__Story__SoThatAssignment_4_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2309:1: ( ( rule__Story__SoThatAssignment_4_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2310:1: ( rule__Story__SoThatAssignment_4_1 )
            {
             before(grammarAccess.getStoryAccess().getSoThatAssignment_4_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2311:1: ( rule__Story__SoThatAssignment_4_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2311:2: rule__Story__SoThatAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Story__SoThatAssignment_4_1_in_rule__Story__Group_4__1__Impl4556);
            rule__Story__SoThatAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getSoThatAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group_4__1__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2325:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2329:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2330:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__04590);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__04593);
            rule__Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2337:1: rule__Scenario__Group__0__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2341:1: ( ( 'Scenario:' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2342:1: ( 'Scenario:' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2342:1: ( 'Scenario:' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2343:1: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Scenario__Group__0__Impl4621); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2356:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2360:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2361:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__14652);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__14655);
            rule__Scenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2368:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2372:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2373:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2373:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2374:1: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2375:1: ( rule__Scenario__NameAssignment_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2375:2: rule__Scenario__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl4682);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2385:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2389:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2390:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__24712);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__24715);
            rule__Scenario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2397:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__Group_2__0 )? ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2401:1: ( ( ( rule__Scenario__Group_2__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2402:1: ( ( rule__Scenario__Group_2__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2402:1: ( ( rule__Scenario__Group_2__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2403:1: ( rule__Scenario__Group_2__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2404:1: ( rule__Scenario__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2404:2: rule__Scenario__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2__0_in_rule__Scenario__Group__2__Impl4742);
                    rule__Scenario__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2414:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2418:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2419:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__34773);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__34776);
            rule__Scenario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2426:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__Group_3__0 )? ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2430:1: ( ( ( rule__Scenario__Group_3__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2431:1: ( ( rule__Scenario__Group_3__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2431:1: ( ( rule__Scenario__Group_3__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2432:1: ( rule__Scenario__Group_3__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_3()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2433:1: ( rule__Scenario__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2433:2: rule__Scenario__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3__0_in_rule__Scenario__Group__3__Impl4803);
                    rule__Scenario__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2443:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2447:1: ( rule__Scenario__Group__4__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2448:2: rule__Scenario__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__44834);
            rule__Scenario__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2454:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__Group_4__0 )? ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2458:1: ( ( ( rule__Scenario__Group_4__0 )? ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2459:1: ( ( rule__Scenario__Group_4__0 )? )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2459:1: ( ( rule__Scenario__Group_4__0 )? )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2460:1: ( rule__Scenario__Group_4__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_4()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2461:1: ( rule__Scenario__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2461:2: rule__Scenario__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4__0_in_rule__Scenario__Group__4__Impl4861);
                    rule__Scenario__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2481:1: rule__Scenario__Group_2__0 : rule__Scenario__Group_2__0__Impl rule__Scenario__Group_2__1 ;
    public final void rule__Scenario__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2485:1: ( rule__Scenario__Group_2__0__Impl rule__Scenario__Group_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2486:2: rule__Scenario__Group_2__0__Impl rule__Scenario__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2__0__Impl_in_rule__Scenario__Group_2__04902);
            rule__Scenario__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2__1_in_rule__Scenario__Group_2__04905);
            rule__Scenario__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2__0"


    // $ANTLR start "rule__Scenario__Group_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2493:1: rule__Scenario__Group_2__0__Impl : ( 'Given ' ) ;
    public final void rule__Scenario__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2497:1: ( ( 'Given ' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2498:1: ( 'Given ' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2498:1: ( 'Given ' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2499:1: 'Given '
            {
             before(grammarAccess.getScenarioAccess().getGivenKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Scenario__Group_2__0__Impl4933); 
             after(grammarAccess.getScenarioAccess().getGivenKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2__0__Impl"


    // $ANTLR start "rule__Scenario__Group_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2512:1: rule__Scenario__Group_2__1 : rule__Scenario__Group_2__1__Impl rule__Scenario__Group_2__2 ;
    public final void rule__Scenario__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2516:1: ( rule__Scenario__Group_2__1__Impl rule__Scenario__Group_2__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2517:2: rule__Scenario__Group_2__1__Impl rule__Scenario__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2__1__Impl_in_rule__Scenario__Group_2__14964);
            rule__Scenario__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2__2_in_rule__Scenario__Group_2__14967);
            rule__Scenario__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2__1"


    // $ANTLR start "rule__Scenario__Group_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2524:1: rule__Scenario__Group_2__1__Impl : ( ( rule__Scenario__GivenAssignment_2_1 ) ) ;
    public final void rule__Scenario__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2528:1: ( ( ( rule__Scenario__GivenAssignment_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2529:1: ( ( rule__Scenario__GivenAssignment_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2529:1: ( ( rule__Scenario__GivenAssignment_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2530:1: ( rule__Scenario__GivenAssignment_2_1 )
            {
             before(grammarAccess.getScenarioAccess().getGivenAssignment_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2531:1: ( rule__Scenario__GivenAssignment_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2531:2: rule__Scenario__GivenAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__GivenAssignment_2_1_in_rule__Scenario__Group_2__1__Impl4994);
            rule__Scenario__GivenAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGivenAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2__1__Impl"


    // $ANTLR start "rule__Scenario__Group_2__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2541:1: rule__Scenario__Group_2__2 : rule__Scenario__Group_2__2__Impl ;
    public final void rule__Scenario__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2545:1: ( rule__Scenario__Group_2__2__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2546:2: rule__Scenario__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2__2__Impl_in_rule__Scenario__Group_2__25024);
            rule__Scenario__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2__2"


    // $ANTLR start "rule__Scenario__Group_2__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2552:1: rule__Scenario__Group_2__2__Impl : ( ( rule__Scenario__Group_2_2__0 )* ) ;
    public final void rule__Scenario__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2556:1: ( ( ( rule__Scenario__Group_2_2__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2557:1: ( ( rule__Scenario__Group_2_2__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2557:1: ( ( rule__Scenario__Group_2_2__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2558:1: ( rule__Scenario__Group_2_2__0 )*
            {
             before(grammarAccess.getScenarioAccess().getGroup_2_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2559:1: ( rule__Scenario__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2559:2: rule__Scenario__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2_2__0_in_rule__Scenario__Group_2__2__Impl5051);
            	    rule__Scenario__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2__2__Impl"


    // $ANTLR start "rule__Scenario__Group_2_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2575:1: rule__Scenario__Group_2_2__0 : rule__Scenario__Group_2_2__0__Impl rule__Scenario__Group_2_2__1 ;
    public final void rule__Scenario__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2579:1: ( rule__Scenario__Group_2_2__0__Impl rule__Scenario__Group_2_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2580:2: rule__Scenario__Group_2_2__0__Impl rule__Scenario__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2_2__0__Impl_in_rule__Scenario__Group_2_2__05088);
            rule__Scenario__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2_2__1_in_rule__Scenario__Group_2_2__05091);
            rule__Scenario__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2_2__0"


    // $ANTLR start "rule__Scenario__Group_2_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2587:1: rule__Scenario__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Scenario__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2591:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2592:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2592:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2593:1: ','
            {
             before(grammarAccess.getScenarioAccess().getCommaKeyword_2_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Scenario__Group_2_2__0__Impl5119); 
             after(grammarAccess.getScenarioAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2_2__0__Impl"


    // $ANTLR start "rule__Scenario__Group_2_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2606:1: rule__Scenario__Group_2_2__1 : rule__Scenario__Group_2_2__1__Impl ;
    public final void rule__Scenario__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2610:1: ( rule__Scenario__Group_2_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2611:2: rule__Scenario__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_2_2__1__Impl_in_rule__Scenario__Group_2_2__15150);
            rule__Scenario__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2_2__1"


    // $ANTLR start "rule__Scenario__Group_2_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2617:1: rule__Scenario__Group_2_2__1__Impl : ( ( rule__Scenario__GivenAssignment_2_2_1 ) ) ;
    public final void rule__Scenario__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2621:1: ( ( ( rule__Scenario__GivenAssignment_2_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2622:1: ( ( rule__Scenario__GivenAssignment_2_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2622:1: ( ( rule__Scenario__GivenAssignment_2_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2623:1: ( rule__Scenario__GivenAssignment_2_2_1 )
            {
             before(grammarAccess.getScenarioAccess().getGivenAssignment_2_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2624:1: ( rule__Scenario__GivenAssignment_2_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2624:2: rule__Scenario__GivenAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__GivenAssignment_2_2_1_in_rule__Scenario__Group_2_2__1__Impl5177);
            rule__Scenario__GivenAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGivenAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_2_2__1__Impl"


    // $ANTLR start "rule__Scenario__Group_3__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2638:1: rule__Scenario__Group_3__0 : rule__Scenario__Group_3__0__Impl rule__Scenario__Group_3__1 ;
    public final void rule__Scenario__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2642:1: ( rule__Scenario__Group_3__0__Impl rule__Scenario__Group_3__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2643:2: rule__Scenario__Group_3__0__Impl rule__Scenario__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3__0__Impl_in_rule__Scenario__Group_3__05211);
            rule__Scenario__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3__1_in_rule__Scenario__Group_3__05214);
            rule__Scenario__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3__0"


    // $ANTLR start "rule__Scenario__Group_3__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2650:1: rule__Scenario__Group_3__0__Impl : ( 'When ' ) ;
    public final void rule__Scenario__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2654:1: ( ( 'When ' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2655:1: ( 'When ' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2655:1: ( 'When ' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2656:1: 'When '
            {
             before(grammarAccess.getScenarioAccess().getWhenKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Scenario__Group_3__0__Impl5242); 
             after(grammarAccess.getScenarioAccess().getWhenKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3__0__Impl"


    // $ANTLR start "rule__Scenario__Group_3__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2669:1: rule__Scenario__Group_3__1 : rule__Scenario__Group_3__1__Impl rule__Scenario__Group_3__2 ;
    public final void rule__Scenario__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2673:1: ( rule__Scenario__Group_3__1__Impl rule__Scenario__Group_3__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2674:2: rule__Scenario__Group_3__1__Impl rule__Scenario__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3__1__Impl_in_rule__Scenario__Group_3__15273);
            rule__Scenario__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3__2_in_rule__Scenario__Group_3__15276);
            rule__Scenario__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3__1"


    // $ANTLR start "rule__Scenario__Group_3__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2681:1: rule__Scenario__Group_3__1__Impl : ( ( rule__Scenario__WhenAssignment_3_1 ) ) ;
    public final void rule__Scenario__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2685:1: ( ( ( rule__Scenario__WhenAssignment_3_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2686:1: ( ( rule__Scenario__WhenAssignment_3_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2686:1: ( ( rule__Scenario__WhenAssignment_3_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2687:1: ( rule__Scenario__WhenAssignment_3_1 )
            {
             before(grammarAccess.getScenarioAccess().getWhenAssignment_3_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2688:1: ( rule__Scenario__WhenAssignment_3_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2688:2: rule__Scenario__WhenAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__WhenAssignment_3_1_in_rule__Scenario__Group_3__1__Impl5303);
            rule__Scenario__WhenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getWhenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3__1__Impl"


    // $ANTLR start "rule__Scenario__Group_3__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2698:1: rule__Scenario__Group_3__2 : rule__Scenario__Group_3__2__Impl ;
    public final void rule__Scenario__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2702:1: ( rule__Scenario__Group_3__2__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2703:2: rule__Scenario__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3__2__Impl_in_rule__Scenario__Group_3__25333);
            rule__Scenario__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3__2"


    // $ANTLR start "rule__Scenario__Group_3__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2709:1: rule__Scenario__Group_3__2__Impl : ( ( rule__Scenario__Group_3_2__0 )* ) ;
    public final void rule__Scenario__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2713:1: ( ( ( rule__Scenario__Group_3_2__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2714:1: ( ( rule__Scenario__Group_3_2__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2714:1: ( ( rule__Scenario__Group_3_2__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2715:1: ( rule__Scenario__Group_3_2__0 )*
            {
             before(grammarAccess.getScenarioAccess().getGroup_3_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2716:1: ( rule__Scenario__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2716:2: rule__Scenario__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3_2__0_in_rule__Scenario__Group_3__2__Impl5360);
            	    rule__Scenario__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3__2__Impl"


    // $ANTLR start "rule__Scenario__Group_3_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2732:1: rule__Scenario__Group_3_2__0 : rule__Scenario__Group_3_2__0__Impl rule__Scenario__Group_3_2__1 ;
    public final void rule__Scenario__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2736:1: ( rule__Scenario__Group_3_2__0__Impl rule__Scenario__Group_3_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2737:2: rule__Scenario__Group_3_2__0__Impl rule__Scenario__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3_2__0__Impl_in_rule__Scenario__Group_3_2__05397);
            rule__Scenario__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3_2__1_in_rule__Scenario__Group_3_2__05400);
            rule__Scenario__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3_2__0"


    // $ANTLR start "rule__Scenario__Group_3_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2744:1: rule__Scenario__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Scenario__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2748:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2749:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2749:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2750:1: ','
            {
             before(grammarAccess.getScenarioAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Scenario__Group_3_2__0__Impl5428); 
             after(grammarAccess.getScenarioAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3_2__0__Impl"


    // $ANTLR start "rule__Scenario__Group_3_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2763:1: rule__Scenario__Group_3_2__1 : rule__Scenario__Group_3_2__1__Impl ;
    public final void rule__Scenario__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2767:1: ( rule__Scenario__Group_3_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2768:2: rule__Scenario__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_3_2__1__Impl_in_rule__Scenario__Group_3_2__15459);
            rule__Scenario__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3_2__1"


    // $ANTLR start "rule__Scenario__Group_3_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2774:1: rule__Scenario__Group_3_2__1__Impl : ( ( rule__Scenario__WhenAssignment_3_2_1 ) ) ;
    public final void rule__Scenario__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2778:1: ( ( ( rule__Scenario__WhenAssignment_3_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2779:1: ( ( rule__Scenario__WhenAssignment_3_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2779:1: ( ( rule__Scenario__WhenAssignment_3_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2780:1: ( rule__Scenario__WhenAssignment_3_2_1 )
            {
             before(grammarAccess.getScenarioAccess().getWhenAssignment_3_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2781:1: ( rule__Scenario__WhenAssignment_3_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2781:2: rule__Scenario__WhenAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__WhenAssignment_3_2_1_in_rule__Scenario__Group_3_2__1__Impl5486);
            rule__Scenario__WhenAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getWhenAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_3_2__1__Impl"


    // $ANTLR start "rule__Scenario__Group_4__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2795:1: rule__Scenario__Group_4__0 : rule__Scenario__Group_4__0__Impl rule__Scenario__Group_4__1 ;
    public final void rule__Scenario__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2799:1: ( rule__Scenario__Group_4__0__Impl rule__Scenario__Group_4__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2800:2: rule__Scenario__Group_4__0__Impl rule__Scenario__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4__0__Impl_in_rule__Scenario__Group_4__05520);
            rule__Scenario__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4__1_in_rule__Scenario__Group_4__05523);
            rule__Scenario__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4__0"


    // $ANTLR start "rule__Scenario__Group_4__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2807:1: rule__Scenario__Group_4__0__Impl : ( 'Then ' ) ;
    public final void rule__Scenario__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2811:1: ( ( 'Then ' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2812:1: ( 'Then ' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2812:1: ( 'Then ' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2813:1: 'Then '
            {
             before(grammarAccess.getScenarioAccess().getThenKeyword_4_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Scenario__Group_4__0__Impl5551); 
             after(grammarAccess.getScenarioAccess().getThenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4__0__Impl"


    // $ANTLR start "rule__Scenario__Group_4__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2826:1: rule__Scenario__Group_4__1 : rule__Scenario__Group_4__1__Impl rule__Scenario__Group_4__2 ;
    public final void rule__Scenario__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2830:1: ( rule__Scenario__Group_4__1__Impl rule__Scenario__Group_4__2 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2831:2: rule__Scenario__Group_4__1__Impl rule__Scenario__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4__1__Impl_in_rule__Scenario__Group_4__15582);
            rule__Scenario__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4__2_in_rule__Scenario__Group_4__15585);
            rule__Scenario__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4__1"


    // $ANTLR start "rule__Scenario__Group_4__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2838:1: rule__Scenario__Group_4__1__Impl : ( ( rule__Scenario__ThenAssignment_4_1 ) ) ;
    public final void rule__Scenario__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2842:1: ( ( ( rule__Scenario__ThenAssignment_4_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2843:1: ( ( rule__Scenario__ThenAssignment_4_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2843:1: ( ( rule__Scenario__ThenAssignment_4_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2844:1: ( rule__Scenario__ThenAssignment_4_1 )
            {
             before(grammarAccess.getScenarioAccess().getThenAssignment_4_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2845:1: ( rule__Scenario__ThenAssignment_4_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2845:2: rule__Scenario__ThenAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__ThenAssignment_4_1_in_rule__Scenario__Group_4__1__Impl5612);
            rule__Scenario__ThenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getThenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4__1__Impl"


    // $ANTLR start "rule__Scenario__Group_4__2"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2855:1: rule__Scenario__Group_4__2 : rule__Scenario__Group_4__2__Impl ;
    public final void rule__Scenario__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2859:1: ( rule__Scenario__Group_4__2__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2860:2: rule__Scenario__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4__2__Impl_in_rule__Scenario__Group_4__25642);
            rule__Scenario__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4__2"


    // $ANTLR start "rule__Scenario__Group_4__2__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2866:1: rule__Scenario__Group_4__2__Impl : ( ( rule__Scenario__Group_4_2__0 )* ) ;
    public final void rule__Scenario__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2870:1: ( ( ( rule__Scenario__Group_4_2__0 )* ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2871:1: ( ( rule__Scenario__Group_4_2__0 )* )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2871:1: ( ( rule__Scenario__Group_4_2__0 )* )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2872:1: ( rule__Scenario__Group_4_2__0 )*
            {
             before(grammarAccess.getScenarioAccess().getGroup_4_2()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2873:1: ( rule__Scenario__Group_4_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==14) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2873:2: rule__Scenario__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4_2__0_in_rule__Scenario__Group_4__2__Impl5669);
            	    rule__Scenario__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4__2__Impl"


    // $ANTLR start "rule__Scenario__Group_4_2__0"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2889:1: rule__Scenario__Group_4_2__0 : rule__Scenario__Group_4_2__0__Impl rule__Scenario__Group_4_2__1 ;
    public final void rule__Scenario__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2893:1: ( rule__Scenario__Group_4_2__0__Impl rule__Scenario__Group_4_2__1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2894:2: rule__Scenario__Group_4_2__0__Impl rule__Scenario__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4_2__0__Impl_in_rule__Scenario__Group_4_2__05706);
            rule__Scenario__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4_2__1_in_rule__Scenario__Group_4_2__05709);
            rule__Scenario__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4_2__0"


    // $ANTLR start "rule__Scenario__Group_4_2__0__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2901:1: rule__Scenario__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Scenario__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2905:1: ( ( ',' ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2906:1: ( ',' )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2906:1: ( ',' )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2907:1: ','
            {
             before(grammarAccess.getScenarioAccess().getCommaKeyword_4_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Scenario__Group_4_2__0__Impl5737); 
             after(grammarAccess.getScenarioAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4_2__0__Impl"


    // $ANTLR start "rule__Scenario__Group_4_2__1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2920:1: rule__Scenario__Group_4_2__1 : rule__Scenario__Group_4_2__1__Impl ;
    public final void rule__Scenario__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2924:1: ( rule__Scenario__Group_4_2__1__Impl )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2925:2: rule__Scenario__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Group_4_2__1__Impl_in_rule__Scenario__Group_4_2__15768);
            rule__Scenario__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4_2__1"


    // $ANTLR start "rule__Scenario__Group_4_2__1__Impl"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2931:1: rule__Scenario__Group_4_2__1__Impl : ( ( rule__Scenario__ThenAssignment_4_2_1 ) ) ;
    public final void rule__Scenario__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2935:1: ( ( ( rule__Scenario__ThenAssignment_4_2_1 ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2936:1: ( ( rule__Scenario__ThenAssignment_4_2_1 ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2936:1: ( ( rule__Scenario__ThenAssignment_4_2_1 ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2937:1: ( rule__Scenario__ThenAssignment_4_2_1 )
            {
             before(grammarAccess.getScenarioAccess().getThenAssignment_4_2_1()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2938:1: ( rule__Scenario__ThenAssignment_4_2_1 )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2938:2: rule__Scenario__ThenAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__ThenAssignment_4_2_1_in_rule__Scenario__Group_4_2__1__Impl5795);
            rule__Scenario__ThenAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getThenAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_4_2__1__Impl"


    // $ANTLR start "rule__Specification__NameAssignment_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2953:1: rule__Specification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Specification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2957:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2958:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2958:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2959:1: RULE_ID
            {
             before(grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Specification__NameAssignment_15834); 
             after(grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__NameAssignment_1"


    // $ANTLR start "rule__Specification__RolesAssignment_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2968:1: rule__Specification__RolesAssignment_2_1 : ( ruleRole ) ;
    public final void rule__Specification__RolesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2972:1: ( ( ruleRole ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2973:1: ( ruleRole )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2973:1: ( ruleRole )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2974:1: ruleRole
            {
             before(grammarAccess.getSpecificationAccess().getRolesRoleParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Specification__RolesAssignment_2_15865);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getRolesRoleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__RolesAssignment_2_1"


    // $ANTLR start "rule__Specification__RolesAssignment_2_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2983:1: rule__Specification__RolesAssignment_2_2_1 : ( ruleRole ) ;
    public final void rule__Specification__RolesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2987:1: ( ( ruleRole ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2988:1: ( ruleRole )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2988:1: ( ruleRole )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2989:1: ruleRole
            {
             before(grammarAccess.getSpecificationAccess().getRolesRoleParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Specification__RolesAssignment_2_2_15896);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getRolesRoleParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__RolesAssignment_2_2_1"


    // $ANTLR start "rule__Specification__CapabilitiesAssignment_3_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:2998:1: rule__Specification__CapabilitiesAssignment_3_1 : ( ruleCapability ) ;
    public final void rule__Specification__CapabilitiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3002:1: ( ( ruleCapability ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3003:1: ( ruleCapability )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3003:1: ( ruleCapability )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3004:1: ruleCapability
            {
             before(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapability_in_rule__Specification__CapabilitiesAssignment_3_15927);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__CapabilitiesAssignment_3_1"


    // $ANTLR start "rule__Specification__CapabilitiesAssignment_3_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3013:1: rule__Specification__CapabilitiesAssignment_3_2_1 : ( ruleCapability ) ;
    public final void rule__Specification__CapabilitiesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3017:1: ( ( ruleCapability ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3018:1: ( ruleCapability )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3018:1: ( ruleCapability )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3019:1: ruleCapability
            {
             before(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapability_in_rule__Specification__CapabilitiesAssignment_3_2_15958);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__CapabilitiesAssignment_3_2_1"


    // $ANTLR start "rule__Specification__BenefitsAssignment_4_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3028:1: rule__Specification__BenefitsAssignment_4_1 : ( ruleBenefit ) ;
    public final void rule__Specification__BenefitsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3032:1: ( ( ruleBenefit ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3033:1: ( ruleBenefit )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3033:1: ( ruleBenefit )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3034:1: ruleBenefit
            {
             before(grammarAccess.getSpecificationAccess().getBenefitsBenefitParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBenefit_in_rule__Specification__BenefitsAssignment_4_15989);
            ruleBenefit();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getBenefitsBenefitParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__BenefitsAssignment_4_1"


    // $ANTLR start "rule__Specification__CapabilitiesAssignment_4_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3043:1: rule__Specification__CapabilitiesAssignment_4_2_1 : ( ruleCapability ) ;
    public final void rule__Specification__CapabilitiesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3047:1: ( ( ruleCapability ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3048:1: ( ruleCapability )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3048:1: ( ruleCapability )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3049:1: ruleCapability
            {
             before(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapability_in_rule__Specification__CapabilitiesAssignment_4_2_16020);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__CapabilitiesAssignment_4_2_1"


    // $ANTLR start "rule__Specification__AutomationLayerAssignment_5"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3058:1: rule__Specification__AutomationLayerAssignment_5 : ( ruleAutomationLayer ) ;
    public final void rule__Specification__AutomationLayerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3062:1: ( ( ruleAutomationLayer ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3063:1: ( ruleAutomationLayer )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3063:1: ( ruleAutomationLayer )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3064:1: ruleAutomationLayer
            {
             before(grammarAccess.getSpecificationAccess().getAutomationLayerAutomationLayerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAutomationLayer_in_rule__Specification__AutomationLayerAssignment_56051);
            ruleAutomationLayer();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getAutomationLayerAutomationLayerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__AutomationLayerAssignment_5"


    // $ANTLR start "rule__Specification__FeaturesAssignment_6"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3073:1: rule__Specification__FeaturesAssignment_6 : ( ruleFeature ) ;
    public final void rule__Specification__FeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3077:1: ( ( ruleFeature ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3078:1: ( ruleFeature )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3078:1: ( ruleFeature )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3079:1: ruleFeature
            {
             before(grammarAccess.getSpecificationAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Specification__FeaturesAssignment_66082);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getFeaturesFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__FeaturesAssignment_6"


    // $ANTLR start "rule__Specification__StoriesAssignment_7"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3088:1: rule__Specification__StoriesAssignment_7 : ( ruleStory ) ;
    public final void rule__Specification__StoriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3092:1: ( ( ruleStory ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3093:1: ( ruleStory )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3093:1: ( ruleStory )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3094:1: ruleStory
            {
             before(grammarAccess.getSpecificationAccess().getStoriesStoryParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStory_in_rule__Specification__StoriesAssignment_76113);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getStoriesStoryParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__StoriesAssignment_7"


    // $ANTLR start "rule__AutomationLayer__ContextAssignment_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3103:1: rule__AutomationLayer__ContextAssignment_1 : ( ruleContext ) ;
    public final void rule__AutomationLayer__ContextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3107:1: ( ( ruleContext ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3108:1: ( ruleContext )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3108:1: ( ruleContext )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3109:1: ruleContext
            {
             before(grammarAccess.getAutomationLayerAccess().getContextContextParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_rule__AutomationLayer__ContextAssignment_16144);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getAutomationLayerAccess().getContextContextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__ContextAssignment_1"


    // $ANTLR start "rule__AutomationLayer__ContextAssignment_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3118:1: rule__AutomationLayer__ContextAssignment_2_1 : ( ruleContext ) ;
    public final void rule__AutomationLayer__ContextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3122:1: ( ( ruleContext ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3123:1: ( ruleContext )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3123:1: ( ruleContext )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3124:1: ruleContext
            {
             before(grammarAccess.getAutomationLayerAccess().getContextContextParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_rule__AutomationLayer__ContextAssignment_2_16175);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getAutomationLayerAccess().getContextContextParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__ContextAssignment_2_1"


    // $ANTLR start "rule__AutomationLayer__ActionsAssignment_5"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3133:1: rule__AutomationLayer__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__AutomationLayer__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3137:1: ( ( ruleAction ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3138:1: ( ruleAction )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3138:1: ( ruleAction )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3139:1: ruleAction
            {
             before(grammarAccess.getAutomationLayerAccess().getActionsActionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__AutomationLayer__ActionsAssignment_56206);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getAutomationLayerAccess().getActionsActionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__ActionsAssignment_5"


    // $ANTLR start "rule__AutomationLayer__ActionsAssignment_6_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3148:1: rule__AutomationLayer__ActionsAssignment_6_1 : ( ruleAction ) ;
    public final void rule__AutomationLayer__ActionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3152:1: ( ( ruleAction ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3153:1: ( ruleAction )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3153:1: ( ruleAction )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3154:1: ruleAction
            {
             before(grammarAccess.getAutomationLayerAccess().getActionsActionParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__AutomationLayer__ActionsAssignment_6_16237);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getAutomationLayerAccess().getActionsActionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__ActionsAssignment_6_1"


    // $ANTLR start "rule__AutomationLayer__BehavioursAssignment_9"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3163:1: rule__AutomationLayer__BehavioursAssignment_9 : ( ruleBehaviour ) ;
    public final void rule__AutomationLayer__BehavioursAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3167:1: ( ( ruleBehaviour ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3168:1: ( ruleBehaviour )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3168:1: ( ruleBehaviour )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3169:1: ruleBehaviour
            {
             before(grammarAccess.getAutomationLayerAccess().getBehavioursBehaviourParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_rule__AutomationLayer__BehavioursAssignment_96268);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getAutomationLayerAccess().getBehavioursBehaviourParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__BehavioursAssignment_9"


    // $ANTLR start "rule__AutomationLayer__BehavioursAssignment_10_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3178:1: rule__AutomationLayer__BehavioursAssignment_10_1 : ( ruleBehaviour ) ;
    public final void rule__AutomationLayer__BehavioursAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3182:1: ( ( ruleBehaviour ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3183:1: ( ruleBehaviour )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3183:1: ( ruleBehaviour )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3184:1: ruleBehaviour
            {
             before(grammarAccess.getAutomationLayerAccess().getBehavioursBehaviourParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_rule__AutomationLayer__BehavioursAssignment_10_16299);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getAutomationLayerAccess().getBehavioursBehaviourParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutomationLayer__BehavioursAssignment_10_1"


    // $ANTLR start "rule__Context__NameAssignment"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3193:1: rule__Context__NameAssignment : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3197:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3198:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3198:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3199:1: RULE_ID
            {
             before(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Context__NameAssignment6330); 
             after(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NameAssignment"


    // $ANTLR start "rule__Action__NameAssignment"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3208:1: rule__Action__NameAssignment : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3212:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3213:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3213:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3214:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Action__NameAssignment6361); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment"


    // $ANTLR start "rule__Behaviour__NameAssignment"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3223:1: rule__Behaviour__NameAssignment : ( RULE_ID ) ;
    public final void rule__Behaviour__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3227:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3228:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3228:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3229:1: RULE_ID
            {
             before(grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Behaviour__NameAssignment6392); 
             after(grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviour__NameAssignment"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3238:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3242:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3243:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3243:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3244:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_16423); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__RefFeaturesAssignment_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3253:1: rule__Feature__RefFeaturesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__RefFeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3257:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3258:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3258:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3259:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getRefFeaturesFeatureCrossReference_2_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3260:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3261:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getRefFeaturesFeatureIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Feature__RefFeaturesAssignment_2_16458); 
             after(grammarAccess.getFeatureAccess().getRefFeaturesFeatureIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getRefFeaturesFeatureCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__RefFeaturesAssignment_2_1"


    // $ANTLR start "rule__Feature__StoriesAssignment_3"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3272:1: rule__Feature__StoriesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__StoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3276:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3277:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3277:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3278:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getStoriesStoryCrossReference_3_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3279:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3280:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getStoriesStoryIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Feature__StoriesAssignment_36497); 
             after(grammarAccess.getFeatureAccess().getStoriesStoryIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getStoriesStoryCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__StoriesAssignment_3"


    // $ANTLR start "rule__Story__NameAssignment_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3291:1: rule__Story__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Story__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3295:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3296:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3296:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3297:1: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Story__NameAssignment_16532); 
             after(grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__NameAssignment_1"


    // $ANTLR start "rule__Story__AsAssignment_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3306:1: rule__Story__AsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Story__AsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3310:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3311:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3311:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3312:1: ( RULE_ID )
            {
             before(grammarAccess.getStoryAccess().getAsRoleCrossReference_2_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3313:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3314:1: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getAsRoleIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Story__AsAssignment_2_16567); 
             after(grammarAccess.getStoryAccess().getAsRoleIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStoryAccess().getAsRoleCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__AsAssignment_2_1"


    // $ANTLR start "rule__Story__IWantAssignment_3_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3325:1: rule__Story__IWantAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Story__IWantAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3329:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3330:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3330:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3331:1: ( RULE_ID )
            {
             before(grammarAccess.getStoryAccess().getIWantCapabilityCrossReference_3_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3332:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3333:1: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getIWantCapabilityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Story__IWantAssignment_3_16606); 
             after(grammarAccess.getStoryAccess().getIWantCapabilityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStoryAccess().getIWantCapabilityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__IWantAssignment_3_1"


    // $ANTLR start "rule__Story__SoThatAssignment_4_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3344:1: rule__Story__SoThatAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Story__SoThatAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3348:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3349:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3349:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3350:1: ( RULE_ID )
            {
             before(grammarAccess.getStoryAccess().getSoThatBenefitCrossReference_4_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3351:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3352:1: RULE_ID
            {
             before(grammarAccess.getStoryAccess().getSoThatBenefitIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Story__SoThatAssignment_4_16645); 
             after(grammarAccess.getStoryAccess().getSoThatBenefitIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getStoryAccess().getSoThatBenefitCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__SoThatAssignment_4_1"


    // $ANTLR start "rule__Story__ScenariosAssignment_5"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3363:1: rule__Story__ScenariosAssignment_5 : ( ruleScenario ) ;
    public final void rule__Story__ScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3367:1: ( ( ruleScenario ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3368:1: ( ruleScenario )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3368:1: ( ruleScenario )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3369:1: ruleScenario
            {
             before(grammarAccess.getStoryAccess().getScenariosScenarioParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_rule__Story__ScenariosAssignment_56680);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getStoryAccess().getScenariosScenarioParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__ScenariosAssignment_5"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3378:1: rule__Scenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3382:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3383:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3383:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3384:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scenario__NameAssignment_16711); 
             after(grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Scenario__GivenAssignment_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3393:1: rule__Scenario__GivenAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scenario__GivenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3397:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3398:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3398:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3399:1: ( RULE_ID )
            {
             before(grammarAccess.getScenarioAccess().getGivenContextCrossReference_2_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3400:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3401:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getGivenContextIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scenario__GivenAssignment_2_16746); 
             after(grammarAccess.getScenarioAccess().getGivenContextIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getScenarioAccess().getGivenContextCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__GivenAssignment_2_1"


    // $ANTLR start "rule__Scenario__GivenAssignment_2_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3412:1: rule__Scenario__GivenAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scenario__GivenAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3416:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3417:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3417:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3418:1: ( RULE_ID )
            {
             before(grammarAccess.getScenarioAccess().getGivenContextCrossReference_2_2_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3419:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3420:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getGivenContextIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scenario__GivenAssignment_2_2_16785); 
             after(grammarAccess.getScenarioAccess().getGivenContextIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getScenarioAccess().getGivenContextCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__GivenAssignment_2_2_1"


    // $ANTLR start "rule__Scenario__WhenAssignment_3_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3431:1: rule__Scenario__WhenAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scenario__WhenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3435:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3436:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3436:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3437:1: ( RULE_ID )
            {
             before(grammarAccess.getScenarioAccess().getWhenActionCrossReference_3_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3438:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3439:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getWhenActionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scenario__WhenAssignment_3_16824); 
             after(grammarAccess.getScenarioAccess().getWhenActionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getScenarioAccess().getWhenActionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__WhenAssignment_3_1"


    // $ANTLR start "rule__Scenario__WhenAssignment_3_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3450:1: rule__Scenario__WhenAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scenario__WhenAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3454:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3455:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3455:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3456:1: ( RULE_ID )
            {
             before(grammarAccess.getScenarioAccess().getWhenActionCrossReference_3_2_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3457:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3458:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getWhenActionIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scenario__WhenAssignment_3_2_16863); 
             after(grammarAccess.getScenarioAccess().getWhenActionIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getScenarioAccess().getWhenActionCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__WhenAssignment_3_2_1"


    // $ANTLR start "rule__Scenario__ThenAssignment_4_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3469:1: rule__Scenario__ThenAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scenario__ThenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3473:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3474:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3474:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3475:1: ( RULE_ID )
            {
             before(grammarAccess.getScenarioAccess().getThenBehaviourCrossReference_4_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3476:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3477:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getThenBehaviourIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scenario__ThenAssignment_4_16902); 
             after(grammarAccess.getScenarioAccess().getThenBehaviourIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getScenarioAccess().getThenBehaviourCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__ThenAssignment_4_1"


    // $ANTLR start "rule__Scenario__ThenAssignment_4_2_1"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3488:1: rule__Scenario__ThenAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Scenario__ThenAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3492:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3493:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3493:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3494:1: ( RULE_ID )
            {
             before(grammarAccess.getScenarioAccess().getThenBehaviourCrossReference_4_2_1_0()); 
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3495:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3496:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getThenBehaviourIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Scenario__ThenAssignment_4_2_16941); 
             after(grammarAccess.getScenarioAccess().getThenBehaviourIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getScenarioAccess().getThenBehaviourCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__ThenAssignment_4_2_1"


    // $ANTLR start "rule__Role__NameAssignment"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3507:1: rule__Role__NameAssignment : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3511:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3512:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3512:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3513:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Role__NameAssignment6976); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment"


    // $ANTLR start "rule__Capability__NameAssignment"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3522:1: rule__Capability__NameAssignment : ( RULE_ID ) ;
    public final void rule__Capability__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3526:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3527:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3527:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3528:1: RULE_ID
            {
             before(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Capability__NameAssignment7007); 
             after(grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__NameAssignment"


    // $ANTLR start "rule__Benefit__NameAssignment"
    // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3537:1: rule__Benefit__NameAssignment : ( RULE_ID ) ;
    public final void rule__Benefit__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3541:1: ( ( RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3542:1: ( RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3542:1: ( RULE_ID )
            // ../fr.obeo.intent.specification.xtext.ui/src-gen/fr/obeo/intent/specification/ui/contentassist/antlr/internal/InternalSpecification.g:3543:1: RULE_ID
            {
             before(grammarAccess.getBenefitAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Benefit__NameAssignment7038); 
             after(grammarAccess.getBenefitAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benefit__NameAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpecification68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__0_in_ruleSpecification94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAutomationLayer_in_entryRuleAutomationLayer121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAutomationLayer128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__0_in_ruleAutomationLayer154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Context__NameAssignment_in_ruleContext214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__NameAssignment_in_ruleAction274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_entryRuleBehaviour301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehaviour308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behaviour__NameAssignment_in_ruleBehaviour334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStory_in_entryRuleStory421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStory428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group__0_in_ruleStory454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenario488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group__0_in_ruleScenario514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_in_ruleRole574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCapability608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Capability__NameAssignment_in_ruleCapability634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBenefit_in_entryRuleBenefit661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBenefit668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Benefit__NameAssignment_in_ruleBenefit694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__0__Impl_in_rule__Specification__Group__0728 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Specification__Group__1_in_rule__Specification__Group__0731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Specification__Group__0__Impl759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__1__Impl_in_rule__Specification__Group__1790 = new BitSet(new long[]{0x0000000000539000L});
        public static final BitSet FOLLOW_rule__Specification__Group__2_in_rule__Specification__Group__1793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__NameAssignment_1_in_rule__Specification__Group__1__Impl820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__2__Impl_in_rule__Specification__Group__2850 = new BitSet(new long[]{0x0000000000539000L});
        public static final BitSet FOLLOW_rule__Specification__Group__3_in_rule__Specification__Group__2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__0_in_rule__Specification__Group__2__Impl880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__3__Impl_in_rule__Specification__Group__3911 = new BitSet(new long[]{0x0000000000539000L});
        public static final BitSet FOLLOW_rule__Specification__Group__4_in_rule__Specification__Group__3914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__0_in_rule__Specification__Group__3__Impl941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__4__Impl_in_rule__Specification__Group__4972 = new BitSet(new long[]{0x0000000000539000L});
        public static final BitSet FOLLOW_rule__Specification__Group__5_in_rule__Specification__Group__4975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__0_in_rule__Specification__Group__4__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__5__Impl_in_rule__Specification__Group__51033 = new BitSet(new long[]{0x0000000000539000L});
        public static final BitSet FOLLOW_rule__Specification__Group__6_in_rule__Specification__Group__51036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__AutomationLayerAssignment_5_in_rule__Specification__Group__5__Impl1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group__6__Impl_in_rule__Specification__Group__61094 = new BitSet(new long[]{0x0000000000539000L});
        public static final BitSet FOLLOW_rule__Specification__Group__7_in_rule__Specification__Group__61097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__FeaturesAssignment_6_in_rule__Specification__Group__6__Impl1124 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Specification__Group__7__Impl_in_rule__Specification__Group__71155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__StoriesAssignment_7_in_rule__Specification__Group__7__Impl1182 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__0__Impl_in_rule__Specification__Group_2__01229 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__1_in_rule__Specification__Group_2__01232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Specification__Group_2__0__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__1__Impl_in_rule__Specification__Group_2__11291 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__2_in_rule__Specification__Group_2__11294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__RolesAssignment_2_1_in_rule__Specification__Group_2__1__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__2__Impl_in_rule__Specification__Group_2__21351 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__3_in_rule__Specification__Group_2__21354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2_2__0_in_rule__Specification__Group_2__2__Impl1381 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2__3__Impl_in_rule__Specification__Group_2__31412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Specification__Group_2__3__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2_2__0__Impl_in_rule__Specification__Group_2_2__01479 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Specification__Group_2_2__1_in_rule__Specification__Group_2_2__01482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Specification__Group_2_2__0__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_2_2__1__Impl_in_rule__Specification__Group_2_2__11541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__RolesAssignment_2_2_1_in_rule__Specification__Group_2_2__1__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__0__Impl_in_rule__Specification__Group_3__01602 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__1_in_rule__Specification__Group_3__01605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Specification__Group_3__0__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__1__Impl_in_rule__Specification__Group_3__11664 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__2_in_rule__Specification__Group_3__11667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__CapabilitiesAssignment_3_1_in_rule__Specification__Group_3__1__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__2__Impl_in_rule__Specification__Group_3__21724 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__3_in_rule__Specification__Group_3__21727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3_2__0_in_rule__Specification__Group_3__2__Impl1754 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3__3__Impl_in_rule__Specification__Group_3__31785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Specification__Group_3__3__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3_2__0__Impl_in_rule__Specification__Group_3_2__01852 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Specification__Group_3_2__1_in_rule__Specification__Group_3_2__01855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Specification__Group_3_2__0__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_3_2__1__Impl_in_rule__Specification__Group_3_2__11914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__CapabilitiesAssignment_3_2_1_in_rule__Specification__Group_3_2__1__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__0__Impl_in_rule__Specification__Group_4__01975 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__1_in_rule__Specification__Group_4__01978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Specification__Group_4__0__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__1__Impl_in_rule__Specification__Group_4__12037 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__2_in_rule__Specification__Group_4__12040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__BenefitsAssignment_4_1_in_rule__Specification__Group_4__1__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__2__Impl_in_rule__Specification__Group_4__22097 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__3_in_rule__Specification__Group_4__22100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4_2__0_in_rule__Specification__Group_4__2__Impl2127 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4__3__Impl_in_rule__Specification__Group_4__32158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Specification__Group_4__3__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4_2__0__Impl_in_rule__Specification__Group_4_2__02225 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Specification__Group_4_2__1_in_rule__Specification__Group_4_2__02228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Specification__Group_4_2__0__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__Group_4_2__1__Impl_in_rule__Specification__Group_4_2__12287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Specification__CapabilitiesAssignment_4_2_1_in_rule__Specification__Group_4_2__1__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__0__Impl_in_rule__AutomationLayer__Group__02348 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__1_in_rule__AutomationLayer__Group__02351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AutomationLayer__Group__0__Impl2379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__1__Impl_in_rule__AutomationLayer__Group__12410 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__2_in_rule__AutomationLayer__Group__12413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__ContextAssignment_1_in_rule__AutomationLayer__Group__1__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__2__Impl_in_rule__AutomationLayer__Group__22470 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__3_in_rule__AutomationLayer__Group__22473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_2__0_in_rule__AutomationLayer__Group__2__Impl2500 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__3__Impl_in_rule__AutomationLayer__Group__32531 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__4_in_rule__AutomationLayer__Group__32534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AutomationLayer__Group__3__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__4__Impl_in_rule__AutomationLayer__Group__42593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__5_in_rule__AutomationLayer__Group__42596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AutomationLayer__Group__4__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__5__Impl_in_rule__AutomationLayer__Group__52655 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__6_in_rule__AutomationLayer__Group__52658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__ActionsAssignment_5_in_rule__AutomationLayer__Group__5__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__6__Impl_in_rule__AutomationLayer__Group__62715 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__7_in_rule__AutomationLayer__Group__62718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_6__0_in_rule__AutomationLayer__Group__6__Impl2745 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__7__Impl_in_rule__AutomationLayer__Group__72776 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__8_in_rule__AutomationLayer__Group__72779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AutomationLayer__Group__7__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__8__Impl_in_rule__AutomationLayer__Group__82838 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__9_in_rule__AutomationLayer__Group__82841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AutomationLayer__Group__8__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__9__Impl_in_rule__AutomationLayer__Group__92900 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__10_in_rule__AutomationLayer__Group__92903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__BehavioursAssignment_9_in_rule__AutomationLayer__Group__9__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__10__Impl_in_rule__AutomationLayer__Group__102960 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__11_in_rule__AutomationLayer__Group__102963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_10__0_in_rule__AutomationLayer__Group__10__Impl2990 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group__11__Impl_in_rule__AutomationLayer__Group__113021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AutomationLayer__Group__11__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_2__0__Impl_in_rule__AutomationLayer__Group_2__03104 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_2__1_in_rule__AutomationLayer__Group_2__03107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AutomationLayer__Group_2__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_2__1__Impl_in_rule__AutomationLayer__Group_2__13166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__ContextAssignment_2_1_in_rule__AutomationLayer__Group_2__1__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_6__0__Impl_in_rule__AutomationLayer__Group_6__03227 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_6__1_in_rule__AutomationLayer__Group_6__03230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AutomationLayer__Group_6__0__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_6__1__Impl_in_rule__AutomationLayer__Group_6__13289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__ActionsAssignment_6_1_in_rule__AutomationLayer__Group_6__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_10__0__Impl_in_rule__AutomationLayer__Group_10__03350 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_10__1_in_rule__AutomationLayer__Group_10__03353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AutomationLayer__Group_10__0__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__Group_10__1__Impl_in_rule__AutomationLayer__Group_10__13412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AutomationLayer__BehavioursAssignment_10_1_in_rule__AutomationLayer__Group_10__1__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__03473 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__03476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Feature__Group__0__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__13535 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__13538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__23595 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__23598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_2__0_in_rule__Feature__Group__2__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__33656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__StoriesAssignment_3_in_rule__Feature__Group__3__Impl3683 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Feature__Group_2__0__Impl_in_rule__Feature__Group_2__03722 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Feature__Group_2__1_in_rule__Feature__Group_2__03725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Feature__Group_2__0__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_2__1__Impl_in_rule__Feature__Group_2__13784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__RefFeaturesAssignment_2_1_in_rule__Feature__Group_2__1__Impl3811 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Story__Group__0__Impl_in_rule__Story__Group__03846 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Story__Group__1_in_rule__Story__Group__03849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Story__Group__0__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group__1__Impl_in_rule__Story__Group__13908 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Story__Group__2_in_rule__Story__Group__13911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__NameAssignment_1_in_rule__Story__Group__1__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group__2__Impl_in_rule__Story__Group__23968 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Story__Group__3_in_rule__Story__Group__23971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_2__0_in_rule__Story__Group__2__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group__3__Impl_in_rule__Story__Group__34029 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Story__Group__4_in_rule__Story__Group__34032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_3__0_in_rule__Story__Group__3__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group__4__Impl_in_rule__Story__Group__44090 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Story__Group__5_in_rule__Story__Group__44093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_4__0_in_rule__Story__Group__4__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group__5__Impl_in_rule__Story__Group__54151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__ScenariosAssignment_5_in_rule__Story__Group__5__Impl4178 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Story__Group_2__0__Impl_in_rule__Story__Group_2__04221 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Story__Group_2__1_in_rule__Story__Group_2__04224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Story__Group_2__0__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_2__1__Impl_in_rule__Story__Group_2__14283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__AsAssignment_2_1_in_rule__Story__Group_2__1__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_3__0__Impl_in_rule__Story__Group_3__04344 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Story__Group_3__1_in_rule__Story__Group_3__04347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Story__Group_3__0__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_3__1__Impl_in_rule__Story__Group_3__14406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__IWantAssignment_3_1_in_rule__Story__Group_3__1__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_4__0__Impl_in_rule__Story__Group_4__04467 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Story__Group_4__1_in_rule__Story__Group_4__04470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Story__Group_4__0__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__Group_4__1__Impl_in_rule__Story__Group_4__14529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Story__SoThatAssignment_4_1_in_rule__Story__Group_4__1__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__04590 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__04593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Scenario__Group__0__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__14652 = new BitSet(new long[]{0x0000000038000000L});
        public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__14655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__NameAssignment_1_in_rule__Scenario__Group__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__24712 = new BitSet(new long[]{0x0000000038000000L});
        public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__24715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2__0_in_rule__Scenario__Group__2__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__34773 = new BitSet(new long[]{0x0000000038000000L});
        public static final BitSet FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__34776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3__0_in_rule__Scenario__Group__3__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__44834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4__0_in_rule__Scenario__Group__4__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2__0__Impl_in_rule__Scenario__Group_2__04902 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2__1_in_rule__Scenario__Group_2__04905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Scenario__Group_2__0__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2__1__Impl_in_rule__Scenario__Group_2__14964 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2__2_in_rule__Scenario__Group_2__14967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__GivenAssignment_2_1_in_rule__Scenario__Group_2__1__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2__2__Impl_in_rule__Scenario__Group_2__25024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2_2__0_in_rule__Scenario__Group_2__2__Impl5051 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2_2__0__Impl_in_rule__Scenario__Group_2_2__05088 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2_2__1_in_rule__Scenario__Group_2_2__05091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Scenario__Group_2_2__0__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_2_2__1__Impl_in_rule__Scenario__Group_2_2__15150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__GivenAssignment_2_2_1_in_rule__Scenario__Group_2_2__1__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3__0__Impl_in_rule__Scenario__Group_3__05211 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3__1_in_rule__Scenario__Group_3__05214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Scenario__Group_3__0__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3__1__Impl_in_rule__Scenario__Group_3__15273 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3__2_in_rule__Scenario__Group_3__15276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__WhenAssignment_3_1_in_rule__Scenario__Group_3__1__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3__2__Impl_in_rule__Scenario__Group_3__25333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3_2__0_in_rule__Scenario__Group_3__2__Impl5360 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3_2__0__Impl_in_rule__Scenario__Group_3_2__05397 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3_2__1_in_rule__Scenario__Group_3_2__05400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Scenario__Group_3_2__0__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_3_2__1__Impl_in_rule__Scenario__Group_3_2__15459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__WhenAssignment_3_2_1_in_rule__Scenario__Group_3_2__1__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4__0__Impl_in_rule__Scenario__Group_4__05520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4__1_in_rule__Scenario__Group_4__05523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Scenario__Group_4__0__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4__1__Impl_in_rule__Scenario__Group_4__15582 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4__2_in_rule__Scenario__Group_4__15585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__ThenAssignment_4_1_in_rule__Scenario__Group_4__1__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4__2__Impl_in_rule__Scenario__Group_4__25642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4_2__0_in_rule__Scenario__Group_4__2__Impl5669 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4_2__0__Impl_in_rule__Scenario__Group_4_2__05706 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4_2__1_in_rule__Scenario__Group_4_2__05709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Scenario__Group_4_2__0__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Group_4_2__1__Impl_in_rule__Scenario__Group_4_2__15768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__ThenAssignment_4_2_1_in_rule__Scenario__Group_4_2__1__Impl5795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Specification__NameAssignment_15834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Specification__RolesAssignment_2_15865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Specification__RolesAssignment_2_2_15896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_in_rule__Specification__CapabilitiesAssignment_3_15927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_in_rule__Specification__CapabilitiesAssignment_3_2_15958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBenefit_in_rule__Specification__BenefitsAssignment_4_15989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_in_rule__Specification__CapabilitiesAssignment_4_2_16020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAutomationLayer_in_rule__Specification__AutomationLayerAssignment_56051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Specification__FeaturesAssignment_66082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStory_in_rule__Specification__StoriesAssignment_76113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_rule__AutomationLayer__ContextAssignment_16144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_rule__AutomationLayer__ContextAssignment_2_16175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__AutomationLayer__ActionsAssignment_56206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__AutomationLayer__ActionsAssignment_6_16237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_rule__AutomationLayer__BehavioursAssignment_96268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_rule__AutomationLayer__BehavioursAssignment_10_16299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Context__NameAssignment6330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment6361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Behaviour__NameAssignment6392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_16423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__RefFeaturesAssignment_2_16458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__StoriesAssignment_36497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Story__NameAssignment_16532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Story__AsAssignment_2_16567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Story__IWantAssignment_3_16606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Story__SoThatAssignment_4_16645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenario_in_rule__Story__ScenariosAssignment_56680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__NameAssignment_16711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__GivenAssignment_2_16746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__GivenAssignment_2_2_16785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__WhenAssignment_3_16824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__WhenAssignment_3_2_16863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__ThenAssignment_4_16902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__ThenAssignment_4_2_16941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment6976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Capability__NameAssignment7007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Benefit__NameAssignment7038 = new BitSet(new long[]{0x0000000000000002L});
    }


}