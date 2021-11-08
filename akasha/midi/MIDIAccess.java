package akasha.midi;

import akasha.EventHandler;
import akasha.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MIDIAccess interface of the Web MIDI API provides methods for listing MIDI input and output devices, and obtaining access to those devices.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MIDIAccess">MIDIAccess - MDN</a>
 * @see <a href="https://webaudio.github.io/web-midi-api/#midiaccess-interface"># midiaccess-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MIDIAccess"
)
public class MIDIAccess extends EventTarget {
  @JsNullable
  public EventHandler onstatechange;

  protected MIDIAccess() {
  }

  @JsProperty(
      name = "inputs"
  )
  @Nonnull
  public native MIDIInputMap inputs();

  @JsProperty(
      name = "outputs"
  )
  @Nonnull
  public native MIDIOutputMap outputs();

  @JsProperty(
      name = "sysexEnabled"
  )
  public native boolean sysexEnabled();
}
