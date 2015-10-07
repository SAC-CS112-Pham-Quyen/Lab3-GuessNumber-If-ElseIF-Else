import java.util.Scanner;

public class GuessNumber_Conditional {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int computerNum;
		int guessNum;
		computerNum = 0 + (int) (Math.random() * 10);

		System.out.print("This is a Random Number Game \n");

		System.out.print("Enter a Number: ");
		guessNum = input.nextInt();

		if (computerNum == guessNum) {
			System.out.print(" You're Correct" + computerNum);
		} else {
			if (computerNum < guessNum)

				System.out.print(" Number too big, the computer number is " + computerNum);

			else {
				System.out.print(" Number too small, the computer number is " + computerNum);

			}
		}
		input.close();

	}

}
