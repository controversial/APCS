public String wordEnds(String str, String word) {
  String out = "";
  
  for (int i=0; i<str.length(); i++) {
    // Create a string to compare to word.
    String test;
    if (i < str.length() - word.length()) test = str.substring(i, i+word.length());
    else test = str.substring(i);

    // Compare the test string to the word
    if (test.equals(word)) {
      // Before
      if (i > 0) {
        out += Character.toString(str.charAt(i-1));
      }
      // After
      if (i < str.length()-word.length()) {
        out += Character.toString(str.charAt(i+word.length()));
      }
    }
  }

  return out;
}
