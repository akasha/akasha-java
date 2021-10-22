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
    name = "MidiPermissionDescriptor"
)
public interface MidiPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder name(@PermissionName @Nonnull final String name) {
    final Builder $midiPermissionDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $midiPermissionDescriptor.setName( name );
    return Js.uncheckedCast( $midiPermissionDescriptor );
  }

  @JsProperty(
      name = "sysex"
  )
  boolean sysex();

  @JsProperty
  void setSysex(boolean sysex);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MidiPermissionDescriptor"
  )
  interface Builder extends MidiPermissionDescriptor {
    @JsOverlay
    @Nonnull
    default Builder sysex(final boolean sysex) {
      setSysex( sysex );
      return this;
    }
  }
}
