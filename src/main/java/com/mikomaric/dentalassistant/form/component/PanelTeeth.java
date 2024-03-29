package com.mikomaric.dentalassistant.form.component;

import com.mikomaric.dentalassistant.domain.Patient;
import com.mikomaric.dentalassistant.form.ColorConstant;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Date;

public class PanelTeeth extends javax.swing.JPanel {

    private final Patient patient;

    public PanelTeeth(Patient patient) {
        this.patient = patient;
        initComponents();
        populateTeethPanel();
        paintPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 153, 153));
        setMaximumSize(new java.awt.Dimension(750, 32767));
        setLayout(new java.awt.GridLayout(1, 0));
    }// </editor-fold>//GEN-END:initComponents

    private void populateTeethPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.gridy = 0;
        gbc.ipady = 140;
        for (int i = 7; i >= 0; i--) {
            gbc.gridx = 7 - i;
            add(PanelTooth.getToothRootsPanel(patient.getTeeth().get(i), 55,new Date()), gbc);
        }
        for (int i = 8; i < 16; i++) {
            gbc.gridx = i;
            add(PanelTooth.getToothRootsPanel(patient.getTeeth().get(i), 55,new Date()), gbc);
        }
        gbc.gridy = 1;
        gbc.ipady = 60;
        for (int i = 7; i >= 0; i--) {
            gbc.gridx = 7 - i;
            add(new PanelToothSides(patient.getTeeth().get(i), new Date(), 55), gbc);
        }
        for (int i = 8; i < 16; i++) {
            gbc.gridx = i;
            add(new PanelToothSides(patient.getTeeth().get(i), new Date(), 55), gbc);
        }
        gbc.gridy = 2;
        for (int i = 31; i >= 24; i--) {
            gbc.gridx = 31 - i;
            add(new PanelToothSides(patient.getTeeth().get(i), new Date(), 55), gbc);

        }
        for (int i = 16; i < 24; i++) {
            gbc.gridx = i - 8;
            add(new PanelToothSides(patient.getTeeth().get(i), new Date(), 55), gbc);

        }
        gbc.gridy = 3;
        gbc.ipady = 140;
        for (int i = 31; i >= 24; i--) {
            gbc.gridx = 31 - i;
            add(PanelTooth.getToothRootsPanel(patient.getTeeth().get(i), 50,new Date()), gbc);
        }
        for (int i = 16; i < 24; i++) {
            gbc.gridx = i - 8;
            add(PanelTooth.getToothRootsPanel(patient.getTeeth().get(i), 50,new Date()), gbc);
        }
        revalidate();
        repaint();
    }

    private void paintPanel() {
        setBackground(new Color(200, 200, 200));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
