public String zipZap(String str) {
  if (str.length() < 3)
    return str;

  String out = "";
  for (int i=0; i<str.length() - 2; i++) {
    if (str.charAt(i) == "z".charAt(0) && str.charAt(i+2) == "p".charAt(0)) {
      out += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 2));
      i += 2;
    } else if (i == str.length() - 3)
      out += str.substring(i);
    else
      out += Character.toString(str.charAt(i));
  }
  return out;
}
