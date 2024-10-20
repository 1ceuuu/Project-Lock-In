package Practices;
import java.util.*;

public class prac1{

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter nothing to stop inputting");
        for(;;){
            System.out.print("Enter number: ");
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            else{
                try{
                    array.add(Integer.parseInt(input));
                }
                catch(Exception e){
                    System.out.println("Invalid input");
                }
            }
        }
        
        if(array.size() < 2){
            System.out.println("bro this fucking array is too small dumbass");
        }
        else{
            int SecondLargestNumber = SecondLargestNumber(array);
            if(SecondLargestNumber == Integer.MIN_VALUE){
                System.out.println("No distinct second largest element.");
            }
            else{
                System.err.println("The second largest elements is: "+SecondLargestNumber);
            }
        }
        
        
    }

    public static int SecondLargestNumber(ArrayList<Integer> array){

        int Largest = Integer.MIN_VALUE;
        int SecondLargestNumber = Integer.MIN_VALUE;
        for(int num:array){
            if(num > Largest){
                SecondLargestNumber = Largest;
                Largest = num;
            }
            else if(num > SecondLargestNumber && num != Largest){
                SecondLargestNumber = num;
            }
        }
        return SecondLargestNumber;
    }
}