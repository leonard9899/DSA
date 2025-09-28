package sortingAlgo;

import java.util.ArrayList;
import java.util.Scanner;

public class bubble {
    public static void main(String []args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner lecture = new Scanner(System.in);
        addElements(lecture,numbers);
        System.out.println("numbers = " + numbers);
        sortingBubble(numbers);
        System.out.println("Sorted list: ");
        System.out.println(numbers);
        System.out.println("NUmber to find it: ");
        int target = lecture.nextInt();
        binarySearch(numbers,target);
    }

    public static void sortingBubble(ArrayList<Integer> numbers){
        for(int k=0;k<numbers.size();k++){
            for(int i=k+1;i<numbers.size();i++){
                Integer min = numbers.get(k);
                if(min>numbers.get(i)){
                    min = numbers.get(i);
                    numbers.set(i,numbers.get(k));
                    numbers.set(k,min);
                }
            }
        }
    }
    public static void addElements(Scanner lecture,ArrayList<Integer> numbers){
        System.out.println("How many numbers you want");
        int itN = lecture.nextInt();
        for(int y=0;y<itN;y++){
            System.out.println("Digit a number");
            numbers.add(lecture.nextInt());
        }
    }
    public static void binarySearch(ArrayList<Integer> numbers,Integer target){
        int L = 0;
        int R = numbers.size();
        boolean control = false;
        int cicles = 0;

        while(L<R){
            int M = (L+R)/2;
            if(target > numbers.get(M)){
                L = M+1;
            }else if(target<numbers.get(M)){
                R = M;
            }
            else{
                System.out.println("Number find it after "+cicles+ " cicles at index: "+M);
                control = true;
                break;
            }
            cicles++;
        }
        if(!control){
            System.out.println("Number not find it");
        }
    }
}
