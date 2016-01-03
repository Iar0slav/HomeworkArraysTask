package task1;

public class Main {

    public static void main(String[] args) throws Exception {

        int[] array = {2,4,6,8,10,12,14,16,18,20};

        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1){
                System.out.print(Integer.toString(array[i]));
            } else {
                System.out.print(Integer.toString(array[i]) + " ");
            }
        }

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(Integer.toString(array[i]));
            } else {
                System.out.println(Integer.toString(array[i]));
            }
        }


    }

}
