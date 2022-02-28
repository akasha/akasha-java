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
 * The estimate() method of the StorageManager interface asks the Storage Manager for how much storage the current origin takes up (usage), and how much space is available (quota).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate">StorageEstimate - MDN</a>
 * @see <a href="https://storage.spec.whatwg.org/#ref-for-dom-storagemanager-estimate"># ref-for-dom-storagemanager-estimate</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StorageEstimate"
)
public interface StorageEstimate {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The StorageEstimate dictionary's quota property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. This value is an estimate to help prevent its use for fingerprinting&mdash;that is, identifying a device using an amalgamation of the values of seemingly innocuous properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/quota">StorageEstimate.quota - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-quota">quota - Storage</a>
   */
  @JsProperty(
      name = "quota"
  )
  int quota();

  /**
   * The StorageEstimate dictionary's quota property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. This value is an estimate to help prevent its use for fingerprinting&mdash;that is, identifying a device using an amalgamation of the values of seemingly innocuous properties.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/quota">StorageEstimate.quota - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-quota">quota - Storage</a>
   */
  @JsProperty
  void setQuota(int quota);

  /**
   * The StorageEstimate dictionary's usage property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. The value is an estimate because the user agent may use compression, duplication prevention techniques, and other methods to improve storage efficiency.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/usage">StorageEstimate.usage - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-usage">usage - Storage</a>
   */
  @JsProperty(
      name = "usage"
  )
  int usage();

  /**
   * The StorageEstimate dictionary's usage property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. The value is an estimate because the user agent may use compression, duplication prevention techniques, and other methods to improve storage efficiency.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/usage">StorageEstimate.usage - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-usage">usage - Storage</a>
   */
  @JsProperty
  void setUsage(int usage);

  /**
   * The estimate() method of the StorageManager interface asks the Storage Manager for how much storage the current origin takes up (usage), and how much space is available (quota).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate">StorageEstimate - MDN</a>
   * @see <a href="https://storage.spec.whatwg.org/#ref-for-dom-storagemanager-estimate"># ref-for-dom-storagemanager-estimate</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "StorageEstimate"
  )
  interface Builder extends StorageEstimate {
    /**
     * The StorageEstimate dictionary's quota property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. This value is an estimate to help prevent its use for fingerprinting&mdash;that is, identifying a device using an amalgamation of the values of seemingly innocuous properties.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/quota">StorageEstimate.quota - MDN</a>
     * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-quota">quota - Storage</a>
     */
    @JsOverlay
    @Nonnull
    default Builder quota(final int quota) {
      setQuota( quota );
      return this;
    }

    /**
     * The StorageEstimate dictionary's usage property is a conservative approximation of how much storage is allotted to the origin or Web app that called StorageManager.estimate(); there may be more space available, but there will not be less. The value is an estimate because the user agent may use compression, duplication prevention techniques, and other methods to improve storage efficiency.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEstimate/usage">StorageEstimate.usage - MDN</a>
     * @see <a href="https://storage.spec.whatwg.org/#dom-storageestimate-usage">usage - Storage</a>
     */
    @JsOverlay
    @Nonnull
    default Builder usage(final int usage) {
      setUsage( usage );
      return this;
    }
  }
}
