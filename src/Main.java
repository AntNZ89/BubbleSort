public class Main {
    public static void main(String[] args) {

        double[] array = createArray(10);

        sortArray(array);

    }



    public static void sortArray(double[] array){

        System.out.println(getArrayAsString(array));
        double swapNum1;
        double swapNum2;
        int i = 0;

        for (int r = 0 ; r < array.length-i ; r++){
            for (int c = 0; c < array.length-i; c++) {

                if (c < 9) {
                    if (array[c] > array[c + 1]) {
                        swapNum1 = array[c];
                        swapNum2 = array[c + 1];
                        array[c] = swapNum2;
                        array[c + 1] = swapNum1;
                    }
                }
            }
            i++;
        }
        System.out.println(getArrayAsString(array));
    }


    public static double[] createArray(int length){

        double[] array = new double[length];

        for (int c = 0 ; c < array.length ; c++) {
            array[c] = Math.random();
        }

        return array;
    }


    public static String getArrayAsString(double[] array){

        String s = "[";

        for (int c = 0 ; c < array.length ; c++){
            if (c < 9){
                s += array[c];
                s += " , ";
            }
            else {
                s += array[c];
            }
        }
        s += "]";
        return s;
    }

}