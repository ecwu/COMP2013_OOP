import javax.swing.JFrame;

public class Start {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MyFrame f = new MyFrame();
			}
		});

	}

}
