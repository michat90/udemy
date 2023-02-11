package com.examples.basic.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("565659323230154512629151511626565");
        bigInt = bigInt.add(new BigInteger("66532323226235"));
        System.out.println(bigInt);

        BigDecimal bigDec = new BigDecimal("23532.2323535232");
        bigDec = bigDec.pow(3);
        System.out.println(bigDec);
    }
}
