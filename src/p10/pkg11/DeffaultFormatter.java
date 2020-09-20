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
public class DeffaultFormatter implements NumberFormatter {

    @Override
    public String formatter(int n) {

        return n+"";
    }

}
