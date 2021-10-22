package akasha.codecs;

import akasha.core.BufferSource;
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
    name = "EncodedAudioChunkInit"
)
public interface EncodedAudioChunkInit {
  @JsOverlay
  @Nonnull
  static Step1 type(@EncodedAudioChunkType @Nonnull final String type) {
    final Builder $encodedAudioChunkInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $encodedAudioChunkInit.setType( type );
    return Js.uncheckedCast( $encodedAudioChunkInit );
  }

  @JsProperty(
      name = "type"
  )
  @EncodedAudioChunkType
  @JsNonNull
  String type();

  @JsProperty
  void setType(@EncodedAudioChunkType @JsNonNull String type);

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsProperty(
      name = "data"
  )
  @JsNonNull
  BufferSource data();

  @JsProperty
  void setData(@JsNonNull BufferSource data);

  @JsProperty(
      name = "duration"
  )
  int duration();

  @JsProperty
  void setDuration(int duration);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedAudioChunkInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 timestamp(int timestamp) {
      Js.<EncodedAudioChunkInit>uncheckedCast( this ).setTimestamp( timestamp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedAudioChunkInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull BufferSource data) {
      Js.<EncodedAudioChunkInit>uncheckedCast( this ).setData( data );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedAudioChunkInit"
  )
  interface Builder extends EncodedAudioChunkInit {
    @JsOverlay
    @Nonnull
    default Builder duration(final int duration) {
      setDuration( duration );
      return this;
    }
  }
}
