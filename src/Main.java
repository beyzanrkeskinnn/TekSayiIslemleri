import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner inp = new Scanner(System.in);

        do {

            System.out.println("Sayi Girinzi: ");
            number = inp.nextInt();
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }
        }
        while (number % 2 == 0);
        System.out.println("Toplam : " + total);
    }
}
