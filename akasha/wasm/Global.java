package akasha.wasm;

import akasha.core.JsObject;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * A WebAssembly.Global object represents a global variable instance, accessible from both JavaScript and importable/exportable across one or more WebAssembly.Module instances. This allows dynamic linking of multiple modules.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Global">WebAssembly.Global - MDN</a>
 * @see <a href="https://webassembly.github.io/spec/js-api/#globals"># globals</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Global"
)
public class Global extends JsObject {
  @JsNullable
  public Any value;

  public Global(@Nonnull final GlobalDescriptor descriptor,
      @DoNotAutobox @Nullable final Object v) {
  }

  public Global(@Nonnull final GlobalDescriptor descriptor) {
  }

  @JsNullable
  public native Any valueOf();
}
