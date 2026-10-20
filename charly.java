package gthub;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class charly {

	private JFrame frmHolaGit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					charly window = new charly();
					window.frmHolaGit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public charly() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHolaGit = new JFrame();
		frmHolaGit.setTitle("HOLA GIT");
		frmHolaGit.setBounds(100, 100, 450, 300);
		frmHolaGit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHolaGit.setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("hola a todos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		lblNewLabel.setToolTipText("");
		frmHolaGit.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}

}
