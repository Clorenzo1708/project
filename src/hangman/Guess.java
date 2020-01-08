package hangman;

/**
 * Guess.java - description
 *
 * @teacher Mr.Wachs
 * @author e.famorcan
 * @since Nov. 25, 2019, 10:08:19 a.m.
 */
class Guess 
{

    /**
     * Default constructor, set class properties
     */
    public Guess() {
        
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Guess clone() {
        return this;
    }

}
