
package com.msbank.CustomException;

/**
 *
 * @author Mcacisi Sithole
 */
public class RecordNotFoundExceptionn extends RuntimeException {

    /**
     * Creates a new instance of <code>RecordNotFoundExceptionn</code> without
     * detail message.
     */
    public RecordNotFoundExceptionn() {
    }

    /**
     * Constructs an instance of <code>RecordNotFoundExceptionn</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public RecordNotFoundExceptionn(String msg) {
        super(msg);
    }
}
