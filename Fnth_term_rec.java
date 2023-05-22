import java.util.Scanner;

public class Fnth_term_rec{
    public static int a=1,s;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number(nth term) you wanna see: ");
        int n=sc.nextInt();
        System.out.println("The nth term is: "+term(n,1));
    }
    public static int term(int n,int i){
        if(i==n+1){
            return s;
        }
        int count=0,p=1;
        while(count!=i){
            p=p*a;
            a++;
            count++;
        }
        s=s+p;
        return term(n,i+1);
    }
    public static int term (int calculated, int current, int N)
  {
    int i, cur = 1;
    //Calculated is similar to a that I used as a
    //Current is used as index
    //cur is used as the product that I used as p
    // Base Condition
    if (current == N + 1)
      return 0;
    // product of terms till current
    for (i = calculated; i < calculated + current; i++)
      cur *= i;
    return cur + term (i, current + 1, N);
}
}