public String repeatSeparator(String word, String sep, int count) {
  String out = "";
  for (int i=0; i<count; i++)
    out += word + (i<count-1 ? sep:"");
  return out;
}
