package akasha.gpu;

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
    name = "GPUImageDataLayout"
)
@ApiStatus.Experimental
public interface GPUImageDataLayout {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "bytesPerRow"
  )
  int bytesPerRow();

  @JsProperty
  void setBytesPerRow(int bytesPerRow);

  @JsProperty(
      name = "offset"
  )
  int offset();

  @JsProperty
  void setOffset(int offset);

  @JsProperty(
      name = "rowsPerImage"
  )
  int rowsPerImage();

  @JsProperty
  void setRowsPerImage(int rowsPerImage);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUImageDataLayout"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUImageDataLayout {
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
