public String changePi(String str) {
  if (str.length() == 0) return "";
  return str.length() > 1 && str.substring(0, 2).equals("pi") ? 
    "3.14" + changePi(str.substring(2)) :
    str.substring(0, 1) + changePi(str.substring(1));
}
