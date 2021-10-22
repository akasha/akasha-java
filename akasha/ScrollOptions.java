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
    name = "ScrollOptions"
)
public interface ScrollOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "behavior"
  )
  @ScrollBehavior
  String behavior();

  @JsProperty
  void setBehavior(@ScrollBehavior @JsNonNull String behavior);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ScrollOptions"
  )
  interface Builder extends ScrollOptions {
    @JsOverlay
    @Nonnull
    default Builder behavior(@ScrollBehavior @Nonnull final String behavior) {
      setBehavior( behavior );
      return this;
    }
  }
}
