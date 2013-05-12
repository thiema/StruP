package easyflow.custom.jgraphx.editor;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		final JPanel panel = new JPanel(new GridLayout(0,1));
		JLabel lblNewLabel = new JLabel("Label1");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setVisible(true);
			}
			
		});
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("Label2");
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
		
		
		JFormattedTextField f1=new JFormattedTextField("text...");
		JFormattedTextField f2=new JFormattedTextField("..text");
		JFormattedTextField f3=new JFormattedTextField("..test..");
		panel.add(f1);
		panel.add(f2);
		panel.add(f3);
		
		contentPane.add(panel, BorderLayout.SOUTH);
	}

}
