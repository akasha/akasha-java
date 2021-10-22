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
    name = "VideoEncoderInit"
)
public interface VideoEncoderInit {
  @JsOverlay
  @Nonnull
  static Step1 output(@Nonnull final EncodedVideoChunkOutputCallback output) {
    final VideoEncoderInit $videoEncoderInit = Js.<VideoEncoderInit>uncheckedCast( JsPropertyMap.of() );
    $videoEncoderInit.setOutput( output );
    return Js.uncheckedCast( $videoEncoderInit );
  }

  @JsProperty(
      name = "output"
  )
  @JsNonNull
  EncodedVideoChunkOutputCallback output();

  @JsProperty
  void setOutput(@JsNonNull EncodedVideoChunkOutputCallback output);

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
      name = "VideoEncoderInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default VideoEncoderInit error(@Nonnull WebCodecsErrorCallback error) {
      Js.<VideoEncoderInit>uncheckedCast( this ).setError( error );
      return Js.uncheckedCast( this );
    }
  }
}
