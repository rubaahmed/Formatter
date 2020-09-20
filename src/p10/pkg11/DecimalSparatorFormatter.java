/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10.pkg11;

import java.text.DecimalFormat;

/**
 *
 * @author reham
 */
public class DecimalSparatorFormatter implements NumberFormatter {

    
    @Override
    public String formatter(int n) {

        DecimalFormat decimal = new DecimalFormat();

        return decimal.format(n) + "";
    }
}
