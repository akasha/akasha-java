package akasha.media;

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
    name = "MediaRecorderOptions"
)
public interface MediaRecorderOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "audioBitrateMode"
  )
  @BitrateMode
  String audioBitrateMode();

  @JsProperty
  void setAudioBitrateMode(@BitrateMode @Nonnull String audioBitrateMode);

  @JsProperty(
      name = "audioBitsPerSecond"
  )
  int audioBitsPerSecond();

  @JsProperty
  void setAudioBitsPerSecond(int audioBitsPerSecond);

  @JsProperty(
      name = "bitsPerSecond"
  )
  int bitsPerSecond();

  @JsProperty
  void setBitsPerSecond(int bitsPerSecond);

  @JsProperty(
      name = "mimeType"
  )
  String mimeType();

  @JsProperty
  void setMimeType(@Nonnull String mimeType);

  @JsProperty(
      name = "videoBitsPerSecond"
  )
  int videoBitsPerSecond();

  @JsProperty
  void setVideoBitsPerSecond(int videoBitsPerSecond);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaRecorderOptions"
  )
  interface Builder extends MediaRecorderOptions {
    @JsOverlay
    @Nonnull
    default Builder audioBitrateMode(@BitrateMode @Nonnull final String audioBitrateMode) {
      setAudioBitrateMode( audioBitrateMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder audioBitsPerSecond(final int audioBitsPerSecond) {
      setAudioBitsPerSecond( audioBitsPerSecond );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bitsPerSecond(final int bitsPerSecond) {
      setBitsPerSecond( bitsPerSecond );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mimeType(@Nonnull final String mimeType) {
      setMimeType( mimeType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder videoBitsPerSecond(final int videoBitsPerSecond) {
      setVideoBitsPerSecond( videoBitsPerSecond );
      return this;
    }
  }
}
