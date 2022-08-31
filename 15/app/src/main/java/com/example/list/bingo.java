package com.example.list;

public class bingo {
    public int id;
    public int numtirer;


    public int getNumtirer() {
        return numtirer;
    }



    public int getId() {
        return id;
    }
    static String letre( int numtirer) {
         if (numtirer>= 15){
             return "B";

         }
         if (numtirer>15 && numtirer<=30 ) return "i";
        if (numtirer>30 && numtirer<45 ) return "n";
        if (numtirer>30 && numtirer<45 ) return "g";

        return "o";
    }

}

