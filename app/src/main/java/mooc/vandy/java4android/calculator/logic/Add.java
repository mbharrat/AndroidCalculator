package mooc.vandy.java4android.calculator.logic;
HI HI HI HIHI HIHIHIHIHIHIHIHI
/**
 * Perform the Add operation.
 */
public class Add {
    //variables
    private int result = 0;

    //constructor (not traditional)
    public Add(int first, int second) {
        result = first + second;
    }

    //override toString()
    public String toString(){
        return String.valueOf(result);
    }
}
