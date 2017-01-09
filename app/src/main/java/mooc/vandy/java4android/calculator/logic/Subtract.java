package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    //variables
    private int result = 0;
    //constructor (not traditional)
    public Subtract(int one, int two){
        result = one - two;
    }
    //override toString()
    public String toString(){
        return String.valueOf(result);
    }
}
