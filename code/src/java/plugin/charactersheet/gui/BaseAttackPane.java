/*
 * CombatPane1.java
 *
 * Created on February 3, 2004, 9:54 AM
 */

package plugin.charactersheet.gui;

import gmgen.gui.GridBoxLayout;
import pcgen.core.PlayerCharacter;
import pcgen.io.exporttoken.AttackToken;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.Font;

/**
 * Confirmed no memory Leaks Dec 10, 2004
 * @author  ddjone3
 */
public class BaseAttackPane extends JPanel
{
	private PlayerCharacter pc;

	private static final String GRAPPLE = "GRAPPLE";
	private static final String MELEE = "MELEE";
	private static final String RANGED = "RANGED";
	private static final String EPIC_TOKEN = "EPIC";
	private static final String MISC_TOKEN = "MISC";
	private static final String SIZE_TOKEN = "SIZE";
	private static final String STAT_TOKEN = "STAT";
	private static final String TOTAL_TOKEN = "TOTAL";
	private static final String PLUS_ZERO = "+0";
	private static final String BLANK = "";
	private static final String SPACE = " ";
	private static final String EQUALS = "=";
	private static final String PLUS = "+";
	private static final String TOTAL = "Total";
	private static final String BAB = "Base Attack Bonus";
	private static final String STAT = "Stat";
	private static final String SIZE = "Size";
	private static final String MISC = "Misc";
	private static final String EPIC = "Epic";
	private static final String TEMP = "Temp";
	private static final String DIALOG = "Dialog";

	private static final Font FONT_NINE = new Font(DIALOG, 0, 9);
	private static final Font FONT_TEN = new Font(DIALOG, 0, 10);

	private JLabel totalLabel;
	private JLabel babLabel;
	private JLabel statLabel;
	private JLabel sizeLabel;
	private JLabel miscLabel;
	private JLabel epicLabel;
	private JLabel tempLabel;

	private JLabel meleeLabel;
	private JPanel meleePanel;
	private JLabel meleeTotal;
	private JPanel meleeTotalPanel;
	private JLabel meleeBab;
	private JPanel meleeBabPanel;
	private JLabel meleeStat;
	private JPanel meleeStatPanel;
	private JLabel meleeSize;
	private JPanel meleeSizePanel;
	private JLabel meleeMisc;
	private JPanel meleeMiscPanel;
	private JLabel meleeEpic;
	private JPanel meleeEpicPanel;
	private JLabel meleeTemp;
	private JPanel meleeTempPanel;

	private JLabel rangedLabel;
	private JPanel rangedPanel;
	private JLabel rangedTotal;
	private JPanel rangedTotalPanel;
	private JLabel rangedBab;
	private JPanel rangedBabPanel;
	private JLabel rangedSize;
	private JPanel rangedSizePanel;
	private JLabel rangedStat;
	private JPanel rangedStatPanel;
	private JLabel rangedMisc;
	private JPanel rangedMiscPanel;
	private JLabel rangedEpic;
	private JPanel rangedEpicPanel;
	private JLabel rangedTemp;
	private JPanel rangedTempPanel;

	private JLabel grappleLabel;
	private JPanel grapplePanel;
	private JLabel grappleTotal;
	private JPanel grappleTotalPanel;
	private JLabel grappleBab;
	private JPanel grappleBabPanel;
	private JLabel grappleStat;
	private JPanel grappleStatPanel;
	private JLabel grappleSize;
	private JPanel grappleSizePanel;
	private JLabel grappleMisc;
	private JPanel grappleMiscPanel;
	private JLabel grappleEpic;
	private JPanel grappleEpicPanel;
	private JLabel grappleTemp;
	private JPanel grappleTempPanel;

	/** Creates new form CombatPane1 */
	public BaseAttackPane()
	{
		initComponents();
		setColor();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents()
	{
		totalLabel = new JLabel();
		babLabel = new JLabel();
		statLabel = new JLabel();
		sizeLabel = new JLabel();
		miscLabel = new JLabel();
		epicLabel = new JLabel();
		tempLabel = new JLabel();

		meleePanel = new JPanel();
		meleeLabel = new JLabel();
		meleeTotalPanel = new JPanel();
		meleeTotal = new JLabel();
		meleeBabPanel = new JPanel();
		meleeBab = new JLabel();
		meleeStatPanel = new JPanel();
		meleeStat = new JLabel();
		meleeSizePanel = new JPanel();
		meleeSize = new JLabel();
		meleeMiscPanel = new JPanel();
		meleeMisc = new JLabel();
		meleeEpicPanel = new JPanel();
		meleeEpic = new JLabel();
		meleeTempPanel = new JPanel();
		meleeTemp = new JLabel();

		rangedPanel = new JPanel();
		rangedLabel = new JLabel();
		rangedTotalPanel = new JPanel();
		rangedTotal = new JLabel();
		rangedBabPanel = new JPanel();
		rangedBab = new JLabel();
		rangedStatPanel = new JPanel();
		rangedStat = new JLabel();
		rangedSizePanel = new JPanel();
		rangedSize = new JLabel();
		rangedMiscPanel = new JPanel();
		rangedMisc = new JLabel();
		rangedEpicPanel = new JPanel();
		rangedEpic = new JLabel();
		rangedTempPanel = new JPanel();
		rangedTemp = new JLabel();

		grapplePanel = new JPanel();
		grappleLabel = new JLabel();
		grappleTotalPanel = new JPanel();
		grappleTotal = new JLabel();
		grappleBabPanel = new JPanel();
		grappleBab = new JLabel();
		grappleStatPanel = new JPanel();
		grappleStat = new JLabel();
		grappleSizePanel = new JPanel();
		grappleSize = new JLabel();
		grappleMiscPanel = new JPanel();
		grappleMisc = new JLabel();
		grappleEpicPanel = new JPanel();
		grappleEpic = new JLabel();
		grappleTempPanel = new JPanel();
		grappleTemp = new JLabel();

		setLayout(new GridBoxLayout(0, 14, 2, 1));

		//Row 1
		//Col 1
		add(new JLabel());
		//Col 2
		totalLabel.setFont(FONT_NINE);
		totalLabel.setText(TOTAL);
		add(totalLabel);
		//Col 3
		add(new JLabel());
		//Col 4
		babLabel.setFont(FONT_NINE);
		babLabel.setText(BAB);
		add(babLabel);
		//Col 5
		add(new JLabel());
		//Col 6
		statLabel.setFont(FONT_NINE);
		statLabel.setText(STAT);
		add(statLabel);
		//Col 7
		add(new JLabel());
		//Col 8
		sizeLabel.setFont(FONT_NINE);
		sizeLabel.setText(SIZE);
		add(sizeLabel);
		//Col 9
		add(new JLabel());
		//Col 10
		miscLabel.setFont(FONT_NINE);
		miscLabel.setText(MISC);
		add(miscLabel);
		//Col 11
		add(new JLabel());
		//Col 12
		epicLabel.setFont(FONT_NINE);
		epicLabel.setText(EPIC);
		add(epicLabel);
		//Col 13
		add(new JLabel());
		//Col 14
		tempLabel.setFont(FONT_NINE);
		tempLabel.setText(TEMP);
		add(tempLabel);

		//Row 2
		//Col 1
		meleePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		meleeLabel.setText(MELEE);
		meleePanel.add(meleeLabel);
		add(meleePanel);
		//Col 2
		add(getBonusPanel(meleeTotalPanel, meleeTotal, 1));
		//Col 3
		add(new JLabel(EQUALS));
		//Col 4
		add(getBonusPanel(meleeBabPanel, meleeBab, 1));
		//Col 5
		add(new JLabel(PLUS));
		//Col 6
		add(getBonusPanel(meleeStatPanel, meleeStat, 2));
		//Col 7
		add(new JLabel(PLUS));
		//Col 8
		add(getBonusPanel(meleeSizePanel, meleeSize, 2));
		//Col 9
		add(new JLabel(PLUS));
		//Col 10
		add(getBonusPanel(meleeMiscPanel, meleeMisc, 2));
		//Col 11
		add(new JLabel(PLUS));
		//Col 12
		add(getBonusPanel(meleeEpicPanel, meleeEpic, 2));
		//Col 13
		add(new JLabel(PLUS));
		//Col 14
		add(getBonusPanel(meleeTempPanel, meleeTemp, 2));

		//Row 3
		//Col 1
		rangedPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		rangedLabel.setText(RANGED);
		rangedPanel.add(rangedLabel);
		add(rangedPanel);
		//Col 2
		add(getBonusPanel(rangedTotalPanel, rangedTotal, 1));
		//Col 3
		add(new JLabel(EQUALS));
		//Col 4
		add(getBonusPanel(rangedBabPanel, rangedBab, 1));
		//Col 5
		add(new JLabel(PLUS));
		//Col 6
		add(getBonusPanel(rangedStatPanel, rangedStat, 2));
		//Col 7
		add(new JLabel(PLUS));
		//Col 8
		add(getBonusPanel(rangedSizePanel, rangedSize, 2));
		//Col 9
		add(new JLabel(PLUS));
		//Col 10
		add(getBonusPanel(rangedMiscPanel, rangedMisc, 2));
		//Col 11
		add(new JLabel(PLUS));
		//Col 12
		add(getBonusPanel(rangedEpicPanel, rangedEpic, 2));
		//Col 13
		add(new JLabel(PLUS));
		//Col 14
		add(getBonusPanel(rangedTempPanel, rangedTemp, 2));

		//Row 4
		//Col 1
		grapplePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		grappleLabel.setText(GRAPPLE);
		grapplePanel.add(grappleLabel);
		add(grapplePanel);
		//Col 2
		add(getBonusPanel(grappleTotalPanel, grappleTotal, 1));
		//Col 3
		add(new JLabel(EQUALS));
		//Col 4
		add(getBonusPanel(grappleBabPanel, grappleBab, 1));
		//Col 5
		add(new JLabel(PLUS));
		//Col 6
		add(getBonusPanel(grappleStatPanel, grappleStat, 2));
		//Col 7
		add(new JLabel(PLUS));
		//Col 8
		add(getBonusPanel(grappleSizePanel, grappleSize, 2));
		//Col 9
		add(new JLabel(PLUS));
		//Col 10
		add(getBonusPanel(grappleMiscPanel, grappleMisc, 2));
		//Col 11
		add(new JLabel(PLUS));
		//Col 12
		add(getBonusPanel(grappleEpicPanel, grappleEpic, 2));
		//Col 13
		add(new JLabel(PLUS));
		//Col 14
		add(getBonusPanel(grappleTempPanel, grappleTemp, 2));
	}

	private JPanel getBonusPanel(JPanel panel, JLabel label, int buffer)
	{
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, buffer, 0));
		label.setFont(FONT_TEN);
		label.setText(SPACE);
		panel.add(label);
		return panel;
	}

	/**
	 * setColor
	 */
	public void setColor()
	{
		setBackground(CharacterPanel.white);
		meleeBabPanel.setBackground(CharacterPanel.white);
		grappleTotalPanel.setBackground(CharacterPanel.bodyLight);
		meleeStatPanel.setBackground(CharacterPanel.white);
		rangedStatPanel.setBackground(CharacterPanel.white);
		meleeSizePanel.setBackground(CharacterPanel.white);
		grappleBabPanel.setBackground(CharacterPanel.white);
		rangedSizePanel.setBackground(CharacterPanel.white);
		grappleMiscPanel.setBackground(CharacterPanel.white);
		grappleStatPanel.setBackground(CharacterPanel.white);
		rangedMiscPanel.setBackground(CharacterPanel.white);
		meleeMiscPanel.setBackground(CharacterPanel.white);
		meleeEpicPanel.setBackground(CharacterPanel.white);
		rangedEpicPanel.setBackground(CharacterPanel.white);
		meleeTempPanel.setBackground(CharacterPanel.white);
		meleeTempPanel.setForeground(CharacterPanel.darkGrey);
		grappleSizePanel.setBackground(CharacterPanel.white);
		rangedTempPanel.setBackground(CharacterPanel.white);
		rangedTempPanel.setForeground(CharacterPanel.darkGrey);
		grappleTempPanel.setBackground(CharacterPanel.white);
		grappleTempPanel.setForeground(CharacterPanel.darkGrey);
		grappleEpicPanel.setBackground(CharacterPanel.white);
		rangedTotalPanel.setBackground(CharacterPanel.bodyLight);
		meleePanel.setBackground(CharacterPanel.header);
		rangedBabPanel.setBackground(CharacterPanel.white);
		rangedPanel.setBackground(CharacterPanel.header);
		grapplePanel.setBackground(CharacterPanel.header);
		meleeTotalPanel.setBackground(CharacterPanel.bodyLight);
		meleeTemp.setForeground(CharacterPanel.darkGrey);
		rangedTemp.setForeground(CharacterPanel.darkGrey);
		grappleTemp.setForeground(CharacterPanel.darkGrey);
		meleeBabPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		grappleTotalPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		meleeStatPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedStatPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		meleeSizePanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		grappleBabPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedSizePanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		grappleMiscPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		grappleStatPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedMiscPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		meleeMiscPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		meleeEpicPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedEpicPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		meleeTempPanel.setBorder(new LineBorder(CharacterPanel.lightGrey, 2));
		grappleSizePanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedTempPanel.setBorder(new LineBorder(CharacterPanel.lightGrey, 2));
		grappleTempPanel.setBorder(new LineBorder(CharacterPanel.lightGrey, 2));
		grappleEpicPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedTotalPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		meleePanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedBabPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		rangedPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		grapplePanel.setBorder(new LineBorder(CharacterPanel.border, 2));
		meleeTotalPanel.setBorder(new LineBorder(CharacterPanel.border, 2));
	}

	/**
	 * Set the pc
	 * @param pc
	 */
	public void setPc(PlayerCharacter pc)
	{
		this.pc = pc;
	}

	/**
	 * Refresh
	 */
	public void refresh()
	{
		grappleBab.setText(AttackToken.getParsedToken(pc, GRAPPLE, BLANK));
		grappleEpic
			.setText(AttackToken.getParsedToken(pc, GRAPPLE, EPIC_TOKEN));
		grappleMisc
			.setText(AttackToken.getParsedToken(pc, GRAPPLE, MISC_TOKEN));
		grappleSize
			.setText(AttackToken.getParsedToken(pc, GRAPPLE, SIZE_TOKEN));
		grappleStat
			.setText(AttackToken.getParsedToken(pc, GRAPPLE, STAT_TOKEN));
		grappleTotal.setText(AttackToken.getParsedToken(pc, GRAPPLE,
			TOTAL_TOKEN));
		grappleTemp.setText(PLUS_ZERO);

		meleeBab.setText(AttackToken.getParsedToken(pc, MELEE, BLANK));
		meleeEpic.setText(AttackToken.getParsedToken(pc, MELEE, EPIC_TOKEN));
		meleeMisc.setText(AttackToken.getParsedToken(pc, MELEE, MISC_TOKEN));
		meleeSize.setText(AttackToken.getParsedToken(pc, MELEE, SIZE_TOKEN));
		meleeStat.setText(AttackToken.getParsedToken(pc, MELEE, STAT_TOKEN));
		meleeTotal.setText(AttackToken.getParsedToken(pc, MELEE, TOTAL_TOKEN));
		meleeTemp.setText(PLUS_ZERO);

		rangedBab.setText(AttackToken.getParsedToken(pc, RANGED, BLANK));
		rangedEpic.setText(AttackToken.getParsedToken(pc, RANGED, EPIC_TOKEN));
		rangedMisc.setText(AttackToken.getParsedToken(pc, RANGED, MISC_TOKEN));
		rangedSize.setText(AttackToken.getParsedToken(pc, RANGED, SIZE_TOKEN));
		rangedStat.setText(AttackToken.getParsedToken(pc, RANGED, STAT_TOKEN));
		rangedTotal
			.setText(AttackToken.getParsedToken(pc, RANGED, TOTAL_TOKEN));
		rangedTemp.setText(PLUS_ZERO);
	}

	/**
	 * Destroy
	 */
	public void destruct()
	{
		//Put any code here that is needed to prevent memory leaks when this panel is destroyed
	}
}
