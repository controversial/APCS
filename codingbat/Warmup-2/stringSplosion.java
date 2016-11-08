public String stringSplosion(String str) {
  String out = "";
  for (int i=0; i<=str.length(); i++) out += str.substring(0, i);
  return out;
}
