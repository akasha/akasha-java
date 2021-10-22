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
  static Step1 output(@Nonnull final VideoFrameOutputCallback output) {
    final VideoDecoderInit $videoDecoderInit = Js.<VideoDecoderInit>uncheckedCast( JsPropertyMap.of() );
    $videoDecoderInit.setOutput( output );
    return Js.uncheckedCast( $videoDecoderInit );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoDecoderInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default VideoDecoderInit error(@Nonnull WebCodecsErrorCallback error) {
      Js.<VideoDecoderInit>uncheckedCast( this ).setError( error );
      return Js.uncheckedCast( this );
    }
  }
}
