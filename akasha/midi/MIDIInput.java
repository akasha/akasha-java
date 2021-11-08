package akasha.midi;

import akasha.EventHandler;
import javax.annotation.Generated;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The MIDIInput interface of the Web MIDI API receives messages from a MIDI input port.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MIDIInput">MIDIInput - MDN</a>
 * @see <a href="https://webaudio.github.io/web-midi-api/#midiinput-interface"># midiinput-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MIDIInput"
)
public class MIDIInput extends MIDIPort {
  @JsNullable
  public EventHandler onmidimessage;

  protected MIDIInput() {
  }
}
