/**
 * Created by Alyona on 19.05.2015.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public class ArraysHt {

            public static void main (String[] args) {

            System.out.println("1.1 Первый метод инвертирования массива");
            int[] array1 = {1,2,3,4,5,6};
            ArraysHt.invertionV1(array1);

            System.out.println("\n1.2 Второй метод инвертирования массива");
            int[] array2 = {1,2,3,4,5,6};
            ArraysHt.invertionV2(array2);

            System.out.println("\n1.3 Третий метод инвертирования массива");
            Integer[] arrayToReverse = {1,2,3,4,5};
            Integer[] rev = ArraysHt.reverse(arrayToReverse);
            System.out.println(Arrays.toString(rev));

            System.out.println("\n2. Вывести 10 первых нечетных чисел");
            ArraysHt.outArray();
            System.out.println("");

            System.out.println("\n3. Поиск наименьшего элемента массива");
            int [] array5 = {1,2,1,4};
            ArraysHt.findMin(array5);

            System.out.println("\n4. Замена местами наименьшего и наибольшего элементов массива");
            int [] array6 = {1,0,4,6};
            ArraysHt.toReplace(array6);

            System.out.println("\n5. Поиск среднего арифметического значения");
            int [] array7 = {4,10,5,10};
            ArraysHt.toEvaluate(array7);


        }

        static public void invertionV1(int[] array1) {

            int[] newArray1 = new int[array1.length];

            for (int i = 0; i < array1.length; i++) {
                newArray1[i] = array1[array1.length-i-1];
            }
            System.out.println(Arrays.toString(newArray1));
        }

        static public int[] invertionV2(int[] array2) {

            for (int i = 0; i < array2.length / 2; i++) {
                int buf = array2[i];
                array2[i] = array2[array2.length-i-1];
                array2[array2.length-i-1] = buf;
            }

            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i]);
            }
            return array2;
        }

        public static Integer[] reverse(Integer[] arrayToReverse){

            List<Integer> listOfType = (List)Arrays.asList(arrayToReverse);
            Collections.reverse(listOfType);
            Integer[] ret = (Integer[])listOfType.toArray();
            return ret;
        }

        static public void outArray () {

            int array3[] = new int[10];

            for (int i = 0; i < array3.length; i++) {
                array3[i] = 2*i+1;
                System.out.print(array3[i] + ", ");
            }
        }

        static public void findMin(int [] array5) {

            int k = 1;
            Arrays.sort(array5);

            for (int i = 0; i < array5.length-1; i++) {
                if (array5[i] == array5[i+1]) {
                    k++;
                }
            }

            for (int i = 0; i < k; i++) {
                System.out.println(array5[0]);
            }
        }

        static public void toReplace(int [] array6) {

            int Min = array6[0];
            int Max = array6[0];
            int m = 0;
            int M = 0;

            for (int i = 0; i < array6.length; i++) {
                if(array6[i] < Min) {
                    Min = array6[i];
                    m = i;
                }
                if (array6[i] > Max) {
                    Max = array6[i];
                    M = i;
                }
            }

            int k = array6[M];
            array6[M] = array6[m];
            array6[m] = k;
            System.out.println(Arrays.toString(array6));
        }

        static public void toEvaluate(int [] array7) {

            int sum = 0;

            for (int i = 0; i < array7.length; i++) {
                sum = sum + array7[i];
            }
            double M = (double) sum/array7.length;
            System.out.println(M);
        }
    }

