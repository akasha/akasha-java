package akasha.midi;

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
    name = "MIDIOptions"
)
public interface MIDIOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "software"
  )
  boolean software();

  @JsProperty
  void setSoftware(boolean software);

  @JsProperty(
      name = "sysex"
  )
  boolean sysex();

  @JsProperty
  void setSysex(boolean sysex);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MIDIOptions"
  )
  interface Builder extends MIDIOptions {
    @JsOverlay
    @Nonnull
    default Builder software(final boolean software) {
      setSoftware( software );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sysex(final boolean sysex) {
      setSysex( sysex );
      return this;
    }
  }
}
