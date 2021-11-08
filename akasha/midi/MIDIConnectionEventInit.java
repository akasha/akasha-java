package akasha.midi;

import akasha.EventInit;
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
    name = "MIDIConnectionEventInit"
)
public interface MIDIConnectionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "port"
  )
  MIDIPort port();

  @JsProperty
  void setPort(@JsNonNull MIDIPort port);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MIDIConnectionEventInit"
  )
  interface Builder extends MIDIConnectionEventInit {
    @JsOverlay
    @Nonnull
    default Builder port(@Nonnull final MIDIPort port) {
      setPort( port );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
