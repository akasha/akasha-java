package akasha.gpu;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
  static Builder error(@Nonnull final GPUError error) {
    final Builder $gpuUncapturedErrorEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuUncapturedErrorEventInit.setError( error );
    return Js.uncheckedCast( $gpuUncapturedErrorEventInit );
  }

  @JsProperty(
      name = "error"
  )
  @JsNonNull
  GPUError error();

  @JsProperty
  void setError(@JsNonNull GPUError error);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUUncapturedErrorEventInit"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUUncapturedErrorEventInit {
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
