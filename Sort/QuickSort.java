public class QuickSort{
    //returns pivot index
    public static int parition(int arr[],int low,int high){
        int pivot=arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap with lesser element found st i with j 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //to determine pivot's correct place
        i++;
        //swap with pivots right place and original high place
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index 
    }
    
    public static void quickSort(int arr[],int low,int high){
        if (low<high){
            int pivot = parition(arr,low,high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    public static void main(String args[]){
        int arr[] ={6,3,9,5,2,8};
        int n=arr.length;
        
        quickSort(arr,0,n-1);

        //prining 
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}