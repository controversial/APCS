public String reverse(String str) {
  return new StringBuilder(str).reverse().toString();
};

public String mirrorEnds(String string) {
  String end = "";
  for (int i=string.length(); i>=0; i--) {
    end = string.substring(0, i);
    if (string.endsWith(reverse(end))) return end;
  }
  return "";
}
