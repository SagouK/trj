// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


package seminar1;

import java.util.Arrays;
import java.util.logging.*;

public class task_5 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,7,5,3,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArr(arr)));
    }
    
    public static int[] sortArr(int[] array) {
        Logger logger = Logger.getLogger(task_5.class.getName());
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
        SimpleFormatter sFormat = new SimpleFormatter();
        info.setFormatter(sFormat);
        int temp = array[0];
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    logger.info("Iteration completed");
                }
            }
        }
        return array;
    }
}
