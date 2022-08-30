package org.example;
import java.util.Random;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        persone per = new persone();
        Gson gson = new Gson();
        String json =  gson.toJson(per);

        System.out.println( json);

        persone obj2 = gson.fromJson(json, persone.class);
        System.out.println( obj2.toString());


        for (int num =Integer.parseInt(args[0]) ; num>0 ; num-- )
        {

            for (int e = (Integer.parseInt(args[0]))+num +1  ; e>0 ; e-- )
            {
                System.out.print(" ");
            }

                for (int e =num ; e>=0 ; e-- )
                {
                    for (int i =num+1 ; i>=0 ; i-- )
                    {
                        System.out.print("*");
                    }
                     System.out.print("*");

                }
                System.out.println("");



        }
        System.out.println( obj2.toString());
        /* fgfdhfghfghfghgf */
        Random random = new Random();
        System.out.println( (int)random);






    }
}
