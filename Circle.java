// Пример интерфейса
interface Printable {
	void print();
}
// Производный класс окружности
public class Circle extends Figure implements Printable {
	private double radius;
	public Circle(double r) {
		radius = r;
	}
	// Площадь
	public double getSquare() {
		return radius * radius * 3.14;
	}
	// Периметр
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	// Печать
	public void print() {
		System.out.print("Радиус круга = " + radius);
	}
}