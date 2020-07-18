package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {


 public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("p değerini giriniz : ");
        BigInteger p = scan.nextBigInteger();
        System.out.println("q değerini giriniz : ");
        BigInteger q = scan.nextBigInteger();
        BigInteger n = p.multiply(q);
        BigInteger Q = p.subtract(BigInteger.valueOf(1)).multiply(q.subtract(BigInteger.valueOf(1)));

        System.out.println("E public anahtarınız : ");
        BigInteger E=scan.nextBigInteger();


        System.out.println("N değeri : "+n);
        System.out.println("Q(n) değeri : "+Q);

        OklitAlgoritmasi oklitAlgoritmasi=new OklitAlgoritmasi();
        BigInteger D=oklitAlgoritmasi.Bul(Q,E);

        System.out.println("Gizli Anahtar : " + D);

        RsaSifreleme rsaSifreleme=new RsaSifreleme();
        //şifrelenmesi istenen veri valueOf tan değiştirilebilir.
        BigInteger sifreliMetin=rsaSifreleme.Sifrele(BigInteger.valueOf(59),E,n);

        System.out.println("Şifrelenmiş Metin : "+sifreliMetin);

        BigInteger deSifrelenmisMetin=rsaSifreleme.DeSifrele(sifreliMetin,D,n);
        System.out.println("Deşifrelenmiş Metin : "+deSifrelenmisMetin);

        }
}


