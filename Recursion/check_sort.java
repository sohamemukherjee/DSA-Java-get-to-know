//check sorted for sorted and strictly increasing

public class check_sort {
    public static boolean isSorted(int arr[], int i){
        if (i == arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return isSorted(arr,i+1);
        }
        else{
            return false;
        }
    }
    
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        boolean check=isSorted(a,0);
        System.out.println(check);    
    }
}
