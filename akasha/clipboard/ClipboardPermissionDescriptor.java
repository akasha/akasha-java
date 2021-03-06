package akasha.clipboard;

import akasha.PermissionDescriptor;
import akasha.PermissionName;
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
    name = "ClipboardPermissionDescriptor"
)
public interface ClipboardPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder name(@PermissionName @Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "allowWithoutGesture"
  )
  boolean allowWithoutGesture();

  @JsProperty
  void setAllowWithoutGesture(boolean allowWithoutGesture);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ClipboardPermissionDescriptor"
  )
  interface Builder extends ClipboardPermissionDescriptor {
    @JsOverlay
    @Nonnull
    default Builder allowWithoutGesture(final boolean allowWithoutGesture) {
      setAllowWithoutGesture( allowWithoutGesture );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@PermissionName @Nonnull final String name) {
      setName( name );
      return this;
    }
  }
}
