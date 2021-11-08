package akasha.midi;

import akasha.Event;
import akasha.core.Uint8Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MIDIMessageEvent interface of the Web MIDI API represents the event passed to the onmidimessage event handler of the MIDIInput interface. A midimessage event is fired every time a MIDI message is sent from a device represented by a MIDIInput, for example when a MIDI keyboard key is pressed, a knob is tweaked, or a slider is moved.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MIDIMessageEvent">MIDIMessageEvent - MDN</a>
 * @see <a href="https://webaudio.github.io/web-midi-api/#midimessageevent-interface"># midimessageevent-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MIDIMessageEvent"
)
public class MIDIMessageEvent extends Event {
  public MIDIMessageEvent(@Nonnull final String type,
      @Nonnull final MIDIMessageEventInit eventInitDict) {
    super( null );
  }

  public MIDIMessageEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native Uint8Array data();
}
