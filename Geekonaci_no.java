import java.util.Scanner;

public class Geekonaci_no {
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int idx=3;
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            
            int ans = geekOnacci(a,b,c,n,idx);
            System.out.println(ans);
        }
	}
    public static int geekOnacci(int a,int b,int c,int n,int idx) {
        if(idx==n){
            return c;
        }
        int temp=c;
        c=a+b+c;
        a=b;
        b=temp;
        return geekOnacci(a, b, c, n, idx+1);
        
    }
}
