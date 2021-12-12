import java.util.Scanner;

public class wheels {
	private int diameter_of_disk; // Диаметр колеса (В дюймах)
	private int width_of_tire; // Ширина шины (В мм)

	// Конструктор по умолчанию
	public wheels(){
		diameter_of_disk = 0;
		width_of_tire = 0;
	}
	// Конструктор
	public wheels(int diametr, int width) {
		diameter_of_disk = diametr;
		width_of_tire = width;
	}
	// Установка диаметра колеса
	public void set_diametr_of_disk(int diametr) {
		diameter_of_disk = diametr;
	}
	// Получение диаметра колеса
	public int get_diametr_of_disk() {
		return diameter_of_disk;
	}
	// Установка ширины шины
	public void set_width_of_tire(int width) {
		width_of_tire = width;
	}
	// Получение ширины шины
	public int get_width_of_tire() {
		return width_of_tire;
	}
	// Ввод информации о колесах
	public void input_wheels() {
		int flag = 0;
		Scanner console = new Scanner(System.in);
		do {
			if (flag == 0) System.out.print("Введите диаметр диска (Дюйм): ");
			if (flag == 1) System.out.print("Ошибка. Введите диаметр диска (Дюйм): ");
			diameter_of_disk = console.nextInt();
			flag = 1;
		} while (diameter_of_disk < 0);
		flag = 0;
		do {
			if (flag == 0) System.out.print("Введите ширину шины (мм): ");
			if (flag == 1) System.out.print("Ошибка. Введите ширину шины (мм): ");
			width_of_tire = console.nextInt();
			flag = 1;
		} while (width_of_tire < 0);
		console = null;
	}
	// Вывод информации о колесах
	public void print_wheels() {
		System.out.print("\nДиаметр колеса (В дюймах): ");
		System.out.print(diameter_of_disk);
		System.out.print("\nШирина шины (В мм): ");
		System.out.print(width_of_tire);
	}
}