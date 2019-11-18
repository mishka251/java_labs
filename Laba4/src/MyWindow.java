import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import javax.swing.*;

public class MyWindow extends JFrame {
	public MyWindow(String title, int w, int h) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(w, h); 
		Color yellow1 = new Color(255, 255,0 );
		Color yellow2 = new Color(215, 215, 0);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		add(panel1);
		add(panel2);
		
		panel1.setSize(w/2, h);
		panel2.setSize(w/2, h);
		panel1.setLocation(0, 0);
		panel2.setLocation(w/2, 0);
		
		panel2.setLayout(null);
		
		panel1.setBackground(yellow1);
		panel2.setBackground(yellow2);
		
		JButton button1 = new JButton("Shot");
		JButton button2 = new JButton("Reload");
		JButton button3 = new JButton("Cold");
		JButton button4 = new JButton("Add silencer");
		
		JTextArea text1 = new JTextArea("������� 1 � 6 ��������� �����, ����� �������,"
				+ " ������ �� 15 ��������, ��� ���������" + 
				"QUESTION_MESSAGE � INFROMATION_MESSAGE \r\n" + 
				"������� 2 � ������ 500 �� 350, ������� � 2, ������ ��  ������� � 4, ����� ����� � 3, \r\n" + 
				"�������� � 2, ������ �.�., ������ �.�., 01.01.2101, ������� 4.\r\n" + 
				"������� 3 � ������� �������. \r\n" + 
				"������� 4 � �������� �� 8 ������. \r\n" + 
				"������� 5 � �������� �������� � �������� �� ������������ ASCII-����� ������ �" + 
				"��������� ���� ������� ����� ���������� ������ -7.");
		
		text1.setLocation(w/2, 50);
		text1.setSize(w/2, 100);
		  text1.setLineWrap(true);
	        text1.setWrapStyleWord(true);
		
		JLabel text2 = new JLabel("Text2");
		text2.setLocation(w/2, 0);
		text2.setSize(140, 20);
		
		JLabel text3 = new JLabel("Text3");
		text3.setLocation(w/2, 70);
		text3.setSize(140, 20);
		
		JTextField input1 = new JTextField("������� ��� ������");
		input1.setLocation(w/2, 100);
		input1.setSize(140, 20);
		
		JTextField input2 = new JTextField("������� ����������������");
		input2.setLocation(w/2, 130);
		input2.setSize(140, 20);
		
		JTextField input3 = new JTextField("������� ��� ��������");
		input3.setLocation(w/2, 160);
		input3.setSize(140, 20);
		
		JTextField input4 = new JTextField("������� ������� ��������");
		input4.setLocation(w/2, 190);
		input4.setSize(140, 20);
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		
		panel1.add(text1);
		panel2.add(text2);
		panel2.add(text3);
	
		panel2.add(input1);
		panel2.add(input2);
		panel2.add(input3);
		panel2.add(input4);
		
		
	}
}
