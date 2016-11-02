public String starOut(String str) {
  if (str.equals("*")) return "";
  str = str.replaceAll(".\\*+.", "");
  if (str.length() > 0 && str.charAt(0) == "*".charAt(0)) str = str.substring(2);
  if (str.length() > 0 && str.charAt(str.length()-1) == "*".charAt(0)) str = str.substring(0, str.length()-2);
  return str;
}
