package akasha.rtc;

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
    name = "RTCRtpHeaderExtensionParameters"
)
public interface RTCRtpHeaderExtensionParameters {
  @JsOverlay
  @Nonnull
  static Builder create(final int id, @Nonnull final String uri) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).uri( uri );
  }

  @JsProperty(
      name = "encrypted"
  )
  boolean encrypted();

  @JsProperty
  void setEncrypted(boolean encrypted);

  @JsProperty(
      name = "id"
  )
  int id();

  @JsProperty
  void setId(int id);

  @JsProperty(
      name = "uri"
  )
  @JsNonNull
  String uri();

  @JsProperty
  void setUri(@JsNonNull String uri);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCRtpHeaderExtensionParameters"
  )
  interface Builder extends RTCRtpHeaderExtensionParameters {
    @JsOverlay
    @Nonnull
    default Builder encrypted(final boolean encrypted) {
      setEncrypted( encrypted );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder id(final int id) {
      setId( id );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uri(@Nonnull final String uri) {
      setUri( uri );
      return this;
    }
  }
}
