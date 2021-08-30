package akasha;

import akasha.core.ArrayBuffer;
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
    name = "AuthenticationExtensionsLargeBlobOutputs"
)
public interface AuthenticationExtensionsLargeBlobOutputs {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "blob"
  )
  ArrayBuffer blob();

  @JsProperty
  void setBlob(@JsNonNull ArrayBuffer blob);

  @JsProperty(
      name = "supported"
  )
  boolean supported();

  @JsProperty
  void setSupported(boolean supported);

  @JsProperty(
      name = "written"
  )
  boolean written();

  @JsProperty
  void setWritten(boolean written);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AuthenticationExtensionsLargeBlobOutputs"
  )
  interface Builder extends AuthenticationExtensionsLargeBlobOutputs {
    @JsOverlay
    @Nonnull
    default Builder blob(@Nonnull final ArrayBuffer blob) {
      setBlob( blob );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder supported(final boolean supported) {
      setSupported( supported );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder written(final boolean written) {
      setWritten( written );
      return this;
    }
  }
}
