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
    name = "Object"
)
public interface ShadowRootInit {
  @JsOverlay
  @Nonnull
  static Builder create(@ShadowRootMode @Nonnull final String mode) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).mode( mode );
  }

  @JsProperty(
      name = "delegatesFocus"
  )
  boolean delegatesFocus();

  @JsProperty
  void setDelegatesFocus(boolean delegatesFocus);

  @JsProperty(
      name = "mode"
  )
  @ShadowRootMode
  @Nonnull
  String mode();

  @JsProperty
  void setMode(@ShadowRootMode @Nonnull String mode);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends ShadowRootInit {
    @JsOverlay
    @Nonnull
    default Builder delegatesFocus(final boolean delegatesFocus) {
      setDelegatesFocus( delegatesFocus );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mode(@ShadowRootMode @Nonnull final String mode) {
      setMode( mode );
      return this;
    }
  }
}
