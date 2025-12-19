public class sum{
  public static void main(String[] args) {
    int[] ar={1,2,3,4,5,6,7};
    int sum=0;
    for(int x: ar){
      sum+=x;
    }
    System.out.println("Sum of Array : "+ sum);
    int arr[][]=
    {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12}
    };
    int sum1=0;
    for(int []x: arr){
      for(int y:x){
        sum1+=y;
      }
    }
    System.out.println("Sum of vector is :"+ sum1);
  }
}