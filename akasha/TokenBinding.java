package akasha;

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
    name = "TokenBinding"
)
public interface TokenBinding {
  @JsOverlay
  @Nonnull
  static Builder create(@TokenBindingStatus @Nonnull final String status) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).status( status );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @JsProperty(
      name = "status"
  )
  @TokenBindingStatus
  @Nonnull
  String status();

  @JsProperty
  void setStatus(@TokenBindingStatus @Nonnull String status);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "TokenBinding"
  )
  interface Builder extends TokenBinding {
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
      setId( id );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder status(@TokenBindingStatus @Nonnull final String status) {
      setStatus( status );
      return this;
    }
  }
}
