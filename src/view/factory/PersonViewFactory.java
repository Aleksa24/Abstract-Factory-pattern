/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory;

import components.IValue;
import javax.swing.JPanel;


/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public interface PersonViewFactory {
    
     IValue getFirstNamePanel();
     IValue getLastNamePanel();
     IValue getDatePanel();
     IValue getGenderPanel();
}
