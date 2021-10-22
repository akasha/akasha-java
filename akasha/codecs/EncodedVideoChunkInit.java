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
    name = "EncodedVideoChunkInit"
)
public interface EncodedVideoChunkInit {
  @JsOverlay
  @Nonnull
  static Step1 type(@EncodedVideoChunkType @Nonnull final String type) {
    final Builder $encodedVideoChunkInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $encodedVideoChunkInit.setType( type );
    return Js.uncheckedCast( $encodedVideoChunkInit );
  }

  @JsProperty(
      name = "type"
  )
  @EncodedVideoChunkType
  @JsNonNull
  String type();

  @JsProperty
  void setType(@EncodedVideoChunkType @JsNonNull String type);

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
      name = "EncodedVideoChunkInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 timestamp(int timestamp) {
      Js.<EncodedVideoChunkInit>uncheckedCast( this ).setTimestamp( timestamp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedVideoChunkInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull BufferSource data) {
      Js.<EncodedVideoChunkInit>uncheckedCast( this ).setData( data );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EncodedVideoChunkInit"
  )
  interface Builder extends EncodedVideoChunkInit {
    @JsOverlay
    @Nonnull
    default Builder duration(final int duration) {
      setDuration( duration );
      return this;
    }
  }
}
