package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The Element.requestFullscreen() method issues an asynchronous request to make the element be displayed in full-screen mode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions">FullscreenOptions - MDN</a>
 * @see <a href="https://fullscreen.spec.whatwg.org/#ref-for-dom-element-requestfullscreen%E2%91%A0">(Fullscreen API) # ref-for-dom-element-requestfullscreen①</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FullscreenOptions"
)
public interface FullscreenOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The FullscreenOptions dictionary's navigationUI property is used when calling requestFullscreen() to specify to what extent the user agent should include its standard user interface while the element is presented in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions/navigationUI">FullscreenOptions.navigationUI - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dictdef-fullscreenoptions">FullscreenOptions - Fullscreen API</a>
   */
  @JsProperty(
      name = "navigationUI"
  )
  @FullscreenNavigationUI
  String navigationUI();

  /**
   * The FullscreenOptions dictionary's navigationUI property is used when calling requestFullscreen() to specify to what extent the user agent should include its standard user interface while the element is presented in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions/navigationUI">FullscreenOptions.navigationUI - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dictdef-fullscreenoptions">FullscreenOptions - Fullscreen API</a>
   */
  @JsProperty
  void setNavigationUI(@FullscreenNavigationUI @JsNonNull String navigationUI);

  /**
   * The Element.requestFullscreen() method issues an asynchronous request to make the element be displayed in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions">FullscreenOptions - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#ref-for-dom-element-requestfullscreen%E2%91%A0">(Fullscreen API) # ref-for-dom-element-requestfullscreen①</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FullscreenOptions"
  )
  interface Builder extends FullscreenOptions {
    /**
     * The FullscreenOptions dictionary's navigationUI property is used when calling requestFullscreen() to specify to what extent the user agent should include its standard user interface while the element is presented in full-screen mode.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FullscreenOptions/navigationUI">FullscreenOptions.navigationUI - MDN</a>
     * @see <a href="https://fullscreen.spec.whatwg.org/#dictdef-fullscreenoptions">FullscreenOptions - Fullscreen API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder navigationUI(@FullscreenNavigationUI @Nonnull final String navigationUI) {
      setNavigationUI( navigationUI );
      return this;
    }
  }
}
