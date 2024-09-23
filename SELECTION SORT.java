import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr={9,4,7,2,8};
        int small;
        for(int i=0;i<arr.length;i++){
            small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    //small=j;
                    int temp=arr[small];
                    arr[small]=arr[j];
                    arr[j]=temp;
                }
            }
            /*int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;*/
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
}
