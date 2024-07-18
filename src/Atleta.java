import javax.swing.*;

public class Atleta {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do atleta"));

        if(idade < 18){
            System.out.println("O Atleta esta na categoria: Juvenil");
        } else if(idade >= 18 && idade <= 40){
            System.out.println("O Atleta esta na categoria: Adulto");
        } else if(idade > 40){
            System.out.println("O Atleta esta na categoria: Master");
        }

    }
}
