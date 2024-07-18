import javax.swing.*;

public class NumeroMaior {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));

        int x = 0;

        if(a > b && a > c){
            x = a;
        }else if(b > a && b > c){
            x = b;
        }else
            x = c;

        System.out.println("o maior número é:" + x);
    }
}
