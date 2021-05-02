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
public interface UnderlyingSource {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "start"
  )
  UnderlyingSourceStartCallback start();

  @JsProperty
  void setStart(@Nonnull UnderlyingSourceStartCallback start);

  @JsProperty(
      name = "pull"
  )
  UnderlyingSourcePullCallback pull();

  @JsProperty
  void setPull(@Nonnull UnderlyingSourcePullCallback pull);

  @JsProperty(
      name = "cancel"
  )
  UnderlyingSourceCancelCallback cancel();

  @JsProperty
  void setCancel(@Nonnull UnderlyingSourceCancelCallback cancel);

  @JsProperty(
      name = "type"
  )
  @ReadableStreamType
  String type();

  @JsProperty
  void setType(@ReadableStreamType @Nonnull String type);

  @JsProperty(
      name = "autoAllocateChunkSize"
  )
  int autoAllocateChunkSize();

  @JsProperty
  void setAutoAllocateChunkSize(int autoAllocateChunkSize);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends UnderlyingSource {
    @JsOverlay
    @Nonnull
    default Builder start(@Nonnull final UnderlyingSourceStartCallback start) {
      setStart( start );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder pull(@Nonnull final UnderlyingSourcePullCallback pull) {
      setPull( pull );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancel(@Nonnull final UnderlyingSourceCancelCallback cancel) {
      setCancel( cancel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@ReadableStreamType @Nonnull final String type) {
      setType( type );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder autoAllocateChunkSize(final int autoAllocateChunkSize) {
      setAutoAllocateChunkSize( autoAllocateChunkSize );
      return this;
    }
  }
}