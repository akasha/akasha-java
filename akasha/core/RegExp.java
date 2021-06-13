package akasha.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RegExp object is used for matching text with a pattern.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp">RegExp - MDN</a>
 * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-regexp-regular-expression-objects">(ECMAScript) # sec-regexp-regular-expression-objects</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RegExp"
)
public class RegExp extends JsObject {
  public int lastIndex;

  public RegExp(@RegExpLanguage @Nonnull final String pattern,
      @RegExpFlags @Nonnull final String flags) {
  }

  public RegExp(@RegExpLanguage @Nonnull final String pattern) {
  }

  /**
   * The dotAll property indicates whether or not the &quot;s&quot; flag is used with the regular expression. dotAll is a read-only property of an individual regular expression instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/dotAll">RegExp.dotAll - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.dotAll">(ECMAScript) # sec-get-regexp.prototype.dotAll</a>
   */
  @JsProperty(
      name = "dotAll"
  )
  public native boolean dotAll();

  /**
   * The flags property returns a string consisting of the flags of the current regular expression object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/flags">RegExp.flags - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.flags">(ECMAScript) # sec-get-regexp.prototype.flags</a>
   */
  @JsProperty(
      name = "flags"
  )
  @RegExpFlags
  @Nonnull
  public native String flags();

  /**
   * The global property indicates whether or not the &quot;g&quot; flag is used with the regular expression. global is a read-only property of an individual regular expression instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/global">RegExp.global - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.global">(ECMAScript) # sec-get-regexp.prototype.global</a>
   */
  @JsProperty(
      name = "global"
  )
  public native boolean global();

  /**
   * The ignoreCase property indicates whether or not the &quot;i&quot; flag is used with the regular expression. ignoreCase is a read-only property of an individual regular expression instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/ignoreCase">RegExp.ignoreCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.ignorecase">(ECMAScript) # sec-get-regexp.prototype.ignorecase</a>
   */
  @JsProperty(
      name = "ignoreCase"
  )
  public native boolean ignoreCase();

  /**
   * The multiline property indicates whether or not the &quot;m&quot; flag is used with the regular expression. multiline is a read-only property of an individual regular expression instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/multiline">RegExp.multiline - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.multiline">(ECMAScript) # sec-get-regexp.prototype.multiline</a>
   */
  @JsProperty(
      name = "multiline"
  )
  public native boolean multiline();

  /**
   * The source property returns a String containing the source text of the regexp object, and it doesn't contain the two forward slashes on both sides and any flags.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/source">RegExp.source - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.source">(ECMAScript) # sec-get-regexp.prototype.source</a>
   */
  @JsProperty(
      name = "source"
  )
  @RegExpLanguage
  @Nonnull
  public native String source();

  /**
   * The sticky property reflects whether or not the search is sticky (searches in strings only from the index indicated by the lastIndex property of this regular expression). sticky is a read-only property of an individual regular expression object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/sticky">RegExp.sticky - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.sticky">(ECMAScript) # sec-get-regexp.prototype.sticky</a>
   */
  @JsProperty(
      name = "sticky"
  )
  public native boolean sticky();

  /**
   * The unicode property indicates whether or not the &quot;u&quot; flag is used with a regular expression. unicode is a read-only property of an individual regular expression instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/unicode">RegExp.unicode - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-get-regexp.prototype.unicode">(ECMAScript) # sec-get-regexp.prototype.unicode</a>
   */
  @JsProperty(
      name = "unicode"
  )
  public native boolean unicode();

  /**
   * The exec() method executes a search for a match in a specified string. Returns a result array, or null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/exec">RegExp.exec - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-regexp.prototype.exec">(ECMAScript) # sec-regexp.prototype.exec</a>
   */
  @Nullable
  public native RegExpResult exec(@Nonnull String text);

  /**
   * The test() method executes a search for a match between a regular expression and a specified string. Returns true or false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/test">RegExp.test - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-regexp.prototype.test">(ECMAScript) # sec-regexp.prototype.test</a>
   */
  public native boolean test(@Nonnull String text);

  /**
   * The toString() method returns a string representing the regular expression.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/toString">RegExp.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-regexp.prototype.tostring">(ECMAScript) # sec-regexp.prototype.tostring</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
