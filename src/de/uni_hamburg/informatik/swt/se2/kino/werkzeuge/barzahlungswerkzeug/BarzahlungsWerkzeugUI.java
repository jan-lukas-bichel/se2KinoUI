package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlungswerkzeug;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BarzahlungsWerkzeugUI extends JDialog {

	private int _platzpreis;
	public JDialog _frame;

	private JPanel _preisPanel;
	private JLabel _preis;
	private JTextField _anzeigePreis;

	private JPanel _betragPanel;
	private JLabel _betrag;
	private JTextField _eingabeBetrag;

	private JPanel _restbetragPanel;
	private JLabel _restbetrag;
	private JTextField _eingabeRestbetrag;

	private JPanel _buttonPanel;
	private JButton _ok;
	private JButton _abbrechen;

	/**
	 * Erezugt die GUI
	 * 
	 * @param preis der Preis, der im PlatzVerkaufsWerkzeug errechnet wird
	 */
	public BarzahlungsWerkzeugUI(int preis) {
		_platzpreis = preis;

		// Erzeugt den Frame
		_frame = new JDialog(this, "Barzahlung", true);

		// welcher layoutmanager?
		_frame.setLayout(new GridLayout());

		erzeugeTextfelderPreis();

		erzeugeTextfelderBetrag();

		erzeugeTextfelderRestbetrag();

		erzeugeButtonPanel();

		zeigeGUIan();
	}

	/**
	 * Erzeugt das ButtonPanel sowie die Buttons und fügt alles dem Frame hinzu
	 */
	private void erzeugeButtonPanel() {
		_buttonPanel = new JPanel();
		erzeugeOK();
		erzeugeAbbrechen();
		_frame.add(_buttonPanel);
	}

	public JButton getOkButton() {
		return _ok;
	}

	/**
	 * zeigt die GUI an
	 */
	private void zeigeGUIan() {
		// setsize of dialog
		_frame.setSize(450, 700);
		_frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		_frame.pack();

	}

	/**
	 * Erzeugt die Anzeige des Textfelds "Preis" und das Textfeld für die Ausgabe
	 * des Preises
	 */
	private void erzeugeTextfelderPreis() {
		_preisPanel = new JPanel();
		_preis = new JLabel();
		_preis.setText("Preis: ");
		_preisPanel.add(_preis);

		_anzeigePreis = new JTextField(10);
		_anzeigePreis.setText(" " + _platzpreis);
		_anzeigePreis.setEditable(false);
		_preisPanel.add(_anzeigePreis);
		_frame.add(_preisPanel);

	}

	/**
	 * Erzeugt die Anzeige des Textfelds "Betrag" und das Textfeld für die Ausagbe
	 * des Betrags
	 */
	private void erzeugeTextfelderBetrag() {
		_betragPanel = new JPanel();
		_betrag = new JLabel();
		_betrag.setText("Betrag: ");
		_betragPanel.add(_betrag);

		_eingabeBetrag = new JTextField(10);
		_betragPanel.add(_eingabeBetrag);
		_frame.add(_betragPanel);

	}

	/**
	 * Erzeugt die Anzeige des Textfelds "Restbetrag" und das Textfeld für die
	 * Ausagbe des Restbetrags
	 */
	private void erzeugeTextfelderRestbetrag() {
		_restbetragPanel = new JPanel();
		_restbetrag = new JLabel();
		_restbetrag.setText("Restbetrag: ");
		_restbetragPanel.add(_restbetrag);

		_eingabeRestbetrag = new JTextField(10);
		_eingabeRestbetrag.setEditable(false);
		_restbetragPanel.add(_eingabeRestbetrag);
		_frame.add(_restbetragPanel);
	}

	/**
	 * Erzeugt den OK-Button
	 */
	public void erzeugeOK() {
		_ok = new JButton("OK");
		_ok.setEnabled(false);
		_buttonPanel.add(_ok);

	}

	/**
	 * Erzeugt den Abbrechen-Button
	 */
	public void erzeugeAbbrechen() {
		_abbrechen = new JButton("Abbrechen");
		_buttonPanel.add(_abbrechen);
	}

	/**
	 * 
	 * @return den Frame
	 */
	public JDialog getFrame() {
		return _frame;
	}

	/**
	 * 
	 * @return den OK-Button
	 */
	public JButton getOK() {
		return _ok;
	}

	/**
	 * 
	 * @return den Abbrechen-Button
	 */
	public JButton getAbbrechen() {
		return _abbrechen;
	}

	/**
	 * 
	 * @return das JTextField, das den Preis anzeigt
	 */
	public JTextField getAnzeigePreis() {
		return _anzeigePreis;
	}

	/**
	 * 
	 * @return das JTextField, das den eingegebenen Betrag anzeigt
	 */
	public JTextField getEingabeBetrag() {
		return _eingabeBetrag;
	}

	/**
	 * 
	 * @return das JTextField, das den Restbetrag anzeigt
	 */
	public JTextField getRestbetrag() {
		return _eingabeRestbetrag;
	}

	/**
	 * 
	 * @return int eingabeBetrag , den eingegebenen Betrag des Nutzers
	 */
	public int getBetrag() {
		return Integer.parseInt(_eingabeBetrag.getText());
	}

	/**
	 * sorgt dafür, dass der Dialog sichtbar wird
	 */
	public void macheDialogSichtbar() {
		_frame.setVisible(true);
	}

}
