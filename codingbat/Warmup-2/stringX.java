public String stringX(String str) {
  if (str.length() < 2) return str;

  String out = str.substring(0, 1);
  for (int i=1; i<str.length()-1; i++)
    if (str.charAt(i) != 'x')
      out += str.substring(i, i+1);
  out += str.substring(str.length()-1);

  return out;
}
