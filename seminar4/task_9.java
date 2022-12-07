// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.



import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class task_9 {
    static LinkedList <Integer> linkedL = new LinkedList<>();
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.printf("Изначальный массив: %s\n", Arrays.toString(arr));
        getReverseList(arr);
    }
    
    public static void getReverseList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            linkedL.addFirst(list[i]);
        }
        System.out.printf("Перевернутый массив: %s", linkedL);
    }
}
