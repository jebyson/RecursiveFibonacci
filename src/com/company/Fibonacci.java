package com.company;

/**
 * Created by je565 on 1/22/18.
 */
public class Fibonacci {

    private int [] sequence = new int[100000];

    private int fibTotal = 0;
    private int xTemp = 0;
    private int yTemp = 1;

    private int numOfSteps = 0;

    public void Fibonacci(int num)
    {
        for(int j = 0; j < sequence.length; j++)
        {
            fibTotal = xTemp + yTemp;
            xTemp = yTemp;
            yTemp = fibTotal;

            sequence[j] = fibTotal;

            if(num == sequence[j])
            {
                System.out.println(num + " is a number in the Fibonacci sequnce. Here is the sequence leading up to it:");
                numOfSteps = j;
                checkFib(num);
                break;
            }
            else if(j == sequence.length - 1 && num != fibTotal)
            {
                System.out.println(num + " is not a number in the Fibonacci sequence.");
            }
        }
    }

    public void checkFib(int inputNum)
    {
        int fibTotal = 0;
        int xTemp = 0;
        int yTemp = 1;

        System.out.print("0, 1, ");

        for(int k = 0; k < numOfSteps; k++)
        {
            fibTotal = xTemp + yTemp;
            xTemp = yTemp;
            yTemp = fibTotal;

            sequence[k] = fibTotal;

            System.out.print(sequence[k] + ", ");

            if(sequence[k] == inputNum)
            {
                System.out.print(" " + inputNum);
                break;
            }
        }
    }
}