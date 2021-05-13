package code_with_harry;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Asmita";
		
		String modified_name=" Asmita Kakkkar is so cute !! ";
		int length=name.length();
		System.out.println("Length of the string "+name+"is "+length);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(modified_name);
		System.out.println(modified_name.trim());
		System.out.println(name.substring(2));
		System.out.println(modified_name.substring(4,17));
		System.out.println(name.replace('A','h'));
		System.out.println(name.startsWith("As"));
		System.out.println(name.endsWith("it"));
		System.out.println(name.endsWith("ita"));
		System.out.println(modified_name.charAt(15));
		System.out.println(modified_name.indexOf("kk"));
		System.out.println(modified_name.lastIndexOf("kk"));
		System.out.println(modified_name.indexOf("kk",11));
		System.out.println(modified_name.lastIndexOf("kk",10));
		System.out.println(name.equals("Asmita"));
		System.out.println(name.equals("asmita"));
		System.out.println(name.equalsIgnoreCase("Asmita"));

	}

}
