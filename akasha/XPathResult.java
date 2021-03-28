package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The XPathResult interface represents the results generated by evaluating an XPath expression within the context of a given node.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult">XPathResult - MDN</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult">XPathResult - Document Object Model (DOM) Level 3 XPath Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XPathResult"
)
public class XPathResult {
  @JsOverlay
  public static final int ANY_TYPE = 0;

  @JsOverlay
  public static final int ANY_UNORDERED_NODE_TYPE = 8;

  @JsOverlay
  public static final int BOOLEAN_TYPE = 3;

  @JsOverlay
  public static final int FIRST_ORDERED_NODE_TYPE = 9;

  @JsOverlay
  public static final int NUMBER_TYPE = 1;

  @JsOverlay
  public static final int ORDERED_NODE_ITERATOR_TYPE = 5;

  @JsOverlay
  public static final int ORDERED_NODE_SNAPSHOT_TYPE = 7;

  @JsOverlay
  public static final int STRING_TYPE = 2;

  @JsOverlay
  public static final int UNORDERED_NODE_ITERATOR_TYPE = 4;

  @JsOverlay
  public static final int UNORDERED_NODE_SNAPSHOT_TYPE = 6;

  protected XPathResult() {
  }

  /**
   * The read-only booleanValue property of the XPathResult interface returns the boolean value of a result with XPathResult.resultType being BOOLEAN_TYPE.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/booleanValue">XPathResult.booleanValue - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-booleanValue">XPathResult.booleanValue - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @JsProperty(
      name = "booleanValue"
  )
  public native boolean booleanValue();

  /**
   * The read-only invalidIteratorState property of the XPathResult interface signifies that the iterator has become invalid. It is true if XPathResult.resultType is UNORDERED_NODE_ITERATOR_TYPE or ORDERED_NODE_ITERATOR_TYPE and the document has been modified since this result was returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/invalidIteratorState">XPathResult.invalidIteratorState - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-invalid-iterator-state">XPathResult.invalidIteratorState - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @JsProperty(
      name = "invalidIteratorState"
  )
  public native boolean invalidIteratorState();

  /**
   * The read-only numberValue property of the XPathResult interface returns the numeric value of a result with XPathResult.resultType being NUMBER_TYPE.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/numberValue">XPathResult.numberValue - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-numberValue">XPathResult.numberValue - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @JsProperty(
      name = "numberValue"
  )
  public native double numberValue();

  /**
   * The read-only resultType property of the XPathResult interface represents the type of the result, as defined by the type constants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/resultType">XPathResult.resultType - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-resultType">XPathResult.resultType - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @JsProperty(
      name = "resultType"
  )
  @XPathResultResultType
  public native int resultType();

  /**
   * The read-only singleNodeValue property of the XPathResult interface returns a Node value or null in case no node was matched of a result with XPathResult.resultType being ANY_UNORDERED_NODE_TYPE or FIRST_ORDERED_NODE_TYPE.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/singleNodeValue">XPathResult.singleNodeValue - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-singleNodeValue">XPathResult.singleNodeValue - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @JsProperty(
      name = "singleNodeValue"
  )
  @Nullable
  public native Node singleNodeValue();

  /**
   * The read-only snapshotLength property of the XPathResult interface represents the number of nodes in the result snapshot.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/snapshotLength">XPathResult.snapshotLength - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-snapshotLength">XPathResult.snapshotLength - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @JsProperty(
      name = "snapshotLength"
  )
  public native int snapshotLength();

  /**
   * The read-only stringValue property of the XPathResult interface returns the string value of a result with XPathResult.resultType being STRING_TYPE.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/stringValue">XPathResult.stringValue - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-stringValue">XPathResult.stringValue - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @JsProperty(
      name = "stringValue"
  )
  @Nonnull
  public native String stringValue();

  /**
   * The iterateNext() method of the XPathResult interface iterates over a node set result and returns the next node from it or null if there are no more nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/iterateNext">XPathResult.iterateNext - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-iterateNext">XPathResult.iterateNext() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nullable
  public native Node iterateNext();

  /**
   * The snapshotItem() method of the XPathResult interface returns an item of the snapshot collection or null in case the index is not within the range of nodes. Unlike the iterator result, the snapshot does not become invalid, but may not correspond to the current document if it is mutated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathResult/snapshotItem">XPathResult.snapshotItem - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathResult-snapshotItem">XPathResult.snapshotItem() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nullable
  public native Node snapshotItem(int index);
}
