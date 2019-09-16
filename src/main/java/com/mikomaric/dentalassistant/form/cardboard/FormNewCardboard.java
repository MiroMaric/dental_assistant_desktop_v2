package com.mikomaric.dentalassistant.form.cardboard;

import com.mikomaric.dentalassistant.controller.Controller;
import com.mikomaric.dentalassistant.domain.Patient;
import com.mikomaric.dentalassistant.icon.ErrorIcon;
import com.mikomaric.dentalassistant.icon.SuccessIcon;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MikoPC
 */
public class FormNewCardboard extends FormCardboardInfo {

    public FormNewCardboard(Frame parent, boolean modal, Patient patient) {
        super(parent, modal, patient);
        prepareForm();
    }

    private void prepareForm() {
        setTitle("Novi karton");
        btn.setText("Kreiraj");
        btn.addActionListener((ActionEvent e) -> {
            if (formIsValid()) {
                populatePatient();
                try {
                    Controller.getInstance().createCardboard(patient);
                    JOptionPane.showMessageDialog(this, "Sistem je otvorio novi karton", "Uspešno kreiranje", JOptionPane.OK_OPTION, new SuccessIcon());
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(FormNewCardboard.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Greška", JOptionPane.OK_OPTION, new ErrorIcon());
                    
                }
            } else {
                JOptionPane.showMessageDialog(this, "Podaci nisu uneti ispravno", "Greška", JOptionPane.OK_OPTION, new ErrorIcon());
            }
        });
    }
}
