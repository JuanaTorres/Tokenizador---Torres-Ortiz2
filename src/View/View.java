package View;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	
	private Tokens_Panel panel1;
	private Tokenization_Panel panel2;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public View() {
		
		setSize(1100, 500);
		setTitle("Tokenizer - Juana Torres, Daniel Ortiz");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(240, 240, 240));
		setLocationRelativeTo(null);
		
		runPanels();
		
		setVisible(true);
		setResizable(false);
	}
	
	public void runPanels() {
		
		panel1 = new Tokens_Panel();
		panel1.setBounds(10, 10, 324, 400);
		add(panel1);
		
		panel2 = new Tokenization_Panel();
		panel2.setBounds(340, 10, 736, 440);
		add(panel2);
		
	}

	public void jopMessage(String mensaje, String titulo, int icono) {
		
		if(icono == 1) {
			
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(icono == 2) {
			
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
			
		}
	}
	
	public Tokens_Panel getPanel1() {
		return panel1;
	}

	public void setPanel1(Tokens_Panel panel1) {
		this.panel1 = panel1;
	}

	public Tokenization_Panel getPanel2() {
		return panel2;
	}

	public void setPanel2(Tokenization_Panel panel2) {
		this.panel2 = panel2;
	}
	
}