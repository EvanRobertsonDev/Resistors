/*
 * Evan Robertson
 * March 3 2020
 * Resistors.java
 * This progra, determines the amount of ohms a resistor resists based on the 
 * colored bands
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
        //Get input
        String resistor = JOptionPane.showInputDialog("What are the colours on"
                + " your resistor? \n Seperate each word with hyphens");
        //make all same case
        resistor = resistor.toUpperCase();
        String colours[] = new String[10];
        //create new array with each color
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
        //Split input into each color speratley
        String[] resistorColours = resistor.split("-");
        int num1 = 0;
        int num2 = 0;
        double mult = 0;
        //Nested loops to check if the input is equal to the colours
        for(int i = 0; i < resistorColours.length; i++){
            for (int k = 0; k < colours.length; k++) {
                //Check if input is equal
                if (resistorColours[i].equals(colours[k])) {
                    //First occurance
                    if (i == 0) {
                        num1 = k*10;
                    }
                    //second occurance
                    else if (i == 1) {
                        num2 = k;
                    }
                    //10x multiplier
                    else {
                        mult = Math.pow(10, k);
                    }
                    break;
                }
            }
        }
        //output answer
        System.out.println("The resistor is " + ((num1 + num2)*mult) + " ohms");
        
    }
    
}
