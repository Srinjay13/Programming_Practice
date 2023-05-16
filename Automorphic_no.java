public class Automorphic_no {
    public static void main(String[] args) {
        int n=376;
        /*if(((n*n)%10)==n){
            System.out.println("Automorphic number");
        }else{
            System.out.println("Not an Automorphic number");
        }*/
        //PAl
        
        System.out.println((((n*n)%10)==(n%10)) ? "Automorphic number" : "Not an automorphic number"); 
    }
}
