import java.util.*;

public class AnimalLegCounter {

    //method of animals to count exactly four legs
    public static int countFourLeggedAnimals(String[] animals) {

    //set of animals known to have four legs
    Set<String> fourLegged = new HashSet<>(Arrays.asList("lion", "deer", "elephant", "cat", "dog", "horse"));
        
       int count = 0;
       for (String animal : animals) {
        if (fourLegged.contains(animal.toLowerCase())) {
            count++;
        }
 
        }
    return count;
    }

//main method to test countFourLeggedAnimals method
public static void main(String[] args) {

//Example1 
String[] animals1 = {"lion", "monkey", "deer", "snake", "elephant"};
int result1 = countFourLeggedAnimals(animals1);
System.out.println("Example 1 output: " + result1); //Expected: 3


//Example2 
String[] animals2 = {"frog", "horse", "spider", "ant"};
int result2 = countFourLeggedAnimals(animals2);
System.out.println("Example 2 output: " + result2); //Expected: 1

//Example3 
String[] animals3 = {"cat", "monkey", "deer", "snake"};
int result3 = countFourLeggedAnimals(animals3);
System.out.println("Example 3 output: " + result3); //Expected: 2
}
}