package fr.obeo.intent.specification.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.obeo.intent.specification.services.SpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecificationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Specification:'", "'Roles ('", "','", "')'", "'Capabilities ('", "'Benefits ('", "'Contexts ('", "'Actions ('", "'Behaviors ('", "'Feature:'", "'linked to '", "'Story:'", "'As '", "'I want '", "'So that '", "'Scenario:'", "'Given '", "'When '", "'Then '"
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
    public String getGrammarFileName() { return "../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g"; }



     	private SpecificationGrammarAccess grammarAccess;
     	
        public InternalSpecificationParser(TokenStream input, SpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	}
       	
       	@Override
       	protected SpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpecification"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:67:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:68:2: (iv_ruleSpecification= ruleSpecification EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:69:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpecification_in_entryRuleSpecification75);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpecification85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:76:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'Specification:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Roles (' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* otherlv_6= ')' )? (otherlv_7= 'Capabilities (' ( (lv_capabilities_8_0= ruleCapability ) ) (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )* otherlv_11= ')' )? (otherlv_12= 'Benefits (' ( (lv_benefits_13_0= ruleBenefit ) ) (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )* otherlv_16= ')' )? ( (lv_automationLayer_17_0= ruleAutomationLayer ) )? ( (lv_features_18_0= ruleFeature ) )* ( (lv_stories_19_0= ruleStory ) )* ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_roles_3_0 = null;

        EObject lv_roles_5_0 = null;

        EObject lv_capabilities_8_0 = null;

        EObject lv_capabilities_10_0 = null;

        EObject lv_benefits_13_0 = null;

        EObject lv_capabilities_15_0 = null;

        EObject lv_automationLayer_17_0 = null;

        EObject lv_features_18_0 = null;

        EObject lv_stories_19_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:79:28: ( (otherlv_0= 'Specification:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Roles (' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* otherlv_6= ')' )? (otherlv_7= 'Capabilities (' ( (lv_capabilities_8_0= ruleCapability ) ) (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )* otherlv_11= ')' )? (otherlv_12= 'Benefits (' ( (lv_benefits_13_0= ruleBenefit ) ) (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )* otherlv_16= ')' )? ( (lv_automationLayer_17_0= ruleAutomationLayer ) )? ( (lv_features_18_0= ruleFeature ) )* ( (lv_stories_19_0= ruleStory ) )* ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:80:1: (otherlv_0= 'Specification:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Roles (' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* otherlv_6= ')' )? (otherlv_7= 'Capabilities (' ( (lv_capabilities_8_0= ruleCapability ) ) (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )* otherlv_11= ')' )? (otherlv_12= 'Benefits (' ( (lv_benefits_13_0= ruleBenefit ) ) (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )* otherlv_16= ')' )? ( (lv_automationLayer_17_0= ruleAutomationLayer ) )? ( (lv_features_18_0= ruleFeature ) )* ( (lv_stories_19_0= ruleStory ) )* )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:80:1: (otherlv_0= 'Specification:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Roles (' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* otherlv_6= ')' )? (otherlv_7= 'Capabilities (' ( (lv_capabilities_8_0= ruleCapability ) ) (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )* otherlv_11= ')' )? (otherlv_12= 'Benefits (' ( (lv_benefits_13_0= ruleBenefit ) ) (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )* otherlv_16= ')' )? ( (lv_automationLayer_17_0= ruleAutomationLayer ) )? ( (lv_features_18_0= ruleFeature ) )* ( (lv_stories_19_0= ruleStory ) )* )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:80:3: otherlv_0= 'Specification:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Roles (' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* otherlv_6= ')' )? (otherlv_7= 'Capabilities (' ( (lv_capabilities_8_0= ruleCapability ) ) (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )* otherlv_11= ')' )? (otherlv_12= 'Benefits (' ( (lv_benefits_13_0= ruleBenefit ) ) (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )* otherlv_16= ')' )? ( (lv_automationLayer_17_0= ruleAutomationLayer ) )? ( (lv_features_18_0= ruleFeature ) )* ( (lv_stories_19_0= ruleStory ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSpecification122); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
                
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:85:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSpecification139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:102:2: (otherlv_2= 'Roles (' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* otherlv_6= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:102:4: otherlv_2= 'Roles (' ( (lv_roles_3_0= ruleRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSpecification157); 

                        	newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getRolesKeyword_2_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:106:1: ( (lv_roles_3_0= ruleRole ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:107:1: (lv_roles_3_0= ruleRole )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:107:1: (lv_roles_3_0= ruleRole )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:108:3: lv_roles_3_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpecificationAccess().getRolesRoleParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleSpecification178);
                    lv_roles_3_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	        }
                           		add(
                           			current, 
                           			"roles",
                            		lv_roles_3_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:124:2: (otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:124:4: otherlv_4= ',' ( (lv_roles_5_0= ruleRole ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSpecification191); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSpecificationAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:128:1: ( (lv_roles_5_0= ruleRole ) )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:129:1: (lv_roles_5_0= ruleRole )
                    	    {
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:129:1: (lv_roles_5_0= ruleRole )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:130:3: lv_roles_5_0= ruleRole
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getRolesRoleParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleSpecification212);
                    	    lv_roles_5_0=ruleRole();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"roles",
                    	            		lv_roles_5_0, 
                    	            		"Role");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSpecification226); 

                        	newLeafNode(otherlv_6, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:150:3: (otherlv_7= 'Capabilities (' ( (lv_capabilities_8_0= ruleCapability ) ) (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )* otherlv_11= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:150:5: otherlv_7= 'Capabilities (' ( (lv_capabilities_8_0= ruleCapability ) ) (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSpecification241); 

                        	newLeafNode(otherlv_7, grammarAccess.getSpecificationAccess().getCapabilitiesKeyword_3_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:154:1: ( (lv_capabilities_8_0= ruleCapability ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:155:1: (lv_capabilities_8_0= ruleCapability )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:155:1: (lv_capabilities_8_0= ruleCapability )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:156:3: lv_capabilities_8_0= ruleCapability
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCapability_in_ruleSpecification262);
                    lv_capabilities_8_0=ruleCapability();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	        }
                           		add(
                           			current, 
                           			"capabilities",
                            		lv_capabilities_8_0, 
                            		"Capability");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:172:2: (otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:172:4: otherlv_9= ',' ( (lv_capabilities_10_0= ruleCapability ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSpecification275); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSpecificationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:176:1: ( (lv_capabilities_10_0= ruleCapability ) )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:177:1: (lv_capabilities_10_0= ruleCapability )
                    	    {
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:177:1: (lv_capabilities_10_0= ruleCapability )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:178:3: lv_capabilities_10_0= ruleCapability
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCapability_in_ruleSpecification296);
                    	    lv_capabilities_10_0=ruleCapability();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"capabilities",
                    	            		lv_capabilities_10_0, 
                    	            		"Capability");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSpecification310); 

                        	newLeafNode(otherlv_11, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:198:3: (otherlv_12= 'Benefits (' ( (lv_benefits_13_0= ruleBenefit ) ) (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )* otherlv_16= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:198:5: otherlv_12= 'Benefits (' ( (lv_benefits_13_0= ruleBenefit ) ) (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )* otherlv_16= ')'
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSpecification325); 

                        	newLeafNode(otherlv_12, grammarAccess.getSpecificationAccess().getBenefitsKeyword_4_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:202:1: ( (lv_benefits_13_0= ruleBenefit ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:203:1: (lv_benefits_13_0= ruleBenefit )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:203:1: (lv_benefits_13_0= ruleBenefit )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:204:3: lv_benefits_13_0= ruleBenefit
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpecificationAccess().getBenefitsBenefitParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBenefit_in_ruleSpecification346);
                    lv_benefits_13_0=ruleBenefit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	        }
                           		add(
                           			current, 
                           			"benefits",
                            		lv_benefits_13_0, 
                            		"Benefit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:220:2: (otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:220:4: otherlv_14= ',' ( (lv_capabilities_15_0= ruleCapability ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSpecification359); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSpecificationAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:224:1: ( (lv_capabilities_15_0= ruleCapability ) )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:225:1: (lv_capabilities_15_0= ruleCapability )
                    	    {
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:225:1: (lv_capabilities_15_0= ruleCapability )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:226:3: lv_capabilities_15_0= ruleCapability
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getCapabilitiesCapabilityParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCapability_in_ruleSpecification380);
                    	    lv_capabilities_15_0=ruleCapability();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"capabilities",
                    	            		lv_capabilities_15_0, 
                    	            		"Capability");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSpecification394); 

                        	newLeafNode(otherlv_16, grammarAccess.getSpecificationAccess().getRightParenthesisKeyword_4_3());
                        

                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:246:3: ( (lv_automationLayer_17_0= ruleAutomationLayer ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:247:1: (lv_automationLayer_17_0= ruleAutomationLayer )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:247:1: (lv_automationLayer_17_0= ruleAutomationLayer )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:248:3: lv_automationLayer_17_0= ruleAutomationLayer
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpecificationAccess().getAutomationLayerAutomationLayerParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAutomationLayer_in_ruleSpecification417);
                    lv_automationLayer_17_0=ruleAutomationLayer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	        }
                           		set(
                           			current, 
                           			"automationLayer",
                            		lv_automationLayer_17_0, 
                            		"AutomationLayer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:264:3: ( (lv_features_18_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:265:1: (lv_features_18_0= ruleFeature )
            	    {
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:265:1: (lv_features_18_0= ruleFeature )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:266:3: lv_features_18_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleSpecification439);
            	    lv_features_18_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_18_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:282:3: ( (lv_stories_19_0= ruleStory ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:283:1: (lv_stories_19_0= ruleStory )
            	    {
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:283:1: (lv_stories_19_0= ruleStory )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:284:3: lv_stories_19_0= ruleStory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getStoriesStoryParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStory_in_ruleSpecification461);
            	    lv_stories_19_0=ruleStory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stories",
            	            		lv_stories_19_0, 
            	            		"Story");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleAutomationLayer"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:308:1: entryRuleAutomationLayer returns [EObject current=null] : iv_ruleAutomationLayer= ruleAutomationLayer EOF ;
    public final EObject entryRuleAutomationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomationLayer = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:309:2: (iv_ruleAutomationLayer= ruleAutomationLayer EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:310:2: iv_ruleAutomationLayer= ruleAutomationLayer EOF
            {
             newCompositeNode(grammarAccess.getAutomationLayerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAutomationLayer_in_entryRuleAutomationLayer498);
            iv_ruleAutomationLayer=ruleAutomationLayer();

            state._fsp--;

             current =iv_ruleAutomationLayer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAutomationLayer508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutomationLayer"


    // $ANTLR start "ruleAutomationLayer"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:317:1: ruleAutomationLayer returns [EObject current=null] : (otherlv_0= 'Contexts (' ( (lv_context_1_0= ruleContext ) ) (otherlv_2= ',' ( (lv_context_3_0= ruleContext ) ) )* otherlv_4= ')' otherlv_5= 'Actions (' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= ')' otherlv_10= 'Behaviors (' ( (lv_behaviours_11_0= ruleBehaviour ) ) (otherlv_12= ',' ( (lv_behaviours_13_0= ruleBehaviour ) ) )* otherlv_14= ')' ) ;
    public final EObject ruleAutomationLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_context_1_0 = null;

        EObject lv_context_3_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_behaviours_11_0 = null;

        EObject lv_behaviours_13_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:320:28: ( (otherlv_0= 'Contexts (' ( (lv_context_1_0= ruleContext ) ) (otherlv_2= ',' ( (lv_context_3_0= ruleContext ) ) )* otherlv_4= ')' otherlv_5= 'Actions (' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= ')' otherlv_10= 'Behaviors (' ( (lv_behaviours_11_0= ruleBehaviour ) ) (otherlv_12= ',' ( (lv_behaviours_13_0= ruleBehaviour ) ) )* otherlv_14= ')' ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:321:1: (otherlv_0= 'Contexts (' ( (lv_context_1_0= ruleContext ) ) (otherlv_2= ',' ( (lv_context_3_0= ruleContext ) ) )* otherlv_4= ')' otherlv_5= 'Actions (' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= ')' otherlv_10= 'Behaviors (' ( (lv_behaviours_11_0= ruleBehaviour ) ) (otherlv_12= ',' ( (lv_behaviours_13_0= ruleBehaviour ) ) )* otherlv_14= ')' )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:321:1: (otherlv_0= 'Contexts (' ( (lv_context_1_0= ruleContext ) ) (otherlv_2= ',' ( (lv_context_3_0= ruleContext ) ) )* otherlv_4= ')' otherlv_5= 'Actions (' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= ')' otherlv_10= 'Behaviors (' ( (lv_behaviours_11_0= ruleBehaviour ) ) (otherlv_12= ',' ( (lv_behaviours_13_0= ruleBehaviour ) ) )* otherlv_14= ')' )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:321:3: otherlv_0= 'Contexts (' ( (lv_context_1_0= ruleContext ) ) (otherlv_2= ',' ( (lv_context_3_0= ruleContext ) ) )* otherlv_4= ')' otherlv_5= 'Actions (' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= ')' otherlv_10= 'Behaviors (' ( (lv_behaviours_11_0= ruleBehaviour ) ) (otherlv_12= ',' ( (lv_behaviours_13_0= ruleBehaviour ) ) )* otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAutomationLayer545); 

                	newLeafNode(otherlv_0, grammarAccess.getAutomationLayerAccess().getContextsKeyword_0());
                
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:325:1: ( (lv_context_1_0= ruleContext ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:326:1: (lv_context_1_0= ruleContext )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:326:1: (lv_context_1_0= ruleContext )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:327:3: lv_context_1_0= ruleContext
            {
             
            	        newCompositeNode(grammarAccess.getAutomationLayerAccess().getContextContextParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleAutomationLayer566);
            lv_context_1_0=ruleContext();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAutomationLayerRule());
            	        }
                   		add(
                   			current, 
                   			"context",
                    		lv_context_1_0, 
                    		"Context");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:343:2: (otherlv_2= ',' ( (lv_context_3_0= ruleContext ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:343:4: otherlv_2= ',' ( (lv_context_3_0= ruleContext ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAutomationLayer579); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAutomationLayerAccess().getCommaKeyword_2_0());
            	        
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:347:1: ( (lv_context_3_0= ruleContext ) )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:348:1: (lv_context_3_0= ruleContext )
            	    {
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:348:1: (lv_context_3_0= ruleContext )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:349:3: lv_context_3_0= ruleContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAutomationLayerAccess().getContextContextParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContext_in_ruleAutomationLayer600);
            	    lv_context_3_0=ruleContext();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAutomationLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"context",
            	            		lv_context_3_0, 
            	            		"Context");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAutomationLayer614); 

                	newLeafNode(otherlv_4, grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_3());
                
            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAutomationLayer626); 

                	newLeafNode(otherlv_5, grammarAccess.getAutomationLayerAccess().getActionsKeyword_4());
                
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:373:1: ( (lv_actions_6_0= ruleAction ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:374:1: (lv_actions_6_0= ruleAction )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:374:1: (lv_actions_6_0= ruleAction )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:375:3: lv_actions_6_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getAutomationLayerAccess().getActionsActionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleAutomationLayer647);
            lv_actions_6_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAutomationLayerRule());
            	        }
                   		add(
                   			current, 
                   			"actions",
                    		lv_actions_6_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:391:2: (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:391:4: otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAutomationLayer660); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAutomationLayerAccess().getCommaKeyword_6_0());
            	        
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:395:1: ( (lv_actions_8_0= ruleAction ) )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:396:1: (lv_actions_8_0= ruleAction )
            	    {
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:396:1: (lv_actions_8_0= ruleAction )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:397:3: lv_actions_8_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAutomationLayerAccess().getActionsActionParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleAutomationLayer681);
            	    lv_actions_8_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAutomationLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_8_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAutomationLayer695); 

                	newLeafNode(otherlv_9, grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_7());
                
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAutomationLayer707); 

                	newLeafNode(otherlv_10, grammarAccess.getAutomationLayerAccess().getBehaviorsKeyword_8());
                
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:421:1: ( (lv_behaviours_11_0= ruleBehaviour ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:422:1: (lv_behaviours_11_0= ruleBehaviour )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:422:1: (lv_behaviours_11_0= ruleBehaviour )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:423:3: lv_behaviours_11_0= ruleBehaviour
            {
             
            	        newCompositeNode(grammarAccess.getAutomationLayerAccess().getBehavioursBehaviourParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_ruleAutomationLayer728);
            lv_behaviours_11_0=ruleBehaviour();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAutomationLayerRule());
            	        }
                   		add(
                   			current, 
                   			"behaviours",
                    		lv_behaviours_11_0, 
                    		"Behaviour");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:439:2: (otherlv_12= ',' ( (lv_behaviours_13_0= ruleBehaviour ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:439:4: otherlv_12= ',' ( (lv_behaviours_13_0= ruleBehaviour ) )
            	    {
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAutomationLayer741); 

            	        	newLeafNode(otherlv_12, grammarAccess.getAutomationLayerAccess().getCommaKeyword_10_0());
            	        
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:443:1: ( (lv_behaviours_13_0= ruleBehaviour ) )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:444:1: (lv_behaviours_13_0= ruleBehaviour )
            	    {
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:444:1: (lv_behaviours_13_0= ruleBehaviour )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:445:3: lv_behaviours_13_0= ruleBehaviour
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAutomationLayerAccess().getBehavioursBehaviourParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_ruleAutomationLayer762);
            	    lv_behaviours_13_0=ruleBehaviour();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAutomationLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"behaviours",
            	            		lv_behaviours_13_0, 
            	            		"Behaviour");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAutomationLayer776); 

                	newLeafNode(otherlv_14, grammarAccess.getAutomationLayerAccess().getRightParenthesisKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutomationLayer"


    // $ANTLR start "entryRuleContext"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:473:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:474:2: (iv_ruleContext= ruleContext EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:475:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext812);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext822); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:482:1: ruleContext returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:485:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:486:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:486:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:487:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:487:1: (lv_name_0_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:488:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleContext863); 

            			newLeafNode(lv_name_0_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleAction"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:512:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:513:2: (iv_ruleAction= ruleAction EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:514:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction903);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:521:1: ruleAction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:524:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:525:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:525:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:526:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:526:1: (lv_name_0_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:527:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAction954); 

            			newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleBehaviour"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:551:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:552:2: (iv_ruleBehaviour= ruleBehaviour EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:553:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
             newCompositeNode(grammarAccess.getBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_entryRuleBehaviour994);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;

             current =iv_ruleBehaviour; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehaviour1004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:560:1: ruleBehaviour returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:563:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:564:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:564:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:565:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:565:1: (lv_name_0_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:566:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBehaviour1045); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviourRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleFeature"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:590:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:591:2: (iv_ruleFeature= ruleFeature EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:592:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature1085);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature1095); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:599:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'linked to ' ( (otherlv_3= RULE_ID ) )* )? ( (otherlv_4= RULE_ID ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:602:28: ( (otherlv_0= 'Feature:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'linked to ' ( (otherlv_3= RULE_ID ) )* )? ( (otherlv_4= RULE_ID ) )* ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:603:1: (otherlv_0= 'Feature:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'linked to ' ( (otherlv_3= RULE_ID ) )* )? ( (otherlv_4= RULE_ID ) )* )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:603:1: (otherlv_0= 'Feature:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'linked to ' ( (otherlv_3= RULE_ID ) )* )? ( (otherlv_4= RULE_ID ) )* )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:603:3: otherlv_0= 'Feature:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'linked to ' ( (otherlv_3= RULE_ID ) )* )? ( (otherlv_4= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFeature1132); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
                
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:607:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:608:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:608:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:609:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFeature1149); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:625:2: (otherlv_2= 'linked to ' ( (otherlv_3= RULE_ID ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:625:4: otherlv_2= 'linked to ' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFeature1167); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getLinkedToKeyword_2_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:629:1: ( (otherlv_3= RULE_ID ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:630:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:630:1: (otherlv_3= RULE_ID )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:631:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFeature1187); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getRefFeaturesFeatureCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:642:5: ( (otherlv_4= RULE_ID ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:643:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:643:1: (otherlv_4= RULE_ID )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:644:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFeature1210); 

            	    		newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getStoriesStoryCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStory"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:663:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:664:2: (iv_ruleStory= ruleStory EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:665:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStory_in_entryRuleStory1247);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStory1257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:672:1: ruleStory returns [EObject current=null] : (otherlv_0= 'Story:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'As ' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'I want ' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'So that ' ( (otherlv_7= RULE_ID ) ) )? ( (lv_scenarios_8_0= ruleScenario ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_scenarios_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:675:28: ( (otherlv_0= 'Story:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'As ' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'I want ' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'So that ' ( (otherlv_7= RULE_ID ) ) )? ( (lv_scenarios_8_0= ruleScenario ) )* ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:676:1: (otherlv_0= 'Story:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'As ' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'I want ' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'So that ' ( (otherlv_7= RULE_ID ) ) )? ( (lv_scenarios_8_0= ruleScenario ) )* )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:676:1: (otherlv_0= 'Story:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'As ' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'I want ' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'So that ' ( (otherlv_7= RULE_ID ) ) )? ( (lv_scenarios_8_0= ruleScenario ) )* )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:676:3: otherlv_0= 'Story:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'As ' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'I want ' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= 'So that ' ( (otherlv_7= RULE_ID ) ) )? ( (lv_scenarios_8_0= ruleScenario ) )*
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStory1294); 

                	newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getStoryKeyword_0());
                
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:680:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:681:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:681:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:682:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStory1311); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:698:2: (otherlv_2= 'As ' ( (otherlv_3= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:698:4: otherlv_2= 'As ' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStory1329); 

                        	newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getAsKeyword_2_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:702:1: ( (otherlv_3= RULE_ID ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:703:1: (otherlv_3= RULE_ID )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:703:1: (otherlv_3= RULE_ID )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:704:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStoryRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStory1349); 

                    		newLeafNode(otherlv_3, grammarAccess.getStoryAccess().getAsRoleCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:715:4: (otherlv_4= 'I want ' ( (otherlv_5= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:715:6: otherlv_4= 'I want ' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStory1364); 

                        	newLeafNode(otherlv_4, grammarAccess.getStoryAccess().getIWantKeyword_3_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:719:1: ( (otherlv_5= RULE_ID ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:720:1: (otherlv_5= RULE_ID )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:720:1: (otherlv_5= RULE_ID )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:721:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStoryRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStory1384); 

                    		newLeafNode(otherlv_5, grammarAccess.getStoryAccess().getIWantCapabilityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:732:4: (otherlv_6= 'So that ' ( (otherlv_7= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:732:6: otherlv_6= 'So that ' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStory1399); 

                        	newLeafNode(otherlv_6, grammarAccess.getStoryAccess().getSoThatKeyword_4_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:736:1: ( (otherlv_7= RULE_ID ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:737:1: (otherlv_7= RULE_ID )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:737:1: (otherlv_7= RULE_ID )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:738:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStoryRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStory1419); 

                    		newLeafNode(otherlv_7, grammarAccess.getStoryAccess().getSoThatBenefitCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:749:4: ( (lv_scenarios_8_0= ruleScenario ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:750:1: (lv_scenarios_8_0= ruleScenario )
            	    {
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:750:1: (lv_scenarios_8_0= ruleScenario )
            	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:751:3: lv_scenarios_8_0= ruleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStoryAccess().getScenariosScenarioParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleScenario_in_ruleStory1442);
            	    lv_scenarios_8_0=ruleScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scenarios",
            	            		lv_scenarios_8_0, 
            	            		"Scenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleScenario"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:775:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:776:2: (iv_ruleScenario= ruleScenario EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:777:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_entryRuleScenario1479);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenario1489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:784:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Given ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'When ' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'Then ' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:787:28: ( (otherlv_0= 'Scenario:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Given ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'When ' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'Then ' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:788:1: (otherlv_0= 'Scenario:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Given ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'When ' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'Then ' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:788:1: (otherlv_0= 'Scenario:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Given ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'When ' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'Then ' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:788:3: otherlv_0= 'Scenario:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Given ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= 'When ' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? (otherlv_10= 'Then ' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleScenario1526); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:792:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:793:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:793:1: (lv_name_1_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:794:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScenario1543); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:810:2: (otherlv_2= 'Given ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:810:4: otherlv_2= 'Given ' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleScenario1561); 

                        	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getGivenKeyword_2_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:814:1: ( (otherlv_3= RULE_ID ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:815:1: (otherlv_3= RULE_ID )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:815:1: (otherlv_3= RULE_ID )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:816:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScenario1581); 

                    		newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getGivenContextCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:827:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:827:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScenario1594); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:831:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:832:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:832:1: (otherlv_5= RULE_ID )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:833:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScenario1614); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getGivenContextCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:844:6: (otherlv_6= 'When ' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:844:8: otherlv_6= 'When ' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleScenario1631); 

                        	newLeafNode(otherlv_6, grammarAccess.getScenarioAccess().getWhenKeyword_3_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:848:1: ( (otherlv_7= RULE_ID ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:849:1: (otherlv_7= RULE_ID )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:849:1: (otherlv_7= RULE_ID )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:850:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScenario1651); 

                    		newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getWhenActionCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:861:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==13) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:861:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScenario1664); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getScenarioAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:865:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:866:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:866:1: (otherlv_9= RULE_ID )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:867:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScenario1684); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getWhenActionCrossReference_3_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:878:6: (otherlv_10= 'Then ' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:878:8: otherlv_10= 'Then ' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    {
                    otherlv_10=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleScenario1701); 

                        	newLeafNode(otherlv_10, grammarAccess.getScenarioAccess().getThenKeyword_4_0());
                        
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:882:1: ( (otherlv_11= RULE_ID ) )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:883:1: (otherlv_11= RULE_ID )
                    {
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:883:1: (otherlv_11= RULE_ID )
                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:884:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScenario1721); 

                    		newLeafNode(otherlv_11, grammarAccess.getScenarioAccess().getThenBehaviourCrossReference_4_1_0()); 
                    	

                    }


                    }

                    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:895:2: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==13) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:895:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScenario1734); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getScenarioAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:899:1: ( (otherlv_13= RULE_ID ) )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:900:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:900:1: (otherlv_13= RULE_ID )
                    	    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:901:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getScenarioRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScenario1754); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getScenarioAccess().getThenBehaviourCrossReference_4_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleRole"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:920:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:921:2: (iv_ruleRole= ruleRole EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:922:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole1794);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole1804); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:929:1: ruleRole returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:932:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:933:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:933:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:934:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:934:1: (lv_name_0_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:935:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole1845); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleCapability"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:959:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:960:2: (iv_ruleCapability= ruleCapability EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:961:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapability_in_entryRuleCapability1885);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCapability1895); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:968:1: ruleCapability returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:971:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:972:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:972:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:973:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:973:1: (lv_name_0_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:974:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCapability1936); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCapabilityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleBenefit"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:998:1: entryRuleBenefit returns [EObject current=null] : iv_ruleBenefit= ruleBenefit EOF ;
    public final EObject entryRuleBenefit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenefit = null;


        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:999:2: (iv_ruleBenefit= ruleBenefit EOF )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1000:2: iv_ruleBenefit= ruleBenefit EOF
            {
             newCompositeNode(grammarAccess.getBenefitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBenefit_in_entryRuleBenefit1976);
            iv_ruleBenefit=ruleBenefit();

            state._fsp--;

             current =iv_ruleBenefit; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBenefit1986); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBenefit"


    // $ANTLR start "ruleBenefit"
    // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1007:1: ruleBenefit returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBenefit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1010:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1011:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1011:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1012:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1012:1: (lv_name_0_0= RULE_ID )
            // ../fr.obeo.intent.specification.xtext/src-gen/fr/obeo/intent/specification/parser/antlr/internal/InternalSpecification.g:1013:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBenefit2027); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBenefitAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBenefitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBenefit"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpecification85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSpecification122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSpecification139 = new BitSet(new long[]{0x0000000000539002L});
        public static final BitSet FOLLOW_12_in_ruleSpecification157 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRole_in_ruleSpecification178 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleSpecification191 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRole_in_ruleSpecification212 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleSpecification226 = new BitSet(new long[]{0x0000000000538002L});
        public static final BitSet FOLLOW_15_in_ruleSpecification241 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCapability_in_ruleSpecification262 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleSpecification275 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCapability_in_ruleSpecification296 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleSpecification310 = new BitSet(new long[]{0x0000000000530002L});
        public static final BitSet FOLLOW_16_in_ruleSpecification325 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBenefit_in_ruleSpecification346 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleSpecification359 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCapability_in_ruleSpecification380 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleSpecification394 = new BitSet(new long[]{0x0000000000520002L});
        public static final BitSet FOLLOW_ruleAutomationLayer_in_ruleSpecification417 = new BitSet(new long[]{0x0000000000500002L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleSpecification439 = new BitSet(new long[]{0x0000000000500002L});
        public static final BitSet FOLLOW_ruleStory_in_ruleSpecification461 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleAutomationLayer_in_entryRuleAutomationLayer498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAutomationLayer508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAutomationLayer545 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleContext_in_ruleAutomationLayer566 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleAutomationLayer579 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleContext_in_ruleAutomationLayer600 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleAutomationLayer614 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAutomationLayer626 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAction_in_ruleAutomationLayer647 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleAutomationLayer660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAction_in_ruleAutomationLayer681 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleAutomationLayer695 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAutomationLayer707 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBehaviour_in_ruleAutomationLayer728 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleAutomationLayer741 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBehaviour_in_ruleAutomationLayer762 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleAutomationLayer776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleContext863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAction954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_entryRuleBehaviour994 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehaviour1004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBehaviour1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature1095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFeature1132 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1149 = new BitSet(new long[]{0x0000000000200012L});
        public static final BitSet FOLLOW_21_in_ruleFeature1167 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1187 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1210 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleStory_in_entryRuleStory1247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStory1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleStory1294 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStory1311 = new BitSet(new long[]{0x0000000007800002L});
        public static final BitSet FOLLOW_23_in_ruleStory1329 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStory1349 = new BitSet(new long[]{0x0000000007000002L});
        public static final BitSet FOLLOW_24_in_ruleStory1364 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStory1384 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_25_in_ruleStory1399 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStory1419 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleScenario_in_ruleStory1442 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario1479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenario1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleScenario1526 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScenario1543 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_27_in_ruleScenario1561 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScenario1581 = new BitSet(new long[]{0x0000000030002002L});
        public static final BitSet FOLLOW_13_in_ruleScenario1594 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScenario1614 = new BitSet(new long[]{0x0000000030002002L});
        public static final BitSet FOLLOW_28_in_ruleScenario1631 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScenario1651 = new BitSet(new long[]{0x0000000020002002L});
        public static final BitSet FOLLOW_13_in_ruleScenario1664 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScenario1684 = new BitSet(new long[]{0x0000000020002002L});
        public static final BitSet FOLLOW_29_in_ruleScenario1701 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScenario1721 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleScenario1734 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScenario1754 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole1845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability1885 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCapability1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCapability1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBenefit_in_entryRuleBenefit1976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBenefit1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBenefit2027 = new BitSet(new long[]{0x0000000000000002L});
    }


}