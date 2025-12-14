package contentjava;

import java.util.ArrayList;
import java.util.List;


public class ListDemo {		
	public static void main(String[] args) {

        
        List<String> names = new ArrayList<>();

        
        names.add("Ram");
        names.add("Sita");
        names.add("Hari");
        names.add("Sita"); 
        System.out.println("List of Names: " + names);

        
        System.out.println("First name: " + names.get(0));

        
        names.remove("Hari");

        
        System.out.println("After removing Hari:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}


