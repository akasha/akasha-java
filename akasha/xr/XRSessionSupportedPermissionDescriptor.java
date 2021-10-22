package akasha.xr;

import akasha.PermissionDescriptor;
import akasha.PermissionName;
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
    name = "XRSessionSupportedPermissionDescriptor"
)
public interface XRSessionSupportedPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder name(@PermissionName @Nonnull final String name) {
    final Builder $xrSessionSupportedPermissionDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrSessionSupportedPermissionDescriptor.setName( name );
    return Js.uncheckedCast( $xrSessionSupportedPermissionDescriptor );
  }

  @JsProperty(
      name = "mode"
  )
  @XRSessionMode
  String mode();

  @JsProperty
  void setMode(@XRSessionMode @JsNonNull String mode);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRSessionSupportedPermissionDescriptor"
  )
  interface Builder extends XRSessionSupportedPermissionDescriptor {
    @JsOverlay
    @Nonnull
    default Builder mode(@XRSessionMode @Nonnull final String mode) {
      setMode( mode );
      return this;
    }
  }
}
