
package tryallpossibilities;

import util.AllPossibilities;

/**
 *
 * @author Sourabh Bhat
 */
public class TryAllPossibilities {
    static final char[] alpha = {'A', 'B', 'C'};
    public static void main(String[] args) {
        int[] limits = {alpha.length, alpha.length, alpha.length, alpha.length};
        
        AllPossibilities possibilities = new AllPossibilities(limits);
        int[] numbers;
        while(true) {
            numbers = possibilities.getNext();
            if(numbers == null) {
                System.out.println("Covered all possibilities");
                break;
            }
            // Lets print out the current possibility
            codeToRunForThisPossibility(numbers);
        }
    }
    
    private static void codeToRunForThisPossibility(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(alpha[numbers[i]] + " ");
        }
        System.out.println();
    }
}
