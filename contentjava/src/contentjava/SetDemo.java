package contentjava;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        
        Student st = new Student();
        st.setRoll(1);
        st.setName("Ram");

        Set<Student> students = new HashSet<Student>();
        students.add(st);

        Student st1 = new Student();
        st1.setRoll(2);
        st1.setName("Manish");
        students.add(st1);

        System.out.println("Roll\tName");

        for (Student s : students) {
            System.out.println(s.getRoll() + "\t" + s.getName());
        }
    }
}