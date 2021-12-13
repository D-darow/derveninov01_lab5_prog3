import java.util.Scanner;

public class bus {
	private int bus_num; // Номер автобуса
	private int num_of_seats; // Занятые места (max 32)
	private engine bus_engine;
	private wheels bus_wheels;
	private driver bus_driver;
	private int price; // Цена проезда (Руб)
	private int sum; // Сумма заработанных денег

	// Конструктор
	public bus(int bus_num, int num_of_seats, 
		int price) 
	{
		this.bus_num = bus_num;
		this.num_of_seats = num_of_seats;
		this.price = price;
		sum = 0;
		bus_engine = new engine();
		bus_wheels = new wheels();
		bus_driver = new driver();
	}
	// Установка номера автобуса
	public void set_bus_num(int bus_num) {
		this.bus_num = bus_num;
	}
	// Получение номера автобуса
	public int get_bus_num() {
		return bus_num;
	}
	// Установка цены проезда
	public void set_price(int price) {
		this.price = price;
	}
	// Получение цены проезда
	public int get_price() {
		return price;
	}
	// Добавить пассажира
	public int add_passenger() {
		if (num_of_seats < 32) {
			num_of_seats += 1;
			int seats_left = 32 - num_of_seats;
			sum += price;
			System.out.print("\nПассажир успешно зашел в автобус и оплатил проезд.\nСвободных мест осталось: " + seats_left + "\n\n");
		}
		else {
			System.out.print("\nПассажир не смог занять место. Автобус переолнен.\n\n");
			return -1;
	}
	return 0;
	}
	// Убрать пассажира
	public int remove_passenger() {
		if (num_of_seats > 0) {
			num_of_seats -= 1;
			int seats_left = 32 - num_of_seats;
			System.out.print("\nПассажир успешно покинул автобус.\nСвободных мест осталось: " + seats_left + "\n\n");
		}
		else {
			System.out.print("\nОшибка. Автобус пуст.\n\n");
			return -1;
		}
		return 0;
	}
	// Ввод информации об автобусе
	public void init_bus() {
		int flag = 0;
		Scanner console = new Scanner(System.in);
		do {
			if (flag == 0) System.out.print("Введите номер автобуса: ");
			if (flag == 1) System.out.print("Ошибка. Введите номер автобуса: ");
			bus_num = console.nextInt();
			flag = 1;
		} while (bus_num < 0);
		flag = 0;
		do {
			if (flag == 0) System.out.print("Введите цену проезда: ");
			if (flag == 1) System.out.print("Ошибка. Введите цену проезда: ");
			price = console.nextInt();
			flag = 1;
		} while (price < 0);
		console = null;
		bus_engine.input_engine();
		bus_wheels.input_wheels();
		bus_driver.input_driver();
	}
	// Вывод информации об автобусе
	public void print_bus() {
		System.out.print("\nНомер автобуса: ");
		System.out.print(bus_num);
		System.out.print("\nЗанятые места: " + num_of_seats + " из 32");
		System.out.print("\nЦена проезда: ");
		System.out.print(price);
		System.out.print("\nСумма заработанных денег: ");
		System.out.print(sum);
		bus_engine.print_engine();
		bus_wheels.print_wheels();
		bus_driver.print_driver();
	}
};