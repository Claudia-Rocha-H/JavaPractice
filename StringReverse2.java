import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(reverse(st));
		
	}

	private static String reverse(String st) {
		 if(st.equals(""))
			 return "Not a valid input";
		 
		 StringBuilder res = new StringBuilder();
		 char[] ch =st.toCharArray();
		 for (int i = ch.length-1; i >=0 ; i--) {
			res.append(ch[i]);
		}
		return res.toString();
	}

}
