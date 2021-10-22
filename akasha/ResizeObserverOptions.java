package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "ResizeObserverOptions"
)
public interface ResizeObserverOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "box"
  )
  @ResizeObserverBoxOptions
  String box();

  @JsProperty
  void setBox(@ResizeObserverBoxOptions @JsNonNull String box);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ResizeObserverOptions"
  )
  interface Builder extends ResizeObserverOptions {
    @JsOverlay
    @Nonnull
    default Builder box(@ResizeObserverBoxOptions @Nonnull final String box) {
      setBox( box );
      return this;
    }
  }
}
