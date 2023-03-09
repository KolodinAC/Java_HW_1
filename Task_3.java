package Java_sem_1.Java_HW_1;
// Реализовать простой калькулятор (+ - / *)

import java.nio.charset.Charset;
import java.util.Scanner;

import javax.print.PrintException;

public class Task_3 {
    public static void main(String[] args) {
        try {
            System.out.print("Добро пожаловать в калькулятор!\n");
            Scanner iScanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            var n1 = iScanner.nextInt();
            System.out.print("Введите действие (+, -, *, /): ");
            var znak = iScanner.next();
            System.out.print("Введите второе число: ");
            var n2 = iScanner.nextInt();
            iScanner.close();

            var result = 0;
            switch (znak) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;
                default:
                    System.out.println("Вы ввели неправильные данные! Пожалуйста вводите только +,-,*,/");
                    break;
            }
            System.out.printf("Результат: %d %s %d = %d", n1, znak, n2, result);
        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные! Вводите только числа и знаки +,-,*,/ !");
        }
    }
}