import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rearrange_array {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        //testcases
        int t =Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            //size of array
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[(int)n];

            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[(int)i]  =Integer.parseInt(st[(int)i]);

            //calling arrange() function
            new Rearrange().arrange(arr, n);

            //printing the elements
            for(int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends
