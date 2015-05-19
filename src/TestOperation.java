import java.util.List;

/**
 * Created by Alyona on 19.05.2015.
 */
public class TestOperation {

    public static void main(String[] args) {

        Operation class1 = new OperationImpl();

        Operation class2 = new OperationImpl2();

        operation(class1);
        operation(class2);

       /* int result = class1.div(3, 2);
        System.out.println(result);*/
    }
    public static void operation (Operation a) {
        a.div(2,3);
        System.out.println(a.div(2,3));

    }
}
