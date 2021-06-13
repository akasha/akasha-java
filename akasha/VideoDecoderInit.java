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
    name = "VideoDecoderInit"
)
public interface VideoDecoderInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final WebCodecsErrorCallback error,
      @Nonnull final VideoFrameOutputCallback output) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error ).output( output );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  WebCodecsErrorCallback error();

  @JsProperty
  void setError(@Nonnull WebCodecsErrorCallback error);

  @JsProperty(
      name = "output"
  )
  @Nonnull
  VideoFrameOutputCallback output();

  @JsProperty
  void setOutput(@Nonnull VideoFrameOutputCallback output);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoDecoderInit"
  )
  interface Builder extends VideoDecoderInit {
    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final WebCodecsErrorCallback error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder output(@Nonnull final VideoFrameOutputCallback output) {
      setOutput( output );
      return this;
    }
  }
}
