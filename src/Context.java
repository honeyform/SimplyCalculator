/**
 * Created by Honey on 08.08.2015.
 */
public class Context {
    private Action Operation;

    public Context(Action Operation) {
        this.Operation = Operation;
    }

    public int DoAction(int firstNumber, int secondNumber) {
        return Operation.DoAction(firstNumber, secondNumber);
    }
}
