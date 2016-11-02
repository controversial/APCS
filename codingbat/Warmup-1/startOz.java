public String startOz(String str) {
  if (str.length() < 2) return str.equals("o") ? "o" : "";
  return (str.charAt(0) == "o".charAt(0) ? "o":"") + (str.charAt(1) == "z".charAt(0) ? "z":"");
}
