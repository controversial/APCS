public String repeatFront(String str, int n) {
  String out="";
  for (int i=n; i>0; i--) {
    out += str.substring(0, i);
  }
  return out;
}
