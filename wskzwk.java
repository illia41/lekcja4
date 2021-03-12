package sample;

import static java.lang.Math.*;

public class Wskazowka

{

          double L, U,L2,U2;



    Wskazowka()


    {

            this.L = 0;



                 this.U = 0;
    }


              Wskazowka (int L, int U)


    {

             this.L = L;


          this.U = U;

    }


               void count_distance (double L, double U)



    {


        System.out.println ("length, "+sqrt( ( Math.pow ( L-this.L, 2 )) + ( Math.pow (U-this.U, 2 ))));



    }

}