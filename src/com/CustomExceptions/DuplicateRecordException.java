
package com.CustomExceptions;

/**
 *
 * @author Mcacisi Sithole
 */
public class DuplicateRecordException extends RuntimeException{

    /**
     * Creates a new instance of <code>DuplicateException</code> without detail
     * message.
     */
    public DuplicateRecordException() {
    }

    /**
     * Constructs an instance of <code>DuplicateException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DuplicateRecordException(String msg) {
        super(msg);
    }
}
