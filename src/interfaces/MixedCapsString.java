package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);

	}

	@Override
	public String funkifyText(String s) {
		String thing = "";
		int blah = 0;
		for (int i = 0; i < s.length(); i++) {
			if (blah == 0) {
				thing += Character.toLowerCase(s.charAt(i));
				blah = 1;
			} else {
				thing += Character.toUpperCase(s.charAt(i));
				blah = 0;
			}
		}
		return thing;
	}

}
