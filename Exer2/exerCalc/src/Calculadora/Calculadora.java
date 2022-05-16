
package Calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Calculadora {
    public void gerarFormCalc() {
        JFrame frmCalc = new JFrame();
        frmCalc.setSize(600,600);
        frmCalc.setTitle("Calculadora");
        frmCalc.setLocation(700,300);
        
        JPanel calc = new JPanel();
        
        JButton botao[] = new JButton[16];
        
        botao[0] = new JButton("7");
        botao[1] = new JButton("8");
        botao[2] = new JButton("9");
        botao[3] = new JButton("/");
        
        botao[4] = new JButton("4");
        botao[5] = new JButton("5");
        botao[6] = new JButton("6");
        botao[7] = new JButton("x");
        
        botao[8] = new JButton("1");
        botao[9] = new JButton("2");
        botao[10] = new JButton("3");
        botao[11] = new JButton("-");
        
        botao[12] = new JButton("0");
        botao[13] = new JButton(".");
        botao[14] = new JButton("=");
        botao[15] = new JButton("+");
        
        for (int i = 0; i < 16; i++) {
            calc.add(botao[i]);
        }
        
        
        
        
        
               
        
        calc.setLayout(new GridLayout(4,3,10,10));
        frmCalc.setLayout(new BorderLayout(10,10));
        
        frmCalc.add(BorderLayout.CENTER, calc);
        
        frmCalc.getContentPane().add(calc);
        frmCalc.setVisible(true);
        frmCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
