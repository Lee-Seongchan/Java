package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myCalc {

	private JFrame frmMycalcvV;
	private JTextField txtDsp;
	
	private int num1 = 0;
	private int num2 = 0;
	private int operator = 0; //1:Plus 2:minus 3:multi 4:div
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myCalc window = new myCalc();
					window.frmMycalcvV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalcvV = new JFrame();
		frmMycalcvV.setTitle("myCalcv v1.0");
		frmMycalcvV.setBounds(100, 100, 450, 520);
		frmMycalcvV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalcvV.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setBackground(new Color(255, 255, 255));
		txtDsp.setEditable(false);
		txtDsp.setFont(new Font("굴림", Font.PLAIN, 24));
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 410, 42);
		frmMycalcvV.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(58, 77, 61, 61);
		frmMycalcvV.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(136, 77, 61, 61);
		frmMycalcvV.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(220, 77, 61, 61);
		frmMycalcvV.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(298, 77, 61, 61);
		frmMycalcvV.getContentPane().add(btnDiv);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(298, 168, 61, 61);
		frmMycalcvV.getContentPane().add(btnMulti);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(220, 168, 61, 61);
		frmMycalcvV.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(136, 168, 61, 61);
		frmMycalcvV.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(58, 168, 61, 61);
		frmMycalcvV.getContentPane().add(btn4);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(298, 267, 61, 61);
		frmMycalcvV.getContentPane().add(btnMinus);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(220, 267, 61, 61);
		frmMycalcvV.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = 2;
			}
		});
		btn2.setBounds(136, 267, 61, 61);
		frmMycalcvV.getContentPane().add(btn2);
		
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDsp.setText("1");
				num1 = 1;
			}
		});
		btn1.setBounds(58, 267, 61, 61);
		frmMycalcvV.getContentPane().add(btn1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
			}
		});
		btnPlus.setBounds(298, 367, 61, 61);
		frmMycalcvV.getContentPane().add(btnPlus);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
					if(operator == 1) {
						result = num1 + num2;
					}else if(operator == 2) {
						result = num1 - num2;
					}else if(operator == 3) {
						result = num1 * num2;
					}else if(operator == 4) {
						result = num1 / num2;
					}
					txtDsp.setText("" + result);
			}
		});
		btnEq.setBounds(220, 367, 61, 61);
		frmMycalcvV.getContentPane().add(btnEq);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(136, 367, 61, 61);
		frmMycalcvV.getContentPane().add(btnCancel);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(58, 367, 61, 61);
		frmMycalcvV.getContentPane().add(btn0);
	}
}
