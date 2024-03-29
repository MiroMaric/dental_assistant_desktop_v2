package com.mikomaric.dentalassistant.form.component.intervention;

import com.mikomaric.dentalassistant.domain.InterventionItem;
import com.mikomaric.dentalassistant.domain.Tooth;


public abstract class PanelNewInterventionItem extends javax.swing.JPanel {

    protected Tooth tooth;
    
    public PanelNewInterventionItem(Tooth tooth) {
        this.tooth = tooth;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    public abstract InterventionItem getInterventionItem();
    public abstract void refreshView();

    public abstract void setNewTooth(Tooth tooth);
    
}
