public class E1p7v2{
	public static void main(String[] args){
		if (args.length == 0)
			System.out.println("You didn't enter any argument.");
		for (int j = 0; j < args.length; j++)
			System.out.println(args[j] + " " + (scan(args[j]) ? "OK" : "NOPE"));
	}

	public static boolean scan(String s) {
		int state = 0;
		int i = 0;
		boolean found = false;
		while (state >= 0 && i < s.length()) {
			final char ch = s.charAt(i++);
			switch (state) {
				case 0:
					if (ch == 'A')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 1:
					if (ch == 'l')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 2:
					if (ch == 'e')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 3:
					if (ch == 'x')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 4:
					if (ch == 'a')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 5:
					if (ch == 'n')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 6:
					if (ch == 'd')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 7:
					if (ch == 'e')
						state += 1;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;

				case 8:
					if (ch == 'r')
						state = 9;
					else if (!found){
						found = true;
						state += 1;
					}else
						state = 10;
					break;
				
				case 9:
					state = 10;
					break;
				
				case 10:
					break;
			}
		}
		return (state == 9);
	}
}
