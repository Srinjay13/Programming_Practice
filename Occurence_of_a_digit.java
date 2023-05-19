public class Occurence_of_a_digit {
    public static void main(String[] args) {
        //Using integer as input
        /*int digit=2;
        int number=12324252;
        int count=0;
        while(number!=0){
            int rem=number%10;
            if(rem==digit){
                count++;
            }
            number=number/10;
        }
        System.out.println(count+" number of times "+digit+" occured in the given number.");
        */
        //Using Strings
        int x = 898989, c = 0;

        char b = '9';

        String s = Integer.toString(x);

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==b)
                c=c+1;
        }
        System.out.println(c);
    }
}
