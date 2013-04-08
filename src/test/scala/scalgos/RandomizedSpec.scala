package scalgos

import org.specs2.mutable.Specification

import scalgos.Randomized._

class RandomizedSpec extends Specification {

  "quickSelect" should {
    "match naive sort based algorithm" in {
      val s = RandomData.seq()
      val k = RandomData.integer(0, s.length)
      quickSelect(s, k) must be equalTo(s.sorted.apply(k))
    }

    "match median-of-medians algorithm" in todo
  }
}
