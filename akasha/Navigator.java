package akasha;

import akasha.bluetooth.Bluetooth;
import akasha.clipboard.Clipboard;
import akasha.core.BufferSource;
import akasha.core.JsObject;
import akasha.gpu.GPU;
import akasha.lang.JsArray;
import akasha.media.MediaDevices;
import akasha.promise.Promise;
import akasha.xr.XRSystem;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.jetbrains.annotations.ApiStatus;

/**
 * The Navigator interface represents the state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator">Navigator - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/system-state.html#the-navigator-object">(HTML) # the-navigator-object</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Navigator"
)
public class Navigator extends JsObject {
  protected Navigator() {
  }

  /**
   * The value of the NavigatorID.appCodeName property is always &quot;Mozilla&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/appCodeName">Navigator.appCodeName - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/appName">Navigator.appName - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/appVersion">Navigator.appVersion - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-appversion">NavigatorID.appVersion - HTML Living Standard</a>
   */
  @JsProperty(
      name = "appVersion"
  )
  @Nonnull
  public native String appVersion();

  @JsOverlay
  public final boolean isBluetoothSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_bluetooth__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_bluetooth__supported" ) ) ? false : Js.asPropertyMap( this ).has( "bluetooth" );
  }

  @JsProperty(
      name = "bluetooth"
  )
  @Nonnull
  public native Bluetooth bluetooth();

  @JsOverlay
  public final boolean isClipboardSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_clipboard__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_clipboard__supported" ) ) ? false : Js.asPropertyMap( this ).has( "clipboard" );
  }

  /**
   * The Clipboard API adds to the Navigator interface the read-only clipboard property, which returns the Clipboard object used to read and write the clipboard's contents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/clipboard">Navigator.clipboard - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#navigator-clipboard">navigator.clipboard - Clipboard API and events</a>
   */
  @JsProperty(
      name = "clipboard"
  )
  @Nonnull
  public native Clipboard clipboard();

  /**
   * navigator.cookieEnabled returns a Boolean value that indicates whether cookies are enabled or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/cookieEnabled">Navigator.cookieEnabled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/webappapis.html#dom-navigator-cookieenabled">Navigator.cookieEnabled - HTML Living Standard</a>
   */
  @JsProperty(
      name = "cookieEnabled"
  )
  public native boolean cookieEnabled();

  @JsOverlay
  public final boolean isCredentialsSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_credentials__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_credentials__supported" ) ) ? false : Js.asPropertyMap( this ).has( "credentials" );
  }

  /**
   * The credentials property of the Navigator interface returns the CredentialsContainer interface, which exposes methods to request credentials. The CredentialsContainer interface also notifies the user agent when an interesting event occurs, such as a successful sign-in or sign-out. This interface can be used for feature detection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/credentials">Navigator.credentials - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  @JsProperty(
      name = "credentials"
  )
  @Nonnull
  public native CredentialsContainer credentials();

  @JsOverlay
  public final boolean isGeolocationSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_geolocation__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_geolocation__supported" ) ) ? false : Js.asPropertyMap( this ).has( "geolocation" );
  }

  /**
   * The Navigator.geolocation read-only property returns a Geolocation object that gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/geolocation">Navigator.geolocation - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-navigator-geolocation">Navigator.geolocation - Geolocation API</a>
   */
  @JsProperty(
      name = "geolocation"
  )
  @Nonnull
  public native Geolocation geolocation();

  @JsOverlay
  public final boolean isGpuSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_gpu__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_gpu__supported" ) ) ? false : Js.asPropertyMap( this ).has( "gpu" );
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/language">Navigator.language - MDN</a>
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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/languages">Navigator.languages - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-languages">NavigatorLanguage: languages - HTML Living Standard</a>
   */
  @JsProperty(
      name = "languages"
  )
  @Nonnull
  public native JsArray<String> languages();

  /**
   * The maxTouchPoints read-only property of the Navigator interface returns the maximum number of simultaneous touch contact points are supported by the current device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/maxTouchPoints">Navigator.maxTouchPoints - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#extensions-to-the-navigator-interface">maxTouchPoints - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#extensions-to-the-navigator-interface">maxTouchPoints - Pointer Events</a>
   */
  @JsProperty(
      name = "maxTouchPoints"
  )
  public native int maxTouchPoints();

  @JsOverlay
  public final boolean isMediaDevicesSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_mediaDevices__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_mediaDevices__supported" ) ) ? false : Js.asPropertyMap( this ).has( "mediaDevices" );
  }

  /**
   * The Navigator.mediaDevices read-only property returns a MediaDevices object, which provides access to connected media input devices like cameras and microphones, as well as screen sharing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/mediaDevices">Navigator.mediaDevices - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#mediadevices">NavigatorUserMedia.mediaDevices - Media Capture and Streams</a>
   */
  @JsProperty(
      name = "mediaDevices"
  )
  @Nonnull
  public native MediaDevices mediaDevices();

  /**
   * Returns a MimeTypeArray object, which contains a list of MimeType objects representing the MIME types recognized by the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorPlugins/mimeTypes">NavigatorPlugins.mimeTypes - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-mimetypes">NavigatorPlugins.mimeTypes - HTML Living Standard</a>
   */
  @JsProperty(
      name = "mimeTypes"
  )
  @Nonnull
  public native MimeTypeArray mimeTypes();

  /**
   * Returns the online status of the browser. The property returns a boolean value, with true meaning online and false meaning offline. The property sends updates whenever the browser's ability to connect to the network changes. The update occurs when the user follows links or when a script requests a remote page. For example, the property should return false when users click links soon after they lose internet connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/onLine">Navigator.onLine - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/browsers.html#dom-navigator-online">navigator.onLine - HTML Living Standard</a>
   */
  @JsProperty(
      name = "onLine"
  )
  public native boolean onLine();

  /**
   * The Navigator.oscpu property returns a string that identifies the current operating system.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/oscpu">Navigator.oscpu - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-oscpu">NavigatorID: oscpu - HTML Living Standard</a>
   */
  @JsProperty(
      name = "oscpu"
  )
  @Nonnull
  public native String oscpu();

  @JsProperty(
      name = "pdfViewerEnabled"
  )
  public native boolean pdfViewerEnabled();

  @JsOverlay
  public final boolean isPermissionsSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_permissions__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_permissions__supported" ) ) ? false : Js.asPropertyMap( this ).has( "permissions" );
  }

  /**
   * The Navigator.permissions read-only property returns a Permissions object that can be used to query and update permission status of APIs covered by the Permissions API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/permissions">Navigator.permissions - MDN</a>
   */
  @JsProperty(
      name = "permissions"
  )
  @Nonnull
  public native Permissions permissions();

  /**
   * Returns a string representing the platform of the browser. The specification allows browsers to always return the empty string, so don't rely on this property to get a reliable answer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/platform">Navigator.platform - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-platform">NavigatorID.platform - HTML Living Standard</a>
   */
  @JsProperty(
      name = "platform"
  )
  @Nonnull
  public native String platform();

  /**
   * Returns a PluginArray object, listing the Plugin objects describing the plugins installed in the application.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorPlugins/plugins">NavigatorPlugins.plugins - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-plugins">NavigatorPlugins.plugins - HTML Living Standard</a>
   */
  @JsProperty(
      name = "plugins"
  )
  @Nonnull
  public native PluginArray plugins();

  /**
   * The value of the NavigatorID.product property is always &quot;Gecko&quot;, in any browser. This property is kept only for compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/product">Navigator.product - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-product">NavigatorID.product - HTML Living Standard</a>
   */
  @JsProperty(
      name = "product"
  )
  @Nonnull
  public native String product();

  /**
   * The Navigator.productSub read-only property returns the build number of the current browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/productSub">Navigator.productSub - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-productsub">NavigatorID: productSub - HTML Living Standard</a>
   */
  @JsProperty(
      name = "productSub"
  )
  @Nonnull
  public native String productSub();

  @JsOverlay
  public final boolean isServiceWorkerSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_serviceWorker__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_serviceWorker__supported" ) ) ? false : Js.asPropertyMap( this ).has( "serviceWorker" );
  }

  /**
   * The Navigator.serviceWorker read-only property returns the ServiceWorkerContainer object for the associated document, which provides access to registration, removal, upgrade, and communication with the ServiceWorker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/serviceWorker">Navigator.serviceWorker - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#navigator-serviceworker">navigator.serviceWorker - Service Workers</a>
   */
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

  /**
   * The NavigatorID.userAgent read-only property returns the user agent string for the current browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/userAgent">Navigator.userAgent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-useragent">NavigatorID.userAgent - HTML Living Standard</a>
   */
  @JsProperty(
      name = "userAgent"
  )
  @Nonnull
  public native String userAgent();

  /**
   * The value of the Navigator vendor property is always either &quot;Google Inc.&quot;, &quot;Apple Computer, Inc.&quot;, or (in Firefox) the empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vendor">Navigator.vendor - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-vendor">NavigatorID: vendor - HTML Living Standard</a>
   */
  @JsProperty(
      name = "vendor"
  )
  @Nonnull
  public native String vendor();

  /**
   * The value of the Navigator.vendorSub property is always the empty string, in any browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vendorSub">Navigator.vendorSub - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-vendorsub">NavigatorID: vendorSub - HTML Living Standard</a>
   */
  @JsProperty(
      name = "vendorSub"
  )
  @Nonnull
  public native String vendorSub();

  @JsOverlay
  public final boolean isWakeLockSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_wakeLock__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_wakeLock__supported" ) ) ? false : Js.asPropertyMap( this ).has( "wakeLock" );
  }

  /**
   * The wakeLock read-only property returns a WakeLock interface which allows a document to acquire a screen wake lock. While a screen wake lock is active, the user agent will try to prevent the device from dimming the screen, turning it off completely, or showing a screensaver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/wakeLock">Navigator.wakeLock - MDN</a>
   */
  @JsProperty(
      name = "wakeLock"
  )
  @Nonnull
  public native WakeLock wakeLock();

  /**
   * The webdriver read-only property of the navigator interface indicates whether the user agent is controlled by automation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/webdriver">Navigator.webdriver - MDN</a>
   * @see <a href="https://w3c.github.io/webdriver/#dom-navigatorautomationinformation-webdriver">webdriver - WebDriver</a>
   */
  @JsProperty(
      name = "webdriver"
  )
  public native boolean webdriver();

  @JsOverlay
  public final boolean isXrSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_xr__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_xr__supported" ) ) ? false : Js.asPropertyMap( this ).has( "xr" );
  }

  /**
   * The read-only xr property provided by the Navigator or WorkerNavigator interface returns an XRSystem object which can be used to access the WebXR Device API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/xr">Navigator.xr - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#navigator-xr-attribute">Navigator.xr - WebXR Device API</a>
   */
  @JsProperty(
      name = "xr"
  )
  @Nonnull
  public native XRSystem xr();

  @JsOverlay
  public final boolean isSendBeaconSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_sendBeacon__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_sendBeacon__supported" ) ) ? false : Js.asPropertyMap( this ).has( "sendBeacon" );
  }

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nullable BodyInit data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull ReadableStream data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull XMLHttpRequestBodyInit data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull Blob data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull BufferSource data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull FormData data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull URLSearchParams data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url, @Nonnull String data);

  /**
   * The navigator.sendBeacon() method asynchronously sends a small amount of data over HTTP to a web server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/sendBeacon">Navigator.sendBeacon - MDN</a>
   * @see <a href="https://w3c.github.io/beacon/#sendbeacon-method">sendBeacon() - Beacon</a>
   */
  public native boolean sendBeacon(@Nonnull String url);

  @JsOverlay
  public final boolean isRequestMediaKeySystemAccessSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_requestMediaKeySystemAccess__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_requestMediaKeySystemAccess__supported" ) ) ? false : Js.asPropertyMap( this ).has( "requestMediaKeySystemAccess" );
  }

  /**
   * The Navigator.requestMediaKeySystemAccess() method returns a Promise which delivers a MediaKeySystemAccess object that can be used to access a particular media key system, which can in turn be used to create keys for decrypting a media stream. This method is part of the Encrypted Media Extensions API, which brings support for encrypted media and DRM-protected video to the web.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/requestMediaKeySystemAccess">Navigator.requestMediaKeySystemAccess - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#navigator-extension-requestmediakeysystemaccess">requestMediaKeySystemAccess() - Encrypted Media Extensions</a>
   */
  @JsNonNull
  public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(@Nonnull String keySystem,
      @Nonnull JsArray<MediaKeySystemConfiguration> supportedConfigurations);

  /**
   * The Navigator.requestMediaKeySystemAccess() method returns a Promise which delivers a MediaKeySystemAccess object that can be used to access a particular media key system, which can in turn be used to create keys for decrypting a media stream. This method is part of the Encrypted Media Extensions API, which brings support for encrypted media and DRM-protected video to the web.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/requestMediaKeySystemAccess">Navigator.requestMediaKeySystemAccess - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#navigator-extension-requestmediakeysystemaccess">requestMediaKeySystemAccess() - Encrypted Media Extensions</a>
   */
  @JsNonNull
  public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(@Nonnull String keySystem,
      @Nonnull MediaKeySystemConfiguration[] supportedConfigurations);

  @JsOverlay
  public final boolean isGetGamepadsSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_getGamepads__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_getGamepads__supported" ) ) ? false : Js.asPropertyMap( this ).has( "getGamepads" );
  }

  /**
   * The Navigator.getGamepads() method returns an array of Gamepad objects, one for each gamepad connected to the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/getGamepads">Navigator.getGamepads - MDN</a>
   * @see <a href="https://w3c.github.io/gamepad/">The Gamepad API specification - Gamepad</a>
   */
  @JsNonNull
  public native JsArray<Gamepad> getGamepads();

  @JsOverlay
  public final boolean isVibrateSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_vibrate__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_vibrate__supported" ) ) ? false : Js.asPropertyMap( this ).has( "vibrate" );
  }

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   * @see <a href="https://dev.w3.org/2009/dap/vibration/">Vibration API</a>
   */
  public native boolean vibrate(@Nonnull VibratePattern pattern);

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   * @see <a href="https://dev.w3.org/2009/dap/vibration/">Vibration API</a>
   */
  public native boolean vibrate(int pattern);

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   * @see <a href="https://dev.w3.org/2009/dap/vibration/">Vibration API</a>
   */
  public native boolean vibrate(@Nonnull JsArray<Double> pattern);

  /**
   * The Navigator.vibrate() method pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/vibrate">Navigator.vibrate - MDN</a>
   * @see <a href="https://dev.w3.org/2009/dap/vibration/">Vibration API</a>
   */
  public native boolean vibrate(@Nonnull double[] pattern);

  /**
   * The Navigator.canShare() method of the Web Share API returns true if a call to navigator.share() would succeed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/canShare">Navigator.canShare - MDN</a>
   */
  public native boolean canShare(@Nonnull ShareData data);

  /**
   * The Navigator.canShare() method of the Web Share API returns true if a call to navigator.share() would succeed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/canShare">Navigator.canShare - MDN</a>
   */
  public native boolean canShare();

  @JsOverlay
  public final boolean isShareSupported() {
    return "true".equals( System.getProperty( "akasha.is__Navigator_share__supported" ) ) ? true : "false".equals( System.getProperty( "akasha.is__Navigator_share__supported" ) ) ? false : Js.asPropertyMap( this ).has( "share" );
  }

  /**
   * The navigator.share() method of the Web Share API invokes the native sharing mechanism of the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/share">Navigator.share - MDN</a>
   * @see <a href="https://w3c.github.io/web-share/#share-method">share() - Web Share API</a>
   */
  @JsNonNull
  public native Promise<Void> share(@Nonnull ShareData data);

  /**
   * The navigator.share() method of the Web Share API invokes the native sharing mechanism of the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/share">Navigator.share - MDN</a>
   * @see <a href="https://w3c.github.io/web-share/#share-method">share() - Web Share API</a>
   */
  @JsNonNull
  public native Promise<Void> share();

  /**
   * The NavigatorID.taintEnabled() method always returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/taintEnabled">Navigator.taintEnabled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-taintenabled">NavigatorID.taintEnabled - HTML Living Standard</a>
   */
  public native boolean taintEnabled();

  /**
   * This method indicates whether the current browser is Java-enabled or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NavigatorPlugins/javaEnabled">NavigatorPlugins.javaEnabled - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-javaenabled">NavigatorPlugins.javaEnabled - HTML Living Standard</a>
   */
  public native boolean javaEnabled();

  /**
   * The Navigator method registerProtocolHandler() lets web sites register their ability to open or handle particular URL schemes (aka protocols).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/registerProtocolHandler">Navigator.registerProtocolHandler - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/system-state.html#custom-handlers">registerProtocolHandler() - HTML Living Standard</a>
   */
  public native void registerProtocolHandler(@Nonnull String scheme, @Nonnull String url);

  public native void unregisterProtocolHandler(@Nonnull String scheme, @Nonnull String url);
}
