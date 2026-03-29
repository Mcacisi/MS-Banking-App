
package com.CustomExceptions;

/**
 *
 * @author Mcacisi Sithole
 */
public class RecordNotFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>NotFoundException</code> without detail
     * message.
     */
    public RecordNotFoundException() {
    }

    /**
     * Constructs an instance of <code>NotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public RecordNotFoundException(String msg) {
        super(msg);
    }
}
