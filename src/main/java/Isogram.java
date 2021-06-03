public class Isogram {
	public String isIsogram(String s1) {

		char[] s1chars = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1chars[i] == s1chars[j]) {
					return "This is not an isogram";
				}
			}
		}
		return s1;
	}

}
