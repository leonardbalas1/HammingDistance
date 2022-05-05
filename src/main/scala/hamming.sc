def hamming(s1: String, s2: String): Int = {
  if (s1.length != s2.length)
    throw new IllegalArgumentException()
  (s1.toList).zip(s2.toList)
    .filter(current => current._1 != current._2)
    .length
}
hamming("GAGCCTACTAACGGGAT","CATCGTAATGACGGCCT")






