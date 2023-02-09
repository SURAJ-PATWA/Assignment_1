public class SecondLargestValue {

    public static void main(String[] args) {


        int arr[] = {12, 35, 1, 10, 34, 11};
        int first = -1;
        int second = -1;
        for (int i : arr){
           if(first<i){
               second=first;
               first=i;
           }
           if(first>i&&second<i){
               second=i;
           }
        }
        System.out.println(second);
    }
}



