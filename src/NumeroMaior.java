import javax.swing.*;

public class NumeroMaior {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));

        int x = 0;

        if(num1 > num2 && num1 > num3){
            x = num1;
        }else if(num2 > num1 && num2 > num3){
            x = num2;
        }else
            x = num3;

        System.out.println("o maior número é:" + x);
    }
}
