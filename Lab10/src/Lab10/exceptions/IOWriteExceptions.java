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
public class IOWriteExceptions extends Exception {

    private static final long serialVersionUID = 1L;
    public IOWriteExceptions() {
        super();
    }

    public IOWriteExceptions(String message) {
        super(message);
    }

    public IOWriteExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
