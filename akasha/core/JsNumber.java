package akasha.core;

import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Number constructor contains constants and methods for working with numbers. Values of other types can be converted to numbers using the Number() function.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number">Number - MDN</a>
 * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number-objects">(ECMAScript) # sec-number-objects</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Number"
)
public class JsNumber extends JsObject {
  /**
   * The Number.EPSILON property represents the difference between 1 and the smallest floating point number greater than 1.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/EPSILON">Number.EPSILON - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.epsilon">(ECMAScript) # sec-number.epsilon</a>
   */
  @JsOverlay
  public static final double EPSILON = Constants.EPSILON;

  /**
   * The Number.MAX_SAFE_INTEGER constant represents the maximum safe integer in JavaScript (2^53 - 1).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER">Number.MAX_SAFE_INTEGER - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.max_safe_integer">(ECMAScript) # sec-number.max_safe_integer</a>
   */
  @JsOverlay
  public static final double MAX_SAFE_INTEGER = Constants.MAX_SAFE_INTEGER;

  /**
   * The Number.MAX_VALUE property represents the maximum numeric value representable in JavaScript.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_VALUE">Number.MAX_VALUE - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.max_value">(ECMAScript) # sec-number.max_value</a>
   */
  @JsOverlay
  public static final double MAX_VALUE = Constants.MAX_VALUE;

  /**
   * The Number.MIN_SAFE_INTEGER constant represents the minimum safe integer in JavaScript (-(2^53 - 1)).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MIN_SAFE_INTEGER">Number.MIN_SAFE_INTEGER - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.min_safe_integer">(ECMAScript) # sec-number.min_safe_integer</a>
   */
  @JsOverlay
  public static final double MIN_SAFE_INTEGER = Constants.MIN_SAFE_INTEGER;

  /**
   * The Number.MIN_VALUE property represents the smallest positive numeric value representable in JavaScript.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MIN_VALUE">Number.MIN_VALUE - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.min_value">(ECMAScript) # sec-number.min_value</a>
   */
  @JsOverlay
  public static final double MIN_VALUE = Constants.MIN_VALUE;

  /**
   * The Number.NEGATIVE_INFINITY property represents the negative Infinity value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/NEGATIVE_INFINITY">Number.NEGATIVE_INFINITY - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.negative_infinity">(ECMAScript) # sec-number.negative_infinity</a>
   */
  @JsOverlay
  public static final double NEGATIVE_INFINITY = Constants.NEGATIVE_INFINITY;

  /**
   * The Number.NaN property represents Not-A-Number. Equivalent of NaN.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/NaN">Number.NaN - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.nan">(ECMAScript) # sec-number.nan</a>
   */
  @JsOverlay
  public static final double NaN = Constants.NaN;

  /**
   * The Number.POSITIVE_INFINITY property represents the positive Infinity value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/POSITIVE_INFINITY">Number.POSITIVE_INFINITY - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.positive_infinity">(ECMAScript) # sec-number.positive_infinity</a>
   */
  @JsOverlay
  public static final double POSITIVE_INFINITY = Constants.POSITIVE_INFINITY;

  /**
   * The Number() constructor creates a Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/Number">Number.Number - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number-constructor">Number constructor - ECMAScript (ECMA-262)</a>
   */
  public JsNumber(final double value) {
  }

  /**
   * The Number() constructor creates a Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/Number">Number.Number - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-number-constructor">Number constructor - ECMAScript (ECMA-262)</a>
   */
  public JsNumber() {
  }

  /**
   * The Number.isFinite() method determines whether the passed value is a finite number &mdash; that is, it checks that the type of a given value is Number, and the number is neither positive Infinity, negative Infinity, nor NaN.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isFinite">Number.isFinite - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.isfinite">(ECMAScript) # sec-number.isfinite</a>
   */
  public static native boolean isFinite(double value);

  /**
   * The Number.isInteger() method determines whether the passed value is an integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isInteger">Number.isInteger - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.isinteger">(ECMAScript) # sec-number.isinteger</a>
   */
  public static native boolean isInteger(double value);

  /**
   * The Number.isNaN() method determines whether the passed value is NaN and its type is Number. It is a more robust version of the original, global isNaN().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN">Number.isNaN - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.isnan">(ECMAScript) # sec-number.isnan</a>
   */
  public static native boolean isNaN(double value);

  /**
   * The Number.isSafeInteger() method determines whether the provided value is a number that is a safe integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger">Number.isSafeInteger - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.issafeinteger">(ECMAScript) # sec-number.issafeinteger</a>
   */
  public static native boolean isSafeInteger(double value);

  /**
   * The Number.parseFloat() method parses an argument and returns a floating point number. If a number cannot be parsed from the argument, it returns NaN.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/parseFloat">Number.parseFloat - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.parsefloat">(ECMAScript) # sec-number.parsefloat</a>
   */
  public static native double parseFloat(@Nonnull String string);

  /**
   * The Number.parseInt() method parses a string argument and returns an integer of the specified radix or base.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/parseInt">Number.parseInt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.parseint">(ECMAScript) # sec-number.parseint</a>
   */
  public static native int parseInt(@Nonnull String string, int radix);

  /**
   * The toExponential() method returns a string representing the Number object in exponential notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential">Number.toExponential - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.toexponential">(ECMAScript) # sec-number.prototype.toexponential</a>
   */
  @HasNoSideEffects
  @Nonnull
  public native String toExponential(int fractionDigits);

  /**
   * The toExponential() method returns a string representing the Number object in exponential notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential">Number.toExponential - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.toexponential">(ECMAScript) # sec-number.prototype.toexponential</a>
   */
  @HasNoSideEffects
  @Nonnull
  public native String toExponential();

  /**
   * The toFixed() method formats a number using fixed-point notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed">Number.toFixed - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.tofixed">(ECMAScript) # sec-number.prototype.tofixed</a>
   */
  @HasNoSideEffects
  @Nonnull
  public native String toFixed(int digits);

  /**
   * The toFixed() method formats a number using fixed-point notation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed">Number.toFixed - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.tofixed">(ECMAScript) # sec-number.prototype.tofixed</a>
   */
  @HasNoSideEffects
  @Nonnull
  public native String toFixed();

  /**
   * The toPrecision() method returns a string representing the Number object to the specified precision.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toPrecision">Number.toPrecision - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.toprecision">(ECMAScript) # sec-number.prototype.toprecision</a>
   */
  @HasNoSideEffects
  @Nonnull
  public native String toPrecision(int precision);

  /**
   * The toPrecision() method returns a string representing the Number object to the specified precision.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toPrecision">Number.toPrecision - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.toprecision">(ECMAScript) # sec-number.prototype.toprecision</a>
   */
  @HasNoSideEffects
  @Nonnull
  public native String toPrecision();

  /**
   * The toString() method returns a string representing the specified Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toString">Number.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.tostring">(ECMAScript) # sec-number.prototype.tostring</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_(int radix);

  /**
   * The toString() method returns a string representing the specified Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toString">Number.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.tostring">(ECMAScript) # sec-number.prototype.tostring</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();

  /**
   * The valueOf() method returns the wrapped primitive value of a Number object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/valueOf">Number.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/numbers-and-dates.html#sec-number.prototype.valueof">(ECMAScript) # sec-number.prototype.valueof</a>
   */
  public native double valueOf();

  @JsType(
      isNative = true,
      name = "Number",
      namespace = JsPackage.GLOBAL
  )
  private static final class Constants {
    private static double EPSILON;

    private static double MAX_SAFE_INTEGER;

    private static double MAX_VALUE;

    private static double MIN_SAFE_INTEGER;

    private static double MIN_VALUE;

    private static double NEGATIVE_INFINITY;

    private static double NaN;

    private static double POSITIVE_INFINITY;
  }
}
