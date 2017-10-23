package interfaces;

public class BackwardsString extends SpecialString {
	
	String thing = "";

	public BackwardsString(String s) {
		super(s);

	}

	@Override
	public String funkifyText(String s) {
		for (int i = 0; i < s.length(); i ++) {
			thing += s.charAt(s.length() - i);
		}
		System.out.println(thing);
		return thing;
	}

}
