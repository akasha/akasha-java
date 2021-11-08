package akasha.midi;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MIDIConnectionEvent interface of the Web MIDI API is the event passed to the onstatechange event handler of the MIDIAccess interface and the onstatechange event of the MIDIPort interface. This occurs any time a new port becomes available, or when a previously available port becomes unavailable. For example, this event is fired whenever a MIDI device is either plugged in to or unplugged from a computer.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MIDIConnectionEvent">MIDIConnectionEvent - MDN</a>
 * @see <a href="https://webaudio.github.io/web-midi-api/#midiconnectionevent-interface"># midiconnectionevent-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MIDIConnectionEvent"
)
public class MIDIConnectionEvent extends Event {
  public MIDIConnectionEvent(@Nonnull final String type,
      @Nonnull final MIDIConnectionEventInit eventInitDict) {
    super( null );
  }

  public MIDIConnectionEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MIDIPort port();
}
