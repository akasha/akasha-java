package akasha.xr;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import akasha.lang.JsIterable;
import akasha.lang.JsIterator;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XRHand interface is pair iterator (an ordered map) with the key being the hand joints and the value being an XRJointSpace.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRHand">XRHand - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRHand"
)
public class XRHand extends JsObject implements JsIterable<XRHand.Entry> {
  protected XRHand() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @JsNonNull
  public native XRJointSpace get(@XRHandJoint @Nonnull String key);

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<String> keys();

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<XRJointSpace> values();

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
    public XRJointSpace value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@JsNonNull XRJointSpace value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@JsNonNull XRJointSpace value, String key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@JsNonNull XRJointSpace value, String key, @JsNonNull XRHand iterable);
  }
}
