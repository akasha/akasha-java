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
  static Builder create(@Nonnull final PermissionDescriptor descriptor,
      @PermissionState @Nonnull final String state) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).descriptor( descriptor ).state( state );
  }

  @JsProperty(
      name = "descriptor"
  )
  @JsNonNull
  PermissionDescriptor descriptor();

  @JsProperty
  void setDescriptor(@JsNonNull PermissionDescriptor descriptor);

  @JsProperty(
      name = "oneRealm"
  )
  boolean oneRealm();

  @JsProperty
  void setOneRealm(boolean oneRealm);

  @JsProperty(
      name = "state"
  )
  @PermissionState
  @JsNonNull
  String state();

  @JsProperty
  void setState(@PermissionState @JsNonNull String state);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PermissionSetParameters"
  )
  interface Builder extends PermissionSetParameters {
    @JsOverlay
    @Nonnull
    default Builder descriptor(@Nonnull final PermissionDescriptor descriptor) {
      setDescriptor( descriptor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder oneRealm(final boolean oneRealm) {
      setOneRealm( oneRealm );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder state(@PermissionState @Nonnull final String state) {
      setState( state );
      return this;
    }
  }
}
