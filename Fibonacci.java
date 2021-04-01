public class Fibonacci {
    public static void main(String[]args){

        int a = 1;
        int b = 0;
        int c = 0;
        int d = 0;


        for ( a = 1; a < 4000000; ){
            if(a%2==0){
                d+=a;
            }
            c=b; // 0
            b=a; // 0 , 1
            a+=c; // 0 1 1 2 3 5
        }
        System.out.println(d);
    }
}










































