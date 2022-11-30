// Вывести все простые числа от 1 до 1000 

package seminar1;

public class task_2 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(2);
        for (int i = 3; i <= n; i++) {
            boolean flag = true;
            for (int j = i-1; j > 1; j--) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
    }
}
