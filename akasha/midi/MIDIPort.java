package akasha.midi;

import akasha.EventHandler;
import akasha.EventTarget;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MIDIPort interface of the Web MIDI API represents a MIDI input or output port.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MIDIPort">MIDIPort - MDN</a>
 * @see <a href="https://webaudio.github.io/web-midi-api/#MIDIPort"># MIDIPort</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MIDIPort"
)
public class MIDIPort extends EventTarget {
  @JsNullable
  public EventHandler onstatechange;

  protected MIDIPort() {
  }

  @JsProperty(
      name = "connection"
  )
  @Nonnull
  @MIDIPortConnectionState
  public native String connection();

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  @JsProperty(
      name = "manufacturer"
  )
  @Nullable
  public native String manufacturer();

  @JsProperty(
      name = "name"
  )
  @Nullable
  public native String name();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  @MIDIPortDeviceState
  public native String state();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  @MIDIPortType
  public native String type();

  @JsProperty(
      name = "version"
  )
  @Nullable
  public native String version();

  @JsNonNull
  public native Promise<MIDIPort> close();

  @JsNonNull
  public native Promise<MIDIPort> open();
}
