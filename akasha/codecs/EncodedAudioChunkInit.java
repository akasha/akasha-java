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
  static Builder create(@EncodedAudioChunkType @Nonnull final String type, final int timestamp,
      @Nonnull final BufferSource data) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).type( type ).timestamp( timestamp ).data( data );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedAudioChunkInit"
  )
  interface Builder extends EncodedAudioChunkInit {
    @JsOverlay
    @Nonnull
    default Builder type(@EncodedAudioChunkType @Nonnull final String type) {
      setType( type );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder timestamp(final int timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final BufferSource data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder duration(final int duration) {
      setDuration( duration );
      return this;
    }
  }
}
