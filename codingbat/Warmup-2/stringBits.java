public String stringBits(String str) {
  String out = "";
  for (int i=0; i<str.length(); i+=2) {
    out += str.substring(i, i+1);
  }
  return out;
}
