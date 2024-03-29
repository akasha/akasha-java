package akasha.core;

import akasha.lang.JsArray;
import akasha.lang.JsIterator;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The String object is used to represent and manipulate a sequence of characters.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String">String - MDN</a>
 * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string-objects"># sec-string-objects</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "String"
)
public class JsString extends JsObject {
  public JsString(@Nonnull final String str) {
  }

  public JsString() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The static String.fromCharCode() method returns a string created from the specified sequence of UTF-16 code units.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCharCode">String.fromCharCode - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.fromcharcode"># sec-string.fromcharcode</a>
   */
  @JsNonNull
  public static native String fromCharCode(int... charCodes);

  /**
   * The static String.fromCodePoint() method returns a string created by using the specified sequence of code points.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCodePoint">String.fromCodePoint - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.fromcodepoint"># sec-string.fromcodepoint</a>
   */
  @JsNonNull
  public static native String fromCodePoint(int codePoint, int... codePoints);

  /**
   * The String object's charAt() method returns a new string consisting of the single UTF-16 code unit located at the specified offset into the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/charAt">String.charAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.charat"># sec-string.prototype.charat</a>
   */
  @JsNonNull
  public native String charAt(int index);

  /**
   * The charCodeAt() method returns an integer between 0 and 65535 representing the UTF-16 code unit at the given index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/charCodeAt">String.charCodeAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.charcodeat"># sec-string.prototype.charcodeat</a>
   */
  @HasNoSideEffects
  public native int charCodeAt();

  /**
   * The charCodeAt() method returns an integer between 0 and 65535 representing the UTF-16 code unit at the given index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/charCodeAt">String.charCodeAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.charcodeat"># sec-string.prototype.charcodeat</a>
   */
  @HasNoSideEffects
  public native int charCodeAt(int index);

  /**
   * The codePointAt() method returns a non-negative integer that is the Unicode code point value at the given position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/codePointAt">String.codePointAt - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.codepointat"># sec-string.prototype.codepointat</a>
   */
  @HasNoSideEffects
  public native int codePointAt(int index);

  /**
   * The concat() method concatenates the string arguments to the calling string and returns a new string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/concat">String.concat - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.concat"># sec-string.prototype.concat</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String concat(@Nonnull String... strings);

  /**
   * The endsWith() method determines whether a string ends with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/endsWith">String.endsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.endswith"># sec-string.prototype.endswith</a>
   */
  @HasNoSideEffects
  public native boolean endsWith(@Nonnull String searchString, int position);

  /**
   * The endsWith() method determines whether a string ends with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/endsWith">String.endsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.endswith"># sec-string.prototype.endswith</a>
   */
  @HasNoSideEffects
  public native boolean endsWith(@Nonnull String searchString);

  /**
   * The includes() method performs a case-sensitive search to determine whether one string may be found within another string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes">String.includes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.includes"># sec-string.prototype.includes</a>
   */
  @HasNoSideEffects
  public native boolean includes(@Nonnull String searchString, int position);

  /**
   * The includes() method performs a case-sensitive search to determine whether one string may be found within another string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/includes">String.includes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.includes"># sec-string.prototype.includes</a>
   */
  @HasNoSideEffects
  public native boolean includes(@Nonnull String searchString);

  /**
   * The indexOf() method, given one argument: a substring to search for, searches the entire calling string, and returns the index of the first occurrence of the specified substring. Given a second argument: a number, the method returns the first occurrence of the specified substring at an index greater than or equal to the specified number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf">String.indexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.indexof"># sec-string.prototype.indexof</a>
   */
  @HasNoSideEffects
  public native int indexOf(@Nonnull String searchValue, int fromIndex);

  /**
   * The indexOf() method, given one argument: a substring to search for, searches the entire calling string, and returns the index of the first occurrence of the specified substring. Given a second argument: a number, the method returns the first occurrence of the specified substring at an index greater than or equal to the specified number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf">String.indexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.indexof"># sec-string.prototype.indexof</a>
   */
  @HasNoSideEffects
  public native int indexOf(@Nonnull String searchValue);

  /**
   * The lastIndexOf() method, given one argument: a substring to search for, searches the entire calling string, and returns the index of the last occurrence of the specified substring. Given a second argument: a number, the method returns the last occurrence of the specified substring at an index less than or equal to the specified number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf">String.lastIndexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.lastindexof"># sec-string.prototype.lastindexof</a>
   */
  @HasNoSideEffects
  public native int lastIndexOf(@Nonnull String searchValue, int fromIndex);

  /**
   * The lastIndexOf() method, given one argument: a substring to search for, searches the entire calling string, and returns the index of the last occurrence of the specified substring. Given a second argument: a number, the method returns the last occurrence of the specified substring at an index less than or equal to the specified number.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf">String.lastIndexOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.lastindexof"># sec-string.prototype.lastindexof</a>
   */
  @HasNoSideEffects
  public native int lastIndexOf(@Nonnull String searchValue);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.localecompare"># sec-string.prototype.localecompare</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare"># sup-String.prototype.localeCompare</a>
   */
  @HasNoSideEffects
  public native int localeCompare(@Nonnull String compareString, @Nonnull String locales,
      @Nonnull JsObject options);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.localecompare"># sec-string.prototype.localecompare</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare"># sup-String.prototype.localeCompare</a>
   */
  @HasNoSideEffects
  public native int localeCompare(@Nonnull String compareString, @Nonnull JsArray<String> locales,
      @Nonnull JsObject options);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.localecompare"># sec-string.prototype.localecompare</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare"># sup-String.prototype.localeCompare</a>
   */
  @HasNoSideEffects
  public native int localeCompare(@Nonnull String compareString, @Nonnull String[] locales,
      @Nonnull JsObject options);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.localecompare"># sec-string.prototype.localecompare</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare"># sup-String.prototype.localeCompare</a>
   */
  @HasNoSideEffects
  public native int localeCompare(@Nonnull String compareString, @Nonnull String locales);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.localecompare"># sec-string.prototype.localecompare</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare"># sup-String.prototype.localeCompare</a>
   */
  @HasNoSideEffects
  public native int localeCompare(@Nonnull String compareString, @Nonnull JsArray<String> locales);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.localecompare"># sec-string.prototype.localecompare</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare"># sup-String.prototype.localeCompare</a>
   */
  @JsOverlay
  public final int localeCompare(@Nonnull final String compareString,
      @Nonnull final String... locales) {
    return _localeCompare( compareString, locales );
  }

  @JsMethod(
      name = "localeCompare"
  )
  @HasNoSideEffects
  private native int _localeCompare(@Nonnull String compareString, @Nonnull String[] locales);

  /**
   * The localeCompare() method returns a number indicating whether a reference string comes before, or after, or is the same as the given string in sort order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare">String.localeCompare - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.localecompare"># sec-string.prototype.localecompare</a>
   * @see <a href="https://tc39.es/ecma402/#sup-String.prototype.localeCompare"># sup-String.prototype.localeCompare</a>
   */
  @HasNoSideEffects
  public native int localeCompare(@Nonnull String compareString);

  /**
   * The match() method retrieves the result of matching a string against a regular expression.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/match">String.match - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.match"># sec-string.prototype.match</a>
   */
  @JsNonNull
  public native JsArray<String> match(@Nonnull RegExp regexp);

  /**
   * The match() method retrieves the result of matching a string against a regular expression.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/match">String.match - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.match"># sec-string.prototype.match</a>
   */
  @JsNonNull
  public native JsArray<String> match(@Nonnull String regexp);

  /**
   * The matchAll() method returns an iterator of all results matching a string against a regular expression, including capturing groups.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/matchAll">String.matchAll - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.matchall"># sec-string.prototype.matchall</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<RegExpResult> matchAll(@Nonnull RegExp regexp);

  /**
   * The matchAll() method returns an iterator of all results matching a string against a regular expression, including capturing groups.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/matchAll">String.matchAll - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.matchall"># sec-string.prototype.matchall</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<RegExpResult> matchAll(@Nonnull String regexp);

  /**
   * The normalize() method returns the Unicode Normalization Form of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/normalize">String.normalize - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.normalize"># sec-string.prototype.normalize</a>
   */
  @JsNonNull
  public native String normalize(@Nonnull String form);

  /**
   * The normalize() method returns the Unicode Normalization Form of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/normalize">String.normalize - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.normalize"># sec-string.prototype.normalize</a>
   */
  @JsNonNull
  public native String normalize();

  /**
   * The padEnd() method pads the current string with a given string (repeated, if needed) so that the resulting string reaches a given length. The padding is applied from the end of the current string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padEnd">String.padEnd - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.padend"># sec-string.prototype.padend</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String padEnd(int targetLength, @Nonnull String padString);

  /**
   * The padEnd() method pads the current string with a given string (repeated, if needed) so that the resulting string reaches a given length. The padding is applied from the end of the current string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padEnd">String.padEnd - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.padend"># sec-string.prototype.padend</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String padEnd(int targetLength);

  /**
   * The padStart() method pads the current string with another string (multiple times, if needed) until the resulting string reaches the given length. The padding is applied from the start of the current string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padStart">String.padStart - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.padstart"># sec-string.prototype.padstart</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String padStart(int targetLength, @Nonnull String padString);

  /**
   * The padStart() method pads the current string with another string (multiple times, if needed) until the resulting string reaches the given length. The padding is applied from the start of the current string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padStart">String.padStart - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.padstart"># sec-string.prototype.padstart</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String padStart(int targetLength);

  /**
   * The repeat() method constructs and returns a new string which contains the specified number of copies of the string on which it was called, concatenated together.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/repeat">String.repeat - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.repeat"># sec-string.prototype.repeat</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String repeat(int count);

  /**
   * The replace() method returns a new string with some or all matches of a pattern replaced by a replacement. The pattern can be a string or a RegExp, and the replacement can be a string or a function to be called for each match. If pattern is a string, only the first occurrence will be replaced.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace">String.replace - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.replace"># sec-string.prototype.replace</a>
   */
  @JsNonNull
  public native String replace(@Nonnull RegExp pattern, @Nonnull String replacement);

  /**
   * The replace() method returns a new string with some or all matches of a pattern replaced by a replacement. The pattern can be a string or a RegExp, and the replacement can be a string or a function to be called for each match. If pattern is a string, only the first occurrence will be replaced.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace">String.replace - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.replace"># sec-string.prototype.replace</a>
   */
  @JsNonNull
  public native String replace(@Nonnull String pattern, @Nonnull String replacement);

  /**
   * The search() method executes a search for a match between a regular expression and this String object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/search">String.search - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.search"># sec-string.prototype.search</a>
   */
  public native int search(@Nonnull RegExp pattern);

  /**
   * The search() method executes a search for a match between a regular expression and this String object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/search">String.search - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.search"># sec-string.prototype.search</a>
   */
  public native int search(@Nonnull String pattern);

  /**
   * The slice() method extracts a section of a string and returns it as a new string, without modifying the original string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/slice">String.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.slice"># sec-string.prototype.slice</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String slice(int begin, int end);

  /**
   * The slice() method extracts a section of a string and returns it as a new string, without modifying the original string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/slice">String.slice - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.slice"># sec-string.prototype.slice</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String slice(int begin);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.split"># sec-string.prototype.split</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsArray<String> split(@Nonnull RegExp separator, int limit);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.split"># sec-string.prototype.split</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsArray<String> split(@Nonnull String separator, int limit);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.split"># sec-string.prototype.split</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsArray<String> split(@Nonnull RegExp separator);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.split"># sec-string.prototype.split</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsArray<String> split(@Nonnull String separator);

  /**
   * The split() method divides a String into an ordered list of substrings, puts these substrings into an array, and returns the array. The division is done by searching for a pattern; where the pattern is provided as the first parameter in the method's call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split">String.split - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.split"># sec-string.prototype.split</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsArray<String> split();

  /**
   * The startsWith() method determines whether a string begins with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/startsWith">String.startsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.startswith"># sec-string.prototype.startswith</a>
   */
  @HasNoSideEffects
  public native boolean startsWith(@Nonnull String searchString, int position);

  /**
   * The startsWith() method determines whether a string begins with the characters of a specified string, returning true or false as appropriate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/startsWith">String.startsWith - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.startswith"># sec-string.prototype.startswith</a>
   */
  @HasNoSideEffects
  public native boolean startsWith(@Nonnull String searchString);

  /**
   * The substring() method returns the part of the string between the start and end indexes, or to the end of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/substring">String.substring - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.substring"># sec-string.prototype.substring</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String substring(int start, int end);

  /**
   * The substring() method returns the part of the string between the start and end indexes, or to the end of the string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/substring">String.substring - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.substring"># sec-string.prototype.substring</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String substring(int start);

  /**
   * The toLocaleLowerCase() method returns the calling string value converted to lower case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleLowerCase">String.toLocaleLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.tolocalelowercase"># sec-string.prototype.tolocalelowercase</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocalelowercase"># sup-string.prototype.tolocalelowercase</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toLocaleLowerCase(@Nonnull JsArray<String> locales);

  /**
   * The toLocaleLowerCase() method returns the calling string value converted to lower case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleLowerCase">String.toLocaleLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.tolocalelowercase"># sec-string.prototype.tolocalelowercase</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocalelowercase"># sup-string.prototype.tolocalelowercase</a>
   */
  @JsOverlay
  @JsNonNull
  public final String toLocaleLowerCase(@Nonnull final String... locales) {
    return _toLocaleLowerCase( locales );
  }

  @JsMethod(
      name = "toLocaleLowerCase"
  )
  @HasNoSideEffects
  @JsNonNull
  private native String _toLocaleLowerCase(@Nonnull String[] locales);

  /**
   * The toLocaleLowerCase() method returns the calling string value converted to lower case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleLowerCase">String.toLocaleLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.tolocalelowercase"># sec-string.prototype.tolocalelowercase</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocalelowercase"># sup-string.prototype.tolocalelowercase</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toLocaleLowerCase();

  /**
   * The toLocaleUpperCase() method returns the calling string value converted to upper case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleUpperCase">String.toLocaleUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.tolocaleuppercase"># sec-string.prototype.tolocaleuppercase</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocaleuppercase"># sup-string.prototype.tolocaleuppercase</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toLocaleUpperCase(@Nonnull JsArray<String> locales);

  /**
   * The toLocaleUpperCase() method returns the calling string value converted to upper case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleUpperCase">String.toLocaleUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.tolocaleuppercase"># sec-string.prototype.tolocaleuppercase</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocaleuppercase"># sup-string.prototype.tolocaleuppercase</a>
   */
  @JsOverlay
  @JsNonNull
  public final String toLocaleUpperCase(@Nonnull final String... locales) {
    return _toLocaleUpperCase( locales );
  }

  @JsMethod(
      name = "toLocaleUpperCase"
  )
  @HasNoSideEffects
  @JsNonNull
  private native String _toLocaleUpperCase(@Nonnull String[] locales);

  /**
   * The toLocaleUpperCase() method returns the calling string value converted to upper case, according to any locale-specific case mappings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLocaleUpperCase">String.toLocaleUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.tolocaleuppercase"># sec-string.prototype.tolocaleuppercase</a>
   * @see <a href="https://tc39.es/ecma402/#sup-string.prototype.tolocaleuppercase"># sup-string.prototype.tolocaleuppercase</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toLocaleUpperCase();

  /**
   * The toLowerCase() method returns the calling string value converted to lower case.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toLowerCase">String.toLowerCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.tolowercase"># sec-string.prototype.tolowercase</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toLowerCase();

  /**
   * The toUpperCase() method returns the calling string value converted to uppercase (the value will be converted to a string if it isn't one).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/toUpperCase">String.toUpperCase - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.touppercase"># sec-string.prototype.touppercase</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String toUpperCase();

  /**
   * The trim() method removes whitespace from both ends of a string and returns a new string, without modifying the original string. Whitespace in this context is all the whitespace characters (space, tab, no-break space, etc.) and all the line terminator characters (LF, CR, etc.).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/trim">String.trim - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.trim"># sec-string.prototype.trim</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String trim();

  /**
   * The trimEnd() method removes whitespace from the end of a string. trimRight() is an alias of this method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/trimEnd">String.trimEnd - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.trimend"># sec-string.prototype.trimend</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String trimEnd();

  @HasNoSideEffects
  @JsNonNull
  public native String trimLeft();

  @HasNoSideEffects
  @JsNonNull
  public native String trimRight();

  /**
   * The trimStart() method removes whitespace from the beginning of a string. trimLeft() is an alias of this method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/trimStart">String.trimStart - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.trimstart"># sec-string.prototype.trimstart</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native String trimStart();

  /**
   * The valueOf() method returns the primitive value of a String object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/valueOf">String.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/text-processing.html#sec-string.prototype.valueof"># sec-string.prototype.valueof</a>
   */
  @JsNonNull
  public native String valueOf();
}
