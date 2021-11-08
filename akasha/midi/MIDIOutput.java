package akasha.midi;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The MIDIOutput interface of the Web MIDI API provides methods to add messages to the queue of an output device, and to clear the queue of messages.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MIDIOutput">MIDIOutput - MDN</a>
 * @see <a href="https://webaudio.github.io/web-midi-api/#MIDIOutput"># MIDIOutput</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MIDIOutput"
)
public class MIDIOutput extends MIDIPort {
  protected MIDIOutput() {
  }

  public native void clear();

  public native void send(@Nonnull JsArray<Double> data, double timestamp);

  public native void send(@Nonnull double[] data, double timestamp);

  public native void send(@Nonnull JsArray<Double> data);

  @JsOverlay
  public final void send(@Nonnull final double... data) {
    _send( data );
  }

  @JsMethod(
      name = "send"
  )
  private native void _send(@Nonnull double[] data);
}
