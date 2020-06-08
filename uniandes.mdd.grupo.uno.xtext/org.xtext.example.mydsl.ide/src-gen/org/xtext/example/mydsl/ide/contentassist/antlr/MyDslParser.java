/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getDBSystemAccess().getAlternatives(), "rule__DBSystem__Alternatives");
					put(grammarAccess.getColorsAccess().getAlternatives(), "rule__Colors__Alternatives");
					put(grammarAccess.getPositionOptionsAccess().getAlternatives(), "rule__PositionOptions__Alternatives");
					put(grammarAccess.getCompanyAccess().getGroup(), "rule__Company__Group__0");
					put(grammarAccess.getCompanyAccess().getGroup_2(), "rule__Company__Group_2__0");
					put(grammarAccess.getCompanyAccess().getGroup_8(), "rule__Company__Group_8__0");
					put(grammarAccess.getCompanyAccess().getGroup_14(), "rule__Company__Group_14__0");
					put(grammarAccess.getDashboardAccess().getGroup(), "rule__Dashboard__Group__0");
					put(grammarAccess.getDashboardAccess().getGroup_9(), "rule__Dashboard__Group_9__0");
					put(grammarAccess.getPanelAccess().getGroup(), "rule__Panel__Group__0");
					put(grammarAccess.getPanelAccess().getGroup_9(), "rule__Panel__Group_9__0");
					put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
					put(grammarAccess.getTableAccess().getGroup_5(), "rule__Table__Group_5__0");
					put(grammarAccess.getTableAccess().getGroup_6(), "rule__Table__Group_6__0");
					put(grammarAccess.getTableAccess().getGroup_7(), "rule__Table__Group_7__0");
					put(grammarAccess.getTableAccess().getGroup_8(), "rule__Table__Group_8__0");
					put(grammarAccess.getTableAccess().getGroup_9(), "rule__Table__Group_9__0");
					put(grammarAccess.getTableAccess().getGroup_14(), "rule__Table__Group_14__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_6(), "rule__Action__Group_6__0");
					put(grammarAccess.getActionAccess().getGroup_7(), "rule__Action__Group_7__0");
					put(grammarAccess.getActionAccess().getGroup_8(), "rule__Action__Group_8__0");
					put(grammarAccess.getActionAccess().getGroup_9(), "rule__Action__Group_9__0");
					put(grammarAccess.getActionAccess().getGroup_10(), "rule__Action__Group_10__0");
					put(grammarAccess.getActionAccess().getGroup_11(), "rule__Action__Group_11__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getColumnAccess().getGroup_6(), "rule__Column__Group_6__0");
					put(grammarAccess.getColumnAccess().getGroup_7(), "rule__Column__Group_7__0");
					put(grammarAccess.getColumnAccess().getGroup_8(), "rule__Column__Group_8__0");
					put(grammarAccess.getColumnAccess().getGroup_9(), "rule__Column__Group_9__0");
					put(grammarAccess.getColumnAccess().getGroup_10(), "rule__Column__Group_10__0");
					put(grammarAccess.getLineChartAccess().getGroup(), "rule__LineChart__Group__0");
					put(grammarAccess.getLineChartAccess().getGroup_5(), "rule__LineChart__Group_5__0");
					put(grammarAccess.getLineChartAccess().getGroup_6(), "rule__LineChart__Group_6__0");
					put(grammarAccess.getLineChartAccess().getGroup_7(), "rule__LineChart__Group_7__0");
					put(grammarAccess.getLineChartAccess().getGroup_8(), "rule__LineChart__Group_8__0");
					put(grammarAccess.getLineChartAccess().getGroup_9(), "rule__LineChart__Group_9__0");
					put(grammarAccess.getLineChartAccess().getGroup_10(), "rule__LineChart__Group_10__0");
					put(grammarAccess.getLineChartAccess().getGroup_11(), "rule__LineChart__Group_11__0");
					put(grammarAccess.getLineChartAccess().getGroup_12(), "rule__LineChart__Group_12__0");
					put(grammarAccess.getLineChartAccess().getGroup_17(), "rule__LineChart__Group_17__0");
					put(grammarAccess.getLineChartAccess().getGroup_23(), "rule__LineChart__Group_23__0");
					put(grammarAccess.getBarChartAccess().getGroup(), "rule__BarChart__Group__0");
					put(grammarAccess.getBarChartAccess().getGroup_5(), "rule__BarChart__Group_5__0");
					put(grammarAccess.getBarChartAccess().getGroup_6(), "rule__BarChart__Group_6__0");
					put(grammarAccess.getBarChartAccess().getGroup_7(), "rule__BarChart__Group_7__0");
					put(grammarAccess.getBarChartAccess().getGroup_8(), "rule__BarChart__Group_8__0");
					put(grammarAccess.getBarChartAccess().getGroup_9(), "rule__BarChart__Group_9__0");
					put(grammarAccess.getBarChartAccess().getGroup_10(), "rule__BarChart__Group_10__0");
					put(grammarAccess.getBarChartAccess().getGroup_11(), "rule__BarChart__Group_11__0");
					put(grammarAccess.getBarChartAccess().getGroup_12(), "rule__BarChart__Group_12__0");
					put(grammarAccess.getBarChartAccess().getGroup_13(), "rule__BarChart__Group_13__0");
					put(grammarAccess.getBarChartAccess().getGroup_18(), "rule__BarChart__Group_18__0");
					put(grammarAccess.getBarChartAccess().getGroup_24(), "rule__BarChart__Group_24__0");
					put(grammarAccess.getRadarChartAccess().getGroup(), "rule__RadarChart__Group__0");
					put(grammarAccess.getRadarChartAccess().getGroup_5(), "rule__RadarChart__Group_5__0");
					put(grammarAccess.getRadarChartAccess().getGroup_6(), "rule__RadarChart__Group_6__0");
					put(grammarAccess.getRadarChartAccess().getGroup_7(), "rule__RadarChart__Group_7__0");
					put(grammarAccess.getRadarChartAccess().getGroup_12(), "rule__RadarChart__Group_12__0");
					put(grammarAccess.getRadarChartAccess().getGroup_18(), "rule__RadarChart__Group_18__0");
					put(grammarAccess.getPieChartAccess().getGroup(), "rule__PieChart__Group__0");
					put(grammarAccess.getPieChartAccess().getGroup_6(), "rule__PieChart__Group_6__0");
					put(grammarAccess.getPieChartAccess().getGroup_7(), "rule__PieChart__Group_7__0");
					put(grammarAccess.getPieChartAccess().getGroup_12(), "rule__PieChart__Group_12__0");
					put(grammarAccess.getPieChartAccess().getGroup_18(), "rule__PieChart__Group_18__0");
					put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
					put(grammarAccess.getDataAccess().getGroup_5(), "rule__Data__Group_5__0");
					put(grammarAccess.getDataAccess().getGroup_6(), "rule__Data__Group_6__0");
					put(grammarAccess.getDataAccess().getGroup_7(), "rule__Data__Group_7__0");
					put(grammarAccess.getDataAccess().getGroup_8(), "rule__Data__Group_8__0");
					put(grammarAccess.getDataAccess().getGroup_9(), "rule__Data__Group_9__0");
					put(grammarAccess.getDataAccess().getGroup_14(), "rule__Data__Group_14__0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getDBServerAccess().getGroup(), "rule__DBServer__Group__0");
					put(grammarAccess.getDBServerAccess().getGroup_5(), "rule__DBServer__Group_5__0");
					put(grammarAccess.getDBServerAccess().getGroup_6(), "rule__DBServer__Group_6__0");
					put(grammarAccess.getDBServerAccess().getGroup_7(), "rule__DBServer__Group_7__0");
					put(grammarAccess.getDBServerAccess().getGroup_12(), "rule__DBServer__Group_12__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_10(), "rule__Entity__Group_10__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_6(), "rule__Attribute__Group_6__0");
					put(grammarAccess.getAttributeAccess().getGroup_7(), "rule__Attribute__Group_7__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getCompanyAccess().getNameAssignment_1(), "rule__Company__NameAssignment_1");
					put(grammarAccess.getCompanyAccess().getNitAssignment_2_1(), "rule__Company__NitAssignment_2_1");
					put(grammarAccess.getCompanyAccess().getDashboardsAssignment_7(), "rule__Company__DashboardsAssignment_7");
					put(grammarAccess.getCompanyAccess().getDashboardsAssignment_8_1(), "rule__Company__DashboardsAssignment_8_1");
					put(grammarAccess.getCompanyAccess().getDBServersAssignment_13(), "rule__Company__DBServersAssignment_13");
					put(grammarAccess.getCompanyAccess().getDBServersAssignment_14_1(), "rule__Company__DBServersAssignment_14_1");
					put(grammarAccess.getDashboardAccess().getNameAssignment_3(), "rule__Dashboard__NameAssignment_3");
					put(grammarAccess.getDashboardAccess().getPanelsAssignment_8(), "rule__Dashboard__PanelsAssignment_8");
					put(grammarAccess.getDashboardAccess().getPanelsAssignment_9_1(), "rule__Dashboard__PanelsAssignment_9_1");
					put(grammarAccess.getPanelAccess().getNameAssignment_3(), "rule__Panel__NameAssignment_3");
					put(grammarAccess.getPanelAccess().getElementsAssignment_8(), "rule__Panel__ElementsAssignment_8");
					put(grammarAccess.getPanelAccess().getElementsAssignment_9_1(), "rule__Panel__ElementsAssignment_9_1");
					put(grammarAccess.getTableAccess().getNameAssignment_3(), "rule__Table__NameAssignment_3");
					put(grammarAccess.getTableAccess().getTitleAssignment_5_2(), "rule__Table__TitleAssignment_5_2");
					put(grammarAccess.getTableAccess().getRegistersPerPageAssignment_6_2(), "rule__Table__RegistersPerPageAssignment_6_2");
					put(grammarAccess.getTableAccess().getActionsAssignment_7_2(), "rule__Table__ActionsAssignment_7_2");
					put(grammarAccess.getTableAccess().getSearchAssignment_8_0(), "rule__Table__SearchAssignment_8_0");
					put(grammarAccess.getTableAccess().getAddAssignment_9_0(), "rule__Table__AddAssignment_9_0");
					put(grammarAccess.getTableAccess().getColumnsAssignment_13(), "rule__Table__ColumnsAssignment_13");
					put(grammarAccess.getTableAccess().getColumnsAssignment_14_1(), "rule__Table__ColumnsAssignment_14_1");
					put(grammarAccess.getActionAccess().getNameAssignment_4(), "rule__Action__NameAssignment_4");
					put(grammarAccess.getActionAccess().getColumnTitleAssignment_6_2(), "rule__Action__ColumnTitleAssignment_6_2");
					put(grammarAccess.getActionAccess().getPositionAssignment_7_2(), "rule__Action__PositionAssignment_7_2");
					put(grammarAccess.getActionAccess().getAddAssignment_8_0(), "rule__Action__AddAssignment_8_0");
					put(grammarAccess.getActionAccess().getFilterAssignment_9_0(), "rule__Action__FilterAssignment_9_0");
					put(grammarAccess.getActionAccess().getEditAssignment_10_0(), "rule__Action__EditAssignment_10_0");
					put(grammarAccess.getActionAccess().getDeletAssignment_11_0(), "rule__Action__DeletAssignment_11_0");
					put(grammarAccess.getColumnAccess().getNameAssignment_4(), "rule__Column__NameAssignment_4");
					put(grammarAccess.getColumnAccess().getTitleAssignment_6_2(), "rule__Column__TitleAssignment_6_2");
					put(grammarAccess.getColumnAccess().getSourceAssignment_7_2(), "rule__Column__SourceAssignment_7_2");
					put(grammarAccess.getColumnAccess().getAttributeAssignment_8_2(), "rule__Column__AttributeAssignment_8_2");
					put(grammarAccess.getColumnAccess().getFilterAssignment_9_0(), "rule__Column__FilterAssignment_9_0");
					put(grammarAccess.getColumnAccess().getEditableAssignment_10_0(), "rule__Column__EditableAssignment_10_0");
					put(grammarAccess.getLineChartAccess().getNameAssignment_3(), "rule__LineChart__NameAssignment_3");
					put(grammarAccess.getLineChartAccess().getTitleAssignment_5_2(), "rule__LineChart__TitleAssignment_5_2");
					put(grammarAccess.getLineChartAccess().getLegendPositionAssignment_6_2(), "rule__LineChart__LegendPositionAssignment_6_2");
					put(grammarAccess.getLineChartAccess().getLabelStringXAxesAssignment_7_2(), "rule__LineChart__LabelStringXAxesAssignment_7_2");
					put(grammarAccess.getLineChartAccess().getColorGridLinesXAxesAssignment_8_2(), "rule__LineChart__ColorGridLinesXAxesAssignment_8_2");
					put(grammarAccess.getLineChartAccess().getLabelStringYAxesAssignment_9_2(), "rule__LineChart__LabelStringYAxesAssignment_9_2");
					put(grammarAccess.getLineChartAccess().getColorGridLinesYAxesAssignment_10_2(), "rule__LineChart__ColorGridLinesYAxesAssignment_10_2");
					put(grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesAssignment_11_0(), "rule__LineChart__DisplayGridLinesXAxesAssignment_11_0");
					put(grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesAssignment_12_0(), "rule__LineChart__DisplayGridLinesYAxesAssignment_12_0");
					put(grammarAccess.getLineChartAccess().getDataAssignment_16(), "rule__LineChart__DataAssignment_16");
					put(grammarAccess.getLineChartAccess().getDataAssignment_17_1(), "rule__LineChart__DataAssignment_17_1");
					put(grammarAccess.getLineChartAccess().getLabelsAssignment_22(), "rule__LineChart__LabelsAssignment_22");
					put(grammarAccess.getLineChartAccess().getLabelsAssignment_23_1(), "rule__LineChart__LabelsAssignment_23_1");
					put(grammarAccess.getBarChartAccess().getNameAssignment_3(), "rule__BarChart__NameAssignment_3");
					put(grammarAccess.getBarChartAccess().getTitleAssignment_5_2(), "rule__BarChart__TitleAssignment_5_2");
					put(grammarAccess.getBarChartAccess().getLegendPositionAssignment_6_2(), "rule__BarChart__LegendPositionAssignment_6_2");
					put(grammarAccess.getBarChartAccess().getLabelStringXAxesAssignment_7_2(), "rule__BarChart__LabelStringXAxesAssignment_7_2");
					put(grammarAccess.getBarChartAccess().getColorGridLinesXAxesAssignment_8_2(), "rule__BarChart__ColorGridLinesXAxesAssignment_8_2");
					put(grammarAccess.getBarChartAccess().getLabelStringYAxesAssignment_9_2(), "rule__BarChart__LabelStringYAxesAssignment_9_2");
					put(grammarAccess.getBarChartAccess().getColorGridLinesYAxesAssignment_10_2(), "rule__BarChart__ColorGridLinesYAxesAssignment_10_2");
					put(grammarAccess.getBarChartAccess().getBarPercentageAssignment_11_2(), "rule__BarChart__BarPercentageAssignment_11_2");
					put(grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesAssignment_12_0(), "rule__BarChart__DisplayGridLinesXAxesAssignment_12_0");
					put(grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesAssignment_13_0(), "rule__BarChart__DisplayGridLinesYAxesAssignment_13_0");
					put(grammarAccess.getBarChartAccess().getDataAssignment_17(), "rule__BarChart__DataAssignment_17");
					put(grammarAccess.getBarChartAccess().getDataAssignment_18_1(), "rule__BarChart__DataAssignment_18_1");
					put(grammarAccess.getBarChartAccess().getLabelsAssignment_23(), "rule__BarChart__LabelsAssignment_23");
					put(grammarAccess.getBarChartAccess().getLabelsAssignment_24_1(), "rule__BarChart__LabelsAssignment_24_1");
					put(grammarAccess.getRadarChartAccess().getNameAssignment_3(), "rule__RadarChart__NameAssignment_3");
					put(grammarAccess.getRadarChartAccess().getTitleAssignment_5_2(), "rule__RadarChart__TitleAssignment_5_2");
					put(grammarAccess.getRadarChartAccess().getLegendPositionAssignment_6_2(), "rule__RadarChart__LegendPositionAssignment_6_2");
					put(grammarAccess.getRadarChartAccess().getAngleLinesDisplayAssignment_7_0(), "rule__RadarChart__AngleLinesDisplayAssignment_7_0");
					put(grammarAccess.getRadarChartAccess().getDataAssignment_11(), "rule__RadarChart__DataAssignment_11");
					put(grammarAccess.getRadarChartAccess().getDataAssignment_12_1(), "rule__RadarChart__DataAssignment_12_1");
					put(grammarAccess.getRadarChartAccess().getLabelsAssignment_17(), "rule__RadarChart__LabelsAssignment_17");
					put(grammarAccess.getRadarChartAccess().getLabelsAssignment_18_1(), "rule__RadarChart__LabelsAssignment_18_1");
					put(grammarAccess.getPieChartAccess().getNameAssignment_4(), "rule__PieChart__NameAssignment_4");
					put(grammarAccess.getPieChartAccess().getTitleAssignment_6_2(), "rule__PieChart__TitleAssignment_6_2");
					put(grammarAccess.getPieChartAccess().getLegendPositionAssignment_7_2(), "rule__PieChart__LegendPositionAssignment_7_2");
					put(grammarAccess.getPieChartAccess().getDataAssignment_11(), "rule__PieChart__DataAssignment_11");
					put(grammarAccess.getPieChartAccess().getDataAssignment_12_1(), "rule__PieChart__DataAssignment_12_1");
					put(grammarAccess.getPieChartAccess().getLabelsAssignment_17(), "rule__PieChart__LabelsAssignment_17");
					put(grammarAccess.getPieChartAccess().getLabelsAssignment_18_1(), "rule__PieChart__LabelsAssignment_18_1");
					put(grammarAccess.getDataAccess().getNameAssignment_3(), "rule__Data__NameAssignment_3");
					put(grammarAccess.getDataAccess().getCategoryAssignment_5_2(), "rule__Data__CategoryAssignment_5_2");
					put(grammarAccess.getDataAccess().getBorderColorAssignment_6_2(), "rule__Data__BorderColorAssignment_6_2");
					put(grammarAccess.getDataAccess().getBackgroundColorAssignment_7_2(), "rule__Data__BackgroundColorAssignment_7_2");
					put(grammarAccess.getDataAccess().getBorderDashAssignment_8_2(), "rule__Data__BorderDashAssignment_8_2");
					put(grammarAccess.getDataAccess().getFillAssignment_9_0(), "rule__Data__FillAssignment_9_0");
					put(grammarAccess.getDataAccess().getDataAssignment_13(), "rule__Data__DataAssignment_13");
					put(grammarAccess.getDataAccess().getDataAssignment_14_1(), "rule__Data__DataAssignment_14_1");
					put(grammarAccess.getLabelAccess().getNameAssignment_4(), "rule__Label__NameAssignment_4");
					put(grammarAccess.getDBServerAccess().getNameAssignment_3(), "rule__DBServer__NameAssignment_3");
					put(grammarAccess.getDBServerAccess().getSystemManagerAssignment_5_2(), "rule__DBServer__SystemManagerAssignment_5_2");
					put(grammarAccess.getDBServerAccess().getTokenAssignment_6_2(), "rule__DBServer__TokenAssignment_6_2");
					put(grammarAccess.getDBServerAccess().getPasswordAssignment_7_2(), "rule__DBServer__PasswordAssignment_7_2");
					put(grammarAccess.getDBServerAccess().getRelatedEntitiesAssignment_11(), "rule__DBServer__RelatedEntitiesAssignment_11");
					put(grammarAccess.getDBServerAccess().getRelatedEntitiesAssignment_12_1(), "rule__DBServer__RelatedEntitiesAssignment_12_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_4(), "rule__Entity__NameAssignment_4");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_9(), "rule__Entity__AttributesAssignment_9");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_10_1(), "rule__Entity__AttributesAssignment_10_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_4(), "rule__Attribute__NameAssignment_4");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_6_1(), "rule__Attribute__TypeAssignment_6_1");
					put(grammarAccess.getAttributeAccess().getRequiredAssignment_7_0(), "rule__Attribute__RequiredAssignment_7_0");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleCompany();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}