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
  static MediaElementAudioSourceOptions mediaElement(@Nonnull final HTMLMediaElement mediaElement) {
    final MediaElementAudioSourceOptions $mediaElementAudioSourceOptions = Js.<MediaElementAudioSourceOptions>uncheckedCast( JsPropertyMap.of() );
    $mediaElementAudioSourceOptions.setMediaElement( mediaElement );
    return Js.uncheckedCast( $mediaElementAudioSourceOptions );
  }

  @JsProperty(
      name = "mediaElement"
  )
  @JsNonNull
  HTMLMediaElement mediaElement();

  @JsProperty
  void setMediaElement(@JsNonNull HTMLMediaElement mediaElement);
}
