package com.newsweaver.math

import math.{abs, max, pow, sqrt}
import org.scalacheck.Prop.forAll
import org.scalacheck.Properties
import org.scalacheck.Prop.BooleanOperators
import org.scalatest._
import prop._

class MathProp extends PropSpec with Checkers {

  property("max(x, y) returns the maximum of x and y") {
    check(
      forAll { (x: Int, y: Int) =>
        val z = max(x, y)
        (z >= x && z >= y) && (z == x || z == y)
      }
    )
  }

  property("sqrt(x) returns NaN if x is negative") {
    check(
      forAll { x: Double =>
        (x < 0) ==> java.lang.Double.isNaN(sqrt(x))
      }
    )
  }

  property("sqrt(x) returns a positive number if x is positive") {
    check(
      forAll { x: Double =>
        (x > 0) ==> (sqrt(x) > 0)
      }
    )
  }

  property("sqrt(x) returns a number whose square is equal to x if x is positive") {
    check(
      forAll { x: Double =>
        (x > 0) ==> {
          val y = sqrt(x)
          y * y == x
        }
      }
    )
  }

}
