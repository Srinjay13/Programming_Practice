import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
        /*int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            // int num=i,rev=0;
            // while(num!=0){
            //     int dig=num%10;
            //     rev=rev*10+dig;
            //     num=num/10;
            // }
            // if(rev==i){
            //     System.out.println(i);
            // }

            String str=i+"";
            int s=0;
            int e=str.length()-1;
            while(s<=e){
                if(str.charAt(s)!=str.charAt(e)){
                    break;
                }
                s++;e--;
            }
            if(s>e){
                System.out.println(i);
            }
        }
        */
    }
}
