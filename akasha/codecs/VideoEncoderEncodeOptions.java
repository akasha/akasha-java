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
    name = "VideoEncoderEncodeOptions"
)
public interface VideoEncoderEncodeOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "keyFrame"
  )
  boolean keyFrame();

  @JsProperty
  void setKeyFrame(boolean keyFrame);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoEncoderEncodeOptions"
  )
  interface Builder extends VideoEncoderEncodeOptions {
    @JsOverlay
    @Nonnull
    default Builder keyFrame(final boolean keyFrame) {
      setKeyFrame( keyFrame );
      return this;
    }
  }
}
