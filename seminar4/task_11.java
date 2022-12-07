import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;


// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка. 2) Написать метод, который принимает массив элементов, 
// помещает их в очередь и выводит на консоль содержимое очереди. 


public class task_11 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.printf("Изначальный массив: %s\n", Arrays.toString(arr));

        getStack(arr);
        getQueue(arr);
    }

    public static void getStack(int[] list) {
        Stack <Integer> stack = new Stack<>();
        
        for (int i = 0; i < list.length; i++) {
            stack.push(list[i]);
        }
        System.out.println(stack);
    }

    public static void getQueue(int[] list) {
        Queue <Integer> queue = new LinkedList<>();
        for (int i = 0; i < list.length; i++) {
            queue.add(list[i]);
        }
        System.err.println(queue);
    }

}
