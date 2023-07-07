package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 날짜 : 2023/07/07
 * 이름 : 이성찬
 * 내용 : Java Swing 실습하기
 * 
 * GUI 프로그래밍
 * - 사용자가 편히가 ㅔ프로그램을 사용할 수 있게 윈도우를 지원하는 프로그래밍
 * - Java는 GUI 개발을 위해 Swing 라이브러리 지원
 * - 편리한 GUI 개발을 위해 Windowbuiler 설치
 * 
 */
public class HelloSwingTest {

	public static void main(String[] args) {
		
		// 윈도우 생성
		JFrame frame = new JFrame("Hello Swing!"); 
		frame.setPreferredSize(new Dimension(300,200)); //Dimension 클래스는 너비와 높이 값을 나타내는 데 사용됩니다.
		frame.pack();// 이 메서드는 프레임(Frame)의 크기를 컨텐츠의 크기에 맞게 자동으로 조정하는 데 사용

	
		frame.setVisible(true); //setVisible(true) 메서드를 호출하면, 프레임이나 윈도우가 화면에 보이게 됩니다.
		
		// 컨테이너 생성 
		Container pane = frame.getContentPane();;
		
		// 컴포넌트 배치
		JLabel label = new JLabel("Hello Swing");
		pane.add(label);
		
		JButton button = new JButton("확인");
		button.setPreferredSize(new Dimension(2, 2));
		pane.add(button);
		
		
		
	}

}
