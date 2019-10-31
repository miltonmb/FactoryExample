/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyfactory;

/**
 *
 * @author Milton Martinez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory factory = new Factory();
        Toy Barbie = factory.getToy("BARBIE");
        Barbie.sound();
        Toy MaxSteel = factory.getToy("MAXSTEEL");
        MaxSteel.sound();
        Toy StuffAnimal = factory.getToy("STUFFANIMAL");
        StuffAnimal.sound();
    }

}
