//Write a Java method to display the first 50 pentagonal numbers.
//
//A pentagonal number is a figurate number that extends the concept
// of triangular and square numbers to the pentagon, but, unlike the first two,
// the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.


public class Exerc06 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 50; i++){
            System.out.printf("%-6d",getPentagonalNumber(i));
            if(count % 10 == 0) System.out.println();
            count++;
        }
    }
    public static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1))/2;
    }
}