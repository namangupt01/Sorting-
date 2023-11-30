public class SortingProb1{
    
    public static void main(String[] args) {
        int [] arr ={32,42,0,11,3,0,99};
int len= arr.length;

        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                        if(arr[j]==0 && arr[j+1]!=0)
                        {
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
            }
        }

        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

// in this we have used the bubble sort algorithm to put all the zeros in the array after all the elements and kept the non-zero elements at their place ,
// here we have simply used the conditon arr[j] ==0 and the next element is arr[j+1]!=0 means a non zero element , then simply swap the two elements otherwise keep the same 
