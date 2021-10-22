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
    name = "AuthenticationExtensionsLargeBlobInputs"
)
public interface AuthenticationExtensionsLargeBlobInputs {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "read"
  )
  boolean read();

  @JsProperty
  void setRead(boolean read);

  @JsProperty(
      name = "support"
  )
  String support();

  @JsProperty
  void setSupport(@JsNonNull String support);

  @JsProperty(
      name = "write"
  )
  BufferSource write();

  @JsProperty
  void setWrite(@JsNonNull BufferSource write);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AuthenticationExtensionsLargeBlobInputs"
  )
  interface Builder extends AuthenticationExtensionsLargeBlobInputs {
    @JsOverlay
    @Nonnull
    default Builder read(final boolean read) {
      setRead( read );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder support(@Nonnull final String support) {
      setSupport( support );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder write(@Nonnull final BufferSource write) {
      setWrite( write );
      return this;
    }
  }
}
