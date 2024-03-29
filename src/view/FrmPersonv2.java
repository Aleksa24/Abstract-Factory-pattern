/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.Gender;
import domain.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author student1
 */
public class FrmPersonv2 extends javax.swing.JFrame {

    /**
     * Creates new form FrmPersonv2
     */
    public FrmPersonv2() {
        initComponents();
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputFirstName = new components.fields.PanelInputTextField();
        inputLastName = new components.fields.PanelInputTextField();
        inputGender = new components.fields.PanelInputTextField();
        inputDate = new components.fields.PanelInputDate();
        btnSubmit = new javax.swing.JButton();
        btnSetPera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnSetPera.setText("Set Pera");
        btnSetPera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetPeraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSetPera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inputDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnSetPera))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         Person person = new Person();
        person.setFirstName((String) inputFirstName.getValue());
        person.setLastName((String) inputLastName.getValue());
        try {
            person.setDate((Date) inputDate.getValue());
        } catch (Exception ex) {
            Logger.getLogger(FrmPerson.class.getName()).log(Level.SEVERE, null, ex);
            inputDate.getLblError().setText(ex.getMessage());
            return;
        }
        try {
            person.setGender(Gender.valueOf((String) inputGender.getValue()));
        } catch (Exception e) {
            inputGender.getLblError().setText(e.getMessage());
        }
        JOptionPane.showMessageDialog(this, person.toString(),"Person is saved.", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSetPeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetPeraActionPerformed
        Person person=new Person();
        person.setFirstName("Pera");
        person.setLastName("Peric");
        person.setGender(Gender.MALE);
        person.setDate(new Date());
        inputDate.setValue(person.getDate());
        inputFirstName.setValue(person.getFirstName());
        inputLastName.setValue(person.getLastName());
        inputGender.setValue(person.getGender());
    }//GEN-LAST:event_btnSetPeraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPersonv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersonv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersonv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersonv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersonv2().setVisible(true);
            }
        });
    }
       private void prepareView() {
        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetPera;
    private javax.swing.JButton btnSubmit;
    private components.fields.PanelInputDate inputDate;
    private components.fields.PanelInputTextField inputFirstName;
    private components.fields.PanelInputTextField inputGender;
    private components.fields.PanelInputTextField inputLastName;
    // End of variables declaration//GEN-END:variables
}
