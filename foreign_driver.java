public class foreign_driver extends driver implements Cloneable {
	protected long RPV_id; // Номер разрешения на временное проживание

	// Конструктор
	public foreign_driver(String name, String surname, String phone_number, long RPV_id) {
		super(name, surname, phone_number);
		this.RPV_id = RPV_id;
	}
	// Переопределние метода вывода
	public void print_driver() {
		super.print_driver();
		System.out.print("\nНомер разрешения на временное проживание: ");
		System.out.print(RPV_id);
	}
	// Переопределение toString
	@Override
	public String toString() {
		return "\nИмя водителя: " + name
			+ "\nФамилия водителя: " + surname
			+ "\nНомер телефона водителя: " + phone_number
			+ "\nНомер разрешения на временное проживание: "
			+ RPV_id;
	}
	// Мелкое клонирование
	/* @Override
	public foreign_driver clone() throws CloneNotSupportedException {
		return (foreign_driver) super.clone();
	}
	*/
	// Глубокое клонирование
	@Override
	public foreign_driver clone() throws CloneNotSupportedException {
		foreign_driver new_driver = (foreign_driver) super.clone();
		return new_driver;
	}
}