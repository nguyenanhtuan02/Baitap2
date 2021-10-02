/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author ASUS
 */
public class JavaApplication9 {
   /* public static long Total(long level,long points,long bounnus)
    {
        long Total;
    if((level>=1)&&(level<=5))
        {
                Total =points+(long)(Math.sqrt(level)*bounnus);
                System.out.println("tong la "+Total);
                return Total;
        }
    else
        {
            System.out.println("khong co");
            return -1;
        }
        
    }
public static long Total(long level,long points)
{
    final long bounnus =100;
    return Total(level,points,bounnus);
}
public static long Total(long level)
{
    long points=100;
    return Total(level,points);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*long Totalup;
        long level;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap level cua ban");
        level=sc.nextLong();
        Totalup=Total(level);
                */
        
        // TODO code application logic here
    
    NewClass Thayha=new NewClass("Ha", 18, "vietha@gmail.com", 'F');
    System.out.printf("ten la: "+Thayha.getName());
        System.out.println("tuoi la "+Thayha.getName());
        System.out.println("emmail la "+Thayha.getEmaildress());
        System.out.println("gioi tinh la "+Thayha.getGener());
        NewClass Thaytrung=new NewClass(18, "trungluu@gmail.com");
        System.out.println("tuoi cua thay trung la "+Thaytrung.getAge());
        System.out.println("email cua thay trung la "+Thaytrung.getEmaildress());
       
        NewClass thayquan =new NewClass(20, 'M');
         System.out.println("tuoi la "+thayquan.getAge());
             System.out.println("tenla "+thayquan.getName());
                 System.out.println("gioi tinh la "+thayquan.getGener());
                     System.out.println("email la "+thayquan.getEmaildress());
    }    
    
}
