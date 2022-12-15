// Пусть дан список сотрудников:Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин 
// Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна 
// Владимирова Иван Мечников Петр Петин Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

package seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task_13 {
    public static void main(String[] args) {
        Map <String, String> listEmployees = new HashMap<>();
        listEmployees.put("Иванов", "Иван");
        listEmployees.put("Петрова", "Светлана");
        listEmployees.put("Белова", "Кристина");
        listEmployees.put("Мусина", "Анна");
        listEmployees.put("Крутова", "Анна");
        listEmployees.put("Юрин", "Иван");
        listEmployees.put("Лыков", "Петр");
        listEmployees.put("Чернов", "Павел");
        listEmployees.put("Чернышов", "Петр");
        listEmployees.put("Федорова", "Мария");
        listEmployees.put("Светлова", "Марина");
        listEmployees.put("Савина", "Мария");
        listEmployees.put("Рыкова", "Мария");
        listEmployees.put("Лугова", "Марина");
        listEmployees.put("Владимирова", "Анна");
        listEmployees.put("Мечников", "Иван");
        listEmployees.put("Петин", "Петр");
        listEmployees.put("Ежов", "Иван");


        ArrayList <String> fNames = new ArrayList<>(listEmployees.values());
        Map <String, Integer> repeatitions = new HashMap<>();
        
        for (int i = 0; i < fNames.size(); i++) {
            String vot = fNames.get(i);
            if (!repeatitions.containsKey(vot)) {
                repeatitions.put(vot, 1);
            }
            else {
                repeatitions.put(vot, repeatitions.get(vot) + 1);

            }
        }
    
        for (Map.Entry<String, Integer> entry: repeatitions.entrySet()) {
            if (entry.getValue() > 1){
                System.out.println("Имя = " + entry.getKey() + ", Повторений = " + entry.getValue());
            }
        }

    }
}

