public String frontTimes(String str, int n) {
  String out = "";
  String front = str.length() < 3 ? str : str.substring(0, 3);
  for (int i=0; i<n; i++) out += front;
  return out;
}
