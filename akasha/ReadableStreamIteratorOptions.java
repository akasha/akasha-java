package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReadableStreamIteratorOptions"
)
public interface ReadableStreamIteratorOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "preventCancel"
  )
  boolean preventCancel();

  @JsProperty
  void setPreventCancel(boolean preventCancel);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ReadableStreamIteratorOptions"
  )
  interface Builder extends ReadableStreamIteratorOptions {
    @JsOverlay
    @Nonnull
    default Builder preventCancel(final boolean preventCancel) {
      setPreventCancel( preventCancel );
      return this;
    }
  }
}
