package Java_sem_1.Java_HW_1;

import java.nio.charset.Charset;
import java.util.Scanner;

/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */


public class hw_1 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите число n: ");
        int n = iScanner.nextInt();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res = res + i;
        }
        System.out.print("\nТреугольное число от n равно: " + res);
        int res2 = 1;
        for (int i = 1; i <= n; i++) {
            res2 = res2 * i;    
        }
        System.out.print("\nФакториал числа n равен: " + res2);
        iScanner.close();
    }
}
