package models;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRead {
    
    final String fileName="dolgozok.txt";
    ArrayList<Employee> empList=new ArrayList<>();

    public void readFile() {
        try {
            tryReadFile();
        }
        catch (FileNotFoundException e) {
            System.err.println("File nem található!");   
            System.err.println(e.getMessage());   
        }
    }

    public void tryReadFile() throws FileNotFoundException {
        
        File file = new File(fileName);
        Scanner sc =new Scanner(file,"utf-8");
        
        sc.nextLine();
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String lineFree=line.replace("\"","");
            // System.out.println(lineFree);


            String[] lineArray = lineFree.split(";");
            Employee emp=new Employee();
            emp.setId(Integer.parseInt(lineArray[0]));
            emp.setName(lineArray[1]);
            emp.setMothersName(lineArray[2]);
            emp.setCity(lineArray[3]);
            emp.setAddress(lineArray[4]);
            emp.setNetto(Integer.parseInt(lineArray[5]));
            emp.setRewards(Integer.parseInt(lineArray[6]));
            emp.setEntry(LocalDate.parse(lineArray[7]));
            emp.setBirthDate(LocalDate.parse(lineArray[8]));
            emp.setBirthPlace(lineArray[9]);
            this.empList.add(emp);
            // System.out.println(emp.getName());
        }
        sc.close();
    }           
}
