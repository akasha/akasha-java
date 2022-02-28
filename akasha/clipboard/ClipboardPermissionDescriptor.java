package akasha.clipboard;

import akasha.PermissionDescriptor;
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
  static Builder name(@Nonnull final String name) {
    final Builder $clipboardPermissionDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $clipboardPermissionDescriptor.setName( name );
    return Js.uncheckedCast( $clipboardPermissionDescriptor );
  }

  @JsProperty(
      name = "allowWithoutGesture"
  )
  boolean allowWithoutGesture();

  @JsProperty
  void setAllowWithoutGesture(boolean allowWithoutGesture);

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
  }
}
