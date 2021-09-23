package Academy;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Y^%^*%&*^*(&*(P6666ankaj";
		str= str.replaceAll("[^a-z, 0-9, A-Z]", "");
		System.out.println(str);
	}
}
