package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The NamedNodeMap interface represents a collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NamedNodeMap">NamedNodeMap - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-namednodemap"># interface-namednodemap</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NamedNodeMap"
)
public class NamedNodeMap extends JsObject {
  protected NamedNodeMap() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsNullable
  public native Attr getNamedItemNS(@Nullable String namespace, @Nonnull String localName);

  @JsNonNull
  public native Attr removeNamedItem(@Nonnull String qualifiedName);

  @JsNonNull
  public native Attr removeNamedItemNS(@Nullable String namespace, @Nonnull String localName);

  @JsNullable
  public native Attr setNamedItem(@Nonnull Attr attr);

  @JsNullable
  public native Attr setNamedItemNS(@Nonnull Attr attr);

  /**
   * The getNamedItem() method of the NamedNodeMap interface returns the Attr corresponding to the given name, or null if there is no corresponding attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NamedNodeMap/getNamedItem">NamedNodeMap.getNamedItem - MDN</a>
   */
  @HasNoSideEffects
  @JsNullable
  public native Attr getNamedItem(@Nonnull String qualifiedName);

  @HasNoSideEffects
  @JsNullable
  public native Attr item(int index);
}
