package com.company;

import java.math.BigInteger;

public class OklitAlgoritmasi {


    public BigInteger Bul(BigInteger Q, BigInteger E){

        BigInteger x1, x2, x3, y1, y2, y3;
        x1 = BigInteger.valueOf(1);
        x2 = BigInteger.valueOf(0);
        x3 = Q;
        y1 = BigInteger.valueOf(0);
        y2 = BigInteger.valueOf(1);
        y3 = E; 


        BigInteger q=BigInteger.valueOf(0);
        BigInteger i = BigInteger.valueOf(1);
        BigInteger t1 = BigInteger.valueOf(0);
        BigInteger t2 = BigInteger.valueOf(0);
        BigInteger t3 = BigInteger.valueOf(0);
        do
        {
            if (i.equals(BigInteger.valueOf(1)))
            {
                q =  x3.divide(y3);
                t1 = x1.subtract((q.multiply(y1)));
                t2 = x2.subtract((q.multiply(y2))) ;
                t3 = x3.subtract((q.multiply(y3))) ;
            }
            else
            {
                x1 = y1;
                x2 = y2;
                x3 = y3;
                y1 = t1;
                y2 = t2;
                y3 = t3;
                q = x3.divide (y3);
                t1 = x1.subtract((q.multiply(y1)));
                t2 = x2.subtract((q.multiply(y2))) ;
                t3 = x3.subtract((q.multiply(y3))) ;
            }
            i=i.add(BigInteger.valueOf(1));

            if (y3.equals(BigInteger.valueOf(0)))
            {
                break;
            }

        } while (!(y3.equals(BigInteger.valueOf(1))));

        if (y3.equals(BigInteger.valueOf(0)))
        {
                return null;
        }
        else
        {
                return y2;

        }
    }

}
