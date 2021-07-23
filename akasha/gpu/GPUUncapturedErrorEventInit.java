package akasha.gpu;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUUncapturedErrorEventInit"
)
@ApiStatus.Experimental
public interface GPUUncapturedErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUError error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  GPUError error();

  @JsProperty
  void setError(@Nonnull GPUError error);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUUncapturedErrorEventInit"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUUncapturedErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final GPUError error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}