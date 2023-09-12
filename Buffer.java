import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Buffer{
    public static void main(String[] args) throws IOException {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(inp.readLine());
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.readLine();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1].charAt(0));
    }
}