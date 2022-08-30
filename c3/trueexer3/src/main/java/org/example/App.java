package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int bob = 0 ;
        for (int e = (Integer.parseInt(args[0])) +1  ; e>0 ; e-- )
        {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int num =Integer.parseInt(args[0]) ; num>0 ; num-- )
        {
            bob++;
            for (int e = num  ; e>0 ; e-- )
            {
                System.out.print(" ");
            }
                    for (int i =0 ; i<=Integer.parseInt(args[0])-num+bob+1 ; i++ )
                    {
                        System.out.print("*");
                    }
                System.out.println("");
        }
        System.out.println( obj2.toString());
        /* fgfdhfghfghfghgf */
        Random random = new Random();
        List<Integer> table = new ArrayList<Integer>();
        for (int e = 99  ; e>0 ; e-- )
        {
            table.add(random.nextInt());
        }

        System.out.println( table.stream().max() );





    }
}
