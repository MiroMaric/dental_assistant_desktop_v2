package com.mikomaric.dentalassistant.form.component.intervention;

import com.mikomaric.dentalassistant.controller.Controller;
import com.mikomaric.dentalassistant.domain.Intervention;
import com.mikomaric.dentalassistant.domain.InterventionItem;
import com.mikomaric.dentalassistant.domain.RootIntervention;
import com.mikomaric.dentalassistant.domain.SideIntervention;
import com.mikomaric.dentalassistant.domain.ToothIntervention;
import com.mikomaric.dentalassistant.domain.Tooth;
import com.mikomaric.dentalassistant.form.ColorConstant;
import com.mikomaric.dentalassistant.form.MyTableCellRenderer;
import com.mikomaric.dentalassistant.form.cardboard.FormCardboard;
import com.mikomaric.dentalassistant.icon.ErrorIcon;
import com.mikomaric.dentalassistant.icon.SuccessIcon;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.mikomaric.dentalassistant.session.Session;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelNewIntervention extends javax.swing.JPanel {

    private FormCardboard parent;
    private Tooth tooth;
    private Intervention intervention;
    private PanelNewInterventionItem pnlNewInterventionItem;
    private TableModelToothInterventionItems tableModelToothInterventions;

    public PanelNewIntervention(FormCardboard parent, Tooth tooth) {
        this.parent = parent;
        this.tooth = tooth;
        prepareTempFields();
        initComponents();
        adjustPanel();
        prepareTblInterventionItem();
        paintPanel();
        setMenuIcons();
        setStartView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtItemNote = new javax.swing.JTextArea();
        lblInterventionItemNote = new javax.swing.JLabel();
        pnlDynamicContent = new javax.swing.JPanel();
        btnAddInterventionitem = new javax.swing.JButton();
        scrollPaneTblInterventionItems = new javax.swing.JScrollPane();
        tblInterventionItems = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInterventionNote = new javax.swing.JTextArea();
        pnlSaveIntervention = new javax.swing.JButton();
        pnlNewInterventionMenu = new javax.swing.JPanel();
        lblSideMenuItem = new javax.swing.JLabel();
        lblRootMenuItem = new javax.swing.JLabel();
        lblToothMenuItem = new javax.swing.JLabel();
        lblInterventionNote = new javax.swing.JLabel();
        btnRemoveInterventionItem = new javax.swing.JButton();

        txtItemNote.setColumns(15);
        txtItemNote.setLineWrap(true);
        txtItemNote.setRows(4);
        txtItemNote.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtItemNote);

        lblInterventionItemNote.setText("Napomena:");

        pnlDynamicContent.setPreferredSize(new java.awt.Dimension(500, 180));

        javax.swing.GroupLayout pnlDynamicContentLayout = new javax.swing.GroupLayout(pnlDynamicContent);
        pnlDynamicContent.setLayout(pnlDynamicContentLayout);
        pnlDynamicContentLayout.setHorizontalGroup(
            pnlDynamicContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        pnlDynamicContentLayout.setVerticalGroup(
            pnlDynamicContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        btnAddInterventionitem.setText("Dodaj");
        btnAddInterventionitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInterventionitemActionPerformed(evt);
            }
        });

        tblInterventionItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneTblInterventionItems.setViewportView(tblInterventionItems);

        txtInterventionNote.setColumns(20);
        txtInterventionNote.setLineWrap(true);
        txtInterventionNote.setRows(5);
        jScrollPane3.setViewportView(txtInterventionNote);

        pnlSaveIntervention.setText("Sacuvaj");
        pnlSaveIntervention.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSaveInterventionMouseClicked(evt);
            }
        });

        lblSideMenuItem.setBackground(new java.awt.Color(0, 153, 153));
        lblSideMenuItem.setForeground(new java.awt.Color(255, 255, 255));
        lblSideMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSideMenuItem.setToolTipText("strana");
        lblSideMenuItem.setMaximumSize(new java.awt.Dimension(30, 15));
        lblSideMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSideMenuItemMousePressed(evt);
            }
        });

        lblRootMenuItem.setBackground(new java.awt.Color(0, 153, 153));
        lblRootMenuItem.setForeground(new java.awt.Color(255, 255, 255));
        lblRootMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRootMenuItem.setToolTipText("koren");
        lblRootMenuItem.setMaximumSize(new java.awt.Dimension(30, 15));
        lblRootMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRootMenuItemMousePressed(evt);
            }
        });

        lblToothMenuItem.setBackground(new java.awt.Color(0, 153, 153));
        lblToothMenuItem.setForeground(new java.awt.Color(255, 255, 255));
        lblToothMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToothMenuItem.setToolTipText("zub");
        lblToothMenuItem.setMaximumSize(new java.awt.Dimension(30, 15));
        lblToothMenuItem.setPreferredSize(new java.awt.Dimension(30, 15));
        lblToothMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblToothMenuItemMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewInterventionMenuLayout = new javax.swing.GroupLayout(pnlNewInterventionMenu);
        pnlNewInterventionMenu.setLayout(pnlNewInterventionMenuLayout);
        pnlNewInterventionMenuLayout.setHorizontalGroup(
            pnlNewInterventionMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewInterventionMenuLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lblSideMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRootMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToothMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNewInterventionMenuLayout.setVerticalGroup(
            pnlNewInterventionMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewInterventionMenuLayout.createSequentialGroup()
                .addGroup(pnlNewInterventionMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSideMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNewInterventionMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRootMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblToothMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInterventionNote.setText("Opis intervencije:");

        btnRemoveInterventionItem.setText("Ukloni");
        btnRemoveInterventionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveInterventionItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNewInterventionMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTblInterventionItems, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDynamicContent, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInterventionItemNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btnAddInterventionitem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInterventionNote, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemoveInterventionItem, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(pnlSaveIntervention, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlNewInterventionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInterventionItemNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddInterventionitem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDynamicContent, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTblInterventionItems, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemoveInterventionItem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlSaveIntervention, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblInterventionNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSideMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSideMenuItemMousePressed
        pnlNewInterventionItem = new PanelNewSideIntervention(tooth);
        refreshDynamicContent();
    }//GEN-LAST:event_lblSideMenuItemMousePressed

    private void lblRootMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRootMenuItemMousePressed
        pnlNewInterventionItem = new PanelNewRootIntervention(tooth);
        refreshDynamicContent();
    }//GEN-LAST:event_lblRootMenuItemMousePressed

    private void lblToothMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblToothMenuItemMousePressed
        pnlNewInterventionItem = new PanelNewToothIntervention(tooth);
        refreshDynamicContent();
    }//GEN-LAST:event_lblToothMenuItemMousePressed

    private void btnAddInterventionitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInterventionitemActionPerformed
        InterventionItem item = pnlNewInterventionItem.getInterventionItem();
        if (item == null) {
            String message = "Morate prvo uneti intervenciju";
            JOptionPane.showMessageDialog(this, message, "Greška", 0, new ErrorIcon());
            return;
        }
        String itemNote = txtItemNote.getText();
        item.setNote(itemNote);
        item.setIntervention(intervention);
        tableModelToothInterventions.addInterventionItem(item);
        if (item instanceof SideIntervention) {
            SideIntervention sideIntervention = (SideIntervention) item;
            sideIntervention.getToothSide().getSideInterventions().add(sideIntervention);
        } else if (item instanceof RootIntervention) {
            RootIntervention rootIntervention = (RootIntervention) item;
            rootIntervention.getToothRoot().getRootInterventions().add(rootIntervention);
        }else if (item instanceof ToothIntervention) {
            ToothIntervention toothIntervention = (ToothIntervention) item;
            toothIntervention.getTooth().getToothInterventions().add(toothIntervention);
        }
        intervention.getItems().add(item);
        parent.refreshToothViews(new Date());
        pnlNewInterventionItem.refreshView();
        txtItemNote.setText("");
    }//GEN-LAST:event_btnAddInterventionitemActionPerformed

    private void btnRemoveInterventionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveInterventionItemActionPerformed
        int index = tblInterventionItems.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Niste izabrali nijednu stavku", "Greška", JOptionPane.OK_OPTION, new ErrorIcon());
            return;
        }
        InterventionItem interventionItem = tableModelToothInterventions.getInterventionItem(index);
        tableModelToothInterventions.removeInterventionItem(index);
        if (interventionItem instanceof SideIntervention) {
            SideIntervention si = (SideIntervention) interventionItem;
            si.getToothSide().getSideInterventions().remove(si);
        } else if (interventionItem instanceof RootIntervention) {
            RootIntervention ri = (RootIntervention) interventionItem;
            ri.getToothRoot().getRootInterventions().remove(ri);
        }else if (interventionItem instanceof ToothIntervention) {
            ToothIntervention ti = (ToothIntervention) interventionItem;
            ti.getTooth().getToothInterventions().remove(ti);
        }
        intervention.getItems().remove(interventionItem);
        parent.refreshToothViews(new Date());
        pnlNewInterventionItem.refreshView();
    }//GEN-LAST:event_btnRemoveInterventionItemActionPerformed

    private void pnlSaveInterventionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSaveInterventionMouseClicked
        if (tableModelToothInterventions.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Niste uneli nijednu stavku intervencije", "Greška", JOptionPane.OK_OPTION, new ErrorIcon());
            return;
        }
        intervention.setDate(new Date());
        intervention.setNote(txtInterventionNote.getText());
        intervention.setUser(Session.getInstance().getUser());
        try {
            Controller.getInstance().saveIntervention(intervention);
            JOptionPane.showMessageDialog(this, "Intervencija je sačuvana", "Intervencija", JOptionPane.OK_OPTION, new SuccessIcon());
            prepareTblInterventionItem();
            setStartView();
            prepareTempFields();
        } catch (Exception ex) {
            Logger.getLogger(PanelNewIntervention.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greška", JOptionPane.OK_OPTION, new ErrorIcon());
        }
    }//GEN-LAST:event_pnlSaveInterventionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddInterventionitem;
    private javax.swing.JButton btnRemoveInterventionItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblInterventionItemNote;
    private javax.swing.JLabel lblInterventionNote;
    private javax.swing.JLabel lblRootMenuItem;
    private javax.swing.JLabel lblSideMenuItem;
    private javax.swing.JLabel lblToothMenuItem;
    private javax.swing.JPanel pnlDynamicContent;
    private javax.swing.JPanel pnlNewInterventionMenu;
    private javax.swing.JButton pnlSaveIntervention;
    private javax.swing.JScrollPane scrollPaneTblInterventionItems;
    private javax.swing.JTable tblInterventionItems;
    private javax.swing.JTextArea txtInterventionNote;
    private javax.swing.JTextArea txtItemNote;
    // End of variables declaration//GEN-END:variables

    private void adjustPanel() {
        pnlDynamicContent.setLayout(new GridLayout(1, 1));
    }

    private void prepareTblInterventionItem() {
        tableModelToothInterventions = new TableModelToothInterventionItems();
        tblInterventionItems.setModel(tableModelToothInterventions);
        tblInterventionItems.getTableHeader().setDefaultRenderer(new MyTableCellRenderer());
        tblInterventionItems.getTableHeader().setReorderingAllowed(false);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resizeTableColumns();
            }
        });
    }

    private void paintPanel() {
        pnlNewInterventionMenu.setBackground(ColorConstant.GREEN_STRONG);
        setBackground(ColorConstant.GREEN_STRONG);
        lblInterventionItemNote.setForeground(ColorConstant.LIGHT_COLOR);
        lblInterventionNote.setForeground(ColorConstant.LIGHT_COLOR);
        scrollPaneTblInterventionItems.getViewport().setBackground(ColorConstant.GREEN_STRONG);
    }

    private void setMenuIcons() {
        lblRootMenuItem.setIcon(new ImageIcon("icons/intervention_item/toothRootInterventionItem.png"));
        lblToothMenuItem.setIcon(new ImageIcon("icons/intervention_item/toothInterventionItem.png"));
        lblSideMenuItem.setIcon(new ImageIcon("icons/intervention_item/toothSideInterventionItem.png"));
    }

    private void refreshDynamicContent() {
        pnlDynamicContent.removeAll();
        pnlDynamicContent.add(pnlNewInterventionItem);
        pnlDynamicContent.revalidate();
    }

    private void setStartView() {
        txtInterventionNote.setText("");
        txtItemNote.setText("");
        pnlNewInterventionItem = new PanelNewSideIntervention(tooth);
        refreshDynamicContent();
    }

    public void resizeTableColumns() {
        int[] percentWidth = {15, 25, 15, 45};
        int tWidth = tblInterventionItems.getWidth();
        for (int i = 0; i < tblInterventionItems.getColumnModel().getColumnCount(); i++) {
            tblInterventionItems.getColumnModel().getColumn(i).setPreferredWidth(Math.round(percentWidth[i] * tWidth));
        }
    }

    private void prepareTempFields() {
        intervention = new Intervention();
        intervention.setDate(new Date());
        intervention.setItems(new ArrayList<>());
    }

    public void setNewTooth(Tooth selectedTooth) {
        tooth = selectedTooth;
        pnlNewInterventionItem.setNewTooth(tooth);
    }

}
