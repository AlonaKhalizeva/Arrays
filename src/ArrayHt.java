/**
 * Created by Alyona on 14.05.2015.
 */
public class ArrayHt {

    public static void main(String[] args) {
        invertion(1,2,3,4,5);
    }

   static int[] invertion(int a, int b,int c,int d,int e) {
        int[] array1 = {a,b,c,d,e};
        int[] newArray1 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray1[i] = array1[array1.length-i];
            System.out.println(newArray1[i]);
        }
        return newArray1;
    }
}
