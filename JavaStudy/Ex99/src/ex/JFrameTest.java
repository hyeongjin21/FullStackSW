package ex;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("연습");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,300);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

}
