/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Iago2
 */
public class JanelasOpcoes {

    public void sair() {
        //Fecha a janela onde o metodo está implementado
        Object[] op = {"Sim", "Não"};

        int i = javax.swing.JOptionPane.showOptionDialog(null,
                "Deseja realmente sair?", "ATENÇÃO ",
                javax.swing.JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);

        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
