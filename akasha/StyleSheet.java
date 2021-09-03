package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * An object implementing the StyleSheet interface represents a single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet">StyleSheet - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-stylesheet-interface">(CSSOM) # the-stylesheet-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StyleSheet"
)
public class StyleSheet extends JsObject {
  /**
   * The disabled property of the StyleSheet interface determines whether the style sheet is prevented from applying to the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet/disabled">StyleSheet.disabled - MDN</a>
   */
  public boolean disabled;

  protected StyleSheet() {
  }

  /**
   * The href property of the StyleSheet interface returns the location of the style sheet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet/href">StyleSheet.href - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-stylesheet-href">StyleSheet: href - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "href"
  )
  @Nullable
  public native String href();

  /**
   * The media property of the StyleSheet interface specifies the intended destination media for style information. It is a read-only, array-like MediaList object and can be removed with deleteMedium() and added with appendMedium().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet/media">StyleSheet.media - MDN</a>
   */
  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native MediaList media();

  /**
   * The ownerNode property of the StyleSheet interface returns the node that associates this style sheet with the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet/ownerNode">StyleSheet.ownerNode - MDN</a>
   */
  @JsProperty(
      name = "ownerNode"
  )
  @Nullable
  public native StyleSheetOwnerNode ownerNode();

  /**
   * The parentStyleSheet property of the StyleSheet interface returns the style sheet, if any, that is including the given style sheet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet/parentStyleSheet">StyleSheet.parentStyleSheet - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-stylesheet-parentstylesheet">StyleSheet: parentStyleSheet - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "parentStyleSheet"
  )
  @Nullable
  public native CSSStyleSheet parentStyleSheet();

  /**
   * The title property of the StyleSheet interface returns the advisory title of the current style sheet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet/title">StyleSheet.title - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-stylesheet-title">StyleSheet: title - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "title"
  )
  @Nullable
  public native String title();

  /**
   * The type property of the StyleSheet interface specifies the style sheet language for the given style sheet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet/type">StyleSheet.type - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom/#dom-stylesheet-type">StyleSheet: type - CSS Object Model (CSSOM)</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();
}
