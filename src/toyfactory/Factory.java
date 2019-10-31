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
public class Factory {

    public Toy getToy(String toyType) {
        if (toyType == null) {
            return null;
        }
        if (toyType.equalsIgnoreCase("BARBIE")) {
            return new Barbie();

        } else if (toyType.equalsIgnoreCase("MAXSTEEL")) {
            return new MaxSteel();

        } else if (toyType.equalsIgnoreCase("STUFFANIMAL")) {
            return new StuffAnimal();
        }

        return null;
    }
}
