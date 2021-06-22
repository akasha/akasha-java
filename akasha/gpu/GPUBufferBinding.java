package akasha.gpu;

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
    name = "GPUBufferBinding"
)
public interface GPUBufferBinding {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUBuffer buffer) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).buffer( buffer );
  }

  @JsProperty(
      name = "buffer"
  )
  @Nonnull
  GPUBuffer buffer();

  @JsProperty
  void setBuffer(@Nonnull GPUBuffer buffer);

  @JsProperty(
      name = "offset"
  )
  int offset();

  @JsProperty
  void setOffset(int offset);

  @JsProperty(
      name = "size"
  )
  int size();

  @JsProperty
  void setSize(int size);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBufferBinding"
  )
  interface Builder extends GPUBufferBinding {
    @JsOverlay
    @Nonnull
    default Builder buffer(@Nonnull final GPUBuffer buffer) {
      setBuffer( buffer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offset(final int offset) {
      setOffset( offset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder size(final int size) {
      setSize( size );
      return this;
    }
  }
}
