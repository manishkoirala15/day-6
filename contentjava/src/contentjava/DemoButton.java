package contentjava;


	import javax.swing.*;

	public class DemoButton {
	    public static void main(String[] args) {
	        JFrame f = new JFrame("Button Demo");

	        JButton btn = new JButton("Click Me");
	        btn.setBounds(50, 50, 120, 30);

	        f.add(btn);
	        f.setSize(300, 200);
	        f.setLayout(null);
	        f.setVisible(true);
	    }
	}


