package org.iselab.grocery.controller;

public class Myclass {
    public static void main(String[] args) {

        int i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }

    static float sumOfAP(float a, float d,
                         int n)
    {
        float sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }

    // Driver function
    public static void serie1()
    {
        int n = 20;
        float a = 2.5f, d = 1.5f;
        System.out.println(sumOfAP(a, d, n));
    }

}
