package sortingAlgo;

import java.util.ArrayList;
import java.util.Scanner;

public class bubble {
    public static void main(String []args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner lecture = new Scanner(System.in);
        System.out.println("How many numbers you want");
        int itN = lecture.nextInt();
        for(int y=0;y<itN;y++){
            System.out.println("Digit a number");
            numbers.add(lecture.nextInt());
        }
        System.out.println("numbers = " + numbers);
    }
}
