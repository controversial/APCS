public boolean xyzMiddle(String str) {
  if (str.equals("xyz")) return true;

  // Try by taking off from the end first
  String copy = new String(str);
  for (int i=0; copy.length() > 3; i++) {
    copy = copy.substring(0, copy.length()-1);
    if (copy.equals("xyz")) return true;
    copy = copy.substring(1);
    if (copy.equals("xyz")) return true;
  }

  // Try by taking off from the beginning first
  copy = new String(str);
  for (int i=0; copy.length() > 3; i++) {
    copy = copy.substring(1);
    if (copy.equals("xyz")) return true;
    copy = copy.substring(0, copy.length()-1);
    if (copy.equals("xyz")) return true;
  }

  return false;
}
