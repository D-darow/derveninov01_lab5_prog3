import java.util.Scanner;

public class driver {
	private String name; // Имя
	private String surname; // Фамилия
	private String phone_number; // Номер телефона

	// Конструктор по умолчанию
	public driver() {
		name = null;
		surname = null;
		phone_number = null;
	}
	// Конструктор
	public driver(String name, String surname, String phone_number) {
		this.name = name;
		this.surname = surname;
		this.phone_number = phone_number;
	}
	// Установка имени
	public void set_name(String name) {
		this.name = name;
	}
	// Получение имени
	public String get_name() {
		return name;
	}
	// Установка фамилии
	public void set_surname(String surname) {
		this.surname = surname;
	}
	// Получение фамилии
	public String get_surname() {
		return surname;
	}
	// Установка номера телефона
	public void set_phone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	// Получение номера телефона
	public String get_phone_number() {
		return phone_number;
	}
	// Ввод информации о водителе
	public void input_driver() {
		Scanner console = new Scanner(System.in);
		System.out.print("Введите имя водителя: ");
		name = console.nextLine();
		System.out.print("Введите фамилию водителя: ");
		surname = console.nextLine();
		System.out.print("Введите номер телефона водителя: ");
		phone_number = console.nextLine();
		console = null;
	}
	// Вывод информации о водителе
	public void print_driver() {
		System.out.print("\nИмя водителя: ");
		System.out.print(name);
		System.out.print("\nФамилия водителя: ");
		System.out.print(surname);
		System.out.print("\nНомер телефона водителя: ");
		System.out.print(phone_number);
	}
}