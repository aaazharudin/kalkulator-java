import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num1, num2;

        Scanner itung = new Scanner(System.in);
        System.out.println("Masukan angka:");

        num1 = itung.nextInt();
        num2 = itung.nextInt();

        System.out.println("Masukan Operator (+,-,*,/):");

        char Hitung = itung.next().charAt(0);
        int o = 0;

        switch (Hitung) {
            // case menambahkan 2 angka
            case '+':
                o = num1 + num2;
                break;
            case '-':
                o = num1 - num2;
                break;
            case '*':
                o = num1 * num2;
                break;
            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("Salah Inputan");
        }
        System.out.println("Hasil akhir:");
        System.out.println();

        // Print Hasil akhir
        System.out.println(num1 + " " + Hitung + " " + num2
                + " = " + o);
    }
}