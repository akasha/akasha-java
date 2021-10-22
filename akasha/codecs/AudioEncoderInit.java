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
    name = "AudioEncoderInit"
)
public interface AudioEncoderInit {
  @JsOverlay
  @Nonnull
  static Step1 output(@Nonnull final EncodedAudioChunkOutputCallback output) {
    final AudioEncoderInit $audioEncoderInit = Js.<AudioEncoderInit>uncheckedCast( JsPropertyMap.of() );
    $audioEncoderInit.setOutput( output );
    return Js.uncheckedCast( $audioEncoderInit );
  }

  @JsProperty(
      name = "output"
  )
  @JsNonNull
  EncodedAudioChunkOutputCallback output();

  @JsProperty
  void setOutput(@JsNonNull EncodedAudioChunkOutputCallback output);

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
      name = "AudioEncoderInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default AudioEncoderInit error(@Nonnull WebCodecsErrorCallback error) {
      Js.<AudioEncoderInit>uncheckedCast( this ).setError( error );
      return Js.uncheckedCast( this );
    }
  }
}
