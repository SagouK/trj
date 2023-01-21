package seminar6;


import java.util.HashSet;
import java.util.HashMap;

public class program {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("ASUS Laptop 15 F515EA-BQ774", "Windows 10", "Intel Core i5-1135G7", 8, 512, "Intel Iris Xe Graphics");
        Notebook n2 = new Notebook("Irbis NB77", "Windows 7", "Intel Atom Z3735F", 2, 128, "Intel HD Graphics");
        Notebook n3 = new Notebook("Lenovo ThinkPad X1 Extreme G5", "Windows 11", "Intel Core i7-12700H", 32, 512, "GeForce RTX 3050 Ti");
        
        HashSet <Notebook> nots = new HashSet<>();
        nots.add(n1);
        nots.add(n2);
        nots.add(n3);
        
        
        HashMap <Integer, Integer> userValues = n1.getcritberFromUser();
    

        
        n1.filtrCriteria(userValues, nots);
        n2.filtrCriteria(userValues, nots);
        n3.filtrCriteria(userValues, nots);

        
        // n1.filtrMinValues(n1.minValues(), userNum, nots);
        // n2.filtrMinValues(n1.minValues(), userNum, nots);
        // n3.filtrMinValues(n1.minValues(), userNum, nots);
    }

    

    
}
