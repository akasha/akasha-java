package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The ScrollToOptions dictionary of the CSSOM View spec contains properties specifying where an element should be scrolled to, and whether the scrolling should be smooth.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions">ScrollToOptions - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#dictdef-scrolltooptions">(CSSOM View) # dictdef-scrolltooptions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ScrollToOptions"
)
public interface ScrollToOptions extends ScrollOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/left">ScrollToOptions.left - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-scrolltooptions-left">left - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "left"
  )
  double left();

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/left">ScrollToOptions.left - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-scrolltooptions-left">left - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty
  void setLeft(double left);

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/top">ScrollToOptions.top - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-scrolltooptions-top">top - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "top"
  )
  double top();

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/top">ScrollToOptions.top - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-scrolltooptions-top">top - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty
  void setTop(double top);

  /**
   * The ScrollToOptions dictionary of the CSSOM View spec contains properties specifying where an element should be scrolled to, and whether the scrolling should be smooth.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions">ScrollToOptions - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dictdef-scrolltooptions">(CSSOM View) # dictdef-scrolltooptions</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ScrollToOptions"
  )
  interface Builder extends ScrollToOptions {
    /**
     * A double.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/left">ScrollToOptions.left - MDN</a>
     * @see <a href="https://drafts.csswg.org/cssom-view/#dom-scrolltooptions-left">left - CSS Object Model (CSSOM) View Module</a>
     */
    @JsOverlay
    @Nonnull
    default Builder left(final double left) {
      setLeft( left );
      return this;
    }

    /**
     * A double.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScrollToOptions/top">ScrollToOptions.top - MDN</a>
     * @see <a href="https://drafts.csswg.org/cssom-view/#dom-scrolltooptions-top">top - CSS Object Model (CSSOM) View Module</a>
     */
    @JsOverlay
    @Nonnull
    default Builder top(final double top) {
      setTop( top );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder behavior(@ScrollBehavior @Nonnull final String behavior) {
      setBehavior( behavior );
      return this;
    }
  }
}
