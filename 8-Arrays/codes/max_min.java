public class max_min{
  public static void main(String[] args) {
    int[] ar={1,2,23,4,5,6,7};
    // finding max
    int maxi=Integer.MIN_VALUE;
    for(int x : ar) {
      if(maxi<x){
        maxi=x;
      }
    }
    System.out.println("Maximum value : "+maxi);
    //finding minimum value
    int mini=Integer.MAX_VALUE;
    for (int x : ar) {
      if (mini > x) {
        mini = x;
      }
    }
    System.out.println("Minimum value : " + mini);

    //finding second maximum
    int maxi1 = Integer.MIN_VALUE;
    int second_maxi=maxi1;
    for (int x : ar) {
      if (maxi1 < x) {
        second_maxi=maxi1;
        maxi1 = x;
      }
      else if(x>second_maxi && x!=maxi1){
        second_maxi=x;
      }
    }
    System.out.println("Second Maximum value : " + second_maxi);
  }
}