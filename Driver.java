public class Driver{
  public static void main(String[]args){
    SuperArray SA = new SuperArray();
    System.out.println(SA);
    System.out.println(SA.add("Fish"));
    System.out.println(SA.add("Hi"));
    System.out.println(SA);
    System.out.println(SA.get(0));
    System.out.println(SA.get(3));
    System.out.println(SA.set(0, "hello"));
    System.out.println(SA.set(1, "fish"));
    System.out.println(SA);
    for (int i = 1; i < 9; i++) {
      System.out.println(SA.add("dog"));
    }
    System.out.println(SA);
    System.out.println(SA.add("Fish"));
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println("___________");
    System.out.println(SA.contains("puppies"));
    System.out.println(SA.indexOf("puppies"));
    System.out.println(SA.indexOf("fish"));
    System.out.println(SA.lastIndexOf("puppies"));
    System.out.println(SA);
    System.out.println(SA.size());
    System.out.println(SA.lastIndexOf("dog"));
  }
}
