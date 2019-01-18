/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        double delta = 0;
        
        System.out.print("a = ");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
        
        delta = b*b - 4*a*c ;
        
        if(a==0 && b==0 && c==0)
            System.out.println("Phuong trinh vo so nghiem!!");
        else if(a == 0 && b == 0 && c !=0)
            System.out.println("Phuong trinh vo nghiem!!");
        else if(a == 0 && b != 0 && c != 0)
            System.out.println("Nghiem cua phuong trinh la : x = " + -c/b);
        else if(a != 0 && b!= 0 && c != 0){
            if(delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if(delta == 0)
                System.out.println("Phuong trinh co nghiem kep : x = " + -b/2*a );
            else if(delta >0)
                System.out.println("Phuong trinh co hai nghiem : \n" + "x1 = " + (-b - Math.sqrt(delta) )/(2*a) + "\n" + "x2 = " + (-b + Math.sqrt(delta) )/(2*a)  );
        }
    }
    
}
