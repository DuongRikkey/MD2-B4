package OOP.EX3;

import java.util.Random;

public class EX3STOPWATCH {
    public static void main(String[] args) {

        STOPWATCH stopWatch = new STOPWATCH();
        Random random = new Random();
        int [] array=new int[100000];
       for(int i=0;i<100000;i++){
           array[i]=random.nextInt(100000);
       }
        stopWatch.start();
        reverseArray(array);
        stopWatch.stop();

        System.out.println("Thời gian thực thi của thuật toán đảo ngược mảng "+stopWatch.getElapsedTime()+  " milliseconds");

    }
        public static void reverseArray(int[] array){
            for (int i = 0; i < array.length/2; i++) {
                int temp =array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
    }

}
