package security_proj;

import static java.lang.Math.pow;

public class RSA {
    public static int e= 2;
    public static int p= 3;
    public static int q= 7;
    public static int n,phi= 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int key =9;
        System.out.println("String To Encrypt: "+ RSA_ENCODE(key));
        int key2=18;
        System.out.println("String To Encrypt: "+ RSA_DECODE(key2));
        
    }
    public static String RSA_ENCODE( int key) {
    
        n = p * q;
        phi = (p - 1) * (q - 1);
        while(e<phi)
            if(gcd(e,phi)==1)
                break;
            else
                e+=1;
                gcd(e,phi);
        int m =key;
        int c;
        c=(int)(pow(m,e)%n);
        return String.valueOf(c);
                
    }
    public static String RSA_DECODE( int key) {
    
        n = p * q;
        phi = (p - 1) * (q - 1);
        while(e<phi)
            if(gcd(e,phi)==1)
                break;
            else
                e+=1;
                gcd(e,phi);
        int c =key;
        int d=0;
        for (int i = 1; i <= 9; i++) {
            int x = 1 + (i * phi);
 
            
            if (x % e == 0) {
                d = x / e;
                //if(d!=e)
                        System.out.println(d);
                        System.out.println(e);


                    break;
            }
        }
        int M;
        M=(int)(pow(c,d)%n);
        return String.valueOf(M);
                
    }
    
    public static int gcd(int e, int phi)
    {
        int temp=0;
        while (true)
        {
            temp=e%phi;
            if(temp==0)
                return phi;
            e=phi;
            phi=temp;     
        }
        
    }
}
