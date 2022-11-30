// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


package seminar2;

import java.util.Arrays;
import java.util.logging.*;
import java.io.*;

public class task_5 {
    public static void main(String[] args) throws IOException{
        int[] arr = {4,1,2,7,5,3,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArr(arr)));
    }


    public static int[] sortArr(int[] array) throws IOException {
        Logger logger = Logger.getLogger(task_5.class.getName());
        FileHandler info = new FileHandler("log.xml");
        logger.addHandler(info);
        XMLFormatter xml = new XMLFormatter();
        info.setFormatter(xml);
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
