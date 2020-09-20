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
public class BaseFormatter implements NumberFormatter {

    private int base;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public BaseFormatter(int base) {
        this.base = base;
    }

    @Override
    public String formatter(int n) {

        String result = Integer.toString(n, base);


        return result;
    }
}
