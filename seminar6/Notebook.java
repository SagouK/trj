
//     1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     2. Создать множество ноутбуков.
//     3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
//     Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:

// 1 - ОЗУ

// 2 - Объем ЖД

// 3 - Операционная система

// 4 - Цвет …

// 1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// 2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.



package seminar6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Notebook {
    String model;
    String OS;
    String CPU;
    int RAM; // GB
    int volumeSSD; // GB
    String videoCard;

    
    
    public void filtrCriteria(Integer crit) {
        Map <Integer, String> criteriaString = new HashMap<>();
        
        if (crit == 1){
            String userChoice = CPU;
            System.out.println("Введите необходимый критерий: ");
            Scanner iScanner = new Scanner(System.in);
            Integer critberCriteria = iScanner.nextInt();

            for (String cpu : n1.CPU) {
                
            }

        }
        
        // criteriaString.put(1, model);
        // criteriaString.put(2, OS);
        // criteriaString.put(3, CPU);
        // criteriaString.put(5, videoCard);
        // criteriaInt.put(4, RAM);
        // criteriaInt.put(6, volumeSSD);


        // System.out.println(criteriaInt);
        // System.out.println(criteriaString);
        // criteria.put(1, "Intel Core i5-1135G7\nIntel Atom Z3735F\nIntel Core i7-12700H");
        // criteria.put(2, "Windows 11\nWindows 10 Home Singe Language\nWindows 11 Pro");
        // criteria.put(3, "8\n2\n32");
        // criteria.put(4, "Intel Iris Xe Graphics\nIntel HD Graphics\nGeForce RTX 3050 Ti");
        // criteria.put(5, "512\n256\n128");

    }
    

    public Integer getcritberFromUser(){
        System.out.println("Ниже представлены критерии ноутбуков. Введите цифру, соответствующую критерию:" + "\n"
        + "1. Процессор" + "\n" + "2. Операционная система" + "\n" + "3. Объем ОЗУ" + "\n" + "4. Видеокарта" + "\n"
        + "5. Объем SSD");

        // Map <Integer, Integer> criteriaInt = new HashMap<>();

        Scanner iScanner = new Scanner(System.in);
        Integer critberCriteria = iScanner.nextInt();

        // System.out.println("Введите необходимый критерий: ");

        // Scanner kScanner = new Scanner(System.in);
        // Integer filter = kScanner.nextInt();

        // criteriaInt.put(critberCriteria, filter);

        iScanner.close();
        // kScanner.close();

        return critberCriteria;
    }
}