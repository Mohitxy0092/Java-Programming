class St {

  static {
    System.out.println("Block 1");
  }
  static {
    System.out.println("Block 2");
  }
}

public class StaticClass {
  public static void main(String args[]) {
    // St s=new St();// block 1 and block 2 will print first
    System.out.println("Main");
    St s = new St();// block 1 and block 2 will print Second
    /*
     St s=new St();
     St s1=new St();
     now in this s1 will not printed in console because
    JVM check if class St is intialized or not, if no then 
    it will initialize it by executing static blocks only once.
     */
  }
}