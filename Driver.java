public class Driver{
  public static void main(String[]args){
    SuperArray SA = new SuperArray();
    System.out.println(SA);
    System.out.println(SA.add("Fish"));
    System.out.println(SA.add("Hi"));
    System.out.println(SA);
    System.out.println(SA.get(0));
    System.out.println(SA.get(3));
  }
}
