/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.exceptions;

/**
 *
 * @author Aliaksiej Protas
 */
public class PackagePlansExceptions extends Exception {
        public PackagePlansExceptions() {
        super();
    }

    public PackagePlansExceptions(String message) {
        super(message);
    }

    public PackagePlansExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    public PackagePlansExceptions(Throwable cause) {
        super(cause);
    } 
}