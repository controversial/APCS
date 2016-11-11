public String altPairs(String str) {
  String out = "";
  for (int i=0; i<str.length(); i+= 4)
    if (i==str.length()-1)
      out += str.substring(i, i+1);
    else
      out += str.substring(i, i+2);
  return out;
}
