package akasha.wasm;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WebAssembly.RuntimeError object is the error type that is thrown whenever WebAssembly specifies a trap.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/RuntimeError">WebAssembly.RuntimeError - MDN</a>
 * @see <a href="https://webassembly.github.io/spec/js-api/#exceptiondef-runtimeerror"># exceptiondef-runtimeerror</a>
 * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-native-error-types-used-in-this-standard">(ECMAScript) # sec-native-error-types-used-in-this-standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.RuntimeError"
)
public class RuntimeError extends JsObject {
  protected RuntimeError() {
  }
}
