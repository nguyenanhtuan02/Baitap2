/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg2;

/**
 *
 * @author ASUS
 */
public class Bai2 {
    public static long Total(long level,long points,long bounnus)
    {
        long SUM;
        if((level>=1)&&(level<=5))
        {
            SUM=points+level*bounnus;
            System.out.println("Tong la "+SUM);
            return SUM;
        }
        else{
            System.out.println("khong kha dung");
            return -1;
        }
    }
    public static long Total(long level,long points)
    {
        final long bounnus=100;
        return Total(level,points,bounnus);
    }
public static long Total(long level)
{
    long points=200;
    return Total(level,points);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long level=3;
        long Total2 ;
        Total2=Total(level);
    }
        
        // TODO code application logic here
    }
    
