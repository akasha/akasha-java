package akasha.rtc;

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
public interface RTCIdentityValidationResult {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String contents, @Nonnull final String identity) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).contents( contents ).identity( identity );
  }

  @JsProperty(
      name = "contents"
  )
  @Nonnull
  String contents();

  @JsProperty
  void setContents(@Nonnull String contents);

  @JsProperty(
      name = "identity"
  )
  @Nonnull
  String identity();

  @JsProperty
  void setIdentity(@Nonnull String identity);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RTCIdentityValidationResult {
    @JsOverlay
    @Nonnull
    default Builder contents(@Nonnull final String contents) {
      setContents( contents );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder identity(@Nonnull final String identity) {
      setIdentity( identity );
      return this;
    }
  }
}
