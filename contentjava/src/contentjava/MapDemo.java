package contentjava;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        
        Map<Integer, String> students = new HashMap<>();

       
        students.put(101, "Ram");
        students.put(102, "Sita");
        students.put(103, "Hari");
        students.put(104, "Sita");  

        
        System.out.println("Students Map: " + students);

        
        System.out.println("Student with ID 102: " + students.get(102));

        
        students.remove(103);

       
        System.out.println("After removing ID 103:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}