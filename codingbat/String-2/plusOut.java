public String plusOut(String str, String word) {
  return str.replace(word, "@").replaceAll("[^@]", "+").replace("@", word);
}
