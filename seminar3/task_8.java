// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package seminar3;

import java.util.ArrayList;
import java.util.Random;

public class task_8 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);

        Integer min = list.get(0);
        Integer max = list.get(0);
        float aver = 0;
        float sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            else if (list.get(i) > max){
                max = list.get(i);
            }
            sum = sum + list.get(i);
            
        }
        aver = sum / list.size();
        
        System.out.printf("Сумма элементов = %f\n", sum);
        System.out.printf("Минимальный элемент = %d\n", min);
        System.out.printf("Максимальный элемент = %d\n", max);
        System.out.printf("Среднее арфметическое = %f\n", aver);
       
    }
}

