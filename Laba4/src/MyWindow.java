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
		
		JTextArea text1 = new JTextArea("Задание 1 – 6 элементов ввода, класс «Оружие»,"
				+ " массив на 15 значений, тип сообщения" + 
				"QUESTION_MESSAGE и INFROMATION_MESSAGE \r\n" + 
				"Задание 2 – Размер 500 на 350, Панелей – 2, Кнопок на  панелях – 4, Полей ввода – 3, \r\n" + 
				"Надписей – 2, Иванов И.И., Петров П.П., 01.01.2101, вариант 4.\r\n" + 
				"Задание 3 – Оттенки желтого. \r\n" + 
				"Задание 4 – Задержка на 8 секунд. \r\n" + 
				"Задание 5 – Разность большего и меньшего от произведений ASCII-кодов первой и" + 
				"последних букв фамилии двоих участников группы -7.");
		
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
		
		JTextField input1 = new JTextField("Введите тип оружия");
		input1.setLocation(w/2, 100);
		input1.setSize(140, 20);
		
		JTextField input2 = new JTextField("Введите скорострельность");
		input2.setLocation(w/2, 130);
		input2.setSize(140, 20);
		
		JTextField input3 = new JTextField("Введите тип патронов");
		input3.setLocation(w/2, 160);
		input3.setSize(140, 20);
		
		JTextField input4 = new JTextField("Введите емкость магазина");
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
