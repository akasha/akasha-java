package akasha.codecs;

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
    name = "ImageDecodeOptions"
)
public interface ImageDecodeOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "completeFramesOnly"
  )
  boolean completeFramesOnly();

  @JsProperty
  void setCompleteFramesOnly(boolean completeFramesOnly);

  @JsProperty(
      name = "frameIndex"
  )
  int frameIndex();

  @JsProperty
  void setFrameIndex(int frameIndex);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ImageDecodeOptions"
  )
  interface Builder extends ImageDecodeOptions {
    @JsOverlay
    @Nonnull
    default Builder completeFramesOnly(final boolean completeFramesOnly) {
      setCompleteFramesOnly( completeFramesOnly );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameIndex(final int frameIndex) {
      setFrameIndex( frameIndex );
      return this;
    }
  }
}
