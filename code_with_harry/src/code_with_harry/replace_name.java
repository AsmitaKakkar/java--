package code_with_harry;

public class replace_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dear <|name|> , Thanks a lot!!";
		System.out.println(str);
		str=str.replace("<|name|>","Asmita");
		System.out.println(str);

	}

}
