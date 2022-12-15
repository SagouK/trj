// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package seminar5;

import java.util.HashMap;
import java.util.Map;

public class task_12 {
    public static void main(String[] args) {
        Map <Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(1234, "Иванов Иван");
        phoneBook.put(4556, "Иванов Иван");
        phoneBook.put(7642, "Сидоров Максим");
        phoneBook.put(7885, "Сидоров Максим");
        phoneBook.put(7424, "Котов Константин");

    
        System.out.println(phoneBook.entrySet());
    }
}