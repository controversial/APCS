public String doubleChar(String str) {
  String out = "";
  for (int i=0; i<str.length(); i++) {
    String letter = Character.toString(str.charAt(i));
    out += letter + letter;
  }
  return out;
}
