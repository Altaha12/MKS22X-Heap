import java.util.*;
public class MyHeap{
  private static void swap(int[] arr, int A, int B){
    int a = arr[A];
    int b = arr[B];
    arr[B] = a;
    arr[A] = b;
  }
  public static void heapify(int[] arr){
    int lo = 0;
    int hi = arr.length;
    int index = lo;
    while( index < hi )
    {
      int i = index;
      while(arr[i] > arr[(i-1)/2])
      {
        swap(arr,i,(i-1)/2);
        i = (i-1)/2;
      }
      index++;
    }
  }
  public static void heapsort(int[] arr){
    heapify(arr);
    int lo = 0;
    int hi =arr.length-1;
    while(hi > lo)
    {
      swap(arr,lo,hi);
      int i = lo;
      while((2*i+1<hi&&arr[i]<arr[2*i+1])||(2*i+2<hi&&arr[i]<arr[2*i+2]))
      {
        boolean a = false;
        boolean b = false;
        if(2*i+1<hi) a = true;
        if(2*i+2<hi) b = true;
        if(a&&b)
        {
          if(arr[2*i+1]>arr[2*i+2])
          {
            swap(arr,i,2*i+1);
            i = 2*i+1;
          }
          else
          {
            swap(arr,i,2*i+2);
            i = 2*i+2;
          }
        }
        else if(a)
        {
          swap(arr,i,2*i+1);
          i = 2*i+1;
        }
        else if(b)
        {
          swap(arr,i,2*i+2);
          i = 2*i+2;
        }
      }
      hi--;
    }
  }
  public static void main(String[] args) {
    int[] testA = new int[0];
    int[] testB = new int[]{1};
    int[] testC = new int[]{1,2};
    int[] testD = new int[]{1, 2, 3};
    int[] testE = new int[]{1,2,3,4,5,6,7,8,9,10,0,11};
    int[] testF = new int[]{67,78,986,3,47,8,3,6,8,48,658,4,98,52};

    System.out.println(Arrays.toString(testA));
    heapsort(testA);
    System.out.println(Arrays.toString(testA));

    System.out.println(Arrays.toString(testB));
    heapsort(testB);
    System.out.println(Arrays.toString(testB));

    System.out.println(Arrays.toString(testC));
    heapsort(testC);
    System.out.println(Arrays.toString(testC));

    System.out.println(Arrays.toString(testD));
    heapsort(testD);
    System.out.println(Arrays.toString(testD));

    System.out.println(Arrays.toString(testE));
    heapsort(testE);
    System.out.println(Arrays.toString(testE));

    System.out.println(Arrays.toString(testF));
    heapsort(testF);
    System.out.println(Arrays.toString(testF));
  }

}
