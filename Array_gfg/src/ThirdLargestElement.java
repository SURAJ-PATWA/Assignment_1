public class ThirdLargestElement {
    public static void main(String[] args) {


        int arr[] = {2,4,1,3,5};
        int first = -1;
        int second = -1;
        int third=-1;
        for (int i : arr){
            if(first<i){
                third=second;
                second=first;
                first=i;
            }
            if(first>i&&second<i){
                third=second;
                second=i;
            }
            if(second>i && third<i){
                third=i;
            }
        }
        System.out.println(third);
    }
}
