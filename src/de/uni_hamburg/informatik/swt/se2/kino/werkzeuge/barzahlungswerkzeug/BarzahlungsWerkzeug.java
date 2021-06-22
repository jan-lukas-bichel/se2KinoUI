package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlungswerkzeug;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.ObservableSubwerkzeug;

public class BarzahlungsWerkzeug
{

    private BarzahlungsWerkzeugUI _ui;

    private boolean _okButtonGedrueckt = false;

    private int _preis;
    private int _restBetrag;

    public BarzahlungsWerkzeug(int preis)
    {
        System.out.println("Konstruktor");
        _ui = new BarzahlungsWerkzeugUI(preis);
        registriereUIAktionen();
        _preis = preis;
        _ui._frame.setVisible(true);
    }

    public void barzahlungStarten(int preis)
    {
        _ui = new BarzahlungsWerkzeugUI(preis);
        registriereUIAktionen();
        _preis = preis;
        _ui._frame.setVisible(true);
        //_ui.setTextfeldPreis(preis);
    }

    /**
     * Verbindet die fachlichen Aktionen mit den Interaktionselementen der
     * graphischen Benutzungsoberfläche.
     */
    private void registriereUIAktionen()
    {
        System.out.println("Ich werde ausgefuehrt");
        _ui.getOkButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    okButtonPressed();
                }
            });

        _ui.getAbbrechenButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    abbrechenButtonPressed();
                }
            });

        _ui.getEingabeBetrag()
            .addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    restBetragBerechnen();
                    betragInputChanged();
                    _ui.setTextfeldeingabeBetrag(
                            Integer.parseInt(_ui.getEingabeBetrag()
                                .getText()));
                }
            });

    }

    private void restBetragBerechnen()
    {
        _restBetrag = _preis - _ui.getBetrag();
        _ui.setTextfeldRestbetrag(_restBetrag);
    }

    private void okButtonPressed()
    {
        _okButtonGedrueckt = true;
        _ui._frame.dispose();
        System.out.println("Hallo der Button wurde gedruckt");
    }

    private void abbrechenButtonPressed()
    {
        _ui.schließeFenster();
    }

    private void betragInputChanged()
    {
        if (_restBetrag > 0)
        {
            _ui.toggleOkButtonOff();
        }
        else
        {
            _ui.toggleOkButtonOn();
        }
        restBetragBerechnen();
    }

    public boolean getOkButtonGedrueckt()
    {
        return _okButtonGedrueckt;
    }

}
