public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> out = new ArrayList();
  for (String w:words) if (w.length() != len) out.add(w);
  return out;
}
