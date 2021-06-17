package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlungswerkzeug;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.ObservableSubwerkzeug;

public class BarzahlungsWerkzeug extends ObservableSubwerkzeug {

	private BarzahlungsWerkzeugUI _ui;

	public void barzahlungStarten(int geldbetrag) {
		_ui = new BarzahlungsWerkzeugUI(geldbetrag);
		registriereUIAktionen(_ui);
		_ui.macheDialogSichtbar();
	}

	/**
	 * Verbindet die fachlichen Aktionen mit den Interaktionselementen der
	 * graphischen Benutzungsoberfläche.
	 */
	private void registriereUIAktionen(BarzahlungsWerkzeugUI ui) {
		ui.getOkButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				okButtonPressed();
			}
		});

//		ui.getAbbrechenButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				abbrechenButtonPressed();
//			}
//		});
	}

	private void okButtonPressed() {
		informiereUeberAenderung();
	}

//	private void abbrechenButtonPressed() {
//
//	}

	private void preisInputChanged() {
		// TODO: Checken ob der OK-Button im UI ausgegraut sein muss
		// TODO: Restbetrag in UI updaten
	}
}
