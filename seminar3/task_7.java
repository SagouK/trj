// Пусть дан произвольный список целых чисел, удалить из него четные числа

package seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class task_7 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        
        Iterator <Integer> iterator = list.iterator(); 
            while (iterator.hasNext()) {
                if (iterator.next() % 2 == 0) {
                    iterator.remove();
                }
            }
        System.out.println(list);
    }
    
}

