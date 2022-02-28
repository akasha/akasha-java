package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * HTML &lt;script&gt; elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of &lt;script&gt; elements (beyond the inherited HTMLElement interface).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLScriptElement">HTMLScriptElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/scripting.html#htmlscriptelement"># htmlscriptelement</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLScriptElement"
)
public class HTMLScriptElement extends HTMLElement implements HTMLOrSVGScriptElement {
  public boolean async;

  @JsNonNull
  public String charset;

  @JsNullable
  @CrossOriginType
  public String crossOrigin;

  public boolean defer;

  @JsNonNull
  public String event;

  @JsNonNull
  public String htmlFor;

  @JsNonNull
  public String integrity;

  public boolean noModule;

  /**
   * The referrerPolicy property of the HTMLScriptElement interface reflects the HTML referrerpolicy of the script element and fetches made by that script, defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLScriptElement/referrerPolicy">HTMLScriptElement.referrerPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">referrerpolicy attribute - Referrer Policy</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-script-referrerpolicy">HTMLScriptElement: referrerPolicy - HTML Living Standard</a>
   */
  @JsNonNull
  @ReferrerPolicy
  public String referrerPolicy;

  @JsNonNull
  public String src;

  @JsNonNull
  public String text;

  @JsNonNull
  public String type;

  protected HTMLScriptElement() {
  }

  @JsProperty(
      name = "blocking"
  )
  @Nonnull
  public native DOMTokenList blocking();

  public static native boolean supports(@Nonnull String type);
}
