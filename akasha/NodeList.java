package akasha;

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
 * NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList">NodeList - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-nodelist"># interface-nodelist</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NodeList"
)
public class NodeList extends JsObject implements JsIterable<NodeList.Entry> {
  protected NodeList() {
  }

  /**
   * The NodeList.length property returns the number of items in a NodeList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/length">NodeList.length - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-nodelist-length">NodeList: length - DOM</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * Returns a node from a NodeList by index. This method doesn't throw exceptions as long as you provide arguments. A value of null is returned if the index is out of range, and a TypeError is thrown if no argument is provided.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/item">NodeList.item - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-nodelist-item">NodeList: item - DOM</a>
   */
  @HasNoSideEffects
  @JsNullable
  public native Node item(int index);

  /**
   * The NodeList.keys() method returns an iterator allowing to go through all keys contained in this object. The keys are unsigned integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/keys">NodeList.keys - MDN</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<Double> keys();

  /**
   * The NodeList.values() method returns an iterator allowing to go through all values contained in this object. The values are Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/values">NodeList.values - MDN</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<Node> values();

  /**
   * The NodeList.entries() method returns an iterator allowing to go through all key/value pairs contained in this object. The values are Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/entries">NodeList.entries - MDN</a>
   */
  @HasNoSideEffects
  @JsNonNull
  public native JsIterator<Entry> entries();

  /**
   * The forEach() method of the NodeList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/forEach">NodeList.forEach - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#es-forEach">forEach - Web IDL</a>
   */
  public native void forEach(@JsNonNull ForEachCallback callback);

  /**
   * The forEach() method of the NodeList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/forEach">NodeList.forEach - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#es-forEach">forEach - Web IDL</a>
   */
  public native void forEach(@JsNonNull ForEachCallback2 callback);

  /**
   * The forEach() method of the NodeList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/forEach">NodeList.forEach - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#es-forEach">forEach - Web IDL</a>
   */
  public native void forEach(@JsNonNull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    public int index() {
      return getAtAsAny( 0 ).asInt();
    }

    @JsOverlay
    @Nonnull
    public Node value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@JsNonNull Node value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@JsNonNull Node value, int index);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@JsNonNull Node value, int index, @JsNonNull NodeList iterable);
  }
}
