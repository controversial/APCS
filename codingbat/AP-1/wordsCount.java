public int wordsCount(String[] words, int len) {
  int count = 0;
  for (String w : words) if (w.length() == len) count++;
  return count;
}
