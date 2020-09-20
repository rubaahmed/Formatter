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
public class AccountingFormatter implements NumberFormatter {

    
    String a;

    @Override
    public String formatter(int n) {
        if (n < 0) {
            n *= -1;
            a = n+"";

        }
        return "(" + a + ")";
    }
}
