import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Conversions {
    public static void main(String[] args) {
        int num=2671,sum=0,i=0;
        //For binary to decimal
        while(num!=0){
            int rem=num%10;
            sum+=rem*Math.pow(2,i);
            //If octal to decimal then use 8 instead of 2
            i++;
            num=num/10;
        }
        // System.out.println(sum);
        // hex_to_dec("7CF");
        // dec_to_bin(12);
        // dec_to_oct(214);
        // dec_to_hex(2545);
        // bin_to_oct("010101011");
        oct_to_bin(347);
    }
    public static void hex_to_dec(String n){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>(); 
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        int sum=0,j=n.length()-1;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)>='A' && n.charAt(i)<='F'){
                int a=map.get(n.charAt(i));
                sum+=a*Math.pow(16,j);
                j--;
            }
            else{
                sum+=Integer.valueOf(""+n.charAt(i))*Math.pow(16,j);
                j--;
            }
        }
        System.out.println(sum);
    }
    //From Prepinsta
    static int convert_hex_to_dec(String hex){  
        String digits = "0123456789ABCDEF";  
                 hex = hex.toUpperCase();  
                 int val = 0;  
                 for (int i = 0; i < hex.length(); i++)  
                 {  
                     char c = hex.charAt(i);  
                     int d = digits.indexOf(c);  
                     val = 16*val + d;  
                 }  
                 return val;  
      } 
    public static void dec_to_bin(int n){
        // int i=0;
        // int[] arr=new int[10];
        // while(n!=0){
        //     int rem=n%2;
        //     arr[i]=rem;
        //     i++;
        //     n=n/2;
        // }
        // for(int j=i-1;j>=0;j--){
        //     System.out.print(arr[j]);
        // }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(n!=0){
                int rem=n%2;
                list.add(rem);
                n=n/2;
            }
        Collections.reverse(list);
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j));
        }
        
        
    } 
    public static void dec_to_oct(int n){
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(n!=0){
                int rem=n%8;
                list.add(rem);
                n=n/8;
            }
        Collections.reverse(list);
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j));
        }
    }
    //From Prepinsta
    public static void decimalToOctal(int deciNum)
    {

        int octalNum = 0, countval = 1;
        int dNo = deciNum;

        while (deciNum != 0) {

            // decimals remainder is calculated
            int remainder = deciNum % 8;

            // storing the octalvalue
            octalNum += remainder * countval;

            // storing exponential value
            countval = countval * 10;
            deciNum /= 8;
        }
        System.out.println(octalNum);
    }
    public static void dec_to_hex(int n){
        // String s="0123456789ABCDEF";
        // String ans="";
        // while(n!=0){
        //     int rem=n%16;
        //     ans=s.charAt(rem)+ans;
        //     n=n/16;
        // }
        // System.out.println(ans);
        ArrayList<String> list=new ArrayList<String>();
        HashMap<Integer,Character> map=new HashMap<Integer,Character>();
        map.put(10,'A');
        map.put(11,'B');
        map.put(12,'C');
        map.put(13,'D');
        map.put(14,'E');
        map.put(15,'F');
        while(n!=0){
                int rem=n%16;
                if(rem>=10){
                    list.add(""+map.get(rem));
                }
                else{
                    list.add(""+rem);
                }
                n=n/16;
            }
        Collections.reverse(list);
        //    System.out.print(list.toString());
        
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j));
        }
    }
    public static void bin_to_oct(String binary){
        //010101011
        int temp = 0;
    StringBuilder octal = new StringBuilder();
    int j = 0;
    for(int i=binary.length()-1;i>=0;i--){
    if(j == 3){
    octal.append(temp);
    // System.out.println(j+" "+temp);
    temp = 0;
    j=0;
    }
    temp += (binary.charAt(i)-'0')*Math.pow(2,j);
    j++;
    }
    octal.append(temp);
    System.out.println("Binary : "+binary+" == octal : "+octal.reverse().toString()); 

    //Another way could be just converting the binary to first decimal and then octal 
        }

        public static void oct_to_bin(long num){
        HashMap<Integer,String> b =new HashMap<>();
        b.put(0,"000");
        b.put(1,"001");
        b.put(2,"010");
        b.put(3,"011");
        b.put(4,"100");
        b.put(5,"101");
        b.put(6,"110");
        b.put(7,"111");

        String result =" ";
        long n=num;
        while(n !=0)
        {
            int rem=(int)n%10;
            result = b.get(rem)+result;
            n=n/10;

        }
        System.out.println(result);
        }

}
