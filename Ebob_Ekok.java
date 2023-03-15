
package ebob_ekok;

import java.util.Scanner;

public class Ebob_Ekok {

    public static void main(String[] args) {
        int s1,s2,ebob=1,ekok,buyuk,kucuk;
        Scanner giris=new Scanner(System.in);
        System.out.println("Ebob Ekok islemi yapilacak iki sayi girin: ");
        s1=giris.nextInt();
        s2=giris.nextInt();
        
        if(s1>s2){buyuk=s1;kucuk=s2;}
        else{buyuk=s2;kucuk=s1;}
        
        int i=1;
        while (i<=kucuk) {
          if(s1%i==0 && s2%i==0)
              ebob=i;
               i++; 
        }
        ekok=(s1*s2)/ebob;
        System.out.println("ebob: "+ebob);
        System.out.println("ekoku: "+ekok);
    }
    
}
