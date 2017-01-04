package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    //variables
    static final int ADDITION = 1;
    static final int SUBTRACTION = 2;
    static final int MULTIPLICATION = 3;
    static final int DIVISION = 4;
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        if(operation == ADDITION){
            //Add is a whole new class so create instance of add
            Add one = new Add(argumentOne,argumentTwo);
            //call new toString in Add class and print
            mOut.print(one.toString());

        }else if(operation == SUBTRACTION){
            //new instance of subtract class
            Subtract one = new Subtract(argumentOne, argumentTwo);
            //call new tostring in subtract class and print
            mOut.print(one.toString());

        }else if(operation == MULTIPLICATION){
            //new instance of multiply
            Multiply one = new Multiply(argumentOne, argumentTwo);
            //call new toString in multiply class and print
            mOut.print(one.toString());
        }else{
            //new instance of divide
            Divide one = new Divide(argumentOne, argumentTwo);
            //call new toString in divide class and print
            mOut.print(one.toString());
        }
    }
}
