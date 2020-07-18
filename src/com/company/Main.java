package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {


 public static void main(String[] args) {

        /**
         * Anahtar Şöyle Oluşturulur;
         *
         * İki adet birbirleriyle asal olan ve birbirlerinden farklı olan iki sayı seçilir.
         * Bunlar p ve q diyelim. Bu sayılar güvenlik sebebiyle rastgele, birbilerine yakın olmalı ve büyük seçilmelidir.
         * n=pq bu işlemin gerçekleştirilmesinin amacı bir sonraki adımlarda n değerini mod alma işlemi için kullanacağız.
         * Bu sayıların Q(n) fonksiyonunu alırız. Q(n)=(p−1)(q−1)
         * 1<e<Q(n) aralığında bir tam sayı üretilir.  Bu ürettiğimiz e sayısı ile Q(n) aralarında asal olmak zorundadır.
         * Burada kullanacağımız e bizim açık anahtarımız olacaktır.
         * de≡1 mod(Q(n)) olacak şekilde bir d sayısı buluruz.
         * Buradan gelecek d değeri bizim gizli anahtarımız olacaktır.
         * Sonuç olarak ortak anahtarımız (n,e) den oluşurken gizli anahtarımız (n,d) den oluşur.
         * Buna ek olarak ilk başta belirlediğimiz p,q ve Q(n) değerleri de gizli kalmalıdır.
         * Bu değerler e ve d değerlerini bulmamızda kullandığımızdan dolayı gizli kalmalıdır.
         */

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


