
import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class task_10 {
    
    public static void main(String[] args) {
        System.out.println(enqueue());
        System.out.println(dequeue(enqueue()));
        System.out.println(first(dequeue(enqueue())));
    }

    public static LinkedList<Integer> enqueue() {
        LinkedList <Integer> queue = new LinkedList<>();
        queue.add(19);
        queue.add(3);
        queue.add(122);
        return queue;
    }

    public static LinkedList<Integer> dequeue(LinkedList <Integer> list) {
        list.removeFirst();
        return list;
    }  

    public static Integer first(LinkedList <Integer> list) {
        return list.getFirst();
    }  
}
