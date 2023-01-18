import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите n: ");//номер члена ряда
        int n = scanner.nextInt();
        System.out.print("Введите e: ");
        double e = scanner.nextDouble();

        double seriesSum = 0;
        double greaterThanESum = 0;
        double greaterThanE10Sum = 0;

        double an = 1;
        double anMinus1 = 1;
        for (int i = 1; i <= n; i++) {
            an = (i * (i + 1) / 2) * x * anMinus1;
            seriesSum += an;
            if (Math.abs(an) > e) {
                greaterThanESum += an;
            }
            if (Math.abs(an) > e / 10) {
                greaterThanE10Sum += an;
            }
            anMinus1 = an;
        }

        System.out.println("Сумма рядов: " + seriesSum);
        System.out.println("Сумма слагаемых, превышающих e по абсолютному значению: " + greaterThanESum);
        System.out.println("Сумма слагаемых, превышающих e/10 по абсолютному значению: " + greaterThanE10Sum);
    }
}