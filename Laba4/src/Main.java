import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import javax.swing.*;

public class Main {

	static String input(String[] possible_values, String name) {

		String inputed = JOptionPane.showInputDialog(null, "введите " + name, "ввод", JOptionPane.OK_CANCEL_OPTION);

		while (Arrays.asList(possible_values).indexOf(inputed) == -1) {
			JOptionPane.showMessageDialog(null, "Неподходящее значение", "ошибка", JOptionPane.ERROR_MESSAGE);
			inputed = JOptionPane.showInputDialog(null, "введите " + name, "ввод", JOptionPane.OK_CANCEL_OPTION);

		}
		return inputed;
	}
	
	
	static void createWindow(String title, int w, int h) {
		JFrame myWindow		= new JFrame(title);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(w, h);
		myWindow.setVisible(true);
	}

	public static void main(String[] args) {

//		String[] input_info = new String[6];
//
//		String[] weapon_types = { "автомат", "пистолет", "пулемет" };
//		String input_type = input(weapon_types, "тип оружия");
//		input_info[0] = input_type;
//
//		String[] weapon_caliber = { "7.62", "5.45", "5.56", ".45", "7.92", "9x19", "9x18", ".50" };
//		String input_caliber = input(weapon_caliber, "калибр оружия");
//		input_info[1] = input_caliber;
//
//		String[] weapon_ammo_count = { "7", "10", "30", "45", "75", "100", "200" };
//		String input_ammo_count = input(weapon_ammo_count, "количество патронов");
//		input_info[2] = input_ammo_count;
//
//		String[] weapon_shot_speed = { "100", "200", "300", "600", "1000" };
//		String input_shot_speed = input(weapon_shot_speed, "скорострельность");
//		input_info[3] = input_shot_speed;
//
//		String[] weapon_name = { "AK", "MG42", "Colt", "M60", "M16" };
//		String input_name = input(weapon_name, "название оружия");
//		input_info[4] = input_name;
//
//		String[] weapon_silencer = { "Yes", "No" };
//		String input_silencer = input(weapon_silencer, "есть глушитель");
//		input_info[5] = input_silencer;
//		
//		
		String[] students = {"Фамилия1", "Фамилия2"};
		int variant = 7;
		LocalDate date =  LocalDate.now();
		
		 String[] all_states = { "Shooting", "Reloading", "Colding", "Ready to shoot", "Broken", "Dirty", "Clean",
				"Silenced", "Used opriic", "Using laser", "2 hand mode", "Sniper mode", "Auto", "One", "Three" };

		MyWindow window= new MyWindow(String.join(" ", students)+" "+variant+" "+date,  500, 350);
		window.setVisible(true);
		
		
		char[] first_chars= {'А', 'Б'};
		int sum = 0;
		for(int i =0; i<first_chars.length; i++) {
			int ascii=(int)first_chars[i];
			sum+=ascii*ascii;
		}
		System.out.println("�сумма кодов = "+( sum-7));
	}
}
