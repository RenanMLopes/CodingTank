public class NumeroMaior {
    public static void main(String[] args) {
        int a = 4, b = 6, c = 77;
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
