public String oneTwo(String str) {
  String out = "";
  for (int i=0; i<str.length()-2; i+=3)
    out += str.substring(i+1, i+3) + Character.toString(str.charAt(i));
  return out;
}
