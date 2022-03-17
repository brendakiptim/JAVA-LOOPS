/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

/**
 *
 * @author kiptim
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        utils util = new utils();
        //this will never ran
        util.While(9);

//        this will run first before checking age
        util.doWhile(9);
    }

}
