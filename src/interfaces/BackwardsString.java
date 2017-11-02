package interfaces;

public class BackwardsString extends SpecialString {
	
	public BackwardsString(String s) {
		super(s);

	}

	@Override
	public String funkifyText(String s) {
		String thing = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			thing += s.charAt(i);
		}
		return thing;
	}
}
