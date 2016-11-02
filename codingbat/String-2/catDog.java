public boolean catDog(String str) {
  int catCount = 0, dogCount = 0;
  for (int i=0; i<str.length()-2; i++) {
    char a = str.charAt(i), b = str.charAt(i+1), c = str.charAt(i+2);
    if (a == "cat".charAt(0) && b == "cat".charAt(1) && c == "cat".charAt(2))
      catCount++;
    else if (a == "dog".charAt(0) && b == "dog".charAt(1) && c == "dog".charAt(2))
      dogCount++;
  }
  return catCount == dogCount;
}
