package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    //var
    private int result = 0;
    //construct (not traditional)
    public Multiply(int one, int two){
        result = one * two;
    }
    //override toString
    public String toString(){
        return String.valueOf(result);
    }
}
