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
  static Builder create(@Nonnull final AudioDataOutputCallback output,
      @Nonnull final WebCodecsErrorCallback error) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).output( output ).error( error );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDecoderInit"
  )
  interface Builder extends AudioDecoderInit {
    @JsOverlay
    @Nonnull
    default Builder output(@Nonnull final AudioDataOutputCallback output) {
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
