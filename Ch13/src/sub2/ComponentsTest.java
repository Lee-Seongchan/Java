package sub2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 10, 125, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1 클릭");
			}
		});
		btn1.setBounds(33, 60, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼 2 클릭");
			}
		});
		btn2.setBounds(155, 60, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭","확인대화상자",JOptionPane.YES_NO_OPTION);
			if(answer == 0) {
				System.out.println("Yes 클릭");
			}else {
				System.out.println("No 클릭");
			}
			
			}
		});
		btn3.setBounds(277, 60, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("Textfiled 실습");
		lblNewLabel_1.setBounds(12, 108, 87, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setBounds(22, 142, 43, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("이름");
		lblNewLabel_1_2.setBounds(22, 176, 43, 24);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("휴대폰");
		lblNewLabel_1_2_1.setBounds(22, 210, 43, 24);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		txtUid = new JTextField();
		txtUid.setBounds(77, 142, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(77, 176, 116, 21);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(77, 210, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lbUid = new JLabel("결과 : ");
		lbUid.setBounds(314, 151, 97, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 : ");
		lbName.setBounds(314, 185, 97, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 : ");
		lbHp.setBounds(314, 219, 97, 15);
		frame.getContentPane().add(lbHp);
		
		JLabel lblNewLabel_3 = new JLabel("Button 실습");
		lblNewLabel_3.setBounds(33, 44, 87, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : " + uid);
			}
		});
		btnUid.setBounds(205, 142, 97, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nmae = txtName.getText();
				lbName.setText("결과 : " + Nmae);
			}
		});
		btnName.setBounds(205, 176, 97, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Hp = txtHp.getText();
				lbHp.setText("결과 : " + Hp);
			}
		});
		btnHp.setBounds(205, 210, 97, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_2 = new JLabel("Check box 실습");
		lblNewLabel_2.setBounds(33, 277, 116, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(33, 298, 56, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(104, 298, 71, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(181, 298, 71, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("참외");
		chk4.setBounds(255, 298, 62, 23);
		frame.getContentPane().add(chk4);
		
		JLabel lbChkFruit = new JLabel("선택한 과일 :");
		lbChkFruit.setBounds(33, 338, 258, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
				}
				
				lbChkFruit.setText("선택한 과일 : " + fruits);
			}
		});
		btnChkFruit.setBounds(325, 298, 97, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 실습");
		lblNewLabel_4.setBounds(32, 384, 88, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(33, 405, 78, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(131, 405, 87, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lbGender = new JLabel("선택결과 :");
		lbGender.setBounds(33, 434, 185, 15);
		frame.getContentPane().add(lbGender);
		
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과 : " + rdMale.getText());
				}else {
					lbGender.setText("선택결과 : " + rdFemale.getText());
				}
				
			}
		});
		btnGender.setBounds(255, 405, 97, 23);
		frame.getContentPane().add(btnGender);
		
		
		
		
	}
}
