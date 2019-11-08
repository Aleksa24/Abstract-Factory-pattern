/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import components.IValue;
import components.fields.PanelInputTextField;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;
import view.factory.impl.AdvancedPersonViewFactory;
import view.factory.impl.SimplePersonViewFactory;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public class FrmPersonView extends javax.swing.JPanel {

    /**
     * Creates new form FrmPersonView
     */
    public FrmPersonView(PersonViewFactory valueFactory) {
        initComponents();
        prepareView(valueFactory);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        panelPerson = new javax.swing.JPanel();

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        panelPerson.setBorder(javax.swing.BorderFactory.createTitledBorder("Person"));
        panelPerson.setLayout(new java.awt.GridLayout(1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 402, Short.MAX_VALUE)
                        .addComponent(btnSubmit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String personString = "";
        Component components[] = ((JPanel) panelPerson.getComponent(0)).getComponents();
        for (Component component : components) {
            if (component instanceof IValue) {
                personString += ((IValue) component).getValue() + " ";
            }
        }
        JOptionPane.showMessageDialog(this, personString);
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel panelPerson;
    // End of variables declaration//GEN-END:variables

    
    //client
    private void prepareView(PersonViewFactory valueAbstractFactory) {
        //Abstract factory
        PersonViewFactory AbstractFactory;
        AbstractFactory = valueAbstractFactory;
        //abstract products
        IValue inputFirstName = null;
        IValue inputLastName = null;
        IValue inputDate = null;
        IValue inputGender = null;
        //panel je ponuda ili krajnji proizvod 
        //kreiranje ponude tj panela
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        inputFirstName = AbstractFactory.getFirstNamePanel();
        inputLastName = AbstractFactory.getLastNamePanel();
        inputDate = AbstractFactory.getDatePanel();
        inputGender = AbstractFactory.getGenderPanel();
        
        panel.add((Component) inputFirstName);
        panel.add((Component) inputLastName);
        panel.add((Component) inputDate);
        panel.add((Component) inputGender);
     
        panelPerson.add(panel);
    }

    
}
