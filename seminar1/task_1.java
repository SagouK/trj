// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

package seminar1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int triangleNumber = iScanner.nextInt();
        iScanner.close();
        
        for (int i = 1; i <= triangleNumber; i++) {
            sum += i;
            mult *= i;
        }

        System.out.printf("Сумма = %s\n", sum);
        System.out.printf("Произведение = %s", mult);
    }
}

