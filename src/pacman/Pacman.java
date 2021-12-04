package pacman;

import javax.swing.JFrame;

public class Pacman extends JFrame {
	public Pacman() {
		add(new Model());

		
	}

	public static void main(String[] args) {
	Pacman pac=new Pacman();
	pac.setVisible(true);
	pac.setTitle("pacman Game ");
	pac.setSize(380,440);
	pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pac.setLocationRelativeTo(null);
	

	}

}
