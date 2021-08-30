package akasha;

import akasha.core.ArrayBuffer;
import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The PushMessageData interface of the Push API provides methods which let you retrieve the push data sent by a server in various formats.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushMessageData">PushMessageData - MDN</a>
 * @see <a href="https://w3c.github.io/push-api/#pushmessagedata-interface"># pushmessagedata-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushMessageData"
)
public class PushMessageData extends JsObject {
  protected PushMessageData() {
  }

  /**
   * The arrayBuffer()method of the PushMessageData interface extracts push message data as an ArrayBuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushMessageData/arrayBuffer">PushMessageData.arrayBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmessagedata-arraybuffer">arrayBuffer() - Push API</a>
   */
  @JsNonNull
  public native ArrayBuffer arrayBuffer();

  /**
   * The blob()method of the PushMessageData interface extracts push message data as a Blob object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushMessageData/blob">PushMessageData.blob - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmessagedata-blob">blob() - Push API</a>
   */
  @JsNonNull
  public native Blob blob();

  /**
   * The json()method of the PushMessageData interface extracts push message data by parsing it as a JSON string and returning the result.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushMessageData/json">PushMessageData.json - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmessagedata-json">json() - Push API</a>
   */
  @JsNullable
  public native Any json();

  /**
   * The text()method of the PushMessageData interface extracts push message data as a plain text string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PushMessageData/text">PushMessageData.text - MDN</a>
   * @see <a href="https://w3c.github.io/push-api/#dom-pushmessagedata-text">text() - Push API</a>
   */
  @JsNonNull
  public native String text();
}
