
public class Selectionsort
{

 static   void swap(int arr[],int a , int b)
    {
        int temp;
        temp=arr[a];
        arr[a]=arr[b]; // here i have made the swapping function to simply swap the two values
        arr[b]=temp;

    }
    public static void main(String[] args) {
        
        int[] arr={5,4,3,2,1};
                 int n=5;  // let us suppose the size of the array arr
        for(int i=0;i<=n-2;i++)
        {
            int min=i;
            for(int j=i+1;j<=n-1;j++)
            {
                if(arr[j]<arr[min])                              
                {
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        for(int i=0;i<5;i++)
        {
      System.out.print(arr[i]+" ");
        }
    }
}
