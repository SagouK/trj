
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
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Notebook {
    String model;
    String OS;
    String CPU;
    int RAM; // GB
    int volumeSSD; // GB
    String videoCard;

    public Notebook(String model, String OS, String CPU, int RAM, int volumeSSD, String videoCard) {
        this.model = model;
        this.OS = OS;
        this.CPU = CPU;
        this.RAM = RAM;
        this.volumeSSD = volumeSSD;
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "model:" + model +
                ", OS:" + OS +
                ", CPU:" + CPU +
                ", RAM:" + RAM +
                ", volumeSSD:" + volumeSSD +
                ", videoCard:" + videoCard +
                '}';
    }
    

    public HashMap<Integer, Integer> getcritberFromUser(){
        System.out.println("Ниже представлены критерии ноутбуков. Введите цифру, соответствующую критерию:" + "\n"
        + "1. Процессор" + "\n" + "2. Операционная система" + "\n" + "3. Объем ОЗУ" + "\n" + "4. Видеокарта" + "\n"
        + "5. Объем SSD");


        Scanner iScanner = new Scanner(System.in);
        Integer critberCriteria = iScanner.nextInt();

        System.out.println("Введите минимальное значение по указанному критерию: ");


        Scanner kScanner = new Scanner(System.in);
        Integer minValue = iScanner.nextInt();


        iScanner.close();
        kScanner.close();

        HashMap<Integer, Integer> criteries = new HashMap<>();
        criteries.put(critberCriteria, minValue);

        return criteries;
    }

    public void filtrCriteria(HashMap <Integer, Integer> parameters, HashSet<Notebook> dataNotes) {
        String ssd = Integer.toString(volumeSSD);
        String ram = Integer.toString(RAM);
        
        HashMap <Integer, String> criteries = new HashMap<>();
        criteries.put(1, CPU);
        criteries.put(2, OS);
        criteries.put(3, ram);
        criteries.put(4, videoCard);
        criteries.put(5, ssd);

        for (Map.Entry<Integer, Integer> entry : parameters.entrySet()) {
            if (criteries.containsKey(entry.getKey())) {
                if (entry.getKey().equals(3)) {

                    int r = Integer.parseInt(ram);
                    
                    if (entry.getValue() <= (r)) {
                        System.out.println("Ноутбуки, соответствующие условиям фильтрации" + criteries);
                        break;
                    }
                    else {
                        System.out.println("Нет ноутбуков, соответствующих вашим условиям.");
                    }
                }
                else if (entry.getKey().equals(5)){
                    int s = Integer.parseInt(ssd);
                    if (entry.getValue() <= (s)){
                        System.out.println("Ноутбуки, соответствующие условиям фильтрации" + criteries);
                        break;
                    }
                    else {
                        System.out.println("Нет ноутбуков, соответствующих вашим условиям.");
                    }
                }
                else {
                    System.out.println("Данный критерий нельзя отфильтровать.");
                }
                break;
            }
            

            else {
                System.out.println("Такого критерия нет, укажите цифру критериев, указанных ниже.");
            }
        }
        
    }


    public String getModel() {
        return model;
    }

    public String getOS() {
        return OS;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getVolumeSSD() {
        return volumeSSD;
    }

    public String getVideoCard() {
        return videoCard;
    }
}