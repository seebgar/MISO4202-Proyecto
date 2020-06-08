package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OBJECT_START", "RULE_EQUALS", "RULE_LIST_START", "RULE_COMA", "RULE_LIST_END", "RULE_OBJECT_END", "RULE_SEMICOLON", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'nit'", "'dashboards'", "'DBServers'", "'name'", "'panels'", "'elements'", "'title'", "'registersPerPage'", "'actions'", "'search'", "'add'", "'columns'", "'columnTitle'", "'position'", "'filter'", "'edit'", "'delete'", "'source'", "'attribute'", "'editable'", "'legendPosition'", "'labelStringXAxes'", "'colorGridLinesXAxes'", "'labelStringYAxes'", "'colorGridLinesYAxes'", "'displayGridLinesXAxes'", "'displayGridLinesYAxes'", "'data'", "'labels'", "'barPercentage'", "'angleLinesDisplay'", "'PIECHART'", "'category'", "'borderColor'", "'backgroundColor'", "'borderDash'", "'fill'", "'systemManager'", "'token'", "'password'", "'relatedEntities'", "'attributes'", "'type'", "'required'", "'-'", "'.'", "'E'", "'e'", "'MONGODB'", "'REDIS'", "'#FFFFFF'", "'#0000FF'", "'#FF0000'", "'#00FF00'", "'#808080'", "'#FFFF00'", "'#000000'", "'#00FFFF'", "'#FF00FF'", "'#C0C0C0'", "'#800000'", "'#808000'", "'#800080'", "'#008080'", "'#000080'", "'left'", "'right'", "'center'", "'top'", "'bottom'"
    };
    public static final int T__50=50;
    public static final int RULE_OBJECT_START=4;
    public static final int RULE_LIST_END=8;
    public static final int T__19=19;
    public static final int RULE_EQUALS=5;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=10;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_LIST_START=6;
    public static final int T__71=71;
    public static final int RULE_COMA=7;
    public static final int T__72=72;
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_OBJECT_END=9;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Company";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompany"
    // InternalMyDsl.g:65:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalMyDsl.g:66:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalMyDsl.g:72:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_OBJECT_START_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token otherlv_12=null;
        Token this_EQUALS_13=null;
        Token this_LIST_START_14=null;
        Token this_COMA_16=null;
        Token this_LIST_END_18=null;
        Token this_OBJECT_END_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nit_3_0 = null;

        EObject lv_dashboards_8_0 = null;

        EObject lv_dashboards_10_0 = null;

        EObject lv_DBServers_15_0 = null;

        EObject lv_DBServers_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END )
            // InternalMyDsl.g:80:3: otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:103:3: (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:104:4: otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompanyAccess().getNitKeyword_2_0());
                    			
                    // InternalMyDsl.g:108:4: ( (lv_nit_3_0= ruleEString ) )
                    // InternalMyDsl.g:109:5: (lv_nit_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:109:5: (lv_nit_3_0= ruleEString )
                    // InternalMyDsl.g:110:6: lv_nit_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getNitEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_nit_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						set(
                    							current,
                    							"nit",
                    							lv_nit_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_OBJECT_START_4=(Token)match(input,RULE_OBJECT_START,FOLLOW_6); 

            			newLeafNode(this_OBJECT_START_4, grammarAccess.getCompanyAccess().getOBJECT_STARTTerminalRuleCall_3());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCompanyAccess().getDashboardsKeyword_4());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_5());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_6());
            		
            // InternalMyDsl.g:144:3: ( (lv_dashboards_8_0= ruleDashboard ) )
            // InternalMyDsl.g:145:4: (lv_dashboards_8_0= ruleDashboard )
            {
            // InternalMyDsl.g:145:4: (lv_dashboards_8_0= ruleDashboard )
            // InternalMyDsl.g:146:5: lv_dashboards_8_0= ruleDashboard
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_dashboards_8_0=ruleDashboard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					add(
            						current,
            						"dashboards",
            						lv_dashboards_8_0,
            						"org.xtext.example.mydsl.MyDsl.Dashboard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:163:3: (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:164:4: this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_8_0());
            	    			
            	    // InternalMyDsl.g:168:4: ( (lv_dashboards_10_0= ruleDashboard ) )
            	    // InternalMyDsl.g:169:5: (lv_dashboards_10_0= ruleDashboard )
            	    {
            	    // InternalMyDsl.g:169:5: (lv_dashboards_10_0= ruleDashboard )
            	    // InternalMyDsl.g:170:6: lv_dashboards_10_0= ruleDashboard
            	    {

            	    						newCompositeNode(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_dashboards_10_0=ruleDashboard();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dashboards",
            	    							lv_dashboards_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.Dashboard");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_10); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_9());
            		
            otherlv_12=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getCompanyAccess().getDBServersKeyword_10());
            		
            this_EQUALS_13=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_13, grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_11());
            		
            this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_14, grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_12());
            		
            // InternalMyDsl.g:204:3: ( (lv_DBServers_15_0= ruleDBServer ) )
            // InternalMyDsl.g:205:4: (lv_DBServers_15_0= ruleDBServer )
            {
            // InternalMyDsl.g:205:4: (lv_DBServers_15_0= ruleDBServer )
            // InternalMyDsl.g:206:5: lv_DBServers_15_0= ruleDBServer
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_DBServers_15_0=ruleDBServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					add(
            						current,
            						"DBServers",
            						lv_DBServers_15_0,
            						"org.xtext.example.mydsl.MyDsl.DBServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:223:3: (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:224:4: this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) )
            	    {
            	    this_COMA_16=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_16, grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_14_0());
            	    			
            	    // InternalMyDsl.g:228:4: ( (lv_DBServers_17_0= ruleDBServer ) )
            	    // InternalMyDsl.g:229:5: (lv_DBServers_17_0= ruleDBServer )
            	    {
            	    // InternalMyDsl.g:229:5: (lv_DBServers_17_0= ruleDBServer )
            	    // InternalMyDsl.g:230:6: lv_DBServers_17_0= ruleDBServer
            	    {

            	    						newCompositeNode(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_DBServers_17_0=ruleDBServer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"DBServers",
            	    							lv_DBServers_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.DBServer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_18, grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_15());
            		
            this_OBJECT_END_19=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_19, grammarAccess.getCompanyAccess().getOBJECT_ENDTerminalRuleCall_16());
            		

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
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleDashboard"
    // InternalMyDsl.g:260:1: entryRuleDashboard returns [EObject current=null] : iv_ruleDashboard= ruleDashboard EOF ;
    public final EObject entryRuleDashboard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashboard = null;


        try {
            // InternalMyDsl.g:260:50: (iv_ruleDashboard= ruleDashboard EOF )
            // InternalMyDsl.g:261:2: iv_ruleDashboard= ruleDashboard EOF
            {
             newCompositeNode(grammarAccess.getDashboardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDashboard=ruleDashboard();

            state._fsp--;

             current =iv_ruleDashboard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // InternalMyDsl.g:267:1: ruleDashboard returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) ;
    public final EObject ruleDashboard() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token this_OBJECT_END_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_panels_8_0 = null;

        EObject lv_panels_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:273:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) )
            // InternalMyDsl.g:274:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:274:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            // InternalMyDsl.g:275:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDashboardAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDashboardAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getDashboardAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:287:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:288:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:288:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:289:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashboardRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_14); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getDashboardAccess().getSEMICOLONTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDashboardAccess().getPanelsKeyword_5());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getDashboardAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getDashboardAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:322:3: ( (lv_panels_8_0= rulePanel ) )
            // InternalMyDsl.g:323:4: (lv_panels_8_0= rulePanel )
            {
            // InternalMyDsl.g:323:4: (lv_panels_8_0= rulePanel )
            // InternalMyDsl.g:324:5: lv_panels_8_0= rulePanel
            {

            					newCompositeNode(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_panels_8_0=rulePanel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashboardRule());
            					}
            					add(
            						current,
            						"panels",
            						lv_panels_8_0,
            						"org.xtext.example.mydsl.MyDsl.Panel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:341:3: (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:342:4: this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getDashboardAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:346:4: ( (lv_panels_10_0= rulePanel ) )
            	    // InternalMyDsl.g:347:5: (lv_panels_10_0= rulePanel )
            	    {
            	    // InternalMyDsl.g:347:5: (lv_panels_10_0= rulePanel )
            	    // InternalMyDsl.g:348:6: lv_panels_10_0= rulePanel
            	    {

            	    						newCompositeNode(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_panels_10_0=rulePanel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDashboardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"panels",
            	    							lv_panels_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.Panel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getDashboardAccess().getLIST_ENDTerminalRuleCall_10());
            		
            this_OBJECT_END_12=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_12, grammarAccess.getDashboardAccess().getOBJECT_ENDTerminalRuleCall_11());
            		

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
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRulePanel"
    // InternalMyDsl.g:378:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalMyDsl.g:378:46: (iv_rulePanel= rulePanel EOF )
            // InternalMyDsl.g:379:2: iv_rulePanel= rulePanel EOF
            {
             newCompositeNode(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanel=rulePanel();

            state._fsp--;

             current =iv_rulePanel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalMyDsl.g:385:1: rulePanel returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token this_OBJECT_END_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:391:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) )
            // InternalMyDsl.g:392:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:392:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            // InternalMyDsl.g:393:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getPanelAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPanelAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getPanelAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:405:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:406:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:406:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:407:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_15); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getPanelAccess().getSEMICOLONTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getPanelAccess().getElementsKeyword_5());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getPanelAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getPanelAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:440:3: ( (lv_elements_8_0= ruleElement ) )
            // InternalMyDsl.g:441:4: (lv_elements_8_0= ruleElement )
            {
            // InternalMyDsl.g:441:4: (lv_elements_8_0= ruleElement )
            // InternalMyDsl.g:442:5: lv_elements_8_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_8_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_8_0,
            						"org.xtext.example.mydsl.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:459:3: (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:460:4: this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getPanelAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:464:4: ( (lv_elements_10_0= ruleElement ) )
            	    // InternalMyDsl.g:465:5: (lv_elements_10_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:465:5: (lv_elements_10_0= ruleElement )
            	    // InternalMyDsl.g:466:6: lv_elements_10_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_elements_10_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPanelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getPanelAccess().getLIST_ENDTerminalRuleCall_10());
            		
            this_OBJECT_END_12=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_12, grammarAccess.getPanelAccess().getOBJECT_ENDTerminalRuleCall_11());
            		

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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:496:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:496:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:497:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:503:1: ruleElement returns [EObject current=null] : (this_Table_0= ruleTable | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_RadarChart_3= ruleRadarChart | this_PieChart_4= rulePieChart ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Table_0 = null;

        EObject this_LineChart_1 = null;

        EObject this_BarChart_2 = null;

        EObject this_RadarChart_3 = null;

        EObject this_PieChart_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:509:2: ( (this_Table_0= ruleTable | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_RadarChart_3= ruleRadarChart | this_PieChart_4= rulePieChart ) )
            // InternalMyDsl.g:510:2: (this_Table_0= ruleTable | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_RadarChart_3= ruleRadarChart | this_PieChart_4= rulePieChart )
            {
            // InternalMyDsl.g:510:2: (this_Table_0= ruleTable | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_RadarChart_3= ruleRadarChart | this_PieChart_4= rulePieChart )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:511:3: this_Table_0= ruleTable
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_0=ruleTable();

                    state._fsp--;


                    			current = this_Table_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:520:3: this_LineChart_1= ruleLineChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLineChartParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineChart_1=ruleLineChart();

                    state._fsp--;


                    			current = this_LineChart_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:529:3: this_BarChart_2= ruleBarChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getBarChartParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BarChart_2=ruleBarChart();

                    state._fsp--;


                    			current = this_BarChart_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:538:3: this_RadarChart_3= ruleRadarChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRadarChartParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadarChart_3=ruleRadarChart();

                    state._fsp--;


                    			current = this_RadarChart_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:547:3: this_PieChart_4= rulePieChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPieChartParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PieChart_4=rulePieChart();

                    state._fsp--;


                    			current = this_PieChart_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:559:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDsl.g:559:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDsl.g:560:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:566:1: ruleTable returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token lv_search_17_0=null;
        Token this_SEMICOLON_18=null;
        Token lv_add_19_0=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_LIST_START_23=null;
        Token this_COMA_25=null;
        Token this_LIST_END_27=null;
        Token this_OBJECT_END_28=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        AntlrDatatypeRuleToken lv_registersPerPage_11_0 = null;

        EObject lv_actions_15_0 = null;

        EObject lv_columns_24_0 = null;

        EObject lv_columns_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:572:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) )
            // InternalMyDsl.g:573:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:573:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            // InternalMyDsl.g:574:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getTableAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:586:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:587:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:587:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:588:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_16); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:609:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:610:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getTitleKeyword_5_0());
                    			
                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_6, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:618:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalMyDsl.g:619:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:619:5: (lv_title_7_0= ruleEString )
                    // InternalMyDsl.g:620:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_17); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:642:3: (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:643:4: otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRegistersPerPageKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_18); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:651:4: ( (lv_registersPerPage_11_0= ruleEInt ) )
                    // InternalMyDsl.g:652:5: (lv_registersPerPage_11_0= ruleEInt )
                    {
                    // InternalMyDsl.g:652:5: (lv_registersPerPage_11_0= ruleEInt )
                    // InternalMyDsl.g:653:6: lv_registersPerPage_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getRegistersPerPageEIntParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_registersPerPage_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"registersPerPage",
                    							lv_registersPerPage_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_19); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:675:3: (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:676:4: otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getTableAccess().getActionsKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_5); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:684:4: ( (lv_actions_15_0= ruleAction ) )
                    // InternalMyDsl.g:685:5: (lv_actions_15_0= ruleAction )
                    {
                    // InternalMyDsl.g:685:5: (lv_actions_15_0= ruleAction )
                    // InternalMyDsl.g:686:6: lv_actions_15_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getActionsActionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_actions_15_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"actions",
                    							lv_actions_15_0,
                    							"org.xtext.example.mydsl.MyDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_20); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:708:3: ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:709:4: ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:709:4: ( (lv_search_17_0= 'search' ) )
                    // InternalMyDsl.g:710:5: (lv_search_17_0= 'search' )
                    {
                    // InternalMyDsl.g:710:5: (lv_search_17_0= 'search' )
                    // InternalMyDsl.g:711:6: lv_search_17_0= 'search'
                    {
                    lv_search_17_0=(Token)match(input,28,FOLLOW_13); 

                    						newLeafNode(lv_search_17_0, grammarAccess.getTableAccess().getSearchSearchKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    						setWithLastConsumed(current, "search", true, "search");
                    					

                    }


                    }

                    this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_21); 

                    				newLeafNode(this_SEMICOLON_18, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_8_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:728:3: ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:729:4: ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:729:4: ( (lv_add_19_0= 'add' ) )
                    // InternalMyDsl.g:730:5: (lv_add_19_0= 'add' )
                    {
                    // InternalMyDsl.g:730:5: (lv_add_19_0= 'add' )
                    // InternalMyDsl.g:731:6: lv_add_19_0= 'add'
                    {
                    lv_add_19_0=(Token)match(input,29,FOLLOW_13); 

                    						newLeafNode(lv_add_19_0, grammarAccess.getTableAccess().getAddAddKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    						setWithLastConsumed(current, "add", true, "add");
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_22); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getTableAccess().getColumnsKeyword_10());
            		
            this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_22, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_11());
            		
            this_LIST_START_23=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_23, grammarAccess.getTableAccess().getLIST_STARTTerminalRuleCall_12());
            		
            // InternalMyDsl.g:760:3: ( (lv_columns_24_0= ruleColumn ) )
            // InternalMyDsl.g:761:4: (lv_columns_24_0= ruleColumn )
            {
            // InternalMyDsl.g:761:4: (lv_columns_24_0= ruleColumn )
            // InternalMyDsl.g:762:5: lv_columns_24_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_columns_24_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_24_0,
            						"org.xtext.example.mydsl.MyDsl.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:779:3: (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:780:4: this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) )
            	    {
            	    this_COMA_25=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_25, grammarAccess.getTableAccess().getCOMATerminalRuleCall_14_0());
            	    			
            	    // InternalMyDsl.g:784:4: ( (lv_columns_26_0= ruleColumn ) )
            	    // InternalMyDsl.g:785:5: (lv_columns_26_0= ruleColumn )
            	    {
            	    // InternalMyDsl.g:785:5: (lv_columns_26_0= ruleColumn )
            	    // InternalMyDsl.g:786:6: lv_columns_26_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_columns_26_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_26_0,
            	    							"org.xtext.example.mydsl.MyDsl.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_LIST_END_27=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_27, grammarAccess.getTableAccess().getLIST_ENDTerminalRuleCall_15());
            		
            this_OBJECT_END_28=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_28, grammarAccess.getTableAccess().getOBJECT_ENDTerminalRuleCall_16());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:816:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:816:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:817:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:823:1: ruleAction returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delet_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMICOLON_13=null;
        Token lv_add_14_0=null;
        Token this_SEMICOLON_15=null;
        Token lv_filter_16_0=null;
        Token this_SEMICOLON_17=null;
        Token lv_edit_18_0=null;
        Token this_SEMICOLON_19=null;
        Token lv_delet_20_0=null;
        Token this_SEMICOLON_21=null;
        Token this_OBJECT_END_22=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_columnTitle_8_0 = null;

        Enumerator lv_position_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:829:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delet_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END ) )
            // InternalMyDsl.g:830:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delet_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:830:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delet_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END )
            // InternalMyDsl.g:831:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delet_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END
            {
            // InternalMyDsl.g:831:3: ()
            // InternalMyDsl.g:832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getActionAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getActionAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:850:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:851:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:851:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:852:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_23); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:873:3: (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:874:4: otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getColumnTitleKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getActionAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:882:4: ( (lv_columnTitle_8_0= ruleEString ) )
                    // InternalMyDsl.g:883:5: (lv_columnTitle_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:883:5: (lv_columnTitle_8_0= ruleEString )
                    // InternalMyDsl.g:884:6: lv_columnTitle_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getColumnTitleEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_columnTitle_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"columnTitle",
                    							lv_columnTitle_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_24); 

                    				newLeafNode(this_SEMICOLON_9, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:906:3: (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:907:4: otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getPositionKeyword_7_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_25); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getActionAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:915:4: ( (lv_position_12_0= rulePositionOptions ) )
                    // InternalMyDsl.g:916:5: (lv_position_12_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:916:5: (lv_position_12_0= rulePositionOptions )
                    // InternalMyDsl.g:917:6: lv_position_12_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getPositionPositionOptionsEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_position_12_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_12_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_26); 

                    				newLeafNode(this_SEMICOLON_13, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:939:3: ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:940:4: ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:940:4: ( (lv_add_14_0= 'add' ) )
                    // InternalMyDsl.g:941:5: (lv_add_14_0= 'add' )
                    {
                    // InternalMyDsl.g:941:5: (lv_add_14_0= 'add' )
                    // InternalMyDsl.g:942:6: lv_add_14_0= 'add'
                    {
                    lv_add_14_0=(Token)match(input,29,FOLLOW_13); 

                    						newLeafNode(lv_add_14_0, grammarAccess.getActionAccess().getAddAddKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "add", true, "add");
                    					

                    }


                    }

                    this_SEMICOLON_15=(Token)match(input,RULE_SEMICOLON,FOLLOW_27); 

                    				newLeafNode(this_SEMICOLON_15, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_8_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:959:3: ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:960:4: ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:960:4: ( (lv_filter_16_0= 'filter' ) )
                    // InternalMyDsl.g:961:5: (lv_filter_16_0= 'filter' )
                    {
                    // InternalMyDsl.g:961:5: (lv_filter_16_0= 'filter' )
                    // InternalMyDsl.g:962:6: lv_filter_16_0= 'filter'
                    {
                    lv_filter_16_0=(Token)match(input,33,FOLLOW_13); 

                    						newLeafNode(lv_filter_16_0, grammarAccess.getActionAccess().getFilterFilterKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "filter", true, "filter");
                    					

                    }


                    }

                    this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_28); 

                    				newLeafNode(this_SEMICOLON_17, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:979:3: ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:980:4: ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:980:4: ( (lv_edit_18_0= 'edit' ) )
                    // InternalMyDsl.g:981:5: (lv_edit_18_0= 'edit' )
                    {
                    // InternalMyDsl.g:981:5: (lv_edit_18_0= 'edit' )
                    // InternalMyDsl.g:982:6: lv_edit_18_0= 'edit'
                    {
                    lv_edit_18_0=(Token)match(input,34,FOLLOW_13); 

                    						newLeafNode(lv_edit_18_0, grammarAccess.getActionAccess().getEditEditKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "edit", true, "edit");
                    					

                    }


                    }

                    this_SEMICOLON_19=(Token)match(input,RULE_SEMICOLON,FOLLOW_29); 

                    				newLeafNode(this_SEMICOLON_19, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_10_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:999:3: ( ( (lv_delet_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1000:4: ( (lv_delet_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1000:4: ( (lv_delet_20_0= 'delete' ) )
                    // InternalMyDsl.g:1001:5: (lv_delet_20_0= 'delete' )
                    {
                    // InternalMyDsl.g:1001:5: (lv_delet_20_0= 'delete' )
                    // InternalMyDsl.g:1002:6: lv_delet_20_0= 'delete'
                    {
                    lv_delet_20_0=(Token)match(input,35,FOLLOW_13); 

                    						newLeafNode(lv_delet_20_0, grammarAccess.getActionAccess().getDeletDeleteKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "delet", true, "delete");
                    					

                    }


                    }

                    this_SEMICOLON_21=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

                    				newLeafNode(this_SEMICOLON_21, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_11_1());
                    			

                    }
                    break;

            }

            this_OBJECT_END_22=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_22, grammarAccess.getActionAccess().getOBJECT_ENDTerminalRuleCall_12());
            		

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


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:1027:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:1027:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:1028:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:1034:1: ruleColumn returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'attribute' this_EQUALS_15= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_filter_18_0= 'filter' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_editable_20_0= 'editable' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMICOLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_SEMICOLON_17=null;
        Token lv_filter_18_0=null;
        Token this_SEMICOLON_19=null;
        Token lv_editable_20_0=null;
        Token this_SEMICOLON_21=null;
        Token this_OBJECT_END_22=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_title_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1040:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'attribute' this_EQUALS_15= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_filter_18_0= 'filter' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_editable_20_0= 'editable' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1041:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'attribute' this_EQUALS_15= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_filter_18_0= 'filter' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_editable_20_0= 'editable' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1041:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'attribute' this_EQUALS_15= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_filter_18_0= 'filter' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_editable_20_0= 'editable' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END )
            // InternalMyDsl.g:1042:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'attribute' this_EQUALS_15= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_filter_18_0= 'filter' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_editable_20_0= 'editable' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END
            {
            // InternalMyDsl.g:1042:3: ()
            // InternalMyDsl.g:1043:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getColumnAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getColumnAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1061:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:1062:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:1062:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:1063:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_30); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:1084:3: (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1085:4: otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getTitleKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getColumnAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1093:4: ( (lv_title_8_0= ruleEString ) )
                    // InternalMyDsl.g:1094:5: (lv_title_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:1094:5: (lv_title_8_0= ruleEString )
                    // InternalMyDsl.g:1095:6: lv_title_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getTitleEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_31); 

                    				newLeafNode(this_SEMICOLON_9, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1117:3: (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1118:4: otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getSourceKeyword_7_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getColumnAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:1126:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1127:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1127:5: ( ruleEString )
                    // InternalMyDsl.g:1128:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getSourceEntityCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_32); 

                    				newLeafNode(this_SEMICOLON_13, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1147:3: (otherlv_14= 'attribute' this_EQUALS_15= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1148:4: otherlv_14= 'attribute' this_EQUALS_15= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON
                    {
                    otherlv_14=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getColumnAccess().getAttributeKeyword_8_0());
                    			
                    this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_15, grammarAccess.getColumnAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:1156:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1157:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1157:5: ( ruleEString )
                    // InternalMyDsl.g:1158:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_33); 

                    				newLeafNode(this_SEMICOLON_17, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1177:3: ( ( (lv_filter_18_0= 'filter' ) ) this_SEMICOLON_19= RULE_SEMICOLON )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1178:4: ( (lv_filter_18_0= 'filter' ) ) this_SEMICOLON_19= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1178:4: ( (lv_filter_18_0= 'filter' ) )
                    // InternalMyDsl.g:1179:5: (lv_filter_18_0= 'filter' )
                    {
                    // InternalMyDsl.g:1179:5: (lv_filter_18_0= 'filter' )
                    // InternalMyDsl.g:1180:6: lv_filter_18_0= 'filter'
                    {
                    lv_filter_18_0=(Token)match(input,33,FOLLOW_13); 

                    						newLeafNode(lv_filter_18_0, grammarAccess.getColumnAccess().getFilterFilterKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "filter", true, "filter");
                    					

                    }


                    }

                    this_SEMICOLON_19=(Token)match(input,RULE_SEMICOLON,FOLLOW_34); 

                    				newLeafNode(this_SEMICOLON_19, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1197:3: ( ( (lv_editable_20_0= 'editable' ) ) this_SEMICOLON_21= RULE_SEMICOLON )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1198:4: ( (lv_editable_20_0= 'editable' ) ) this_SEMICOLON_21= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1198:4: ( (lv_editable_20_0= 'editable' ) )
                    // InternalMyDsl.g:1199:5: (lv_editable_20_0= 'editable' )
                    {
                    // InternalMyDsl.g:1199:5: (lv_editable_20_0= 'editable' )
                    // InternalMyDsl.g:1200:6: lv_editable_20_0= 'editable'
                    {
                    lv_editable_20_0=(Token)match(input,38,FOLLOW_13); 

                    						newLeafNode(lv_editable_20_0, grammarAccess.getColumnAccess().getEditableEditableKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "editable", true, "editable");
                    					

                    }


                    }

                    this_SEMICOLON_21=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

                    				newLeafNode(this_SEMICOLON_21, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_10_1());
                    			

                    }
                    break;

            }

            this_OBJECT_END_22=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_22, grammarAccess.getColumnAccess().getOBJECT_ENDTerminalRuleCall_11());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleLineChart"
    // InternalMyDsl.g:1225:1: entryRuleLineChart returns [EObject current=null] : iv_ruleLineChart= ruleLineChart EOF ;
    public final EObject entryRuleLineChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineChart = null;


        try {
            // InternalMyDsl.g:1225:50: (iv_ruleLineChart= ruleLineChart EOF )
            // InternalMyDsl.g:1226:2: iv_ruleLineChart= ruleLineChart EOF
            {
             newCompositeNode(grammarAccess.getLineChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineChart=ruleLineChart();

            state._fsp--;

             current =iv_ruleLineChart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineChart"


    // $ANTLR start "ruleLineChart"
    // InternalMyDsl.g:1232:1: ruleLineChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END ) ;
    public final EObject ruleLineChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_SEMICOLON_24=null;
        Token otherlv_25=null;
        Token this_EQUALS_26=null;
        Token this_SEMICOLON_28=null;
        Token lv_displayGridLinesXAxes_29_0=null;
        Token this_SEMICOLON_30=null;
        Token lv_displayGridLinesYAxes_31_0=null;
        Token this_SEMICOLON_32=null;
        Token otherlv_33=null;
        Token this_EQUALS_34=null;
        Token this_LIST_START_35=null;
        Token this_COMA_37=null;
        Token this_LIST_END_39=null;
        Token otherlv_40=null;
        Token this_EQUALS_41=null;
        Token this_LIST_START_42=null;
        Token this_COMA_44=null;
        Token this_LIST_END_46=null;
        Token this_OBJECT_END_47=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_legendPosition_11_0 = null;

        AntlrDatatypeRuleToken lv_labelStringXAxes_15_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesXAxes_19_0 = null;

        AntlrDatatypeRuleToken lv_labelStringYAxes_23_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesYAxes_27_0 = null;

        EObject lv_data_36_0 = null;

        EObject lv_data_38_0 = null;

        EObject lv_labels_43_0 = null;

        EObject lv_labels_45_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1238:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1239:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1239:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END )
            // InternalMyDsl.g:1240:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getLineChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLineChartAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:1252:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:1253:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:1253:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:1254:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_35); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:1275:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // InternalMyDsl.g:1276:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getLineChartAccess().getTitleKeyword_5_0());
            			
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            				newLeafNode(this_EQUALS_6, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_5_1());
            			
            // InternalMyDsl.g:1284:4: ( (lv_title_7_0= ruleEString ) )
            // InternalMyDsl.g:1285:5: (lv_title_7_0= ruleEString )
            {
            // InternalMyDsl.g:1285:5: (lv_title_7_0= ruleEString )
            // InternalMyDsl.g:1286:6: lv_title_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getLineChartAccess().getTitleEStringParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_title_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_7_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_36); 

            				newLeafNode(this_SEMICOLON_8, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_5_3());
            			

            }

            // InternalMyDsl.g:1308:3: (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1309:4: otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLineChartAccess().getLegendPositionKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_25); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1317:4: ( (lv_legendPosition_11_0= rulePositionOptions ) )
                    // InternalMyDsl.g:1318:5: (lv_legendPosition_11_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:1318:5: (lv_legendPosition_11_0= rulePositionOptions )
                    // InternalMyDsl.g:1319:6: lv_legendPosition_11_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLegendPositionPositionOptionsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_11_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_11_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_37); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1341:3: (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1342:4: otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getLineChartAccess().getLabelStringXAxesKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:1350:4: ( (lv_labelStringXAxes_15_0= ruleEString ) )
                    // InternalMyDsl.g:1351:5: (lv_labelStringXAxes_15_0= ruleEString )
                    {
                    // InternalMyDsl.g:1351:5: (lv_labelStringXAxes_15_0= ruleEString )
                    // InternalMyDsl.g:1352:6: lv_labelStringXAxes_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelStringXAxesEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringXAxes_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringXAxes",
                    							lv_labelStringXAxes_15_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_38); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1374:3: (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1375:4: otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    otherlv_17=(Token)match(input,41,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getLineChartAccess().getColorGridLinesXAxesKeyword_8_0());
                    			
                    this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_18, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:1383:4: ( (lv_colorGridLinesXAxes_19_0= ruleEString ) )
                    // InternalMyDsl.g:1384:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    {
                    // InternalMyDsl.g:1384:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    // InternalMyDsl.g:1385:6: lv_colorGridLinesXAxes_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getColorGridLinesXAxesEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesXAxes_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesXAxes",
                    							lv_colorGridLinesXAxes_19_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_39); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1407:3: (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1408:4: otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON
                    {
                    otherlv_21=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getLineChartAccess().getLabelStringYAxesKeyword_9_0());
                    			
                    this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_22, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_9_1());
                    			
                    // InternalMyDsl.g:1416:4: ( (lv_labelStringYAxes_23_0= ruleEString ) )
                    // InternalMyDsl.g:1417:5: (lv_labelStringYAxes_23_0= ruleEString )
                    {
                    // InternalMyDsl.g:1417:5: (lv_labelStringYAxes_23_0= ruleEString )
                    // InternalMyDsl.g:1418:6: lv_labelStringYAxes_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelStringYAxesEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringYAxes_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringYAxes",
                    							lv_labelStringYAxes_23_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_40); 

                    				newLeafNode(this_SEMICOLON_24, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1440:3: (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1441:4: otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON
                    {
                    otherlv_25=(Token)match(input,43,FOLLOW_7); 

                    				newLeafNode(otherlv_25, grammarAccess.getLineChartAccess().getColorGridLinesYAxesKeyword_10_0());
                    			
                    this_EQUALS_26=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_26, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_10_1());
                    			
                    // InternalMyDsl.g:1449:4: ( (lv_colorGridLinesYAxes_27_0= ruleEString ) )
                    // InternalMyDsl.g:1450:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    {
                    // InternalMyDsl.g:1450:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    // InternalMyDsl.g:1451:6: lv_colorGridLinesYAxes_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getColorGridLinesYAxesEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesYAxes_27_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesYAxes",
                    							lv_colorGridLinesYAxes_27_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_41); 

                    				newLeafNode(this_SEMICOLON_28, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_10_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1473:3: ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1474:4: ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1474:4: ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) )
                    // InternalMyDsl.g:1475:5: (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' )
                    {
                    // InternalMyDsl.g:1475:5: (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' )
                    // InternalMyDsl.g:1476:6: lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes'
                    {
                    lv_displayGridLinesXAxes_29_0=(Token)match(input,44,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesXAxes_29_0, grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesXAxes", true, "displayGridLinesXAxes");
                    					

                    }


                    }

                    this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_42); 

                    				newLeafNode(this_SEMICOLON_30, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_11_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1493:3: ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1494:4: ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1494:4: ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) )
                    // InternalMyDsl.g:1495:5: (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' )
                    {
                    // InternalMyDsl.g:1495:5: (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' )
                    // InternalMyDsl.g:1496:6: lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes'
                    {
                    lv_displayGridLinesYAxes_31_0=(Token)match(input,45,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesYAxes_31_0, grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesYAxes", true, "displayGridLinesYAxes");
                    					

                    }


                    }

                    this_SEMICOLON_32=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

                    				newLeafNode(this_SEMICOLON_32, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_12_1());
                    			

                    }
                    break;

            }

            otherlv_33=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_33, grammarAccess.getLineChartAccess().getDataKeyword_13());
            		
            this_EQUALS_34=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_34, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_14());
            		
            this_LIST_START_35=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_35, grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_15());
            		
            // InternalMyDsl.g:1525:3: ( (lv_data_36_0= ruleData ) )
            // InternalMyDsl.g:1526:4: (lv_data_36_0= ruleData )
            {
            // InternalMyDsl.g:1526:4: (lv_data_36_0= ruleData )
            // InternalMyDsl.g:1527:5: lv_data_36_0= ruleData
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_36_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_36_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1544:3: (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:1545:4: this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) )
            	    {
            	    this_COMA_37=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_37, grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_17_0());
            	    			
            	    // InternalMyDsl.g:1549:4: ( (lv_data_38_0= ruleData ) )
            	    // InternalMyDsl.g:1550:5: (lv_data_38_0= ruleData )
            	    {
            	    // InternalMyDsl.g:1550:5: (lv_data_38_0= ruleData )
            	    // InternalMyDsl.g:1551:6: lv_data_38_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_38_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_38_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            this_LIST_END_39=(Token)match(input,RULE_LIST_END,FOLLOW_44); 

            			newLeafNode(this_LIST_END_39, grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_18());
            		
            otherlv_40=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_40, grammarAccess.getLineChartAccess().getLabelsKeyword_19());
            		
            this_EQUALS_41=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_41, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_20());
            		
            this_LIST_START_42=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_42, grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_21());
            		
            // InternalMyDsl.g:1585:3: ( (lv_labels_43_0= ruleLabel ) )
            // InternalMyDsl.g:1586:4: (lv_labels_43_0= ruleLabel )
            {
            // InternalMyDsl.g:1586:4: (lv_labels_43_0= ruleLabel )
            // InternalMyDsl.g:1587:5: lv_labels_43_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_43_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_43_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1604:3: (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:1605:4: this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) )
            	    {
            	    this_COMA_44=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_44, grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_23_0());
            	    			
            	    // InternalMyDsl.g:1609:4: ( (lv_labels_45_0= ruleLabel ) )
            	    // InternalMyDsl.g:1610:5: (lv_labels_45_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:1610:5: (lv_labels_45_0= ruleLabel )
            	    // InternalMyDsl.g:1611:6: lv_labels_45_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_23_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_45_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_45_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            this_LIST_END_46=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_46, grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_24());
            		
            this_OBJECT_END_47=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_47, grammarAccess.getLineChartAccess().getOBJECT_ENDTerminalRuleCall_25());
            		

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
    // $ANTLR end "ruleLineChart"


    // $ANTLR start "entryRuleBarChart"
    // InternalMyDsl.g:1641:1: entryRuleBarChart returns [EObject current=null] : iv_ruleBarChart= ruleBarChart EOF ;
    public final EObject entryRuleBarChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarChart = null;


        try {
            // InternalMyDsl.g:1641:49: (iv_ruleBarChart= ruleBarChart EOF )
            // InternalMyDsl.g:1642:2: iv_ruleBarChart= ruleBarChart EOF
            {
             newCompositeNode(grammarAccess.getBarChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarChart=ruleBarChart();

            state._fsp--;

             current =iv_ruleBarChart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBarChart"


    // $ANTLR start "ruleBarChart"
    // InternalMyDsl.g:1648:1: ruleBarChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END ) ;
    public final EObject ruleBarChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_SEMICOLON_24=null;
        Token otherlv_25=null;
        Token this_EQUALS_26=null;
        Token this_SEMICOLON_28=null;
        Token otherlv_29=null;
        Token this_EQUALS_30=null;
        Token this_SEMICOLON_32=null;
        Token lv_displayGridLinesXAxes_33_0=null;
        Token this_SEMICOLON_34=null;
        Token lv_displayGridLinesYAxes_35_0=null;
        Token this_SEMICOLON_36=null;
        Token otherlv_37=null;
        Token this_EQUALS_38=null;
        Token this_LIST_START_39=null;
        Token this_COMA_41=null;
        Token this_LIST_END_43=null;
        Token otherlv_44=null;
        Token this_EQUALS_45=null;
        Token this_LIST_START_46=null;
        Token this_COMA_48=null;
        Token this_LIST_END_50=null;
        Token this_OBJECT_END_51=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_legendPosition_11_0 = null;

        AntlrDatatypeRuleToken lv_labelStringXAxes_15_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesXAxes_19_0 = null;

        AntlrDatatypeRuleToken lv_labelStringYAxes_23_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesYAxes_27_0 = null;

        AntlrDatatypeRuleToken lv_barPercentage_31_0 = null;

        EObject lv_data_40_0 = null;

        EObject lv_data_42_0 = null;

        EObject lv_labels_47_0 = null;

        EObject lv_labels_49_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1654:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1655:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1655:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END )
            // InternalMyDsl.g:1656:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getBarChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBarChartAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:1668:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:1669:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:1669:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:1670:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_35); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:1691:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // InternalMyDsl.g:1692:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getBarChartAccess().getTitleKeyword_5_0());
            			
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            				newLeafNode(this_EQUALS_6, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_5_1());
            			
            // InternalMyDsl.g:1700:4: ( (lv_title_7_0= ruleEString ) )
            // InternalMyDsl.g:1701:5: (lv_title_7_0= ruleEString )
            {
            // InternalMyDsl.g:1701:5: (lv_title_7_0= ruleEString )
            // InternalMyDsl.g:1702:6: lv_title_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBarChartAccess().getTitleEStringParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_title_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_7_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_45); 

            				newLeafNode(this_SEMICOLON_8, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_5_3());
            			

            }

            // InternalMyDsl.g:1724:3: (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1725:4: otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getBarChartAccess().getLegendPositionKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_25); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1733:4: ( (lv_legendPosition_11_0= rulePositionOptions ) )
                    // InternalMyDsl.g:1734:5: (lv_legendPosition_11_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:1734:5: (lv_legendPosition_11_0= rulePositionOptions )
                    // InternalMyDsl.g:1735:6: lv_legendPosition_11_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_11_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_11_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_46); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1757:3: (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1758:4: otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getBarChartAccess().getLabelStringXAxesKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:1766:4: ( (lv_labelStringXAxes_15_0= ruleEString ) )
                    // InternalMyDsl.g:1767:5: (lv_labelStringXAxes_15_0= ruleEString )
                    {
                    // InternalMyDsl.g:1767:5: (lv_labelStringXAxes_15_0= ruleEString )
                    // InternalMyDsl.g:1768:6: lv_labelStringXAxes_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelStringXAxesEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringXAxes_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringXAxes",
                    							lv_labelStringXAxes_15_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_47); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1790:3: (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1791:4: otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    otherlv_17=(Token)match(input,41,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getBarChartAccess().getColorGridLinesXAxesKeyword_8_0());
                    			
                    this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_18, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:1799:4: ( (lv_colorGridLinesXAxes_19_0= ruleEString ) )
                    // InternalMyDsl.g:1800:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    {
                    // InternalMyDsl.g:1800:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    // InternalMyDsl.g:1801:6: lv_colorGridLinesXAxes_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getColorGridLinesXAxesEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesXAxes_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesXAxes",
                    							lv_colorGridLinesXAxes_19_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_48); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1823:3: (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1824:4: otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON
                    {
                    otherlv_21=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getBarChartAccess().getLabelStringYAxesKeyword_9_0());
                    			
                    this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_22, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_9_1());
                    			
                    // InternalMyDsl.g:1832:4: ( (lv_labelStringYAxes_23_0= ruleEString ) )
                    // InternalMyDsl.g:1833:5: (lv_labelStringYAxes_23_0= ruleEString )
                    {
                    // InternalMyDsl.g:1833:5: (lv_labelStringYAxes_23_0= ruleEString )
                    // InternalMyDsl.g:1834:6: lv_labelStringYAxes_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelStringYAxesEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringYAxes_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringYAxes",
                    							lv_labelStringYAxes_23_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_49); 

                    				newLeafNode(this_SEMICOLON_24, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1856:3: (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1857:4: otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON
                    {
                    otherlv_25=(Token)match(input,43,FOLLOW_7); 

                    				newLeafNode(otherlv_25, grammarAccess.getBarChartAccess().getColorGridLinesYAxesKeyword_10_0());
                    			
                    this_EQUALS_26=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_26, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_10_1());
                    			
                    // InternalMyDsl.g:1865:4: ( (lv_colorGridLinesYAxes_27_0= ruleEString ) )
                    // InternalMyDsl.g:1866:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    {
                    // InternalMyDsl.g:1866:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    // InternalMyDsl.g:1867:6: lv_colorGridLinesYAxes_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getColorGridLinesYAxesEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesYAxes_27_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesYAxes",
                    							lv_colorGridLinesYAxes_27_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_50); 

                    				newLeafNode(this_SEMICOLON_28, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_10_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1889:3: (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON )
            // InternalMyDsl.g:1890:4: otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON
            {
            otherlv_29=(Token)match(input,48,FOLLOW_7); 

            				newLeafNode(otherlv_29, grammarAccess.getBarChartAccess().getBarPercentageKeyword_11_0());
            			
            this_EQUALS_30=(Token)match(input,RULE_EQUALS,FOLLOW_51); 

            				newLeafNode(this_EQUALS_30, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_11_1());
            			
            // InternalMyDsl.g:1898:4: ( (lv_barPercentage_31_0= ruleEFloat ) )
            // InternalMyDsl.g:1899:5: (lv_barPercentage_31_0= ruleEFloat )
            {
            // InternalMyDsl.g:1899:5: (lv_barPercentage_31_0= ruleEFloat )
            // InternalMyDsl.g:1900:6: lv_barPercentage_31_0= ruleEFloat
            {

            						newCompositeNode(grammarAccess.getBarChartAccess().getBarPercentageEFloatParserRuleCall_11_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_barPercentage_31_0=ruleEFloat();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            						}
            						set(
            							current,
            							"barPercentage",
            							lv_barPercentage_31_0,
            							"org.xtext.example.mydsl.MyDsl.EFloat");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_32=(Token)match(input,RULE_SEMICOLON,FOLLOW_41); 

            				newLeafNode(this_SEMICOLON_32, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_11_3());
            			

            }

            // InternalMyDsl.g:1922:3: ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1923:4: ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1923:4: ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) )
                    // InternalMyDsl.g:1924:5: (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' )
                    {
                    // InternalMyDsl.g:1924:5: (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' )
                    // InternalMyDsl.g:1925:6: lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes'
                    {
                    lv_displayGridLinesXAxes_33_0=(Token)match(input,44,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesXAxes_33_0, grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBarChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesXAxes", true, "displayGridLinesXAxes");
                    					

                    }


                    }

                    this_SEMICOLON_34=(Token)match(input,RULE_SEMICOLON,FOLLOW_42); 

                    				newLeafNode(this_SEMICOLON_34, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_12_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1942:3: ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1943:4: ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1943:4: ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) )
                    // InternalMyDsl.g:1944:5: (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' )
                    {
                    // InternalMyDsl.g:1944:5: (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' )
                    // InternalMyDsl.g:1945:6: lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes'
                    {
                    lv_displayGridLinesYAxes_35_0=(Token)match(input,45,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesYAxes_35_0, grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBarChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesYAxes", true, "displayGridLinesYAxes");
                    					

                    }


                    }

                    this_SEMICOLON_36=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

                    				newLeafNode(this_SEMICOLON_36, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_13_1());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_37, grammarAccess.getBarChartAccess().getDataKeyword_14());
            		
            this_EQUALS_38=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_38, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_15());
            		
            this_LIST_START_39=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_39, grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_16());
            		
            // InternalMyDsl.g:1974:3: ( (lv_data_40_0= ruleData ) )
            // InternalMyDsl.g:1975:4: (lv_data_40_0= ruleData )
            {
            // InternalMyDsl.g:1975:4: (lv_data_40_0= ruleData )
            // InternalMyDsl.g:1976:5: lv_data_40_0= ruleData
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_40_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_40_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1993:3: (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_COMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:1994:4: this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) )
            	    {
            	    this_COMA_41=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_41, grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_18_0());
            	    			
            	    // InternalMyDsl.g:1998:4: ( (lv_data_42_0= ruleData ) )
            	    // InternalMyDsl.g:1999:5: (lv_data_42_0= ruleData )
            	    {
            	    // InternalMyDsl.g:1999:5: (lv_data_42_0= ruleData )
            	    // InternalMyDsl.g:2000:6: lv_data_42_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_42_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_42_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            this_LIST_END_43=(Token)match(input,RULE_LIST_END,FOLLOW_44); 

            			newLeafNode(this_LIST_END_43, grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_19());
            		
            otherlv_44=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_44, grammarAccess.getBarChartAccess().getLabelsKeyword_20());
            		
            this_EQUALS_45=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_45, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_21());
            		
            this_LIST_START_46=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_46, grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_22());
            		
            // InternalMyDsl.g:2034:3: ( (lv_labels_47_0= ruleLabel ) )
            // InternalMyDsl.g:2035:4: (lv_labels_47_0= ruleLabel )
            {
            // InternalMyDsl.g:2035:4: (lv_labels_47_0= ruleLabel )
            // InternalMyDsl.g:2036:5: lv_labels_47_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_47_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_47_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2053:3: (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:2054:4: this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) )
            	    {
            	    this_COMA_48=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_48, grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_24_0());
            	    			
            	    // InternalMyDsl.g:2058:4: ( (lv_labels_49_0= ruleLabel ) )
            	    // InternalMyDsl.g:2059:5: (lv_labels_49_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:2059:5: (lv_labels_49_0= ruleLabel )
            	    // InternalMyDsl.g:2060:6: lv_labels_49_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_24_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_49_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_49_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            this_LIST_END_50=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_50, grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_25());
            		
            this_OBJECT_END_51=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_51, grammarAccess.getBarChartAccess().getOBJECT_ENDTerminalRuleCall_26());
            		

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
    // $ANTLR end "ruleBarChart"


    // $ANTLR start "entryRuleRadarChart"
    // InternalMyDsl.g:2090:1: entryRuleRadarChart returns [EObject current=null] : iv_ruleRadarChart= ruleRadarChart EOF ;
    public final EObject entryRuleRadarChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadarChart = null;


        try {
            // InternalMyDsl.g:2090:51: (iv_ruleRadarChart= ruleRadarChart EOF )
            // InternalMyDsl.g:2091:2: iv_ruleRadarChart= ruleRadarChart EOF
            {
             newCompositeNode(grammarAccess.getRadarChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadarChart=ruleRadarChart();

            state._fsp--;

             current =iv_ruleRadarChart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRadarChart"


    // $ANTLR start "ruleRadarChart"
    // InternalMyDsl.g:2097:1: ruleRadarChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END ) ;
    public final EObject ruleRadarChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token lv_angleLinesDisplay_13_0=null;
        Token this_SEMICOLON_14=null;
        Token otherlv_15=null;
        Token this_EQUALS_16=null;
        Token this_LIST_START_17=null;
        Token this_COMA_19=null;
        Token this_LIST_END_21=null;
        Token otherlv_22=null;
        Token this_EQUALS_23=null;
        Token this_LIST_START_24=null;
        Token this_COMA_26=null;
        Token this_LIST_END_28=null;
        Token this_OBJECT_END_29=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_legendPosition_11_0 = null;

        EObject lv_data_18_0 = null;

        EObject lv_data_20_0 = null;

        EObject lv_labels_25_0 = null;

        EObject lv_labels_27_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2103:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2104:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2104:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END )
            // InternalMyDsl.g:2105:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getRadarChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRadarChartAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:2117:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:2118:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:2118:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:2119:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_35); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:2140:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // InternalMyDsl.g:2141:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getRadarChartAccess().getTitleKeyword_5_0());
            			
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            				newLeafNode(this_EQUALS_6, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_5_1());
            			
            // InternalMyDsl.g:2149:4: ( (lv_title_7_0= ruleEString ) )
            // InternalMyDsl.g:2150:5: (lv_title_7_0= ruleEString )
            {
            // InternalMyDsl.g:2150:5: (lv_title_7_0= ruleEString )
            // InternalMyDsl.g:2151:6: lv_title_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRadarChartAccess().getTitleEStringParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_title_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_7_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_52); 

            				newLeafNode(this_SEMICOLON_8, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_5_3());
            			

            }

            // InternalMyDsl.g:2173:3: (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2174:4: otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getRadarChartAccess().getLegendPositionKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_25); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2182:4: ( (lv_legendPosition_11_0= rulePositionOptions ) )
                    // InternalMyDsl.g:2183:5: (lv_legendPosition_11_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:2183:5: (lv_legendPosition_11_0= rulePositionOptions )
                    // InternalMyDsl.g:2184:6: lv_legendPosition_11_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getRadarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_11_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_11_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_53); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2206:3: ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON )
            // InternalMyDsl.g:2207:4: ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON
            {
            // InternalMyDsl.g:2207:4: ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) )
            // InternalMyDsl.g:2208:5: (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' )
            {
            // InternalMyDsl.g:2208:5: (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' )
            // InternalMyDsl.g:2209:6: lv_angleLinesDisplay_13_0= 'angleLinesDisplay'
            {
            lv_angleLinesDisplay_13_0=(Token)match(input,49,FOLLOW_13); 

            						newLeafNode(lv_angleLinesDisplay_13_0, grammarAccess.getRadarChartAccess().getAngleLinesDisplayAngleLinesDisplayKeyword_7_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRadarChartRule());
            						}
            						setWithLastConsumed(current, "angleLinesDisplay", true, "angleLinesDisplay");
            					

            }


            }

            this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

            				newLeafNode(this_SEMICOLON_14, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_7_1());
            			

            }

            otherlv_15=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getRadarChartAccess().getDataKeyword_8());
            		
            this_EQUALS_16=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_16, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_9());
            		
            this_LIST_START_17=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_17, grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_10());
            		
            // InternalMyDsl.g:2238:3: ( (lv_data_18_0= ruleData ) )
            // InternalMyDsl.g:2239:4: (lv_data_18_0= ruleData )
            {
            // InternalMyDsl.g:2239:4: (lv_data_18_0= ruleData )
            // InternalMyDsl.g:2240:5: lv_data_18_0= ruleData
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_18_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_18_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2257:3: (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_COMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:2258:4: this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) )
            	    {
            	    this_COMA_19=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_19, grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_12_0());
            	    			
            	    // InternalMyDsl.g:2262:4: ( (lv_data_20_0= ruleData ) )
            	    // InternalMyDsl.g:2263:5: (lv_data_20_0= ruleData )
            	    {
            	    // InternalMyDsl.g:2263:5: (lv_data_20_0= ruleData )
            	    // InternalMyDsl.g:2264:6: lv_data_20_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_20_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_20_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            this_LIST_END_21=(Token)match(input,RULE_LIST_END,FOLLOW_44); 

            			newLeafNode(this_LIST_END_21, grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_13());
            		
            otherlv_22=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_22, grammarAccess.getRadarChartAccess().getLabelsKeyword_14());
            		
            this_EQUALS_23=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_23, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_15());
            		
            this_LIST_START_24=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_24, grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_16());
            		
            // InternalMyDsl.g:2298:3: ( (lv_labels_25_0= ruleLabel ) )
            // InternalMyDsl.g:2299:4: (lv_labels_25_0= ruleLabel )
            {
            // InternalMyDsl.g:2299:4: (lv_labels_25_0= ruleLabel )
            // InternalMyDsl.g:2300:5: lv_labels_25_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_25_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_25_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2317:3: (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_COMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMyDsl.g:2318:4: this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) )
            	    {
            	    this_COMA_26=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_26, grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_18_0());
            	    			
            	    // InternalMyDsl.g:2322:4: ( (lv_labels_27_0= ruleLabel ) )
            	    // InternalMyDsl.g:2323:5: (lv_labels_27_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:2323:5: (lv_labels_27_0= ruleLabel )
            	    // InternalMyDsl.g:2324:6: lv_labels_27_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_27_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_27_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            this_LIST_END_28=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_28, grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_19());
            		
            this_OBJECT_END_29=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_29, grammarAccess.getRadarChartAccess().getOBJECT_ENDTerminalRuleCall_20());
            		

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
    // $ANTLR end "ruleRadarChart"


    // $ANTLR start "entryRulePieChart"
    // InternalMyDsl.g:2354:1: entryRulePieChart returns [EObject current=null] : iv_rulePieChart= rulePieChart EOF ;
    public final EObject entryRulePieChart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieChart = null;


        try {
            // InternalMyDsl.g:2354:49: (iv_rulePieChart= rulePieChart EOF )
            // InternalMyDsl.g:2355:2: iv_rulePieChart= rulePieChart EOF
            {
             newCompositeNode(grammarAccess.getPieChartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePieChart=rulePieChart();

            state._fsp--;

             current =iv_rulePieChart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePieChart"


    // $ANTLR start "rulePieChart"
    // InternalMyDsl.g:2361:1: rulePieChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) ;
    public final EObject rulePieChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMICOLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_LIST_START_16=null;
        Token this_COMA_18=null;
        Token this_LIST_END_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_LIST_START_23=null;
        Token this_COMA_25=null;
        Token this_LIST_END_27=null;
        Token this_OBJECT_END_28=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_title_8_0 = null;

        Enumerator lv_legendPosition_12_0 = null;

        EObject lv_data_17_0 = null;

        EObject lv_data_19_0 = null;

        EObject lv_labels_24_0 = null;

        EObject lv_labels_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2367:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2368:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2368:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            // InternalMyDsl.g:2369:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_54); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getPieChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPieChartAccess().getPIECHARTKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPieChartAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:2385:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:2386:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:2386:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:2387:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_55); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getPieChartAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:2408:3: (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2409:4: otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getPieChartAccess().getTitleKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2417:4: ( (lv_title_8_0= ruleEString ) )
                    // InternalMyDsl.g:2418:5: (lv_title_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:2418:5: (lv_title_8_0= ruleEString )
                    // InternalMyDsl.g:2419:6: lv_title_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPieChartAccess().getTitleEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_56); 

                    				newLeafNode(this_SEMICOLON_9, grammarAccess.getPieChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2441:3: (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2442:4: otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getPieChartAccess().getLegendPositionKeyword_7_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_25); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:2450:4: ( (lv_legendPosition_12_0= rulePositionOptions ) )
                    // InternalMyDsl.g:2451:5: (lv_legendPosition_12_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:2451:5: (lv_legendPosition_12_0= rulePositionOptions )
                    // InternalMyDsl.g:2452:6: lv_legendPosition_12_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getPieChartAccess().getLegendPositionPositionOptionsEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_12_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_12_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

                    				newLeafNode(this_SEMICOLON_13, grammarAccess.getPieChartAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getPieChartAccess().getDataKeyword_8());
            		
            this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_15, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_9());
            		
            this_LIST_START_16=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_16, grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_10());
            		
            // InternalMyDsl.g:2486:3: ( (lv_data_17_0= ruleData ) )
            // InternalMyDsl.g:2487:4: (lv_data_17_0= ruleData )
            {
            // InternalMyDsl.g:2487:4: (lv_data_17_0= ruleData )
            // InternalMyDsl.g:2488:5: lv_data_17_0= ruleData
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_17_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_17_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2505:3: (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_COMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:2506:4: this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) )
            	    {
            	    this_COMA_18=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_18, grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_12_0());
            	    			
            	    // InternalMyDsl.g:2510:4: ( (lv_data_19_0= ruleData ) )
            	    // InternalMyDsl.g:2511:5: (lv_data_19_0= ruleData )
            	    {
            	    // InternalMyDsl.g:2511:5: (lv_data_19_0= ruleData )
            	    // InternalMyDsl.g:2512:6: lv_data_19_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_19_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_19_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            this_LIST_END_20=(Token)match(input,RULE_LIST_END,FOLLOW_44); 

            			newLeafNode(this_LIST_END_20, grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_13());
            		
            otherlv_21=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getPieChartAccess().getLabelsKeyword_14());
            		
            this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_22, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_15());
            		
            this_LIST_START_23=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_23, grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_16());
            		
            // InternalMyDsl.g:2546:3: ( (lv_labels_24_0= ruleLabel ) )
            // InternalMyDsl.g:2547:4: (lv_labels_24_0= ruleLabel )
            {
            // InternalMyDsl.g:2547:4: (lv_labels_24_0= ruleLabel )
            // InternalMyDsl.g:2548:5: lv_labels_24_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_24_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_24_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2565:3: (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_COMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:2566:4: this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) )
            	    {
            	    this_COMA_25=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_25, grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_18_0());
            	    			
            	    // InternalMyDsl.g:2570:4: ( (lv_labels_26_0= ruleLabel ) )
            	    // InternalMyDsl.g:2571:5: (lv_labels_26_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:2571:5: (lv_labels_26_0= ruleLabel )
            	    // InternalMyDsl.g:2572:6: lv_labels_26_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_26_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_26_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            this_LIST_END_27=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_27, grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_19());
            		
            this_OBJECT_END_28=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_28, grammarAccess.getPieChartAccess().getOBJECT_ENDTerminalRuleCall_20());
            		

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
    // $ANTLR end "rulePieChart"


    // $ANTLR start "entryRuleData"
    // InternalMyDsl.g:2602:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalMyDsl.g:2602:45: (iv_ruleData= ruleData EOF )
            // InternalMyDsl.g:2603:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalMyDsl.g:2609:1: ruleData returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_SEMICOLON_20=null;
        Token lv_fill_21_0=null;
        Token this_SEMICOLON_22=null;
        Token otherlv_23=null;
        Token this_EQUALS_24=null;
        Token this_LIST_START_25=null;
        Token this_COMA_27=null;
        Token this_LIST_END_29=null;
        Token this_OBJECT_END_30=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_category_7_0 = null;

        Enumerator lv_borderColor_11_0 = null;

        Enumerator lv_backgroundColor_15_0 = null;

        AntlrDatatypeRuleToken lv_borderDash_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2615:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2616:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2616:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END )
            // InternalMyDsl.g:2617:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDataAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:2629:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:2630:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:2630:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:2631:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_57); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:2652:3: (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2653:4: otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataAccess().getCategoryKeyword_5_0());
                    			
                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_6, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:2661:4: ( (lv_category_7_0= ruleEString ) )
                    // InternalMyDsl.g:2662:5: (lv_category_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:2662:5: (lv_category_7_0= ruleEString )
                    // InternalMyDsl.g:2663:6: lv_category_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getCategoryEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_category_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"category",
                    							lv_category_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_58); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2685:3: (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==52) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2686:4: otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,52,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataAccess().getBorderColorKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_59); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2694:4: ( (lv_borderColor_11_0= ruleColors ) )
                    // InternalMyDsl.g:2695:5: (lv_borderColor_11_0= ruleColors )
                    {
                    // InternalMyDsl.g:2695:5: (lv_borderColor_11_0= ruleColors )
                    // InternalMyDsl.g:2696:6: lv_borderColor_11_0= ruleColors
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBorderColorColorsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_borderColor_11_0=ruleColors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"borderColor",
                    							lv_borderColor_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Colors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_60); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2718:3: (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2719:4: otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,53,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataAccess().getBackgroundColorKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_59); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:2727:4: ( (lv_backgroundColor_15_0= ruleColors ) )
                    // InternalMyDsl.g:2728:5: (lv_backgroundColor_15_0= ruleColors )
                    {
                    // InternalMyDsl.g:2728:5: (lv_backgroundColor_15_0= ruleColors )
                    // InternalMyDsl.g:2729:6: lv_backgroundColor_15_0= ruleColors
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBackgroundColorColorsEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_backgroundColor_15_0=ruleColors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"backgroundColor",
                    							lv_backgroundColor_15_0,
                    							"org.xtext.example.mydsl.MyDsl.Colors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_61); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2751:3: (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2752:4: otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    otherlv_17=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getDataAccess().getBorderDashKeyword_8_0());
                    			
                    this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_18); 

                    				newLeafNode(this_EQUALS_18, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:2760:4: ( (lv_borderDash_19_0= ruleEInt ) )
                    // InternalMyDsl.g:2761:5: (lv_borderDash_19_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2761:5: (lv_borderDash_19_0= ruleEInt )
                    // InternalMyDsl.g:2762:6: lv_borderDash_19_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBorderDashEIntParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_borderDash_19_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"borderDash",
                    							lv_borderDash_19_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_62); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2784:3: ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2785:4: ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:2785:4: ( (lv_fill_21_0= 'fill' ) )
                    // InternalMyDsl.g:2786:5: (lv_fill_21_0= 'fill' )
                    {
                    // InternalMyDsl.g:2786:5: (lv_fill_21_0= 'fill' )
                    // InternalMyDsl.g:2787:6: lv_fill_21_0= 'fill'
                    {
                    lv_fill_21_0=(Token)match(input,55,FOLLOW_13); 

                    						newLeafNode(lv_fill_21_0, grammarAccess.getDataAccess().getFillFillKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    						setWithLastConsumed(current, "fill", true, "fill");
                    					

                    }


                    }

                    this_SEMICOLON_22=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

                    				newLeafNode(this_SEMICOLON_22, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_23, grammarAccess.getDataAccess().getDataKeyword_10());
            		
            this_EQUALS_24=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_24, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_11());
            		
            this_LIST_START_25=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

            			newLeafNode(this_LIST_START_25, grammarAccess.getDataAccess().getLIST_STARTTerminalRuleCall_12());
            		
            // InternalMyDsl.g:2816:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2817:4: ( ruleEString )
            {
            // InternalMyDsl.g:2817:4: ( ruleEString )
            // InternalMyDsl.g:2818:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataAccess().getDataEntityCrossReference_13_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2832:3: (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_COMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:2833:4: this_COMA_27= RULE_COMA ( ( ruleEString ) )
            	    {
            	    this_COMA_27=(Token)match(input,RULE_COMA,FOLLOW_3); 

            	    				newLeafNode(this_COMA_27, grammarAccess.getDataAccess().getCOMATerminalRuleCall_14_0());
            	    			
            	    // InternalMyDsl.g:2837:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2838:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2838:5: ( ruleEString )
            	    // InternalMyDsl.g:2839:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDataAccess().getDataEntityCrossReference_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            this_LIST_END_29=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_29, grammarAccess.getDataAccess().getLIST_ENDTerminalRuleCall_15());
            		
            this_OBJECT_END_30=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_30, grammarAccess.getDataAccess().getOBJECT_ENDTerminalRuleCall_16());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:2866:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:2866:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:2867:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:2873:1: ruleLabel returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token this_OBJECT_END_6=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2879:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2880:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2880:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END )
            // InternalMyDsl.g:2881:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END
            {
            // InternalMyDsl.g:2881:3: ()
            // InternalMyDsl.g:2882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getLabelAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getLabelAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:2900:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:2901:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:2901:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:2902:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getLabelAccess().getSEMICOLONTerminalRuleCall_5());
            		
            this_OBJECT_END_6=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_6, grammarAccess.getLabelAccess().getOBJECT_ENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleDBServer"
    // InternalMyDsl.g:2931:1: entryRuleDBServer returns [EObject current=null] : iv_ruleDBServer= ruleDBServer EOF ;
    public final EObject entryRuleDBServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBServer = null;


        try {
            // InternalMyDsl.g:2931:49: (iv_ruleDBServer= ruleDBServer EOF )
            // InternalMyDsl.g:2932:2: iv_ruleDBServer= ruleDBServer EOF
            {
             newCompositeNode(grammarAccess.getDBServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBServer=ruleDBServer();

            state._fsp--;

             current =iv_ruleDBServer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDBServer"


    // $ANTLR start "ruleDBServer"
    // InternalMyDsl.g:2938:1: ruleDBServer returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedEntities' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedEntities_20_0= ruleEntity ) ) (this_COMA_21= RULE_COMA ( (lv_relatedEntities_22_0= ruleEntity ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END ) ;
    public final EObject ruleDBServer() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_LIST_START_19=null;
        Token this_COMA_21=null;
        Token this_LIST_END_23=null;
        Token this_OBJECT_END_24=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_systemManager_7_0 = null;

        AntlrDatatypeRuleToken lv_token_11_0 = null;

        AntlrDatatypeRuleToken lv_password_15_0 = null;

        EObject lv_relatedEntities_20_0 = null;

        EObject lv_relatedEntities_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2944:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedEntities' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedEntities_20_0= ruleEntity ) ) (this_COMA_21= RULE_COMA ( (lv_relatedEntities_22_0= ruleEntity ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2945:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedEntities' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedEntities_20_0= ruleEntity ) ) (this_COMA_21= RULE_COMA ( (lv_relatedEntities_22_0= ruleEntity ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2945:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedEntities' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedEntities_20_0= ruleEntity ) ) (this_COMA_21= RULE_COMA ( (lv_relatedEntities_22_0= ruleEntity ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END )
            // InternalMyDsl.g:2946:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedEntities' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedEntities_20_0= ruleEntity ) ) (this_COMA_21= RULE_COMA ( (lv_relatedEntities_22_0= ruleEntity ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDBServerAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDBServerAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:2958:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:2959:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:2959:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:2960:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDBServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_63); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:2981:3: (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2982:4: otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getDBServerAccess().getSystemManagerKeyword_5_0());
                    			
                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_64); 

                    				newLeafNode(this_EQUALS_6, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:2990:4: ( (lv_systemManager_7_0= ruleDBSystem ) )
                    // InternalMyDsl.g:2991:5: (lv_systemManager_7_0= ruleDBSystem )
                    {
                    // InternalMyDsl.g:2991:5: (lv_systemManager_7_0= ruleDBSystem )
                    // InternalMyDsl.g:2992:6: lv_systemManager_7_0= ruleDBSystem
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getSystemManagerDBSystemEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_systemManager_7_0=ruleDBSystem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"systemManager",
                    							lv_systemManager_7_0,
                    							"org.xtext.example.mydsl.MyDsl.DBSystem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_65); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3014:3: (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==57) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:3015:4: otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getDBServerAccess().getTokenKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:3023:4: ( (lv_token_11_0= ruleEString ) )
                    // InternalMyDsl.g:3024:5: (lv_token_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:3024:5: (lv_token_11_0= ruleEString )
                    // InternalMyDsl.g:3025:6: lv_token_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getTokenEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_token_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"token",
                    							lv_token_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_66); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3047:3: (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:3048:4: otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,58,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getDBServerAccess().getPasswordKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:3056:4: ( (lv_password_15_0= ruleEString ) )
                    // InternalMyDsl.g:3057:5: (lv_password_15_0= ruleEString )
                    {
                    // InternalMyDsl.g:3057:5: (lv_password_15_0= ruleEString )
                    // InternalMyDsl.g:3058:6: lv_password_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getPasswordEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_password_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_15_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_67); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getDBServerAccess().getRelatedEntitiesKeyword_8());
            		
            this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_18, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_9());
            		
            this_LIST_START_19=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_19, grammarAccess.getDBServerAccess().getLIST_STARTTerminalRuleCall_10());
            		
            // InternalMyDsl.g:3092:3: ( (lv_relatedEntities_20_0= ruleEntity ) )
            // InternalMyDsl.g:3093:4: (lv_relatedEntities_20_0= ruleEntity )
            {
            // InternalMyDsl.g:3093:4: (lv_relatedEntities_20_0= ruleEntity )
            // InternalMyDsl.g:3094:5: lv_relatedEntities_20_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getDBServerAccess().getRelatedEntitiesEntityParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_relatedEntities_20_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBServerRule());
            					}
            					add(
            						current,
            						"relatedEntities",
            						lv_relatedEntities_20_0,
            						"org.xtext.example.mydsl.MyDsl.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3111:3: (this_COMA_21= RULE_COMA ( (lv_relatedEntities_22_0= ruleEntity ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_COMA) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:3112:4: this_COMA_21= RULE_COMA ( (lv_relatedEntities_22_0= ruleEntity ) )
            	    {
            	    this_COMA_21=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_21, grammarAccess.getDBServerAccess().getCOMATerminalRuleCall_12_0());
            	    			
            	    // InternalMyDsl.g:3116:4: ( (lv_relatedEntities_22_0= ruleEntity ) )
            	    // InternalMyDsl.g:3117:5: (lv_relatedEntities_22_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:3117:5: (lv_relatedEntities_22_0= ruleEntity )
            	    // InternalMyDsl.g:3118:6: lv_relatedEntities_22_0= ruleEntity
            	    {

            	    						newCompositeNode(grammarAccess.getDBServerAccess().getRelatedEntitiesEntityParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_relatedEntities_22_0=ruleEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDBServerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relatedEntities",
            	    							lv_relatedEntities_22_0,
            	    							"org.xtext.example.mydsl.MyDsl.Entity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            this_LIST_END_23=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_23, grammarAccess.getDBServerAccess().getLIST_ENDTerminalRuleCall_13());
            		
            this_OBJECT_END_24=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_24, grammarAccess.getDBServerAccess().getOBJECT_ENDTerminalRuleCall_14());
            		

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
    // $ANTLR end "ruleDBServer"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:3148:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:3148:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:3149:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:3155:1: ruleEntity returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_LIST_START_8=null;
        Token this_COMA_10=null;
        Token this_LIST_END_12=null;
        Token this_OBJECT_END_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3161:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3162:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3162:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END )
            // InternalMyDsl.g:3163:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END
            {
            // InternalMyDsl.g:3163:3: ()
            // InternalMyDsl.g:3164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getEntityAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getEntityAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3182:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:3183:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:3183:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:3184:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_68); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getEntityAccess().getSEMICOLONTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,60,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getAttributesKeyword_6());
            		
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_7, grammarAccess.getEntityAccess().getEQUALSTerminalRuleCall_7());
            		
            this_LIST_START_8=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_8, grammarAccess.getEntityAccess().getLIST_STARTTerminalRuleCall_8());
            		
            // InternalMyDsl.g:3217:3: ( (lv_attributes_9_0= ruleAttribute ) )
            // InternalMyDsl.g:3218:4: (lv_attributes_9_0= ruleAttribute )
            {
            // InternalMyDsl.g:3218:4: (lv_attributes_9_0= ruleAttribute )
            // InternalMyDsl.g:3219:5: lv_attributes_9_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_attributes_9_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_9_0,
            						"org.xtext.example.mydsl.MyDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3236:3: (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_COMA) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalMyDsl.g:3237:4: this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) )
            	    {
            	    this_COMA_10=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_10, grammarAccess.getEntityAccess().getCOMATerminalRuleCall_10_0());
            	    			
            	    // InternalMyDsl.g:3241:4: ( (lv_attributes_11_0= ruleAttribute ) )
            	    // InternalMyDsl.g:3242:5: (lv_attributes_11_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:3242:5: (lv_attributes_11_0= ruleAttribute )
            	    // InternalMyDsl.g:3243:6: lv_attributes_11_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_11_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_11_0,
            	    							"org.xtext.example.mydsl.MyDsl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            this_LIST_END_12=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_12, grammarAccess.getEntityAccess().getLIST_ENDTerminalRuleCall_11());
            		
            this_OBJECT_END_13=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_13, grammarAccess.getEntityAccess().getOBJECT_ENDTerminalRuleCall_12());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:3273:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:3273:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:3274:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:3280:1: ruleAttribute returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? ( ( (lv_required_9_0= 'required' ) ) this_SEMICOLON_10= RULE_SEMICOLON )? this_OBJECT_END_11= RULE_OBJECT_END ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_SEMICOLON_8=null;
        Token lv_required_9_0=null;
        Token this_SEMICOLON_10=null;
        Token this_OBJECT_END_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3286:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? ( ( (lv_required_9_0= 'required' ) ) this_SEMICOLON_10= RULE_SEMICOLON )? this_OBJECT_END_11= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3287:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? ( ( (lv_required_9_0= 'required' ) ) this_SEMICOLON_10= RULE_SEMICOLON )? this_OBJECT_END_11= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3287:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? ( ( (lv_required_9_0= 'required' ) ) this_SEMICOLON_10= RULE_SEMICOLON )? this_OBJECT_END_11= RULE_OBJECT_END )
            // InternalMyDsl.g:3288:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? ( ( (lv_required_9_0= 'required' ) ) this_SEMICOLON_10= RULE_SEMICOLON )? this_OBJECT_END_11= RULE_OBJECT_END
            {
            // InternalMyDsl.g:3288:3: ()
            // InternalMyDsl.g:3289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getAttributeAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getAttributeAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3307:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:3308:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:3308:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:3309:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_69); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getAttributeAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:3330:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==61) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:3331:4: otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTypeKeyword_6_0());
                    			
                    // InternalMyDsl.g:3335:4: ( (lv_type_7_0= ruleEString ) )
                    // InternalMyDsl.g:3336:5: (lv_type_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:3336:5: (lv_type_7_0= ruleEString )
                    // InternalMyDsl.g:3337:6: lv_type_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_70); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getAttributeAccess().getSEMICOLONTerminalRuleCall_6_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3359:3: ( ( (lv_required_9_0= 'required' ) ) this_SEMICOLON_10= RULE_SEMICOLON )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:3360:4: ( (lv_required_9_0= 'required' ) ) this_SEMICOLON_10= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:3360:4: ( (lv_required_9_0= 'required' ) )
                    // InternalMyDsl.g:3361:5: (lv_required_9_0= 'required' )
                    {
                    // InternalMyDsl.g:3361:5: (lv_required_9_0= 'required' )
                    // InternalMyDsl.g:3362:6: lv_required_9_0= 'required'
                    {
                    lv_required_9_0=(Token)match(input,62,FOLLOW_13); 

                    						newLeafNode(lv_required_9_0, grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(current, "required", true, "required");
                    					

                    }


                    }

                    this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

                    				newLeafNode(this_SEMICOLON_10, grammarAccess.getAttributeAccess().getSEMICOLONTerminalRuleCall_7_1());
                    			

                    }
                    break;

            }

            this_OBJECT_END_11=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_11, grammarAccess.getAttributeAccess().getOBJECT_ENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:3387:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalMyDsl.g:3387:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalMyDsl.g:3388:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:3394:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3400:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:3401:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:3401:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:3402:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:3402:3: (kw= '-' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==63) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:3403:4: kw= '-'
                    {
                    kw=(Token)match(input,63,FOLLOW_71); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3409:3: (this_INT_1= RULE_INT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:3410:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_72); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,64,FOLLOW_73); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_74); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3430:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=65 && LA66_0<=66)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:3431:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:3431:4: (kw= 'E' | kw= 'e' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==65) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==66) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalMyDsl.g:3432:5: kw= 'E'
                            {
                            kw=(Token)match(input,65,FOLLOW_18); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3438:5: kw= 'e'
                            {
                            kw=(Token)match(input,66,FOLLOW_18); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:3444:4: (kw= '-' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==63) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalMyDsl.g:3445:5: kw= '-'
                            {
                            kw=(Token)match(input,63,FOLLOW_73); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:3463:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:3463:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:3464:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:3470:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3476:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:3477:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:3477:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_ID) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:3478:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3486:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:3497:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:3497:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:3498:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:3504:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3510:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:3511:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:3511:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:3512:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:3512:3: (kw= '-' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==63) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:3513:4: kw= '-'
                    {
                    kw=(Token)match(input,63,FOLLOW_73); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleDBSystem"
    // InternalMyDsl.g:3530:1: ruleDBSystem returns [Enumerator current=null] : ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) ) ;
    public final Enumerator ruleDBSystem() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3536:2: ( ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) ) )
            // InternalMyDsl.g:3537:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) )
            {
            // InternalMyDsl.g:3537:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==67) ) {
                alt69=1;
            }
            else if ( (LA69_0==68) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:3538:3: (enumLiteral_0= 'MONGODB' )
                    {
                    // InternalMyDsl.g:3538:3: (enumLiteral_0= 'MONGODB' )
                    // InternalMyDsl.g:3539:4: enumLiteral_0= 'MONGODB'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3546:3: (enumLiteral_1= 'REDIS' )
                    {
                    // InternalMyDsl.g:3546:3: (enumLiteral_1= 'REDIS' )
                    // InternalMyDsl.g:3547:4: enumLiteral_1= 'REDIS'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDBSystemAccess().getREDISEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDBSystemAccess().getREDISEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDBSystem"


    // $ANTLR start "ruleColors"
    // InternalMyDsl.g:3557:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= '#FFFFFF' ) | (enumLiteral_1= '#0000FF' ) | (enumLiteral_2= '#FF0000' ) | (enumLiteral_3= '#00FF00' ) | (enumLiteral_4= '#808080' ) | (enumLiteral_5= '#FFFF00' ) | (enumLiteral_6= '#000000' ) | (enumLiteral_7= '#00FFFF' ) | (enumLiteral_8= '#FF00FF' ) | (enumLiteral_9= '#C0C0C0' ) | (enumLiteral_10= '#800000' ) | (enumLiteral_11= '#808000' ) | (enumLiteral_12= '#800080' ) | (enumLiteral_13= '#008080' ) | (enumLiteral_14= '#000080' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3563:2: ( ( (enumLiteral_0= '#FFFFFF' ) | (enumLiteral_1= '#0000FF' ) | (enumLiteral_2= '#FF0000' ) | (enumLiteral_3= '#00FF00' ) | (enumLiteral_4= '#808080' ) | (enumLiteral_5= '#FFFF00' ) | (enumLiteral_6= '#000000' ) | (enumLiteral_7= '#00FFFF' ) | (enumLiteral_8= '#FF00FF' ) | (enumLiteral_9= '#C0C0C0' ) | (enumLiteral_10= '#800000' ) | (enumLiteral_11= '#808000' ) | (enumLiteral_12= '#800080' ) | (enumLiteral_13= '#008080' ) | (enumLiteral_14= '#000080' ) ) )
            // InternalMyDsl.g:3564:2: ( (enumLiteral_0= '#FFFFFF' ) | (enumLiteral_1= '#0000FF' ) | (enumLiteral_2= '#FF0000' ) | (enumLiteral_3= '#00FF00' ) | (enumLiteral_4= '#808080' ) | (enumLiteral_5= '#FFFF00' ) | (enumLiteral_6= '#000000' ) | (enumLiteral_7= '#00FFFF' ) | (enumLiteral_8= '#FF00FF' ) | (enumLiteral_9= '#C0C0C0' ) | (enumLiteral_10= '#800000' ) | (enumLiteral_11= '#808000' ) | (enumLiteral_12= '#800080' ) | (enumLiteral_13= '#008080' ) | (enumLiteral_14= '#000080' ) )
            {
            // InternalMyDsl.g:3564:2: ( (enumLiteral_0= '#FFFFFF' ) | (enumLiteral_1= '#0000FF' ) | (enumLiteral_2= '#FF0000' ) | (enumLiteral_3= '#00FF00' ) | (enumLiteral_4= '#808080' ) | (enumLiteral_5= '#FFFF00' ) | (enumLiteral_6= '#000000' ) | (enumLiteral_7= '#00FFFF' ) | (enumLiteral_8= '#FF00FF' ) | (enumLiteral_9= '#C0C0C0' ) | (enumLiteral_10= '#800000' ) | (enumLiteral_11= '#808000' ) | (enumLiteral_12= '#800080' ) | (enumLiteral_13= '#008080' ) | (enumLiteral_14= '#000080' ) )
            int alt70=15;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt70=1;
                }
                break;
            case 70:
                {
                alt70=2;
                }
                break;
            case 71:
                {
                alt70=3;
                }
                break;
            case 72:
                {
                alt70=4;
                }
                break;
            case 73:
                {
                alt70=5;
                }
                break;
            case 74:
                {
                alt70=6;
                }
                break;
            case 75:
                {
                alt70=7;
                }
                break;
            case 76:
                {
                alt70=8;
                }
                break;
            case 77:
                {
                alt70=9;
                }
                break;
            case 78:
                {
                alt70=10;
                }
                break;
            case 79:
                {
                alt70=11;
                }
                break;
            case 80:
                {
                alt70=12;
                }
                break;
            case 81:
                {
                alt70=13;
                }
                break;
            case 82:
                {
                alt70=14;
                }
                break;
            case 83:
                {
                alt70=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:3565:3: (enumLiteral_0= '#FFFFFF' )
                    {
                    // InternalMyDsl.g:3565:3: (enumLiteral_0= '#FFFFFF' )
                    // InternalMyDsl.g:3566:4: enumLiteral_0= '#FFFFFF'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3573:3: (enumLiteral_1= '#0000FF' )
                    {
                    // InternalMyDsl.g:3573:3: (enumLiteral_1= '#0000FF' )
                    // InternalMyDsl.g:3574:4: enumLiteral_1= '#0000FF'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3581:3: (enumLiteral_2= '#FF0000' )
                    {
                    // InternalMyDsl.g:3581:3: (enumLiteral_2= '#FF0000' )
                    // InternalMyDsl.g:3582:4: enumLiteral_2= '#FF0000'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3589:3: (enumLiteral_3= '#00FF00' )
                    {
                    // InternalMyDsl.g:3589:3: (enumLiteral_3= '#00FF00' )
                    // InternalMyDsl.g:3590:4: enumLiteral_3= '#00FF00'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3597:3: (enumLiteral_4= '#808080' )
                    {
                    // InternalMyDsl.g:3597:3: (enumLiteral_4= '#808080' )
                    // InternalMyDsl.g:3598:4: enumLiteral_4= '#808080'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3605:3: (enumLiteral_5= '#FFFF00' )
                    {
                    // InternalMyDsl.g:3605:3: (enumLiteral_5= '#FFFF00' )
                    // InternalMyDsl.g:3606:4: enumLiteral_5= '#FFFF00'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3613:3: (enumLiteral_6= '#000000' )
                    {
                    // InternalMyDsl.g:3613:3: (enumLiteral_6= '#000000' )
                    // InternalMyDsl.g:3614:4: enumLiteral_6= '#000000'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3621:3: (enumLiteral_7= '#00FFFF' )
                    {
                    // InternalMyDsl.g:3621:3: (enumLiteral_7= '#00FFFF' )
                    // InternalMyDsl.g:3622:4: enumLiteral_7= '#00FFFF'
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3629:3: (enumLiteral_8= '#FF00FF' )
                    {
                    // InternalMyDsl.g:3629:3: (enumLiteral_8= '#FF00FF' )
                    // InternalMyDsl.g:3630:4: enumLiteral_8= '#FF00FF'
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3637:3: (enumLiteral_9= '#C0C0C0' )
                    {
                    // InternalMyDsl.g:3637:3: (enumLiteral_9= '#C0C0C0' )
                    // InternalMyDsl.g:3638:4: enumLiteral_9= '#C0C0C0'
                    {
                    enumLiteral_9=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3645:3: (enumLiteral_10= '#800000' )
                    {
                    // InternalMyDsl.g:3645:3: (enumLiteral_10= '#800000' )
                    // InternalMyDsl.g:3646:4: enumLiteral_10= '#800000'
                    {
                    enumLiteral_10=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:3653:3: (enumLiteral_11= '#808000' )
                    {
                    // InternalMyDsl.g:3653:3: (enumLiteral_11= '#808000' )
                    // InternalMyDsl.g:3654:4: enumLiteral_11= '#808000'
                    {
                    enumLiteral_11=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:3661:3: (enumLiteral_12= '#800080' )
                    {
                    // InternalMyDsl.g:3661:3: (enumLiteral_12= '#800080' )
                    // InternalMyDsl.g:3662:4: enumLiteral_12= '#800080'
                    {
                    enumLiteral_12=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:3669:3: (enumLiteral_13= '#008080' )
                    {
                    // InternalMyDsl.g:3669:3: (enumLiteral_13= '#008080' )
                    // InternalMyDsl.g:3670:4: enumLiteral_13= '#008080'
                    {
                    enumLiteral_13=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:3677:3: (enumLiteral_14= '#000080' )
                    {
                    // InternalMyDsl.g:3677:3: (enumLiteral_14= '#000080' )
                    // InternalMyDsl.g:3678:4: enumLiteral_14= '#000080'
                    {
                    enumLiteral_14=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getNavyEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getColorsAccess().getNavyEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleColors"


    // $ANTLR start "rulePositionOptions"
    // InternalMyDsl.g:3688:1: rulePositionOptions returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) ) ;
    public final Enumerator rulePositionOptions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3694:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) ) )
            // InternalMyDsl.g:3695:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) )
            {
            // InternalMyDsl.g:3695:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) )
            int alt71=5;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt71=1;
                }
                break;
            case 85:
                {
                alt71=2;
                }
                break;
            case 86:
                {
                alt71=3;
                }
                break;
            case 87:
                {
                alt71=4;
                }
                break;
            case 88:
                {
                alt71=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:3696:3: (enumLiteral_0= 'left' )
                    {
                    // InternalMyDsl.g:3696:3: (enumLiteral_0= 'left' )
                    // InternalMyDsl.g:3697:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3704:3: (enumLiteral_1= 'right' )
                    {
                    // InternalMyDsl.g:3704:3: (enumLiteral_1= 'right' )
                    // InternalMyDsl.g:3705:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3712:3: (enumLiteral_2= 'center' )
                    {
                    // InternalMyDsl.g:3712:3: (enumLiteral_2= 'center' )
                    // InternalMyDsl.g:3713:4: enumLiteral_2= 'center'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3720:3: (enumLiteral_3= 'top' )
                    {
                    // InternalMyDsl.g:3720:3: (enumLiteral_3= 'top' )
                    // InternalMyDsl.g:3721:4: enumLiteral_3= 'top'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3728:3: (enumLiteral_4= 'bottom' )
                    {
                    // InternalMyDsl.g:3728:3: (enumLiteral_4= 'bottom' )
                    // InternalMyDsl.g:3729:4: enumLiteral_4= 'bottom'
                    {
                    enumLiteral_4=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getBottomEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPositionOptionsAccess().getBottomEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "rulePositionOptions"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\55\uffff";
    static final String dfa_2s = "\1\4\1\26\1\uffff\1\5\1\14\2\12\1\31\1\5\1\uffff\1\14\2\12\1\32\5\5\3\uffff\1\124\4\14\15\12\1\50\1\51\1\52\1\53\1\54";
    static final String dfa_3s = "\1\4\1\62\1\uffff\1\5\1\15\2\12\1\36\1\5\1\uffff\1\15\2\12\1\61\5\5\3\uffff\1\130\4\15\15\12\1\61\4\60";
    static final String dfa_4s = "\2\uffff\1\5\6\uffff\1\1\11\uffff\1\3\1\2\1\4\27\uffff";
    static final String dfa_5s = "\55\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\33\uffff\1\2",
            "",
            "\1\4",
            "\1\5\1\6",
            "\1\7",
            "\1\7",
            "\1\10\5\11",
            "\1\12",
            "",
            "\1\13\1\14",
            "\1\15",
            "\1\15",
            "\5\11\10\uffff\1\16\1\17\1\20\1\21\1\22\3\24\1\uffff\1\23\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "",
            "",
            "\1\33\1\34\1\35\1\36\1\37",
            "\1\40\1\41",
            "\1\42\1\43",
            "\1\44\1\45",
            "\1\46\1\47",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\51",
            "\1\51",
            "\1\52",
            "\1\52",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\54",
            "\1\17\1\20\1\21\1\22\3\24\1\uffff\1\23\1\25",
            "\1\20\1\21\1\22\3\24\1\uffff\1\23",
            "\1\21\1\22\3\24\1\uffff\1\23",
            "\1\22\3\24\1\uffff\1\23",
            "\3\24\1\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "510:2: (this_Table_0= ruleTable | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_RadarChart_3= ruleRadarChart | this_PieChart_4= rulePieChart )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x8000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000FA0000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F20000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000E20000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E00000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00000200L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000200L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007202000200L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007200000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006200000200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004200000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000200L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00007F8000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00007F0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00010F8000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00010F0000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00010E0000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00010C0000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002008000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000408002000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00F8400000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00F0400000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x00000000000FFFE0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00E0400000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00C0400000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x6000000000000200L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x4000000000000200L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});

}