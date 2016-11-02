public String repeatEnd(String str, int n) {
  String out="", segment = str.substring(str.length()-n);
  for (int i=0; i<n; i++) out+=segment;
  return out;
}
