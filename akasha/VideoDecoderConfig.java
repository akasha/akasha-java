package akasha;

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
    name = "VideoDecoderConfig"
)
public interface VideoDecoderConfig {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String codec) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codec( codec );
  }

  @JsProperty(
      name = "codec"
  )
  @JsNonNull
  String codec();

  @JsProperty
  void setCodec(@JsNonNull String codec);

  @JsProperty(
      name = "codedHeight"
  )
  int codedHeight();

  @JsProperty
  void setCodedHeight(int codedHeight);

  @JsProperty(
      name = "codedWidth"
  )
  int codedWidth();

  @JsProperty
  void setCodedWidth(int codedWidth);

  @JsProperty(
      name = "description"
  )
  BufferSource description();

  @JsProperty
  void setDescription(@JsNonNull BufferSource description);

  @JsProperty(
      name = "displayAspectHeight"
  )
  int displayAspectHeight();

  @JsProperty
  void setDisplayAspectHeight(int displayAspectHeight);

  @JsProperty(
      name = "displayAspectWidth"
  )
  int displayAspectWidth();

  @JsProperty
  void setDisplayAspectWidth(int displayAspectWidth);

  @JsProperty(
      name = "hardwareAcceleration"
  )
  @HardwareAcceleration
  String hardwareAcceleration();

  @JsProperty
  void setHardwareAcceleration(@HardwareAcceleration @JsNonNull String hardwareAcceleration);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoDecoderConfig"
  )
  interface Builder extends VideoDecoderConfig {
    @JsOverlay
    @Nonnull
    default Builder codec(@Nonnull final String codec) {
      setCodec( codec );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codedHeight(final int codedHeight) {
      setCodedHeight( codedHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codedWidth(final int codedWidth) {
      setCodedWidth( codedWidth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder description(@Nonnull final BufferSource description) {
      setDescription( description );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displayAspectHeight(final int displayAspectHeight) {
      setDisplayAspectHeight( displayAspectHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displayAspectWidth(final int displayAspectWidth) {
      setDisplayAspectWidth( displayAspectWidth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hardwareAcceleration(
        @HardwareAcceleration @Nonnull final String hardwareAcceleration) {
      setHardwareAcceleration( hardwareAcceleration );
      return this;
    }
  }
}
