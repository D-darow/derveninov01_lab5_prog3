public class Test {

   public static void main(String args[]){
      bus my_bus = new bus(0, 0, 25);
      my_bus.init_bus();
      my_bus.add_passenger();
      my_bus.print_bus();
   }
}