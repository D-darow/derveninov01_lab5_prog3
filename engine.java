import java.util.Scanner;

public class engine {
	private  int hs_power; // Лошадиные силы
	private int fuel; // Род топлива
	private int num_of_cylinders; // Количество цилиндров (от 2 до 16)

	// Конструтор по умолчанию
	public engine() {
		hs_power = 0;
		fuel = 1;
		num_of_cylinders = 2;
	}
	// Конструктор
	public engine(int hs_power, int fuel, int num_of_cylinders) {
		this.hs_power = hs_power;
		this.fuel = fuel;
		this.num_of_cylinders = num_of_cylinders;
	}
	// Установка лошадиных сил
	public void set_hs_power(int hs_power) {
		this.hs_power = hs_power;
	}
	// Получение лошадиных сил
	public int get_hs_power() {
		return hs_power;
	}
	// Установка рода топлива
	public void set_fuel(int fuel) {
		this.fuel = fuel;
	}
	// Получение рода топлива
	public int get_fuel() {
		return fuel;
	}
	// Установка количества цилиндров
	public void set_num_of_cylinders(int num_of_cylinders) {
		this.num_of_cylinders = num_of_cylinders;
	}
	// Получение количества цилиндров
	public int get_num_of_cylinders() {
		return num_of_cylinders;
	}
	// Ввод информации о двигателе
	public void input_engine() {
		int flag = 0;
		Scanner console = new Scanner(System.in);
		do {
			if (flag == 0) System.out.print("Введите кол-во лошадиных сил:");
			if (flag == 1) System.out.print("Ошибка. Введите кол-во лошадиных сил:");
			hs_power = console.nextInt();
			flag = 1;
		} while (hs_power < 0);
		flag = 0;
		do {
			if (flag == 0) System.out.print("Выберите род топлива (1 - бензин, 2 - дизель): ");
			if (flag == 1) System.out.print("Ошибка. Выберите род топлива (1 - бензин, 2 - дизель): ");
			fuel = console.nextInt();
			flag = 1;
		} while (fuel < 1 || fuel > 2);
		flag = 0;
		do {
			if (flag == 0) System.out.print("Введите кол-во цилиндров двигателя (2 - 16): ");
			if (flag == 1) System.out.print("Ошибка. Введите кол-во цилиндров двигателя (2 - 16): ");
			num_of_cylinders = console.nextInt();
			flag = 1;
		} while (num_of_cylinders < 2 || num_of_cylinders > 16);
		console = null;
	}
	// Вывод информации о двигателе
	public void print_engine() {
		System.out.print("\nКол-во лошадиных сил: ");
		System.out.print(hs_power);
		System.out.print("\nРод топлива: ");
		if (fuel == 1) {
			System.out.print("Бензин");
		}
		else {
			System.out.print("Дизель");
		}
		System.out.print("\nКоличество цилиндров:");
		System.out.print(num_of_cylinders);
	}
}