package akasha.audio;

import akasha.HTMLMediaElement;
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
    name = "MediaElementAudioSourceOptions"
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
  @JsNonNull
  HTMLMediaElement mediaElement();

  @JsProperty
  void setMediaElement(@JsNonNull HTMLMediaElement mediaElement);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaElementAudioSourceOptions"
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
