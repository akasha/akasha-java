package akasha.midi;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.lang.JsIterable;
import akasha.lang.JsIterator;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MIDIOutputMap read-only interface of the Web MIDI API provides a Map-like interface to the currently available MIDI output ports. Although it works like a map, because it is read-only, it does not contain clear(), delete(), or set() functions.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MIDIOutputMap">MIDIOutputMap - MDN</a>
 * @see <a href="https://webaudio.github.io/web-midi-api/#midiinputmap-interface"># midiinputmap-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MIDIOutputMap"
)
public class MIDIOutputMap extends JsObject implements JsIterable<MIDIOutputMap.Entry> {
  protected MIDIOutputMap() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @HasNoSideEffects
  public native boolean has(@JsNonNull String key);

  @HasNoSideEffects
  @JsNullable
  public native MIDIOutput get(@JsNonNull String key);

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<String> keys();

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<MIDIOutput> values();

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<Entry> entries();

  public native void forEach(@JsNonNull ForEachCallback callback);

  public native void forEach(@JsNonNull ForEachCallback2 callback);

  public native void forEach(@JsNonNull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    @Nonnull
    public String key() {
      return getAtAsAny( 0 ).asString();
    }

    @JsOverlay
    @Nonnull
    public MIDIOutput value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@JsNonNull MIDIOutput value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@JsNonNull MIDIOutput value, @JsNonNull String key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@JsNonNull MIDIOutput value, @JsNonNull String key, @JsNonNull MIDIOutputMap map);
  }
}
