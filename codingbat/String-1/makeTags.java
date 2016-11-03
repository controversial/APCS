public String makeTags(String tag, String word) {
  String openTag = "<"+tag+">";
  String closeTag = "</"+tag+">";
  return openTag + word + closeTag;
}
