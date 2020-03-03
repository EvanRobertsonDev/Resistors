/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistors;
import javax.swing.JOptionPane;

/**
 *
 * @author evrob0095
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resistor = JOptionPane.showInputDialog("What are the colours on"
                + " your resistor? \n Seperate each word with hyphens");
        resistor = resistor.toUpperCase();
        String colours[] = new String[10];
        colours[0] = "BLACK";
        colours[1] = "BROWN";
        colours[2] = "RED";
        colours[3] = "ORANGE";
        colours[4] = "YELLOW";
        colours[5] = "GREEN";
        colours[6] = "BLUE";
        colours[7] = "VIOLET";
        colours[8] = "GREY";
        colours[9] = "WHITE";
        String[] resistorColours = resistor.split("-");
        int num1 = 0;
        int num2 = 0;
        double mult = 0;
        for(int i = 0; i < resistorColours.length; i++){
            for (int k = 0; k < colours.length; k++) {
                if (resistorColours[i].equals(colours[k])) {
                    if (i == 0) {
                        num1 = k*10;
                    }
                    else if (i == 1) {
                        num2 = k;
                    }
                    else {
                        mult = Math.pow(10, k);
                    }
                    break;
                }
            }
        }
        System.out.println("The resistor is " + ((num1 + num2)*mult) + " ohms");
        
    }
    
}
