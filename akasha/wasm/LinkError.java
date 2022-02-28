package akasha.wasm;

import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WebAssembly.LinkError object indicates an error during module instantiation (besides traps from the start function).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/LinkError">WebAssembly.LinkError - MDN</a>
 * @see <a href="https://webassembly.github.io/spec/js-api/#exceptiondef-linkerror"># exceptiondef-linkerror</a>
 * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-native-error-types-used-in-this-standard"># sec-native-error-types-used-in-this-standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.LinkError"
)
public class LinkError extends JsObject {
  protected LinkError() {
  }
}
