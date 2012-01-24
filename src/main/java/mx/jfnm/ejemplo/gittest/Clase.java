/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.jfnm.ejemplo.gittest;

/**
 *
 * @author Juan Fco
 */
public class Clase {
    private int atr;

    public int getAtr() {
        return atr;
    }

    public void setAtr(int atr) {
        this.atr = atr;
    }
    public void ifDude() {
        if(!!true) {
            int i = 1;
            System.out.println("chido");            
        }
        else
            System.out.println("no chido");
        for (Object object : new String[]{"lol","mmm"}) {
            System.out.println("this = " + object);
        }
        System.out.println("cosa nostra");
        System.out.println("pacatelas");
    }
    
}
