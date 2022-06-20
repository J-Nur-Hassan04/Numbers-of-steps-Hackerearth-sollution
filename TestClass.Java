import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().trim().split("\\s+");
        String[] s2 = br.readLine().trim().split("\\s+");
 
        int[] a1 = new int[n];
        int[] b1 = new int[n];
    int i;
        for(i = 0; i< n; i++)
        {
            a1[i] = Integer.parseInt(s1[i]);
            b1[i] = Integer.parseInt(s2[i]);
        }
    
    int min = 0;
        for(i = 0; i<n; i++)
        {
            if(a1[i] < a1[min])
            min=i;
        }
    int steps=0;
        for(i =0; i<n; i++)
        {
            while(a1[i] != a1[min])
            {
                if(a1[i] <= 0)
                {
                    System.out.println("-1");
                    return;
                }
                if( a1[i] > a1[min] )
                {
                    a1[i] = a1[i]-b1[i];
                    steps++;
                }
                if(a1[min] > a1[i])
                {
                    a1[min] = a1[min] - b1[min];
                    steps++;
                }
 
            }
        }
        System.out.println(steps);
        
    }
}