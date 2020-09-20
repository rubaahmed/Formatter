/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10.pkg11;

/**
 *
 * @author reham
 */
public class P1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      DeffaultFormatter number1=new DeffaultFormatter();
      DecimalSparatorFormatter number2=new DecimalSparatorFormatter();
      AccountingFormatter number3=new AccountingFormatter();
      BaseFormatter number4=new BaseFormatter(36);
      
      
        System.out.println("Deffault Formatter :"+number1.formatter(9999));
        System.out.println("Decimal Sparator Formatter :"+number2.formatter(13400000));
        System.out.println("Accounting Formatter :"+number3.formatter(-4));
        System.out.println("Base Formatter :"+number4.formatter(36));
        

    }
    
}
