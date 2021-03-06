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
    System.out.println("___________");
    SA.add(19, "puppy");
    SA.add(2, "puppy");
    System.out.println(SA);
    System.out.println("___________");
    SA.remove(2);
    System.out.println(SA);
    System.out.println(SA.size());
    System.out.println(SA.remove(30));
    System.out.println(SA);
    System.out.println("___________");
    System.out.println(SA);
    SA.remove("dog");
    System.out.println(SA.remove("dog"));
    System.out.println(SA);
    System.out.println("___________");
    SuperArray A = new SuperArray(0);
    System.out.println(A.toStringDebug());
    System.out.println(A.add("fish"));
    System.out.println(A);
    SuperArray B = new SuperArray(15);
    System.out.println(B.toStringDebug());
    try{
      SuperArray TEST = new SuperArray(-20);
    } catch (IllegalArgumentException e){
      e.printStackTrace();
    }
    try{
      SA.remove(30);
    } catch (IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try{
      SA.add(-3, "word");
    } catch (IndexOutOfBoundsException e){
      e.printStackTrace();
    }
  }
}
