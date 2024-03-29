/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.IValue;
import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author student1
 */
public class AdvancedPersonViewFactory implements PersonViewFactory{

    @Override
    public IValue getFirstNamePanel() {
        PanelInputTextField inputFirstName=new PanelInputTextField();
        
        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        
        return inputFirstName;
    }

    @Override
    public IValue getLastNamePanel() {
        PanelInputTextField inputLastName=new PanelInputTextField();
        
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        
        return inputLastName;
    }

    @Override
    public IValue getDatePanel() {
        PanelInputDate inputDate=new PanelInputDate();
        
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputDate.initialize("2000");
        
        return inputDate;
    }

    @Override
    public IValue getGenderPanel() {
        PanelInputComboBox inputGender=new PanelInputComboBox();
        
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        List<Gender> genders = new ArrayList<>();
        genders.add(Gender.MALE);
        genders.add(Gender.FEMALE);
        inputGender.initialize(genders);
        
        return inputGender;
    }
    
//    @Override
//    public JPanel getPersonView() {
//        
//        JPanel panelTemplate=new JPanel();
//        panelTemplate.setLayout(new GridLayout(4, 1));
//        PanelInputTextField inputFirstName=new PanelInputTextField();
//        PanelInputTextField inputLastName=new PanelInputTextField();
//        PanelInputDate inputDate=new PanelInputDate();
//        PanelInputComboBox inputGender=new PanelInputComboBox();
//        
//        inputFirstName.getLblFieldText().setText("First name:");
//        inputFirstName.getLblError().setText("");
//        inputFirstName.initialize("");
//        inputLastName.getLblFieldText().setText("Last name:");
//        inputLastName.getLblError().setText("");
//        inputLastName.initialize("");
//        inputDate.getLblFieldText().setText("Date:");
//        inputDate.getLblError().setText("");
//        inputDate.initialize("2000");
//        inputGender.getLblFieldText().setText("Gender:");
//        inputGender.getLblError().setText("");
//        List<Gender> genders = new ArrayList<>();
//        genders.add(Gender.MALE);
//        genders.add(Gender.FEMALE);
//        inputGender.initialize(genders);
//        
//        panelTemplate.add(inputFirstName);
//        panelTemplate.add(inputLastName);
//        panelTemplate.add(inputDate);
//        panelTemplate.add(inputGender);
//        
//        return panelTemplate;
//    }
    
}
