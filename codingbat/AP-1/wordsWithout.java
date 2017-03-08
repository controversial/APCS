public String[] wordsWithout(String[] words, String target) {
  int removalCount = 0;
  for (int i = 0; i < words.length; i++) {
    if (words[i].equals(target)) removalCount++;
  }
  
  String[] out = new String[words.length - removalCount];
  int outIndex = 0;
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      out[outIndex] = words[i];
      outIndex++;
    }
  }

  return out;
}
