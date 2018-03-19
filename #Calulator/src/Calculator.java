import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btn;
	private JButton btnmin;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnmul;
	private JButton btn2;
	private JButton btn1;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 251, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 215, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 116, 50, 50);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(65, 116, 50, 50);
		frame.getContentPane().add(btn8);
		
		    btn9 = new JButton("9");
		    btn9.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent arg0) {
		    		
		    		String EnterNumber = textField.getText() + btn9.getText();
					textField.setText(EnterNumber);
		    	}
		    });
			btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn9.setBounds(120, 116, 50, 50);
			frame.getContentPane().add(btn9);
			
			btnmin = new JButton("-");
			btnmin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations= "-";
				}
			});
			btnmin.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnmin.setBounds(175, 116, 50, 50);
			frame.getContentPane().add(btnmin);
			
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNumber = textField.getText() + btn4.getText();
					textField.setText(EnterNumber);
				}
			});
			btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn4.setBounds(10, 171, 50, 50);
			frame.getContentPane().add(btn4);
			
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNumber = textField.getText() + btn5.getText();
					textField.setText(EnterNumber);
				}
			});
			btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn5.setBounds(65, 171, 50, 50);
			frame.getContentPane().add(btn5);
			
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String EnterNumber = textField.getText() + btn6.getText();
					textField.setText(EnterNumber);
				}
			});
			btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn6.setBounds(120, 171, 50, 50);
			frame.getContentPane().add(btn6);
			
			btnmul = new JButton("*");
			btnmul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations= "*";
				}
			});
			btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnmul.setBounds(175, 171, 50, 50);
			frame.getContentPane().add(btnmul);
			
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNumber = textField.getText() + btn2.getText();
					textField.setText(EnterNumber);
				}
			});
			btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn2.setBounds(65, 226, 50, 50);
			frame.getContentPane().add(btn2);
			
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNumber = textField.getText() + btn1.getText();
					textField.setText(EnterNumber);
				}
			});
			btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn1.setBounds(10, 226, 50, 50);
			frame.getContentPane().add(btn1);
			
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNumber = textField.getText() + btn3.getText();
					textField.setText(EnterNumber);
				}
			});
			btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn3.setBounds(120, 226, 50, 50);
			frame.getContentPane().add(btn3);
			
			JButton btnd = new JButton("/");
			btnd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations= "/";
				}
			});
			btnd.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnd.setHorizontalAlignment(SwingConstants.RIGHT);
			btnd.setBounds(175, 226, 50, 50);
			frame.getContentPane().add(btnd);
			
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNumber = textField.getText() + btn0.getText();
					textField.setText(EnterNumber);
				}
			});
			btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn0.setBounds(10, 281, 50, 50);
			frame.getContentPane().add(btn0);
			
			JButton btndot = new JButton(".");
			btndot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNumber = textField.getText() + btndot.getText();
					textField.setText(EnterNumber);	
				}
			});
			btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
			btndot.setBounds(65, 281, 50, 50);
			frame.getContentPane().add(btndot);
			
			JButton btnequal = new JButton("=");
			btnequal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String answer;
					secondnum= Double.parseDouble(textField.getText());
					if(operations =="+")
					{
						result = firstnum+ secondnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if(operations =="-")
					{
						result = firstnum- secondnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if(operations =="*")
					{
						result = firstnum* secondnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if(operations =="/")
					{
						result = firstnum/ secondnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if(operations =="%")
					{
						result = firstnum% secondnum;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
				}
			});
			btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnequal.setBounds(175, 281, 50, 50);
			frame.getContentPane().add(btnequal);
			
			JButton btnplmi = new JButton("+-");
			btnplmi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double ops = Double.parseDouble(String.valueOf(textField.getText()));
					ops =ops * (-1);
					textField.setText(String.valueOf(ops));
				}
			});
			btnplmi.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnplmi.setBounds(120, 281, 50, 50);
			frame.getContentPane().add(btnplmi);
			
			JButton btnback = new JButton("<-");
			btnback.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String btnback=null;
					
					if(textField.getText().length()>0)
					{
						StringBuilder strB = new StringBuilder(textField.getText());
						strB.deleteCharAt(textField.getText().length() - 1);
						btnback = strB.toString();
						textField.setText(btnback);
					}
				}
			});
			btnback.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnback.setBounds(10, 63, 50, 50);
			frame.getContentPane().add(btnback);
			
			JButton btnC = new JButton("C");
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					textField.setText(null);
				}
			});
			btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnC.setBounds(65, 63, 50, 50);
			frame.getContentPane().add(btnC);
			
			JButton btnmod = new JButton("%");
			btnmod.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations= "%";
				}
			});
			btnmod.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnmod.setBounds(120, 63, 50, 50);
			frame.getContentPane().add(btnmod);
			
			JButton btnpl = new JButton("+");
			btnpl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations= "+";
				}
			});
			btnpl.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnpl.setBounds(175, 63, 50, 50);
			frame.getContentPane().add(btnpl);
	}
}
