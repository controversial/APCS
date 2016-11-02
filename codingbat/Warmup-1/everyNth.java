public String everyNth(String str, int n) {
  String out = "";
  for (int i=0; i<str.length(); i+=n) {
    out += Character.toString(str.charAt(i));
  }
  return out;
}
