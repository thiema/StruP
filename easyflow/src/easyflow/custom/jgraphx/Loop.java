package easyflow.custom.jgraphx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class Loop extends JInternalFrame implements ActionListener{

	JComboBox c1 = new JComboBox(new DefaultComboBoxModel());
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Button");
	List<String> iteratingList = new ArrayList<String>();
	static int counter = 0, iteration = 1;

	public Loop(){
		initializeRelateEditorScreen();
	}

	private void initializeRelateEditorScreen(){
		
		setSize(900, 700);
		setVisible(true);
		b1.addActionListener(this);
		panel.add(b1);
		panel.add(c1);
		add(panel);
		
		iteratingList.add("a");
		iteratingList.add("b");
		iteratingList.add("c");
		iteratingList.add("d");
		
		iteratingList.add("e");
		iteratingList.add("f");
		iteratingList.add("g");
		iteratingList.add("h");
		
		iteratingList.add("i");
		iteratingList.add("j");
		iteratingList.add("k");
		iteratingList.add("l");
	}
	public void actionPerformed(ActionEvent e) {
		showArrayList();
	}
	public void showArrayList(){		 
		c1.removeAllItems();
		for(int i = counter; i < iteration * 4; i++){
			c1.addItem(iteratingList.get(counter++));
		}
		iteration ++;
	}
	public static void main(String...args){
		JFrame frame = new JFrame();
		JDesktopPane jdPane = new JDesktopPane();
		frame.setContentPane(jdPane);
		frame.setVisible(true);
		frame.setSize(1000,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Loop si = new Loop();		
		jdPane.add(si);
		si.setVisible(true);
	}


}
