package akasha;

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
  static Builder create(@Nonnull final WebCodecsErrorCallback error,
      @Nonnull final EncodedAudioChunkOutputCallback output) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).error( error ).output( output );
  }

  @JsProperty(
      name = "error"
  )
  @JsNonNull
  WebCodecsErrorCallback error();

  @JsProperty
  void setError(@JsNonNull WebCodecsErrorCallback error);

  @JsProperty(
      name = "output"
  )
  @JsNonNull
  EncodedAudioChunkOutputCallback output();

  @JsProperty
  void setOutput(@JsNonNull EncodedAudioChunkOutputCallback output);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioEncoderInit"
  )
  interface Builder extends AudioEncoderInit {
    @JsOverlay
    @Nonnull
    default Builder error(@Nonnull final WebCodecsErrorCallback error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder output(@Nonnull final EncodedAudioChunkOutputCallback output) {
      setOutput( output );
      return this;
    }
  }
}
