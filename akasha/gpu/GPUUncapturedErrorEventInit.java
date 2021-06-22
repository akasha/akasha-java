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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUUncapturedErrorEventInit"
)
public interface GPUUncapturedErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUError error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUOutOfMemoryError error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUValidationError error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  GPUError error();

  @JsProperty
  void setError(@Nonnull GPUError error);

  @JsOverlay
  default void setError(@Nonnull final GPUOutOfMemoryError error) {
    setError( GPUError.of( error ) );
  }

  @JsOverlay
  default void setError(@Nonnull final GPUValidationError error) {
    setError( GPUError.of( error ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUUncapturedErrorEventInit"
  )
  interface Builder extends GPUUncapturedErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final GPUError error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final GPUOutOfMemoryError error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final GPUValidationError error) {
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
