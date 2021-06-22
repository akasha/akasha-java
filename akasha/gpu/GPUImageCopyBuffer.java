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
    name = "GPUImageCopyBuffer"
)
public interface GPUImageCopyBuffer extends GPUImageDataLayout {
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUImageCopyBuffer"
  )
  interface Builder extends GPUImageCopyBuffer {
    @JsOverlay
    @Nonnull
    default Builder buffer(@Nonnull final GPUBuffer buffer) {
      setBuffer( buffer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bytesPerRow(final int bytesPerRow) {
      setBytesPerRow( bytesPerRow );
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
    default Builder rowsPerImage(final int rowsPerImage) {
      setRowsPerImage( rowsPerImage );
      return this;
    }
  }
}