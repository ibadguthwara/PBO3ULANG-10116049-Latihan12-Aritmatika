/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan12.aritmatika;

/**
 *
 * @author ibadguthwara
 * NAMA 	     : M. Ibad Guthwara
 * KELAS	     : PBO 3 ULANG
 * NIM		     : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi program untuk operasi dan perhitungan aritmatika
 */
public class PBO3ULANG10116049Latihan12Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("b / a = " + (b/a));
        System.out.println("b % a = " + (b%a));  //modulus/sisa hasil bagi 20:10=2; sisa habis/0
        System.out.println("c % a = " + (c%a));  //modulus/sisa hasil bagi 25:10=2,; sisa 5 
        
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
    }
    
}
