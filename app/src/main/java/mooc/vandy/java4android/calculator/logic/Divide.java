package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    //private var
    private int result = 0;
    private int rem = 0;

    public Divide(int one, int two){
        result = one/two;
        rem = one%two;
    }
    //override toString()
    public String toString(){
        String first =  String.valueOf(result);
        String two = String.valueOf(rem);
        return first+" R: "+two;
    }
}
