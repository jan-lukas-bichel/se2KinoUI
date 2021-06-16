package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlungswerkzeug;

<<<<<<< Updated upstream:src/de/uni_hamburg/informatik/swt/se2/kino/werkzeuge/barzahlungswerkzeug/BarzahlungsWerkzeugUI.java
public class BarzahlungsWerkzeugUI {
=======
<<<<<<< HEAD:src/de/uni_hamburg/informatik/swt/se2/kino/werkzeuge/barzahlungswerkzeug/BarzahlungswerkzeugUI.java
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class BarzahlungswerkzeugUI extends JDialog
{

    public JDialog _frame;

    private JTextField _anzeigePreis;
    private JTextField _eingabeBetrag;
    private JTextField _eingabeRestbetrag;

    private JButton _ok;
    private JButton _abbrechen;

    public BarzahlungswerkzeugUI(int preis)
    {

    }

    /**
     * Erzeugt den OK-Button
     */
    public void erzeugeOK()
    {
        _ok = new JButton("OK");

    }

    /**
     * Erzeugt den Abbrechen-Button
     */
    public void erzeugeAbbrechen()
    {
        _abbrechen = new JButton("Abbrechen");
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
    public JButton getAbbrechen()
    {
        return _abbrechen;
    }

    /**
     * 
     * @return das JTextField, das den Preis anzeigt
     */
    public JTextField getAnzeigePreis()
    {
        return _anzeigePreis;
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
=======
public class BarzahlungsWerkzeugUI {
>>>>>>> a3ca47226559b1e073204c72feee0c87f618a9c2:src/de/uni_hamburg/informatik/swt/se2/kino/werkzeuge/barzahlungswerkzeug/BarzahlungsWerkzeugUI.java
>>>>>>> Stashed changes:src/de/uni_hamburg/informatik/swt/se2/kino/werkzeuge/barzahlungswerkzeug/BarzahlungswerkzeugUI.java

}
