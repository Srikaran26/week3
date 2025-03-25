public class SelectionSort {

    static void Selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int smallIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallIndex]) {
                    smallIndex = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallIndex];
            arr[smallIndex]=arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={10,20,40,30};
        Selectionsort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }


    }
}
