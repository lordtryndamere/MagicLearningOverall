package com.magic.dsa.exercises;

public class BigO {

    public  static  void printItems(int n){
        //O(n) grow linearly depends of the input
        for(int i=0;i<n;i++){
            System.out.println(i);
        }

        //O(n^2) grow quadratically depends on the input
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println(i+" "+j);
            }
        }

        //O(1) not grow, the value is constant
        System.out.println(n+n);

        //La funcion logaritmo, se encarga de asignarle un exponente, al cual otro numero fijo debe elevarse,
        //para obtener el resultado deseado.
        //Ejemplo:
        // 2^5 = 32
        // porque :
        // log2 de 32 = 5
        // 2 elevado a 5 = 32
        // log con base 2 de 8 = 3
        // 2 * 2 * 2 * 2 * 2 = 32
        //O(log(n))


    }



}
