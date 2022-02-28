package akasha.rtc;

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
 * The RTCStatsReport interface provides a statistics report obtained by calling one of the RTCPeerConnection.getStats(), RTCRtpReceiver.getStats(), and RTCRtpSender.getStats() methods.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStatsReport">RTCStatsReport - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcstatsreport-object"># rtcstatsreport-object</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCStatsReport"
)
public class RTCStatsReport extends JsObject implements JsIterable<RTCStatsReport.Entry> {
  protected RTCStatsReport() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @HasNoSideEffects
  public native boolean has(@JsNonNull String key);

  @HasNoSideEffects
  @JsNullable
  public native JsObject get(@JsNonNull String key);

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<String> keys();

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<JsObject> values();

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
    public JsObject value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@JsNonNull JsObject value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@JsNonNull JsObject value, @JsNonNull String key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@JsNonNull JsObject value, @JsNonNull String key, @JsNonNull RTCStatsReport map);
  }
}
