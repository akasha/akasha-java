package akasha.midi;

import akasha.EventInit;
import akasha.core.Uint8Array;
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
    name = "MIDIMessageEventInit"
)
public interface MIDIMessageEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  Uint8Array data();

  @JsProperty
  void setData(@JsNonNull Uint8Array data);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MIDIMessageEventInit"
  )
  interface Builder extends MIDIMessageEventInit {
    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final Uint8Array data) {
      setData( data );
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
