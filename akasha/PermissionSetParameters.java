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
    name = "PermissionSetParameters"
)
public interface PermissionSetParameters {
  @JsOverlay
  @Nonnull
  static Step1 descriptor(@Nonnull final PermissionDescriptor descriptor) {
    final Builder $permissionSetParameters = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $permissionSetParameters.setDescriptor( descriptor );
    return Js.uncheckedCast( $permissionSetParameters );
  }

  @JsProperty(
      name = "descriptor"
  )
  @JsNonNull
  PermissionDescriptor descriptor();

  @JsProperty
  void setDescriptor(@JsNonNull PermissionDescriptor descriptor);

  @JsProperty(
      name = "state"
  )
  @PermissionState
  @JsNonNull
  String state();

  @JsProperty
  void setState(@PermissionState @JsNonNull String state);

  @JsProperty(
      name = "oneRealm"
  )
  boolean oneRealm();

  @JsProperty
  void setOneRealm(boolean oneRealm);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PermissionSetParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder state(@PermissionState @Nonnull String state) {
      Js.<PermissionSetParameters>uncheckedCast( this ).setState( state );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PermissionSetParameters"
  )
  interface Builder extends PermissionSetParameters {
    @JsOverlay
    @Nonnull
    default Builder oneRealm(final boolean oneRealm) {
      setOneRealm( oneRealm );
      return this;
    }
  }
}
