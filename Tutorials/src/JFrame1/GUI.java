package JFrame1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		frame.setSize(700, 700);
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(null);
		JLabel lable = new JLabel("USER");
		lable.setBounds(10, 20, 80, 25);
		panel.add(lable);

	}

}
