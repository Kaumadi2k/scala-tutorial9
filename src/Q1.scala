object RationalNumberDemoX {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must be nonzero")

    val gcdValue: Int = gcd(n.abs, d.abs)
    val numer: Int = n / gcdValue
    val denom: Int = d / gcdValue

    def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }

    def neg: Rational = new Rational(-numer, denom)

    override def toString: String = s"$numer / $denom"
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(1, 2)
    val y = new Rational(3, 4)
    println(x.neg) // -1/2
    println(y.neg) // -3/4
  }
}
