package benutzerschnittstelle;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.EtchedBorder;

import steuerung.Steuerung;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import fachkonzept.Endstand;

import java.awt.Font;

@SuppressWarnings("serial")
public class Benutzerschnittstelle extends JFrame
{
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JPanel pnlGewinnkarte;
	private JPanel pnlWuerfel;

	private JLabel lblWuerfel1;
	private JLabel lblWuerfel2;
	private JLabel lblWuerfel3;
	private JLabel lblWuerfel4;
	private JLabel lblWuerfel5;
	private JLabel[] lblWuerfel;

	private JCheckBox cbxWuerfel1;
	private JCheckBox cbxWuerfel2;
	private JCheckBox cbxWuerfel3;
	private JCheckBox cbxWuerfel4;
	private JCheckBox cbxWuerfel5;
	private JCheckBox[] cbxWuerfel;

	private JTextField txtEinser;
	private JTextField txtZweier;
	private JTextField txtDreier;
	private JTextField txtVierer;
	private JTextField txtFuenfer;
	private JTextField txtSechser;
	private JTextField txtDreierpasch;
	private JTextField txtViererpasch;
	private JTextField txtFullHouse;
	private JTextField txtKleineStrasse;
	private JTextField txtGrosseStrasse;
	private JTextField txtKniffel;
	private JTextField txtChance;
	private JTextField[] txtFiguren;

	private JTextField txtSummeOben;
	private JTextField txtBonus;
	private JTextField txtSummeObenMitBonus;
	private JTextField txtSummeUnten;
	private JTextField txtEndsumme;
	private JTextField[] txtSummen;

	private JLabel lblBestenliste;
	private JLabel lblSummeOben;
	private JLabel lblBonus;
	private JLabel lblSummeObenMitBonus;
	private JLabel lblSummeUnten;
	private JLabel lblEndsumme;

	private JTextArea txtBestenliste;

	private JRadioButton rbtEinser;
	private JRadioButton rbtZweier;
	private JRadioButton rbtDreier;
	private JRadioButton rbtVierer;
	private JRadioButton rbtFuenfer;
	private JRadioButton rbtSechser;
	private JRadioButton rbtDreierpasch;
	private JRadioButton rbtViererpasch;
	private JRadioButton rbtFullHouse;
	private JRadioButton rbtKleineStrasse;
	private JRadioButton rbtGrosseStrasse;
	private JRadioButton rbtKniffel;
	private JRadioButton rbtChance;
	private JRadioButton[] rbtFiguren;

	private final ButtonGroup buttonGroup = new ButtonGroup();

	private JButton btnWuerfeln;
	private JButton btnEintragen;
	private JButton btnNeuesSpiel;

	private Steuerung dieSteuerung;

	public static void main(String[] args)
	{
		try
		{
			UIManager
					.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Benutzerschnittstelle frame = new Benutzerschnittstelle();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Benutzerschnittstelle()
	{
		setResizable(false);
		setTitle("Kniffel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pnlWuerfel = new JPanel();
		pnlWuerfel
				.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlWuerfel.setBounds(11, 11, 211, 150);
		contentPane.add(pnlWuerfel);
		pnlWuerfel.setLayout(null);

		lblWuerfel1 = new JLabel("");
		lblWuerfel1.setBounds(10, 11, 30, 30);
		pnlWuerfel.add(lblWuerfel1);

		lblWuerfel2 = new JLabel("");
		lblWuerfel2.setBounds(50, 11, 30, 30);
		pnlWuerfel.add(lblWuerfel2);

		lblWuerfel3 = new JLabel("");
		lblWuerfel3.setBounds(90, 11, 30, 30);
		pnlWuerfel.add(lblWuerfel3);

		lblWuerfel4 = new JLabel("");
		lblWuerfel4.setBounds(130, 11, 30, 30);
		pnlWuerfel.add(lblWuerfel4);

		lblWuerfel5 = new JLabel("");
		lblWuerfel5.setBounds(170, 11, 30, 30);
		pnlWuerfel.add(lblWuerfel5);

		cbxWuerfel1 = new JCheckBox("");
		cbxWuerfel1.setBounds(15, 49, 21, 23);
		pnlWuerfel.add(cbxWuerfel1);

		cbxWuerfel2 = new JCheckBox("");
		cbxWuerfel2.setBounds(55, 49, 21, 23);
		pnlWuerfel.add(cbxWuerfel2);

		cbxWuerfel3 = new JCheckBox("");
		cbxWuerfel3.setBounds(95, 49, 21, 23);
		pnlWuerfel.add(cbxWuerfel3);

		cbxWuerfel4 = new JCheckBox("");
		cbxWuerfel4.setBounds(135, 49, 21, 23);
		pnlWuerfel.add(cbxWuerfel4);

		cbxWuerfel5 = new JCheckBox("");
		cbxWuerfel5.setBounds(175, 49, 21, 23);
		pnlWuerfel.add(cbxWuerfel5);

		btnWuerfeln = new JButton("w\u00FCrfeln");
		btnWuerfeln.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				geklicktWuerfeln();
			}
		});
		btnWuerfeln.setBounds(10, 79, 190, 23);
		pnlWuerfel.add(btnWuerfeln);

		btnEintragen = new JButton("eintragen als >>");
		btnEintragen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int figurNr;
				for (figurNr = 0; figurNr < rbtFiguren.length; figurNr++)
				{
					if (rbtFiguren[figurNr].isSelected())
					{
						break;
					}
				}
				if (figurNr < rbtFiguren.length)
				{
					geklicktEintragen(figurNr);
				}
				else
				{
					zeigeNachricht("Wähle eine Figur aus!");
				}
			}
		});
		btnEintragen.setBounds(10, 113, 190, 23);
		pnlWuerfel.add(btnEintragen);

		lblBestenliste = new JLabel("Bestenliste");
		lblBestenliste.setBounds(21, 172, 67, 14);
		contentPane.add(lblBestenliste);

		pnlGewinnkarte = new JPanel();
		pnlGewinnkarte.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null));
		pnlGewinnkarte.setBounds(232, 11, 150, 466);
		contentPane.add(pnlGewinnkarte);
		pnlGewinnkarte.setLayout(null);

		txtEinser = new JTextField();
		txtEinser.setHorizontalAlignment(SwingConstants.TRAILING);
		txtEinser.setBounds(101, 11, 35, 20);
		pnlGewinnkarte.add(txtEinser);
		txtEinser.setEditable(false);
		txtEinser.setColumns(10);

		txtZweier = new JTextField();
		txtZweier.setHorizontalAlignment(SwingConstants.TRAILING);
		txtZweier.setBounds(101, 36, 35, 20);
		pnlGewinnkarte.add(txtZweier);
		txtZweier.setEditable(false);
		txtZweier.setColumns(10);

		txtDreier = new JTextField();
		txtDreier.setHorizontalAlignment(SwingConstants.TRAILING);
		txtDreier.setBounds(101, 61, 35, 20);
		pnlGewinnkarte.add(txtDreier);
		txtDreier.setEditable(false);
		txtDreier.setColumns(10);

		txtVierer = new JTextField();
		txtVierer.setHorizontalAlignment(SwingConstants.TRAILING);
		txtVierer.setBounds(101, 86, 35, 20);
		pnlGewinnkarte.add(txtVierer);
		txtVierer.setEditable(false);
		txtVierer.setColumns(10);

		txtFuenfer = new JTextField();
		txtFuenfer.setHorizontalAlignment(SwingConstants.TRAILING);
		txtFuenfer.setBounds(101, 111, 35, 20);
		pnlGewinnkarte.add(txtFuenfer);
		txtFuenfer.setEditable(false);
		txtFuenfer.setColumns(10);

		txtSechser = new JTextField();
		txtSechser.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSechser.setBounds(101, 136, 35, 20);
		pnlGewinnkarte.add(txtSechser);
		txtSechser.setEditable(false);
		txtSechser.setColumns(10);

		txtSummeOben = new JTextField();
		txtSummeOben.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSummeOben.setBounds(101, 161, 35, 20);
		pnlGewinnkarte.add(txtSummeOben);
		txtSummeOben.setEditable(false);
		txtSummeOben.setColumns(10);

		txtBonus = new JTextField();
		txtBonus.setHorizontalAlignment(SwingConstants.TRAILING);
		txtBonus.setBounds(101, 186, 35, 20);
		pnlGewinnkarte.add(txtBonus);
		txtBonus.setEditable(false);
		txtBonus.setColumns(10);

		txtSummeObenMitBonus = new JTextField();
		txtSummeObenMitBonus.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSummeObenMitBonus.setBounds(101, 211, 35, 20);
		pnlGewinnkarte.add(txtSummeObenMitBonus);
		txtSummeObenMitBonus.setEditable(false);
		txtSummeObenMitBonus.setColumns(10);

		txtDreierpasch = new JTextField();
		txtDreierpasch.setHorizontalAlignment(SwingConstants.TRAILING);
		txtDreierpasch.setBounds(101, 236, 35, 20);
		pnlGewinnkarte.add(txtDreierpasch);
		txtDreierpasch.setEditable(false);
		txtDreierpasch.setColumns(10);

		txtViererpasch = new JTextField();
		txtViererpasch.setHorizontalAlignment(SwingConstants.TRAILING);
		txtViererpasch.setBounds(101, 261, 35, 20);
		pnlGewinnkarte.add(txtViererpasch);
		txtViererpasch.setEditable(false);
		txtViererpasch.setColumns(10);

		txtFullHouse = new JTextField();
		txtFullHouse.setHorizontalAlignment(SwingConstants.TRAILING);
		txtFullHouse.setBounds(101, 286, 35, 20);
		pnlGewinnkarte.add(txtFullHouse);
		txtFullHouse.setEditable(false);
		txtFullHouse.setColumns(10);

		txtKleineStrasse = new JTextField();
		txtKleineStrasse.setHorizontalAlignment(SwingConstants.TRAILING);
		txtKleineStrasse.setBounds(101, 311, 35, 20);
		pnlGewinnkarte.add(txtKleineStrasse);
		txtKleineStrasse.setEditable(false);
		txtKleineStrasse.setColumns(10);

		txtGrosseStrasse = new JTextField();
		txtGrosseStrasse.setHorizontalAlignment(SwingConstants.TRAILING);
		txtGrosseStrasse.setBounds(101, 336, 35, 20);
		pnlGewinnkarte.add(txtGrosseStrasse);
		txtGrosseStrasse.setEditable(false);
		txtGrosseStrasse.setColumns(10);

		txtKniffel = new JTextField();
		txtKniffel.setHorizontalAlignment(SwingConstants.TRAILING);
		txtKniffel.setBounds(101, 361, 35, 20);
		pnlGewinnkarte.add(txtKniffel);
		txtKniffel.setEditable(false);
		txtKniffel.setColumns(10);

		txtChance = new JTextField();
		txtChance.setHorizontalAlignment(SwingConstants.TRAILING);
		txtChance.setBounds(101, 386, 35, 20);
		pnlGewinnkarte.add(txtChance);
		txtChance.setEditable(false);
		txtChance.setColumns(10);

		txtSummeUnten = new JTextField();
		txtSummeUnten.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSummeUnten.setBounds(101, 411, 35, 20);
		pnlGewinnkarte.add(txtSummeUnten);
		txtSummeUnten.setEditable(false);
		txtSummeUnten.setColumns(10);

		txtEndsumme = new JTextField();
		txtEndsumme.setHorizontalAlignment(SwingConstants.TRAILING);
		txtEndsumme.setBounds(101, 436, 35, 20);
		pnlGewinnkarte.add(txtEndsumme);
		txtEndsumme.setEditable(false);
		txtEndsumme.setColumns(10);

		lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(27, 189, 70, 14);
		pnlGewinnkarte.add(lblBonus);
		lblBonus.setHorizontalAlignment(SwingConstants.LEFT);

		lblSummeObenMitBonus = new JLabel("Summe oben");
		lblSummeObenMitBonus.setBounds(27, 214, 70, 14);
		pnlGewinnkarte.add(lblSummeObenMitBonus);
		lblSummeObenMitBonus.setHorizontalAlignment(SwingConstants.LEFT);

		lblSummeOben = new JLabel("Summe");
		lblSummeOben.setBounds(27, 164, 70, 14);
		pnlGewinnkarte.add(lblSummeOben);
		lblSummeOben.setHorizontalAlignment(SwingConstants.LEFT);

		lblSummeUnten = new JLabel("Summe unten");
		lblSummeUnten.setBounds(27, 414, 70, 14);
		pnlGewinnkarte.add(lblSummeUnten);
		lblSummeUnten.setHorizontalAlignment(SwingConstants.LEFT);

		lblEndsumme = new JLabel("Endsumme");
		lblEndsumme.setBounds(27, 439, 70, 14);
		pnlGewinnkarte.add(lblEndsumme);
		lblEndsumme.setHorizontalAlignment(SwingConstants.LEFT);

		rbtEinser = new JRadioButton("1er");
		rbtEinser.setBounds(6, 11, 89, 23);
		pnlGewinnkarte.add(rbtEinser);
		buttonGroup.add(rbtEinser);

		rbtZweier = new JRadioButton("2er");
		rbtZweier.setBounds(6, 36, 89, 23);
		pnlGewinnkarte.add(rbtZweier);
		buttonGroup.add(rbtZweier);

		rbtDreier = new JRadioButton("3er");
		rbtDreier.setBounds(6, 61, 89, 23);
		pnlGewinnkarte.add(rbtDreier);
		buttonGroup.add(rbtDreier);

		rbtVierer = new JRadioButton("4er");
		rbtVierer.setBounds(6, 86, 89, 23);
		pnlGewinnkarte.add(rbtVierer);
		buttonGroup.add(rbtVierer);

		rbtFuenfer = new JRadioButton("5er");
		rbtFuenfer.setBounds(6, 111, 89, 23);
		pnlGewinnkarte.add(rbtFuenfer);
		buttonGroup.add(rbtFuenfer);

		rbtSechser = new JRadioButton("6er");
		rbtSechser.setBounds(6, 136, 89, 23);
		pnlGewinnkarte.add(rbtSechser);
		buttonGroup.add(rbtSechser);

		rbtDreierpasch = new JRadioButton("Dreierpasch");
		rbtDreierpasch.setBounds(6, 236, 89, 23);
		pnlGewinnkarte.add(rbtDreierpasch);
		buttonGroup.add(rbtDreierpasch);

		rbtViererpasch = new JRadioButton("Viererpasch");
		rbtViererpasch.setBounds(6, 261, 89, 23);
		pnlGewinnkarte.add(rbtViererpasch);
		buttonGroup.add(rbtViererpasch);

		rbtKleineStrasse = new JRadioButton("kl. Stra\u00DFe");
		rbtKleineStrasse.setBounds(6, 311, 89, 23);
		pnlGewinnkarte.add(rbtKleineStrasse);
		buttonGroup.add(rbtKleineStrasse);

		rbtGrosseStrasse = new JRadioButton("gr. Stra\u00DFe");
		rbtGrosseStrasse.setBounds(6, 336, 89, 23);
		pnlGewinnkarte.add(rbtGrosseStrasse);
		buttonGroup.add(rbtGrosseStrasse);

		rbtKniffel = new JRadioButton("Kniffel");
		rbtKniffel.setBounds(6, 361, 89, 23);
		pnlGewinnkarte.add(rbtKniffel);
		buttonGroup.add(rbtKniffel);

		rbtChance = new JRadioButton("Chance");
		rbtChance.setBounds(6, 386, 89, 23);
		pnlGewinnkarte.add(rbtChance);
		buttonGroup.add(rbtChance);

		rbtFullHouse = new JRadioButton("Full House");
		rbtFullHouse.setBounds(6, 286, 89, 23);
		pnlGewinnkarte.add(rbtFullHouse);
		buttonGroup.add(rbtFullHouse);

		btnNeuesSpiel = new JButton("neues Spiel");
		btnNeuesSpiel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				geklicktNeuesSpiel();
			}
		});
		btnNeuesSpiel.setBounds(22, 454, 190, 23);
		contentPane.add(btnNeuesSpiel);

		txtBestenliste = new JTextArea();
		txtBestenliste.setEditable(false);
		txtBestenliste.setFont(new Font("Courier New", Font.PLAIN, 11));
		txtBestenliste.setText(null);
		txtBestenliste.setBounds(22, 197, 190, 246);
		scrollPane = new JScrollPane(txtBestenliste);
		scrollPane.setBounds(22, 197, 190, 246);
		contentPane.add(scrollPane);

		lblWuerfel = new JLabel[5];
		lblWuerfel[0] = lblWuerfel1;
		lblWuerfel[1] = lblWuerfel2;
		lblWuerfel[2] = lblWuerfel3;
		lblWuerfel[3] = lblWuerfel4;
		lblWuerfel[4] = lblWuerfel5;

		cbxWuerfel = new JCheckBox[5];
		cbxWuerfel[0] = cbxWuerfel1;
		cbxWuerfel[1] = cbxWuerfel2;
		cbxWuerfel[2] = cbxWuerfel3;
		cbxWuerfel[3] = cbxWuerfel4;
		cbxWuerfel[4] = cbxWuerfel5;

		rbtFiguren = new JRadioButton[13];
		rbtFiguren[0] = rbtEinser;
		rbtFiguren[1] = rbtZweier;
		rbtFiguren[2] = rbtDreier;
		rbtFiguren[3] = rbtVierer;
		rbtFiguren[4] = rbtFuenfer;
		rbtFiguren[5] = rbtSechser;
		rbtFiguren[6] = rbtDreierpasch;
		rbtFiguren[7] = rbtViererpasch;
		rbtFiguren[8] = rbtFullHouse;
		rbtFiguren[9] = rbtKleineStrasse;
		rbtFiguren[10] = rbtGrosseStrasse;
		rbtFiguren[11] = rbtKniffel;
		rbtFiguren[12] = rbtChance;

		txtFiguren = new JTextField[13];
		txtFiguren[0] = txtEinser;
		txtFiguren[1] = txtZweier;
		txtFiguren[2] = txtDreier;
		txtFiguren[3] = txtVierer;
		txtFiguren[4] = txtFuenfer;
		txtFiguren[5] = txtSechser;
		txtFiguren[6] = txtDreierpasch;
		txtFiguren[7] = txtViererpasch;
		txtFiguren[8] = txtFullHouse;
		txtFiguren[9] = txtKleineStrasse;
		txtFiguren[10] = txtGrosseStrasse;
		txtFiguren[11] = txtKniffel;
		txtFiguren[12] = txtChance;

		txtSummen = new JTextField[5];
		txtSummen[0] = txtSummeOben;
		txtSummen[1] = txtBonus;
		txtSummen[2] = txtSummeObenMitBonus;
		txtSummen[3] = txtSummeUnten;
		txtSummen[4] = txtEndsumme;

		dieSteuerung = new Steuerung(this);
	}

	public void aktiviereEintragen(boolean pAktiv)
	{
		btnEintragen.setEnabled(pAktiv);
	}

	public void aktiviereWuerfelauswahl(boolean pAktiv)
	{
		for (int w = 0; w < cbxWuerfel.length; w++)
		{
			cbxWuerfel[w].setEnabled(pAktiv);
		}
	}

	public void aktiviereWuerfeln(boolean pAktiv)
	{
		btnWuerfeln.setEnabled(pAktiv);
	}

	public String erfrageSpielername()
	{
		return JOptionPane.showInputDialog("Wie ist dein Name?");
	}

	private void geklicktEintragen(int pFigurNr)
	{
		dieSteuerung.geklicktEintragen(pFigurNr);
	}

	private void geklicktNeuesSpiel()
	{

		int antwort = JOptionPane.showConfirmDialog(this,
				"Wills du wirklich ein neues Spiel starten?", "Neues Spiel",
				JOptionPane.YES_NO_OPTION);
		if (antwort == JOptionPane.YES_OPTION)
		{
			dieSteuerung.geklicktNeuesSpiel();
		}
	}

	private void geklicktWuerfeln()
	{
		boolean wuerfelWerfen[] = new boolean[cbxWuerfel.length];
		for (int w = 0; w < cbxWuerfel.length; w++)
		{
			wuerfelWerfen[w] = cbxWuerfel[w].isSelected();
		}
		dieSteuerung.geklicktWuerfeln(wuerfelWerfen);
	}

	public void waehleAlleWuerfelAus()
	{
		for (int w = 0; w < cbxWuerfel.length; w++)
		{
			cbxWuerfel[w].setSelected(true);
		}
	}

	public void zeigeBestenliste(Endstand[] pEndstand)
	{
		txtBestenliste.setText(null);
		for (int z = 0; z < pEndstand.length; z++)
		{
			String zeile = String.format("%3d Punkte: %s%n",
					pEndstand[z].liesPunkte(), pEndstand[z].liesName());
			txtBestenliste.append(zeile);
		}
		txtBestenliste.setCaretPosition(0);
	}

	public void zeigeGewinnkarte(boolean[] pEingetragen, int[] pPunktzahl)
	{
		// "pEingetragen" beinhaltet nur für die 13 Figuren die Information,
		// ob die jeweilige Figur eingetragen ist

		// "pPunktzahl" beinhaltet zuerst für die 13 Figuren, danach für die
		// 5 Summenfelder die jeweiligen Punktzahlen

		for (int f = 0; f < txtFiguren.length; f++)
		{
			if (pEingetragen[f])
			{
				txtFiguren[f].setText(Integer.toString(pPunktzahl[f]));
			}
			else
			{
				txtFiguren[f].setText(null);
			}
		}

		for (int f = 0; f < txtSummen.length; f++)
		{
			txtSummen[f].setText(Integer.toString(pPunktzahl[f
					+ txtFiguren.length]));
		}
	}

	public void zeigeNachricht(String pNachricht)
	{
		JOptionPane.showMessageDialog(this, pNachricht);
	}

	public void zeigeWuerfel(int[] pAugenzahl)
	{
		for (int wuerfelNr = 0; wuerfelNr < 5; wuerfelNr++)
		{
			String dateiname = "/benutzerschnittstelle/wuerfel"
					+ pAugenzahl[wuerfelNr] + ".png";
			ImageIcon icon = new ImageIcon(
					Benutzerschnittstelle.class.getResource(dateiname));
			Image img1 = icon.getImage();
			Image img2 = img1.getScaledInstance(
					lblWuerfel[wuerfelNr].getWidth(),
					lblWuerfel[wuerfelNr].getHeight(),
					java.awt.Image.SCALE_SMOOTH);
			icon = new ImageIcon(img2);
			lblWuerfel[wuerfelNr].setIcon(icon);
		}
	}
}
