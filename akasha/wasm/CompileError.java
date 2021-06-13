package akasha.wasm;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WebAssembly.CompileError object indicates an error during WebAssembly decoding or validation.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/CompileError">WebAssembly.CompileError - MDN</a>
 * @see <a href="https://webassembly.github.io/spec/js-api/#exceptiondef-compileerror"># exceptiondef-compileerror</a>
 * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-native-error-types-used-in-this-standard">(ECMAScript) # sec-native-error-types-used-in-this-standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.CompileError"
)
public class CompileError extends JsObject {
  protected CompileError() {
  }
}
