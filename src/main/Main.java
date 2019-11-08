/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import view.FrmPerson;
import view.FrmPersonView;
import view.FrmPersonv2;
import view.FrmPersonv4;
import view.factory.impl.AdvancedPersonViewFactory;
import view.factory.impl.SimplePersonViewFactory;
import view.formPersonv3;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public class Main {
        public static void main(String[] args) {
            JFrame main= new JFrame();
            //JPanel panel=new FrmPersonView(new SimplePersonViewFactory());
            JPanel panel=new FrmPersonView(new AdvancedPersonViewFactory());
            main.add(panel);
            main.pack();
            main.setVisible(true);
            main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
