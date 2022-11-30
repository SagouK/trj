// Реализовать простой калькулятор.

package seminar1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
    
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = iScanner.nextInt();

        System.out.println("Введите операцию (+, -, *, /, %): ");
        char userOperation = iScanner.next().charAt(0);
    
        System.out.println("Введите второе число: ");
        int secondNumber = iScanner.nextInt();

        
        System.out.println(calculator(firstNumber, userOperation, secondNumber));
        iScanner.close();
    }
    public static int calculator(int num1, char oper, int num2){
        int result = 0;
        if (oper == '+') result = num1 + num2;
        else if (oper == '-') result = num1 - num2;
        else if (oper == '/' && num2 != 0) result = num1 / num2;
        else if (oper == '/' && num2 == 0) System.out.println("Деление на 0 невозможно");
        else if (oper == '*') result = num1 * num2;
        else if (oper == '%') result = num1 % num2;
        else if (oper == '%' && num2 == 0) System.out.println("Деление на 0 невозможно");
        else System.out.println("Введите поддерживаемую операцию!");
        return result;
    }
}
