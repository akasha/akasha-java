package akasha;

import akasha.lang.JsArray;
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
    name = "WindowPostMessageOptions"
)
public interface WindowPostMessageOptions extends PostMessageOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "targetOrigin"
  )
  String targetOrigin();

  @JsProperty
  void setTargetOrigin(@JsNonNull String targetOrigin);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "WindowPostMessageOptions"
  )
  interface Builder extends WindowPostMessageOptions {
    @JsOverlay
    @Nonnull
    default Builder targetOrigin(@Nonnull final String targetOrigin) {
      setTargetOrigin( targetOrigin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transfer(@Nonnull final JsArray<Transferable> transfer) {
      setTransfer( transfer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transfer(@Nonnull final Transferable... transfer) {
      setTransfer( transfer );
      return this;
    }
  }
}
