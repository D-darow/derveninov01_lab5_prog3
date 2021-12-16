public class Test {

   public static void main(String args[]){
   		// Создание объекта конструктором без параметров
		bus my_bus = new bus();
		my_bus.add_passenger();
		try
		{
			int check = my_bus.remove_passenger();
			if (check == -1) throw new Exception("\nАвтобус пуст.\n");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			int check = my_bus.remove_passenger();
			if (check == -1) throw new Exception("\nАвтобус пуст.\n");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
    }
}