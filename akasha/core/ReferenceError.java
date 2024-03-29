package akasha.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ReferenceError object represents an error when a variable that doesn't exist (or hasn't yet been initialized) in the current scope is referenced.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ReferenceError">ReferenceError - MDN</a>
 * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-native-error-types-used-in-this-standard-referenceerror"># sec-native-error-types-used-in-this-standard-referenceerror</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReferenceError"
)
public class ReferenceError extends JsError {
  /**
   * The ReferenceError object represents an error when a non-existent variable is referenced.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ReferenceError/ReferenceError">ReferenceError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-referenceerror">ReferenceError() - ECMA</a>
   */
  public ReferenceError(@Nonnull final String message) {
  }

  /**
   * The ReferenceError object represents an error when a non-existent variable is referenced.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ReferenceError/ReferenceError">ReferenceError() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-native-error-types-used-in-this-standard-referenceerror">ReferenceError() - ECMA</a>
   */
  public ReferenceError() {
  }
}
