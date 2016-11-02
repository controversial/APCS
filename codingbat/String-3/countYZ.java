public int countYZ(String str) {
  str = str.toLowerCase();
  int count = 0;
  for (int i=0; i<str.length(); i++)
    if ((i==str.length()-1 || !Character.isLetter(str.charAt(i+1))) && (str.substring(i, i+1).equals("y") || str.substring(i, i+1).equals("z")))
      count++;
  return count;
}
