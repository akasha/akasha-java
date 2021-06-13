package akasha;

import akasha.core.BufferSource;
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
    name = "EncodedVideoChunkInit"
)
public interface EncodedVideoChunkInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final BufferSource data, final int timestamp,
      @EncodedVideoChunkType @Nonnull final String type) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).data( data ).timestamp( timestamp ).type( type );
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  BufferSource data();

  @JsProperty
  void setData(@Nonnull BufferSource data);

  @JsProperty(
      name = "duration"
  )
  int duration();

  @JsProperty
  void setDuration(int duration);

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsProperty(
      name = "type"
  )
  @EncodedVideoChunkType
  @Nonnull
  String type();

  @JsProperty
  void setType(@EncodedVideoChunkType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedVideoChunkInit"
  )
  interface Builder extends EncodedVideoChunkInit {
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

    @JsOverlay
    @Nonnull
    default Builder timestamp(final int timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@EncodedVideoChunkType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
