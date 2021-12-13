public class Test {

   public static void main(String args[]){
      bus[] bus_arr = new bus[2];
      bus_arr[0] = new bus(1, 0, 25);
      bus_arr[1] = new bus(2, 0, 30);
      for (int i = 0; i < 2; i++) {
      	bus_arr[i].init_bus();
      	System.out.print("\n");
      }
      for (int i = 0; i < 2; i++) {
      	bus_arr[i].print_bus();
      	System.out.print("\n");
      }
   }
}