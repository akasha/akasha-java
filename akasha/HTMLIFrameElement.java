package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLIFrameElement interface provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement">HTMLIFrameElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/iframe-embed-object.html#htmliframeelement">(HTML) # htmliframeelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLIFrameElement"
)
public class HTMLIFrameElement extends HTMLElement {
  @JsNonNull
  public String align;

  @JsNonNull
  public String allow;

  public boolean allowFullscreen;

  @JsNonNull
  public String frameBorder;

  @JsNonNull
  public String height;

  @JsNonNull
  @LoadingType
  public String loading;

  @JsNonNull
  public String longDesc;

  @JsNonNull
  public String marginHeight;

  @JsNonNull
  public String marginWidth;

  @JsNonNull
  public String name;

  /**
   * The HTMLIFrameElement.referrerPolicy property reflects the HTML referrerpolicy attribute of the iframe element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy">HTMLIFrameElement.referrerPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">referrerpolicy attribute - Referrer Policy</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-referrerpolicy">HTMLIFrameElement: referrerPolicy - HTML Living Standard</a>
   */
  @JsNonNull
  @ReferrerPolicy
  public String referrerPolicy;

  @JsNonNull
  public String scrolling;

  /**
   * The HTMLIFrameElement.src property reflects the HTML referrerpolicy attribute of the iframe element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/src">HTMLIFrameElement.src - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-src">HTMLIFrameElement: src - HTML Living Standard</a>
   */
  @JsNonNull
  public String src;

  /**
   * The srcdoc property of the HTMLIFrameElement specifies the content of the page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/srcdoc">HTMLIFrameElement.srcdoc - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#attr-iframe-srcdoc">HTMLIFrameElement: srcdoc - HTML Living Standard</a>
   */
  @JsNonNull
  public String srcdoc;

  @JsNonNull
  public String width;

  protected HTMLIFrameElement() {
  }

  /**
   * If the iframe and the iframe's parent document are Same Origin, returns a Document (that is, the active document in the inline frame's nested browsing context), else returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/contentDocument">HTMLIFrameElement.contentDocument - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-contentdocument">HTMLIFrameElement: contentDocument - HTML Living Standard</a>
   */
  @JsProperty(
      name = "contentDocument"
  )
  @Nullable
  public native Document contentDocument();

  /**
   * The contentWindow property returns the Window object of an HTMLIFrameElement. You can use this Window object to access the iframe's document and its internal DOM. This attribute is read-only, but its properties can be manipulated like the global Window object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/contentWindow">HTMLIFrameElement.contentWindow - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-iframe-contentwindow">HTMLIFrameElement: contentWindow - HTML Living Standard</a>
   */
  @JsProperty(
      name = "contentWindow"
  )
  @Nullable
  public native Window contentWindow();

  @JsProperty(
      name = "sandbox"
  )
  @Nonnull
  public native DOMTokenList sandbox();

  @JsNullable
  public native Document getSVGDocument();
}
