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
    name = "FocusOptions"
)
public interface FocusOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "preventScroll"
  )
  boolean preventScroll();

  @JsProperty
  void setPreventScroll(boolean preventScroll);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FocusOptions"
  )
  interface Builder extends FocusOptions {
    @JsOverlay
    @Nonnull
    default Builder preventScroll(final boolean preventScroll) {
      setPreventScroll( preventScroll );
      return this;
    }
  }
}
