package akasha.core;

import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Math is a built-in object that has properties and methods for mathematical constants and functions. It&rsquo;s not a function object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math">Math - MDN</a>
 */
@JsType(
    isNative = true,
    name = "Math",
    namespace = JsPackage.GLOBAL
)
@Generated("org.realityforge.webtack")
public final class JsMath {
  /**
   * The Math.E property represents Euler's number, the base of natural logarithms, e, which is approximately 2.718.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/E">Math.E - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.e">(ECMAScript) # sec-math.e</a>
   */
  @JsOverlay
  public static final double E = Constants.E;

  /**
   * The Math.LN10 property represents the natural logarithm of 10, approximately 2.302:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LN10">Math.LN10 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.ln10">(ECMAScript) # sec-math.ln10</a>
   */
  @JsOverlay
  public static final double LN10 = Constants.LN10;

  /**
   * The Math.LN2 property represents the natural logarithm of 2, approximately 0.693:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LN2">Math.LN2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.ln2">(ECMAScript) # sec-math.ln2</a>
   */
  @JsOverlay
  public static final double LN2 = Constants.LN2;

  /**
   * The Math.LOG10E property represents the base 10 logarithm of e, approximately 0.434:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LOG10E">Math.LOG10E - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.log10e">(ECMAScript) # sec-math.log10e</a>
   */
  @JsOverlay
  public static final double LOG10E = Constants.LOG10E;

  /**
   * The Math.LOG2E property represents the base 2 logarithm of e, approximately 1.442:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/LOG2E">Math.LOG2E - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.log2e">(ECMAScript) # sec-math.log2e</a>
   */
  @JsOverlay
  public static final double LOG2E = Constants.LOG2E;

  /**
   * The Math.PI property represents the ratio of the circumference of a circle to its diameter, approximately 3.14159:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/PI">Math.PI - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.pi">(ECMAScript) # sec-math.pi</a>
   */
  @JsOverlay
  public static final double PI = Constants.PI;

  /**
   * The Math.SQRT1_2 property represents the square root of 1/2 which is approximately 0.707:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/SQRT1_2">Math.SQRT1_2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.sqrt1_2">(ECMAScript) # sec-math.sqrt1_2</a>
   */
  @JsOverlay
  public static final double SQRT1_2 = Constants.SQRT1_2;

  /**
   * The Math.SQRT2 property represents the square root of 2, approximately 1.414:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/SQRT2">Math.SQRT2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.sqrt2">(ECMAScript) # sec-math.sqrt2</a>
   */
  @JsOverlay
  public static final double SQRT2 = Constants.SQRT2;

  private JsMath() {
  }

  /**
   * The Math.abs() function returns the absolute value of a number. That is, it returns x if x is positive or zero, and the negation of x if x is negative.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/abs">Math.abs - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.abs">(ECMAScript) # sec-math.abs</a>
   */
  @HasNoSideEffects
  public static native double abs(double x);

  /**
   * The Math.acos() function returns the arccosine (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/acos">Math.acos - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.acos">(ECMAScript) # sec-math.acos</a>
   */
  @HasNoSideEffects
  public static native double acos(double x);

  /**
   * The Math.acosh() function returns the hyperbolic arc-cosine of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/acosh">Math.acosh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.acosh">(ECMAScript) # sec-math.acosh</a>
   */
  @HasNoSideEffects
  public static native double acosh(double x);

  /**
   * The Math.asin() function returns the arcsine (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/asin">Math.asin - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.asin">(ECMAScript) # sec-math.asin</a>
   */
  @HasNoSideEffects
  public static native double asin(double x);

  /**
   * The Math.asinh() function returns the hyperbolic arcsine of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/asinh">Math.asinh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.asinh">(ECMAScript) # sec-math.asinh</a>
   */
  @HasNoSideEffects
  public static native double asinh(double x);

  /**
   * The Math.atan() function returns the arctangent (in radians) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atan">Math.atan - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.atan">(ECMAScript) # sec-math.atan</a>
   */
  @HasNoSideEffects
  public static native double atan(double x);

  /**
   * The Math.atan2() function returns the angle in the plane (in radians) between the positive x-axis and the ray from (0,0) to the point (x,y), for Math.atan2(y,x).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atan2">Math.atan2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.atan2">(ECMAScript) # sec-math.atan2</a>
   */
  @HasNoSideEffects
  public static native double atan2(double y, double x);

  /**
   * The Math.atanh() function returns the hyperbolic arctangent of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/atanh">Math.atanh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.atanh">(ECMAScript) # sec-math.atanh</a>
   */
  @HasNoSideEffects
  public static native double atanh(double x);

  /**
   * The Math.cbrt() function returns the cube root of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cbrt">Math.cbrt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.cbrt">(ECMAScript) # sec-math.cbrt</a>
   */
  @HasNoSideEffects
  public static native double cbrt(double x);

  /**
   * The Math.ceil() function always rounds a number up to the next largest integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/ceil">Math.ceil - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.ceil">(ECMAScript) # sec-math.ceil</a>
   */
  @HasNoSideEffects
  public static native int ceil(double x);

  /**
   * The Math.clz32() function returns the number of leading zero bits in the 32-bit binary representation of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/clz32">Math.clz32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.clz32">(ECMAScript) # sec-math.clz32</a>
   */
  @HasNoSideEffects
  public static native int clz32(int x);

  /**
   * The Math.cos() static function returns the cosine of the specified angle, which must be specified in radians.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cos">Math.cos - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.cos">(ECMAScript) # sec-math.cos</a>
   */
  @HasNoSideEffects
  public static native double cos(double x);

  /**
   * The Math.cosh() function returns the hyperbolic cosine of a number, that can be expressed using the constant e:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/cosh">Math.cosh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.cosh">(ECMAScript) # sec-math.cosh</a>
   */
  @HasNoSideEffects
  public static native double cosh(double x);

  /**
   * The Math.exp() function returns e^x, where x is the argument, and e is Euler's number (also known as Napier's constant), the base of the natural logarithms.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/exp">Math.exp - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.exp">(ECMAScript) # sec-math.exp</a>
   */
  @HasNoSideEffects
  public static native double exp(double x);

  /**
   * The Math.expm1() function returns e^x - 1, where x is the argument, and e the base of the natural logarithms.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/expm1">Math.expm1 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.expm1">(ECMAScript) # sec-math.expm1</a>
   */
  @HasNoSideEffects
  public static native double expm1(double x);

  /**
   * The Math.floor() function returns the largest integer less than or equal to a given number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/floor">Math.floor - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.floor">(ECMAScript) # sec-math.floor</a>
   */
  @HasNoSideEffects
  public static native int floor(double x);

  /**
   * The Math.fround() function returns the nearest 32-bit single precision float representation of a Number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/fround">Math.fround - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.fround">(ECMAScript) # sec-math.fround</a>
   */
  @HasNoSideEffects
  public static native float fround(double x);

  /**
   * The Math.hypot() function returns the square root of the sum of squares of its arguments, that is:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/hypot">Math.hypot - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.hypot">(ECMAScript) # sec-math.hypot</a>
   */
  @HasNoSideEffects
  public static native double hypot(double... value);

  /**
   * The Math.imul() function returns the result of the C-like 32-bit multiplication of the two parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/imul">Math.imul - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.imul">(ECMAScript) # sec-math.imul</a>
   */
  @HasNoSideEffects
  public static native double imul(double... value);

  /**
   * The Math.imul() function returns the result of the C-like 32-bit multiplication of the two parameters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/imul">Math.imul - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.imul">(ECMAScript) # sec-math.imul</a>
   */
  @HasNoSideEffects
  public static native int imul(int value1, int value2);

  /**
   * The Math.log() function returns the natural logarithm (base e) of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log">Math.log - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.log">(ECMAScript) # sec-math.log</a>
   */
  @HasNoSideEffects
  public static native double log(double x);

  /**
   * The Math.log10() function returns the base 10 logarithm of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log10">Math.log10 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.log10">(ECMAScript) # sec-math.log10</a>
   */
  @HasNoSideEffects
  public static native double log10(double x);

  /**
   * The Math.log1p() function returns the natural logarithm (base e) of 1 + a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log1p">Math.log1p - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.log1p">(ECMAScript) # sec-math.log1p</a>
   */
  @HasNoSideEffects
  public static native double log1p(double x);

  /**
   * The Math.log2() function returns the base 2 logarithm of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/log2">Math.log2 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.log2">(ECMAScript) # sec-math.log2</a>
   */
  @HasNoSideEffects
  public static native double log2(double x);

  /**
   * The Math.max() function returns the largest of the zero or more numbers given as input parameters, or NaN if any parameter isn't a number and can't be converted into one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/max">Math.max - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.max">(ECMAScript) # sec-math.max</a>
   */
  @HasNoSideEffects
  public static native double max(double... values);

  /**
   * The static function Math.min() returns the lowest-valued number passed into it, or NaN if any parameter isn't a number and can't be converted into one.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/min">Math.min - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.min">(ECMAScript) # sec-math.min</a>
   */
  @HasNoSideEffects
  public static native double min(double... values);

  /**
   * The Math.pow() function returns the base to the exponent power, as in base^exponent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/pow">Math.pow - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.pow">(ECMAScript) # sec-math.pow</a>
   */
  @HasNoSideEffects
  public static native double pow(double x, double y);

  /**
   * The Math.random() function returns a floating-point, pseudo-random number in the range 0 to less than 1 (inclusive of 0, but not 1) with approximately uniform distribution over that range &mdash; which you can then scale to your desired range. The implementation selects the initial seed to the random number generation algorithm; it cannot be chosen or reset by the user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random">Math.random - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.random">(ECMAScript) # sec-math.random</a>
   */
  @HasNoSideEffects
  public static native double random();

  /**
   * The Math.round() function returns the value of a number rounded to the nearest integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round">Math.round - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.round">(ECMAScript) # sec-math.round</a>
   */
  @HasNoSideEffects
  public static native int round(double x);

  /**
   * The Math.sign() function returns either a positive or negative +/- 1, indicating the sign of a number passed into the argument. If the number passed into Math.sign() is 0, it will return a +/- 0. Note that if the number is positive, an explicit (+) will not be returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sign">Math.sign - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.sign">(ECMAScript) # sec-math.sign</a>
   */
  @HasNoSideEffects
  public static native double sign(double x);

  /**
   * The Math.sin() function returns the sine of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sin">Math.sin - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.sin">(ECMAScript) # sec-math.sin</a>
   */
  @HasNoSideEffects
  public static native double sin(double x);

  /**
   * The Math.sinh() function returns the hyperbolic sine of a number, that can be expressed using the constant e:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sinh">Math.sinh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.sinh">(ECMAScript) # sec-math.sinh</a>
   */
  @HasNoSideEffects
  public static native double sinh(double x);

  /**
   * The Math.sqrt() function returns the square root of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sqrt">Math.sqrt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.sqrt">(ECMAScript) # sec-math.sqrt</a>
   */
  @HasNoSideEffects
  public static native double sqrt(double x);

  /**
   * The Math.tan() function returns the tangent of a number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/tan">Math.tan - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.tan">(ECMAScript) # sec-math.tan</a>
   */
  @HasNoSideEffects
  public static native double tan(double x);

  /**
   * The Math.tanh() function returns the hyperbolic tangent of a number, that is
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/tanh">Math.tanh - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.tanh">(ECMAScript) # sec-math.tanh</a>
   */
  @HasNoSideEffects
  public static native double tanh(double x);

  /**
   * The Math.trunc() function returns the integer part of a number by removing any fractional digits.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/trunc">Math.trunc - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-math.trunc">(ECMAScript) # sec-math.trunc</a>
   */
  @HasNoSideEffects
  public static native int trunc(double x);

  @JsType(
      isNative = true,
      name = "Math",
      namespace = JsPackage.GLOBAL
  )
  private static final class Constants {
    private static double E;

    private static double LN10;

    private static double LN2;

    private static double LOG10E;

    private static double LOG2E;

    private static double PI;

    private static double SQRT1_2;

    private static double SQRT2;
  }
}
