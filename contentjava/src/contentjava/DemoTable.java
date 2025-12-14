package contentjava;

import javax.swing.*;

public class DemoTable {
    public static void main(String[] args) {

        JFrame f = new JFrame("Table Demo");

        String data[][] = {
                {"1", "Manish", "20"},
                {"2", "Kiran", "21"},
                {"3", "Sita", "19"}
        };

        String column[] = {"ID", "Name", "Age"};

        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);

        f.add(sp);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
