import java.util.StringTokenizer;


class Lab6Ex4{
	public static void main(String args[]){
		String s1 = "The StringTokenizer class allows a string to be broken into tokens";
		StringTokenizer st = new StringTokenizer(s1,"");
		//count tokens
		System.out.println("Number of tokens:"+st.countTokens());
		
		//
		while(st.hasMoreTokens()) 
			System.out.println(st.nextToken()); 
		
	}
	
	
}