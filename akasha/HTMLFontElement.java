package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Implements the document object model (DOM) representation of the font element. The HTML Font Element &lt;font&gt; defines the font size, font face and color of text.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFontElement">HTMLFontElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFontElement"
)
public class HTMLFontElement extends HTMLElement {
  /**
   * The obsolete HTMLFontElement.color property is a DOMString that reflects the color HTML attribute, containing either a named color or a color specified in the hexadecimal #RRGGBB format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFontElement/color">HTMLFontElement.color - MDN</a>
   */
  @JsNonNull
  public String color;

  /**
   * The obsolete HTMLFontElement.face property is a DOMString that reflects the face HTML attribute, containing a comma-separated list of one or more font names.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFontElement/face">HTMLFontElement.face - MDN</a>
   */
  @JsNonNull
  public String face;

  /**
   * The obsolete HTMLFontElement.size property is a DOMString that reflects the size HTML attribute. It contains either an integer number in the range of 1-7 or a relative value to increase/decrease the value of the size attribute of the basefont element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFontElement/size">HTMLFontElement.size - MDN</a>
   */
  @JsNonNull
  public String size;

  protected HTMLFontElement() {
  }
}
