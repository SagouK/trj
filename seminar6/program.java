package seminar6;



public class program {
    public static void main(String[] args) {
        Notebook n1 = new Notebook();
        n1.model = "ASUS Laptop 15 F515EA-BQ774";
        n1.CPU = "Intel Core i5-1135G7";
        n1.OS = "Windows 10";
        n1.RAM = 8;
        n1.videoCard = "Intel Iris Xe Graphics";
        n1.volumeSSD = 512;

        Notebook n2 = new Notebook();
        n2.model = "Irbis NB77";
        n2.CPU = "Intel Atom Z3735F";
        n2.OS = "Windows 7";
        n2.RAM = 2;
        n2.videoCard = "Intel HD Graphics";
        n1.volumeSSD = 128;

        Notebook n3 = new Notebook();
        n3.model = "Lenovo ThinkPad X1 Extreme G5";
        n3.CPU = "Intel Core i7-12700H";
        n3.OS = "Windows 11";
        n3.RAM = 32;
        n3.videoCard = "GeForce RTX 3050 Ti";
        n3.volumeSSD = 512;

        Integer userNum = n1.getNumberFromUser();
        n1.filtrCriteria(userNum);
        
    }

    

    
}
