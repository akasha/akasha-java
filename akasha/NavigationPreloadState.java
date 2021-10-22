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
    name = "NavigationPreloadState"
)
public interface NavigationPreloadState {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "enabled"
  )
  boolean enabled();

  @JsProperty
  void setEnabled(boolean enabled);

  @JsProperty(
      name = "headerValue"
  )
  String headerValue();

  @JsProperty
  void setHeaderValue(@JsNonNull String headerValue);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "NavigationPreloadState"
  )
  interface Builder extends NavigationPreloadState {
    @JsOverlay
    @Nonnull
    default Builder enabled(final boolean enabled) {
      setEnabled( enabled );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headerValue(@Nonnull final String headerValue) {
      setHeaderValue( headerValue );
      return this;
    }
  }
}
