package com.newsweaver.math

import java.lang.Double.isNaN
import org.scalatest.{FunSpec, Matchers}
import scala.math.{max, sqrt}

class MathSpec extends FunSpec with Matchers {

  describe("max") {

    it("should return its positive argument when passed 0 and a positive number") {
      val posNum = 42
      max(0, posNum) shouldEqual posNum
    }

    it("should return 0 when passed 0 and a negative number") {
      val negNum = -1
      max(0, negNum) shouldEqual 0
    }

    it("should return its argument when passed the same number twice") {
      val num = 2
      max(num, num) shouldEqual num
    }

  }

  describe("sqrt") {

    it("should return NaN when passed a negative number") {
      val x = -1
      isNaN(sqrt(x)) shouldBe true
    }

    it("should return a positive number when passed a positive number") {
      val x = 42
      (sqrt(x) > 0) shouldBe true
    }

    it("should return a number whose square is equal to its argument, when the latter is a positive number") {
      val x = 42
      val y = sqrt(x)
      (y * y) shouldEqual x
    }

  }

}
