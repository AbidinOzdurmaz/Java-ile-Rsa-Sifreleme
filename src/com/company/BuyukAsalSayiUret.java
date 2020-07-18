package com.company;

public class BuyukAsalSayiUret {


    private long x=(long) Math.pow(2,30);           //sayı aralığı için x ve y değişkenlerini tanımladık
    private long y=(long) (Math.pow(2,40));
    private long p = 0;                             //oluşturacağımız sayıyı tanımladık
    private int bolunen;                            //asal olup olmadığını kontrol amaçlı bölünen değişkeni tanımladık

    //bu method belirli aralılarla sayı üretip asal olup olmadığını kontrol ediyor eğer sayı asalsa return ile sayısı döndürüyor
    public long Uret(){

        while (true) {

            bolunen = 0;

            p = x + (long) (Math.random() * y);      //x ve y arasında rastgele sayı ürettik

            for (long i = 2; i < p / 2; i++) {          //asallığını kontrol ettik eğer bolunen sıfırdan farklıysa asal değil
                if (p % i == 0) {
                    bolunen++;
                    break;
                }

            }

            if (bolunen == 0) {
                break;
            }

        }

        return p;
    }



}
