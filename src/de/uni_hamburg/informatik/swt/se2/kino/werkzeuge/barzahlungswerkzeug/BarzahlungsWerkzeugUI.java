package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlungswerkzeug;

import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

<<<<<<< Updated upstream
public class BarzahlungsWerkzeugUI extends JDialog
{

    private int _platzpreis;
    protected JDialog _frame;

    private JPanel _preisPanel;
    private JLabel _preis;
    private JTextField _anzeigePreis;

    private JPanel _betragPanel;
    private JLabel _betrag;
    private JFormattedTextField _eingabeBetrag;

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
    public BarzahlungsWerkzeugUI(int preis)
    {
        _platzpreis = preis;
        erzeugeDialogFenster();

    }

    private void erzeugeDialogFenster()
    {
        // Erzeugt den Frame
        _frame = new JDialog(this, "Barzahlung", true);

        _frame.setVisible(false);

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
    private void erzeugeButtonPanel()
    {
        _buttonPanel = new JPanel();
        erzeugeOK();
        erzeugeAbbrechen();
        _frame.add(_buttonPanel);
    }

    public JButton getOkButton()
    {
        return _ok;
    }

    /**
     * zeigt die GUI an
     */
    private void zeigeGUIan()
    {
        // setsize of dialog
        _frame.setSize(450, 700);
        // _frame.setVisible(true);
        _frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        _frame.pack();

    }

    /**
     * Erzeugt die Anzeige des Textfelds "Preis" und das Textfeld für die Ausgabe
     * des Preises
     */
    private void erzeugeTextfelderPreis()
    {
        _preisPanel = new JPanel();
        _preis = new JLabel();
        _preis.setText("Preis: ");
        _preisPanel.add(_preis);

        _anzeigePreis = new JTextField();
        _anzeigePreis.setEditable(false);
        _anzeigePreis.setText(formatiereString(_platzpreis));
        _preisPanel.add(_anzeigePreis);
        _frame.add(_preisPanel);

    }

    public void setTextfeldPreis(int preis)
    {
        _platzpreis = preis;
        _anzeigePreis.setText(formatiereString(preis));
    }

    /**
     * Erzeugt die Anzeige des Textfelds "Betrag" und das Textfeld für die Ausagbe
     * des Betrags
     */
    private void erzeugeTextfelderBetrag()
    {
        _betragPanel = new JPanel();
        _betrag = new JLabel();
        _betrag.setText("Betrag: ");
        _betragPanel.add(_betrag);

        _eingabeBetrag = new JFormattedTextField(
                NumberFormat.getNumberInstance());
        _eingabeBetrag.setColumns(9);
        _betragPanel.add(_eingabeBetrag);
        _frame.add(_betragPanel);

    }

    /**
     * Erzeugt die Anzeige des Textfelds "Restbetrag" und das Textfeld für die
     * Ausagbe des Restbetrags
     */
    private void erzeugeTextfelderRestbetrag()
    {
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
    private void erzeugeOK()
    {
        _ok = new JButton("OK");
        toggleOkButtonOff();
        _buttonPanel.add(_ok);

    }

    /**
     * Erzeugt den Abbrechen-Button
     */
    private void erzeugeAbbrechen()
    {
        _abbrechen = new JButton("Abbrechen");
        _buttonPanel.add(_abbrechen);
    }

    /**
     * Aktiviert den Ok-Button
     */
    public void toggleOkButtonOn()
    {
        _ok.setEnabled(true);
    }

    /**
     * Deaktiviert den Ok-Button
     */
    public void toggleOkButtonOff()
    {
        _ok.setEnabled(false);
    }

    /**
     * 
     * @return den Frame
     */
    public JDialog getFrame()
    {
        return _frame;
    }

    /**
     * 
     * @return den OK-Button
     */
    public JButton getOK()
    {
        return _ok;
    }

    /**
     * 
     * @return den Abbrechen-Button
     */
    public JButton getAbbrechenButton()
    {
        return _abbrechen;
    }

    /**
     * 
     * @return das JTextField, das den eingegebenen Betrag anzeigt
     */
    public JTextField getEingabeBetrag()
    {
        return _eingabeBetrag;
    }

    /**
     * 
     * @return das JTextField, das den Restbetrag anzeigt
     */
    public JTextField getRestbetrag()
    {
        return _eingabeRestbetrag;
    }

    /**
     * 
     * @return int eingabeBetrag , den eingegebenen Betrag des Nutzers
     */
    public int getBetrag()
    {
        return Integer.parseInt(_eingabeBetrag.getText());
    }

    public void setTextfeldeingabeBetrag(int betrag)
    {
        _eingabeBetrag.setText(formatiereString(betrag));
    }

    public void setTextfeldRestbetrag(int betrag)
    {
        _eingabeRestbetrag.setText(formatiereString(betrag));
    }

    /**
     * Schließt das Fenster
     */
    public void schließeFenster()
    {
        _frame.dispose();
    }

    /**
     * Formatiert den Geldbetrag
     * 
     * @param betrag der Geldbetrag, der übergeben wird
     * @return den formatierten Geldbetrag
     */
    public String formatiereString(int betrag)
    {
        String res;
        if (betrag < 0)
        {
            res = String.format("-%d,%02d€", betrag / 100 * -1,
                    betrag % 100 * -1);
        }
        else
        {
            res = String.format("%d,%02d€", betrag / 100, betrag % 100);
        }

        return res;
    }
=======
public class BarzahlungsWerkzeugUI extends JDialog {

	private int _platzpreis;
	protected JDialog _frame;

	private JPanel _preisPanel;
	private JLabel _preis;
	private JTextField _anzeigePreis;

	private JPanel _betragPanel;
	private JLabel _betrag;
	private JFormattedTextField _eingabeBetrag;

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
		erzeugeDialogFenster();

	}

	private void erzeugeDialogFenster() {
		// Erzeugt den Frame
		_frame = new JDialog(this, "Barzahlung", true);

		_frame.setVisible(false);

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
		// _frame.setVisible(true);
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

		_anzeigePreis = new JTextField();
		_anzeigePreis.setEditable(false);
		_anzeigePreis.setText(formatiereString(_platzpreis));
		_preisPanel.add(_anzeigePreis);
		_frame.add(_preisPanel);

	}

	public void setTextfeldPreis(int preis) {
		_platzpreis = preis;
		_anzeigePreis.setText(formatiereString(preis));
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

		_eingabeBetrag = new JFormattedTextField(NumberFormat.getNumberInstance());
		_eingabeBetrag.setColumns(9);
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
	private void erzeugeOK() {
		_ok = new JButton("OK");
		toggleOkButtonOff();
		_buttonPanel.add(_ok);

	}

	/**
	 * Erzeugt den Abbrechen-Button
	 */
	private void erzeugeAbbrechen() {
		_abbrechen = new JButton("Abbrechen");
		_buttonPanel.add(_abbrechen);
	}

	/**
	 * Aktiviert den Ok-Button
	 */
	public void toggleOkButtonOn() {
		_ok.setEnabled(true);
	}

	/**
	 * Deaktiviert den Ok-Button
	 */
	public void toggleOkButtonOff() {
		_ok.setEnabled(false);
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
	public JButton getAbbrechenButton() {
		return _abbrechen;
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
	 * @return int eingabeBetrag , den eingegebenen Betrag des Nutzers
	 */
	public int getBetrag() {
		return Integer.parseInt(_eingabeBetrag.getText());
	}

	/**
	 * Zeigt den übergebenen Geldetrag als gezahlen Geldbetrag an
	 */
	public void setTextfeldeingabeBetrag(int betrag) {
		_eingabeBetrag.setText(formatiereString(betrag));
	}

	/**
	 * Zeigt den übergebenen Betrag als Restbetrag an
	 */
	public void setTextfeldRestbetrag(int betrag) {
		_eingabeRestbetrag.setText(formatiereString(betrag));
	}

	public void schließeFenster() {
		_frame.dispose();
	}

	public String formatiereString(int betrag) {
		String res;
		if (betrag < 0) {
			res = String.format("-%d,%02d€", betrag / 100 * -1, betrag % 100 * -1);
		} else {
			res = String.format("%d,%02d€", betrag / 100, betrag % 100);
		}

		return res;
	}
>>>>>>> Stashed changes
}
