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
    name = "AudioDecoderInit"
)
public interface AudioDecoderInit {
  @JsOverlay
  @Nonnull
  static Step1 output(@Nonnull final AudioDataOutputCallback output) {
    final AudioDecoderInit $audioDecoderInit = Js.<AudioDecoderInit>uncheckedCast( JsPropertyMap.of() );
    $audioDecoderInit.setOutput( output );
    return Js.uncheckedCast( $audioDecoderInit );
  }

  @JsProperty(
      name = "output"
  )
  @JsNonNull
  AudioDataOutputCallback output();

  @JsProperty
  void setOutput(@JsNonNull AudioDataOutputCallback output);

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
      name = "AudioDecoderInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default AudioDecoderInit error(@Nonnull WebCodecsErrorCallback error) {
      Js.<AudioDecoderInit>uncheckedCast( this ).setError( error );
      return Js.uncheckedCast( this );
    }
  }
}
