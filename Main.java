
public class Main {

	public static String vaporcode(String s) {

		String upper_s = s.toUpperCase();  
        int length = s.length();  

        StringBuilder sb = new StringBuilder();  

        for (int i = 0; i < length; i++) {
            if (upper_s.charAt(i) != ' ') {  
                sb.append(upper_s.charAt(i));  

                
                if (i != upper_s.length() - 1) {
                    sb.append("  ");
                }
            }
        }

        return sb.toString();  
    }
	

	public static void main(String[] args) {
		String x = vaporcode("Lets go to the movies");

		System.out.println(x);
	}

}