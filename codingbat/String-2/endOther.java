public boolean endOther(String a, String b) {
  a = a.toLowerCase(); b = b.toLowerCase();
  if (a.length() > b.length())
    return a.substring(a.length()-b.length()).equals(b);
  else
    return b.substring(b.length()-a.length()).equals(a);

}
