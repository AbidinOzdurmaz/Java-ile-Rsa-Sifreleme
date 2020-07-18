package com.company;

import java.math.BigInteger;

public class RsaSifreleme {

    public BigInteger Sifrele(BigInteger C,BigInteger E,BigInteger N){

        BigInteger S=C.modPow(E, N);

        return S;
    }

    public BigInteger DeSifrele(BigInteger S,BigInteger D,BigInteger N){

        BigInteger C=S.modPow(D, N);
        return C;
    }

}
