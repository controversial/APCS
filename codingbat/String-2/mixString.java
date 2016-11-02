public String mixString(String a, String b) {
  String out = "";
  int length = Math.max(a.length(), b.length());
  for (int i=0; i<length; i++) {
    if (i < a.length()) out += Character.toString(a.charAt(i));
    if (i < b.length()) out += Character.toString(b.charAt(i));
  }
  return out;
}
