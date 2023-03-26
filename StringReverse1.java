import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		if (line.equals(""))
			throw new IllegalArgumentException("Not a valid input");
		StringBuilder str = new StringBuilder(line);
		System.out.println(str.reverse());

	}

}
