public class Sum_within_range {
    public static int Bf(int n1,int n2){
        int sum=0;
        for(int i=n1;i<=n2;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static int rec(int n1,int n2){
        if(n1<n2){   
        if(n1==n2)
            return n1;
        return n1+rec(n1+1,n2);
        }
        else{
            if(n2==n1)
                return n2;
            return n2+rec(n1,n2+1);
        }
    }
    public static void main(String args[]) {
        int ans=rec(15,12);
        System.out.println(ans);
    }
}
