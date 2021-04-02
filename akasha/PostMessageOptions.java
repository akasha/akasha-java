package akasha;

import akasha.lang.JsArray;
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
public interface PostMessageOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "transfer"
  )
  JsArray<Transferable> transfer();

  @JsProperty
  void setTransfer(@Nonnull JsArray<Transferable> transfer);

  @JsOverlay
  default void setTransfer(@Nonnull final Transferable... transfer) {
    setTransfer( Js.<JsArray<Transferable>>uncheckedCast( transfer ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends PostMessageOptions {
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
