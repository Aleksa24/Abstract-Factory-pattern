/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.IValue;
import components.fields.PanelInputTextField;
import java.awt.GridLayout;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public class SimplePersonViewFactory implements PersonViewFactory{

    @Override
    public PanelInputTextField getFirstNamePanel() {
        PanelInputTextField inputFirstName=new PanelInputTextField();
        
        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        
        return inputFirstName;
    }

    @Override
    public PanelInputTextField getLastNamePanel() {
        PanelInputTextField inputLastName=new PanelInputTextField();
        
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        
        return inputLastName;
    }

    @Override
    public PanelInputTextField getDatePanel() {
        PanelInputTextField inputDate=new PanelInputTextField();
        
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        
        return inputDate;
    }

    @Override
    public PanelInputTextField getGenderPanel() {
        PanelInputTextField inputGender=new PanelInputTextField();
        
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        
        return inputGender;
    }

//    @Override
//    public JPanel getPersonView() {
//        JPanel panelTemplate=new JPanel();
//        panelTemplate.setLayout(new GridLayout(4, 1));
//        PanelInputTextField inputFirstName=new PanelInputTextField();
//        PanelInputTextField inputLastName=new PanelInputTextField();
//        PanelInputTextField inputDate=new PanelInputTextField();
//        PanelInputTextField inputGender=new PanelInputTextField();
//        
//        inputFirstName.getLblFieldText().setText("First name:");
//        inputFirstName.getLblError().setText("");
//        inputLastName.getLblFieldText().setText("Last name:");
//        inputLastName.getLblError().setText("");
//        inputDate.getLblFieldText().setText("Date:");
//        inputDate.getLblError().setText("");
//        inputGender.getLblFieldText().setText("Gender:");
//        inputGender.getLblError().setText("");
//        
//        panelTemplate.add(inputFirstName);
//        panelTemplate.add(inputLastName);
//        panelTemplate.add(inputDate);
//        panelTemplate.add(inputGender);
//        
//        return panelTemplate;
//    }
    
}
