public class Test {

   public static void main(String args[]){
   		foreign_driver new_driver = new foreign_driver("Кто", "То", "967565678", 4325);
   		foreign_driver clone_driver = new foreign_driver("", "", "", 0);
   		// Глубокое клонирование
   		try {
            clone_driver = new_driver.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Вывод копии
   		System.out.print(clone_driver + "\n");
   		Circle my_circle = new Circle(2.345);
   		my_circle.print();
   		System.out.print("\nПлощадь круга = " + my_circle.getSquare());
    }
}