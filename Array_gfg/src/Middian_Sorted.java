import java.util.Arrays;
import java.util.HashSet;

public class Middian_Sorted {
    public static void main(String[] args) {
        int array1[] =  {4,6};

         int array2[] =  {1,2,3,5};
         int m= array1.length;
       int n= array2.length;
      int arr[]=new int[m+n];
      for(int i=0;i<m;i++){
          arr[i]=array1[i];
      }
        for(int j=0;j<n;j++){
            arr[m+j]=array2[j];
        }
        Arrays.sort(arr);
//        for(int i=0;i<m+n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
        //int sum=(arr[0]+arr[m+n-1]);
  double mid=(double)(arr[0]+arr[m+n-1])/2;
        System.out.println(mid);

float var=(0+7)/2;
        System.out.println(var);

    }


}
