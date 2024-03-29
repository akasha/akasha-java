package akasha;

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
    name = "TokenBinding"
)
public interface TokenBinding {
  @JsOverlay
  @Nonnull
  static Builder status(@Nonnull final String status) {
    final Builder $tokenBinding = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $tokenBinding.setStatus( status );
    return Js.uncheckedCast( $tokenBinding );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@JsNonNull String id);

  @JsProperty(
      name = "status"
  )
  @JsNonNull
  String status();

  @JsProperty
  void setStatus(@JsNonNull String status);

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
  }
}
