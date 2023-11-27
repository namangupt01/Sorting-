public class InsertonSort {
    public static void main(String[] args) {
        
        int[] arr = {5,3,2,6,8};

        for(int i =1;i<arr.length;i++)
        {
            int j=i;

            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }

          
        }
   
            for(int val:arr)
            {
                System.out.print(val+ " ");
            }

    }

}
