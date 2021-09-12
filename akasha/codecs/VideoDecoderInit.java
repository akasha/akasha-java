package akasha.codecs;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
  static Builder create(@Nonnull final VideoFrameOutputCallback output,
      @Nonnull final WebCodecsErrorCallback error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).output( output ).error( error );
  }

  @JsProperty(
      name = "output"
  )
  @JsNonNull
  VideoFrameOutputCallback output();

  @JsProperty
  void setOutput(@JsNonNull VideoFrameOutputCallback output);

  @JsProperty(
      name = "error"
  )
  @JsNonNull
  WebCodecsErrorCallback error();

  @JsProperty
  void setError(@JsNonNull WebCodecsErrorCallback error);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoDecoderInit"
  )
  interface Builder extends VideoDecoderInit {
    @JsOverlay
    @Nonnull
    default Builder output(@Nonnull final VideoFrameOutputCallback output) {
      setOutput( output );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final WebCodecsErrorCallback error) {
      setError( error );
      return this;
    }
  }
}
