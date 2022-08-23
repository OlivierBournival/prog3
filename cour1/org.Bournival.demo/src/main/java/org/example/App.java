package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        for (int num =0 ; num<=Integer.parseInt(args[0]) ; num++ ) {

            for (int e =0 ; e<=num ; e++ ) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
