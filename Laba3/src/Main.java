import java.util.Arrays;

public class Main {
	static int[][] matrix;
	static int names_size = 8;
	static int states_size = 17;
	static String[] states;

	// 1
	static String[] names = { "AK", "Colt", "MG42", "M4", "M16", "Mauser", "M60", "RPK" };

	static String[] all_states = { "Shooting", "Reloading", "Colding", "Ready to shoot", "Broken", "Dirty", "Clean",
			"Silenced", "Used opriic", "Using laser", "2 hand mode", "Sniper mode", "Auto", "One", "Three" };

	// 2
	static void function(String name, String state) {
		int name_ind = Arrays.asList(names).indexOf(name);
		int state_ind = Arrays.asList(states).indexOf(state);

		matrix[name_ind][state_ind]++;
	}

	// 3
	static String[] fillArray(String[] all_variants, int count) {
		String[] target = new String[count];
		for (int i = 0; i < count; i++) {
			boolean has_repeat = false;
			do {
				int ind = (int) (Math.random() * all_variants.length);
				String elem = all_variants[ind];
				has_repeat = Arrays.asList(target).indexOf(elem) != -1;
				target[i] = elem;
			} while (has_repeat);

		}
		return target;
	}

	// 4
	static int[][] fillMatrix(int min, int max) {
		int[][] matrix = new int[names_size][states_size];

		for (int i = 0; i < names_size; i++) {
			for (int j = 0; j < states_size; j++) {
				matrix[i][j] = (int) (Math.random() * (max - min) + min);
			}
		}

		int sum = 0;
		for (int i = 0; i < names_size; i++) {
			for (int j = 0; j < states_size; j++) {
				sum += matrix[i][j];
			}
		}
		System.out.println("Сумма всех элементов = " + sum);
		return matrix;
	}

	// 5
	static void sortFirstRow(int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < i; j++) {
				if (matrix[0][i] > matrix[0][j]) {
					int tmp = matrix[0][i];
					matrix[0][i] = matrix[0][j];
					matrix[0][j] = tmp;
				}
			}
		}
		System.out.println("Отсортированный ряд");
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(matrix[0][i] + " ");
		}
		System.out.println();
	}

	// 6
	static int[][] copyFirstRow(int[][] matrix) {
		int[][] copy = new int[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			copy[i] = new int[matrix[i].length];
			for (int j = 0; j < matrix[i].length; j++) {
				copy[i][j] = matrix[i][j];
			}
		}
		System.out.println("Первый столбец");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][0]);
		}
		return copy;
	}

	// 7
	static void actionsCount() {
		int name_ind = (int) (Math.random() * names.length);
		String name = names[name_ind];

		int count = 0;
		for (int i = 0; i < matrix[name_ind].length; i++) {
			count += matrix[name_ind][i];
		}
		System.out.println(name + " выполнил " + count + " действий");
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		states = fillArray(all_states, 5);
		System.out.println("Выбранные дейсвтия");
		printArray(states);
		matrix = fillMatrix(0, 3);
		System.out.println("Матрица");
		printMatrix(matrix);
		sortFirstRow(matrix);
		System.out.println("Матрица после сортировки");
		printMatrix(matrix);
		int[][] copy = copyFirstRow(matrix);
		System.out.println("Копия");
		printMatrix(copy);
		actionsCount();
	}
}
