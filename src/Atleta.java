import javax.swing.*;

public class Atleta {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do atleta"));

        String categoria = (idade < 18) ? "Juvenil" : (idade <= 40) ? "Adulto" : "Master";
        System.out.println("o Atleta esta na categoria: " + categoria);

    }
}
