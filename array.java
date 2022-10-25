/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custodio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Custodio_CPE112
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "▬▬ι═══════ﺤ");
        JOptionPane.showMessageDialog(null, "⁽⁽(੭ꐦ •̀Д•́ )੭*⁾⁾");
        JOptionPane.showMessageDialog(null, "╭∩╮( •̀_•́ )╭∩╮");
        JOptionPane.showMessageDialog(null, "( -_•)╦̵̵̿╤─");
        JOptionPane.showMessageDialog(null, "(ง'̀-'́)ง");
        int ivan[] = new int[17];
        String c;
        float v = 0, sum = 0, average = 0;
        int count = 0;
        do {
            count = 0;
            sum = 0;
            average = 0;
            v = 0;
            for (int i = 0; i < 5; i++) {
                String r = JOptionPane.showInputDialog("enter valuefofor index: " + count);
                count = count + 1;
                int y = Integer.parseInt(r);
                JOptionPane.showMessageDialog(null, "value at index " + i + " = " + y);
                sum = y + v;
                v = sum;
                average = v / count;
            }
            do {
                c = JOptionPane.showInputDialog("[average] [sum]");
                switch (c) {
                    case "average":
                        JOptionPane.showMessageDialog(null, "the average is: " + average);
                        break;
                    case "sum":
                        JOptionPane.showMessageDialog(null, "the sum is: " + sum);
                        break;
                }
                c = JOptionPane.showInputDialog("Do you want to try again?");
            } while (c.equals("yes"));
            c = JOptionPane.showInputDialog("loop?");
        } while (c.equals("yes"));

    }

}
