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
    name = "ClientQueryOptions"
)
public interface ClientQueryOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "includeUncontrolled"
  )
  boolean includeUncontrolled();

  @JsProperty
  void setIncludeUncontrolled(boolean includeUncontrolled);

  @JsProperty(
      name = "type"
  )
  @ClientType
  String type();

  @JsProperty
  void setType(@ClientType @JsNonNull String type);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ClientQueryOptions"
  )
  interface Builder extends ClientQueryOptions {
    @JsOverlay
    @Nonnull
    default Builder includeUncontrolled(final boolean includeUncontrolled) {
      setIncludeUncontrolled( includeUncontrolled );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@ClientType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
