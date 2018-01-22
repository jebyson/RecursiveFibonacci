package com.company;

/**
 * Created by je565 on 1/22/18.
 */
public class Fibonacci {

    public static void checkFib(int num)
    {
        int [] sequence = new int[100000];

        int fibTotal;
        int xTemp = 0;
        int yTemp = 1;

        for(int j = 0; j < sequence.length; j++)
        {
            fibTotal = xTemp + yTemp;
            xTemp = yTemp;
            yTemp = fibTotal;

            sequence[j] = fibTotal;

            if(num == sequence[j])
            {
                System.out.println(num + " is a number in the Fibonacci sequnce. Here is the sequence leading up to it:");
                System.out.println(fibSequence(num));
            }
        }
    }

    public static int fibSequence(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        else if(num == 1)
        {
            return num;
        }
        else
        {
            return fibSequence(num - 1) + fibSequence(num - 2);
        }
    }
}
