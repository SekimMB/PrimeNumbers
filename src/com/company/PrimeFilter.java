package com.company;

import java.util.Arrays;

public class PrimeFilter {

    public static String FilterPrime(String paremeters){
        String[] strArray=paremeters.split(",");
        String primes = "";
        //System.out.println(Arrays.asList(strArray));

        for (int i=0;i<strArray.length;i++){
            int tempint = Integer.parseInt(strArray[i]);
            if(isPrime(tempint)==true){
                primes.concat(String.valueOf(tempint));


            }
        }
        primes.substring(primes.lastIndexOf(",")+1);
        System.out.println(Arrays.asList(primes));
        return primes;
    }

    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
