public class Isogram {
	public String isIsogram(String s1) {

		if (s1.equals("")) {
			throw new IllegalArgumentException("Empty string not allowed");
		}

		char[] s1chars = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1chars[i] == s1chars[j]) {
					return "False";
				}
			}
		}
		return "True";
	}
}
