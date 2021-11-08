package akasha;

import akasha.core.JsObject;
import akasha.gpu.GPU;
import akasha.lang.JsArray;
import akasha.usb.USB;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.jetbrains.annotations.ApiStatus;

/**
 * The WorkerNavigator interface represents a subset of the Navigator interface allowed to be accessed from a Worker. Such an object is initialized for each worker and is available via the self.navigator property.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator">WorkerNavigator - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/workers.html#the-workernavigator-object">(HTML) # the-workernavigator-object</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WorkerNavigator"
)
public class WorkerNavigator extends JsObject {
  protected WorkerNavigator() {
  }

  /**
   * The value of the NavigatorID.appCodeName property is always &quot;Mozilla&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/appCodeName">WorkerNavigator.appCodeName - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-appcodename">NavigatorID.appCodeName - HTML Living Standard</a>
   */
  @JsProperty(
      name = "appCodeName"
  )
  @Nonnull
  public native String appCodeName();

  /**
   * The value of the NavigatorID.appName property is always &quot;Netscape&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/appName">WorkerNavigator.appName - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-appname">NavigatorID.appName - HTML Living Standard</a>
   */
  @JsProperty(
      name = "appName"
  )
  @Nonnull
  public native String appName();

  /**
   * Returns either &quot;4.0&quot; or a string representing version information about the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/appVersion">WorkerNavigator.appVersion - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-appversion">NavigatorID.appVersion - HTML Living Standard</a>
   */
  @JsProperty(
      name = "appVersion"
  )
  @Nonnull
  public native String appVersion();

  @JsOverlay
  public final boolean isGpuSupported() {
    return "true".equals( System.getProperty( "akasha.is__WorkerNavigator_gpu__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__WorkerNavigator_gpu__supported" ) ) ? false : Js.asPropertyMap( this ).has( "gpu" );
  }

  @JsProperty(
      name = "gpu"
  )
  @ApiStatus.Experimental
  @Nonnull
  public native GPU gpu();

  /**
   * The navigator.hardwareConcurrency read-only property returns the number of logical processors available to run threads on the user's computer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorConcurrentHardware/hardwareConcurrency">NavigatorConcurrentHardware.hardwareConcurrency - MDN</a>
   */
  @JsProperty(
      name = "hardwareConcurrency"
  )
  public native int hardwareConcurrency();

  /**
   * The NavigatorLanguage.language read-only property returns a string representing the preferred language of the user, usually the language of the browser UI.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/language">WorkerNavigator.language - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-language">NavigatorLanguage: language - HTML Living Standard</a>
   */
  @JsProperty(
      name = "language"
  )
  @Nonnull
  public native String language();

  /**
   * The NavigatorLanguage.languages read-only property returns an array of DOMStrings representing the user's preferred languages. The language is described using BCP 47 language tags. In the returned array they are ordered by preference with the most preferred language first.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/languages">WorkerNavigator.languages - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-languages">NavigatorLanguage: languages - HTML Living Standard</a>
   */
  @JsProperty(
      name = "languages"
  )
  @Nonnull
  public native JsArray<String> languages();

  /**
   * Returns the online status of the browser. The property returns a boolean value, with true meaning online and false meaning offline. The property sends updates whenever the browser's ability to connect to the network changes. The update occurs when the user follows links or when a script requests a remote page. For example, the property should return false when users click links soon after they lose internet connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/onLine">WorkerNavigator.onLine - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-navigator-online">navigator.onLine - HTML Living Standard</a>
   */
  @JsProperty(
      name = "onLine"
  )
  public native boolean onLine();

  @JsProperty(
      name = "oscpu"
  )
  @Nonnull
  public native String oscpu();

  /**
   * The WorkerNavigator.permissions read-only property returns a Permissions object that can be used to query and update permission status of APIs covered by the Permissions API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/permissions">WorkerNavigator.permissions - MDN</a>
   */
  @JsProperty(
      name = "permissions"
  )
  @Nonnull
  public native Permissions permissions();

  /**
   * Returns a string representing the platform of the browser. The specification allows browsers to always return the empty string, so don't rely on this property to get a reliable answer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/platform">WorkerNavigator.platform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-platform">NavigatorID.platform - HTML Living Standard</a>
   */
  @JsProperty(
      name = "platform"
  )
  @Nonnull
  public native String platform();

  /**
   * The value of the NavigatorID.product property is always &quot;Gecko&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/product">WorkerNavigator.product - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-product">NavigatorID.product - HTML Living Standard</a>
   */
  @JsProperty(
      name = "product"
  )
  @Nonnull
  public native String product();

  @JsProperty(
      name = "productSub"
  )
  @Nonnull
  public native String productSub();

  @JsProperty(
      name = "serviceWorker"
  )
  @Nonnull
  public native ServiceWorkerContainer serviceWorker();

  /**
   * The NavigatorStorage.storage read-only property returns the singleton StorageManager object used to access the overall storage capabilities of the browser for the current site or app.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorStorage/storage">NavigatorStorage.storage - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#navigatorstorage">navigator.storage - Storage</a>
   */
  @JsProperty(
      name = "storage"
  )
  @Nonnull
  public native StorageManager storage();

  @JsOverlay
  public final boolean isUsbSupported() {
    return "true".equals( System.getProperty( "akasha.is__WorkerNavigator_usb__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__WorkerNavigator_usb__supported" ) ) ? false : Js.asPropertyMap( this ).has( "usb" );
  }

  @JsProperty(
      name = "usb"
  )
  @Nonnull
  public native USB usb();

  /**
   * The NavigatorID.userAgent read-only property returns the user agent string for the current browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/userAgent">WorkerNavigator.userAgent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-useragent">NavigatorID.userAgent - HTML Living Standard</a>
   */
  @JsProperty(
      name = "userAgent"
  )
  @Nonnull
  public native String userAgent();

  @JsProperty(
      name = "vendor"
  )
  @Nonnull
  public native String vendor();

  @JsProperty(
      name = "vendorSub"
  )
  @Nonnull
  public native String vendorSub();

  /**
   * The NavigatorID.taintEnabled() method always returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WorkerNavigator/taintEnabled">WorkerNavigator.taintEnabled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-taintenabled">NavigatorID.taintEnabled - HTML Living Standard</a>
   */
  public native boolean taintEnabled();
}
