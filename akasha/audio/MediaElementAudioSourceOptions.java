package akasha.audio;

import akasha.HTMLMediaElement;
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
    name = "Object"
)
public interface MediaElementAudioSourceOptions {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final HTMLMediaElement mediaElement) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).mediaElement( mediaElement );
  }

  @JsProperty(
      name = "mediaElement"
  )
  @Nonnull
  HTMLMediaElement mediaElement();

  @JsProperty
  void setMediaElement(@Nonnull HTMLMediaElement mediaElement);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends MediaElementAudioSourceOptions {
    @JsOverlay
    @Nonnull
    default Builder mediaElement(@Nonnull final HTMLMediaElement mediaElement) {
      setMediaElement( mediaElement );
      return this;
    }
  }
}
