/**
 * Created by Alyona on 19.05.2015.
 */
public class OperationImpl implements Operation {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
    public int min(int a, int b) {
        return a-b;
    }
}
