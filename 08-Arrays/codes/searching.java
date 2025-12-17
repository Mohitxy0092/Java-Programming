public class searching{
  public static void main(String[] args) {
    int[] ar={1,2,3,4,5,6,7};
    int key=5;
    boolean found=false;
    int index= -1;
    //linear search
    for(int i=0;i<ar.length;++i) {
      if(ar[i]==key){
        found=true;
        index=i;
      }
    }
    if(found){
      System.out.println(key + " found in the array at index " + index );
    } else {
      System.out.println(key + " not found in the array.");
    }
    //binary search (array must be sorted)
    int s=0;
    int e=ar.length-1;
    found=false;
    index=-1;
    while(s<=e){
      int mid=s+((e-s)>>1);
      if(ar[mid]==key){
        found=true;
        index=mid;
        break;
      }else if(ar[mid]<key){
        s=mid+1;
      }else {
        e=mid-1;
      }
    }
    if(found){
      System.out.println(key + " found in the array using binary search at index " + index);
    } else {
      System.out.println(key + " not found in the array using binary search.");
    }
  }
}