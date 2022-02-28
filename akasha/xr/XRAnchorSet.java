package akasha.xr;

import akasha.core.JsObject;
import akasha.lang.JsArray;
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
 * The XRAnchorSet interface exposes a collection of anchors. It is returned by XRFrame.trackedAnchors and is a Set-like object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRAnchorSet">XRAnchorSet - MDN</a>
 * @see <a href="https://immersive-web.github.io/anchors/#xranchorset"># xranchorset</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRAnchorSet"
)
public class XRAnchorSet extends JsObject {
  protected XRAnchorSet() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @HasNoSideEffects
  public native boolean has(@JsNonNull XRAnchor value);

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<XRAnchor> keys();

  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<XRAnchor> values();

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
    public XRAnchor key() {
      return getAtAsAny( 0 ).cast();
    }

    @JsOverlay
    @Nonnull
    public XRAnchor value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@JsNonNull XRAnchor value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@JsNonNull XRAnchor value, @JsNonNull XRAnchor value2);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@JsNonNull XRAnchor value, @JsNonNull XRAnchor value2, @JsNonNull XRAnchorSet set);
  }
}
