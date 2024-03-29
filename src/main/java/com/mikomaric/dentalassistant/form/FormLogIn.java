package com.mikomaric.dentalassistant.form;

import com.mikomaric.dentalassistant.communication.exception.MyNotAuthorizedException;
import com.mikomaric.dentalassistant.controller.Controller;
import com.mikomaric.dentalassistant.domain.User;
import com.mikomaric.dentalassistant.form.component.TitleBar;
import com.mikomaric.dentalassistant.form.component.myfield.MyField;
import com.mikomaric.dentalassistant.form.component.myfield.MyInputPasswordField;
import com.mikomaric.dentalassistant.form.component.myfield.MyInputTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import com.mikomaric.dentalassistant.session.Session;

public class FormLogIn extends javax.swing.JFrame {

    public FormLogIn() {
        //decorateForm();
        initComponents();
        initFields();
        adjustForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogIn = new javax.swing.JButton();
        btnLogIn1 = new javax.swing.JButton();
        pnlLogIn = new javax.swing.JPanel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnLogIn.setText("Prijavi me");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnLogIn1.setText("Registracija");
        btnLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogIn1ActionPerformed(evt);
            }
        });

        pnlLogIn.setPreferredSize(new java.awt.Dimension(355, 130));
        pnlLogIn.setLayout(new java.awt.GridLayout(2, 1));

        lblError.setBackground(new java.awt.Color(255, 255, 255));
        lblError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        logIn();
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogIn1ActionPerformed
        new FormSignUp().setVisible(true);
    }//GEN-LAST:event_btnLogIn1ActionPerformed

    private void adjustForm() {
        setLocationRelativeTo(null);
        this.setTitle("Prijavljivanje");
        getContentPane().setBackground(ColorConstant.GREEN_SPRING);
        pnlLogIn.setBackground(ColorConstant.GREEN_SPRING);
        lblError.setForeground(Color.WHITE);
    }

    private void decorateForm() {
        this.setUndecorated(true);
        TitleBar titleBar = new TitleBar("Dental Assistant", this);
        this.add(titleBar, BorderLayout.NORTH);
        this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnLogIn1;
    private javax.swing.JLabel lblError;
    private javax.swing.JPanel pnlLogIn;
    // End of variables declaration//GEN-END:variables

    //Moja polja
    MyField pnlUsername;
    MyField pnlPassword;

    //Dodeljivanje vrednosti mojim poljima
    private void initFields() {
        pnlUsername = new MyInputTextField("Korisničko ime:", "", null, true);
//        pnlUsername.setValue("miko");
        pnlPassword = new MyInputPasswordField("Šifra:", "", null, true);
//        pnlPassword.setValue("mikomaric");
        pnlLogIn.add(pnlUsername);
        pnlLogIn.add(pnlPassword);
    }

    private void logIn() {
        lblError.setText("");
        String username = pnlUsername.getValue().toString().trim();
        String password = pnlPassword.getValue().toString();
        if (!username.isEmpty() && !password.isEmpty()) {
            try {
                User user = Controller.getInstance().logIn(username, password);
                Session.getInstance().setUser(user);
                new FormMain().setVisible(true);
                this.dispose();
            } catch (MyNotAuthorizedException e) {
                lblError.setText("Pogrešno korisničko ime i/ili šifra");
            }catch(Exception e){
                lblError.setText("Sistem ne može da autentifikuje korisnika, pokušajte ponovo");
                System.out.println(e.getMessage());
            }
        } else {
            lblError.setText("Podaci nisu uneti");
        }
    }
}
