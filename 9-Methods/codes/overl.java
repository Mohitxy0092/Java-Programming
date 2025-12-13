public class overl{
  static int max(int a, int b) {
    return (a > b) ? a : b;
  }

  static float max(float a, float b) {
    return (a > b) ? a : b;
  }

  static int max(int a, int b, int c) {
    return max(max(a, b), c);
  }

  public static void main(String[] args) {
    System.out.println(max(10, 20));
    System.out.println(max(10.5f, 7.2f));
    System.out.println(max(5, 15, 10));
  }
}