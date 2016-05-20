package SCLab;

public class Testing {
  private String wifi_name;
  private int wifi_number;
  
  class Testing(){};
  class Testing(wifi_name, wifi_number);
  
  class void print()
  {
    System.out.println(wifi_name, wifi_number);
  }
  
  public static void main(String[] args)
  {
    Testing test = new Testing(DGU, 12345);
    test.print();
  }

}
