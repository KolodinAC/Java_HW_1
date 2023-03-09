package Java_sem_1.Java_HW_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите положительное число до которого выводить простые числа: ");
        int input = iScanner.nextInt();
        iScanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPNum = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPNum = false;
                    break;
                }
            }

            if (isPNum) {
                primes.add(i);
            }
        }
        System.out.println("Вывожу простые числа от 2 до " + input + ": " + primes);
    }
}
