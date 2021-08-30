package akasha.xr;

import akasha.PermissionDescriptor;
import akasha.PermissionName;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRPermissionDescriptor"
)
public interface XRPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(@PermissionName @Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  /**
   * The mode property of the XRPermissionDescriptor dictionary is a string taken from the XRSessionMode enumerated type, specifying which Web XR session mode (inline, immersive-vr, or immersive-ar) the described permissions will be used for.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/mode">XRPermissionDescriptor.mode - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-mode">XRPermissionDescriptor.mode - WebXR Device API</a>
   */
  @JsProperty(
      name = "mode"
  )
  @XRSessionMode
  String mode();

  /**
   * The mode property of the XRPermissionDescriptor dictionary is a string taken from the XRSessionMode enumerated type, specifying which Web XR session mode (inline, immersive-vr, or immersive-ar) the described permissions will be used for.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/mode">XRPermissionDescriptor.mode - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-mode">XRPermissionDescriptor.mode - WebXR Device API</a>
   */
  @JsProperty
  void setMode(@XRSessionMode @JsNonNull String mode);

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">XRPermissionDescriptor.optionalFeatures - WebXR Device API</a>
   */
  @JsProperty(
      name = "optionalFeatures"
  )
  JsArray<Any> optionalFeatures();

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">XRPermissionDescriptor.optionalFeatures - WebXR Device API</a>
   */
  @JsProperty
  void setOptionalFeatures(@JsNonNull JsArray<Any> optionalFeatures);

  /**
   * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">XRPermissionDescriptor.optionalFeatures - WebXR Device API</a>
   */
  @JsOverlay
  default void setOptionalFeatures(@Nonnull final Any... optionalFeatures) {
    setOptionalFeatures( Js.<JsArray<Any>>uncheckedCast( optionalFeatures ) );
  }

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">XRPermissionDescriptor.requiredFeatures - WebXR Device API</a>
   */
  @JsProperty(
      name = "requiredFeatures"
  )
  JsArray<Any> requiredFeatures();

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">XRPermissionDescriptor.requiredFeatures - WebXR Device API</a>
   */
  @JsProperty
  void setRequiredFeatures(@JsNonNull JsArray<Any> requiredFeatures);

  /**
   * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">XRPermissionDescriptor.requiredFeatures - WebXR Device API</a>
   */
  @JsOverlay
  default void setRequiredFeatures(@Nonnull final Any... requiredFeatures) {
    setRequiredFeatures( Js.<JsArray<Any>>uncheckedCast( requiredFeatures ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRPermissionDescriptor"
  )
  interface Builder extends XRPermissionDescriptor {
    /**
     * The mode property of the XRPermissionDescriptor dictionary is a string taken from the XRSessionMode enumerated type, specifying which Web XR session mode (inline, immersive-vr, or immersive-ar) the described permissions will be used for.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/mode">XRPermissionDescriptor.mode - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-mode">XRPermissionDescriptor.mode - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder mode(@XRSessionMode @Nonnull final String mode) {
      setMode( mode );
      return this;
    }

    /**
     * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">XRPermissionDescriptor.optionalFeatures - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder optionalFeatures(@Nonnull final JsArray<Any> optionalFeatures) {
      setOptionalFeatures( optionalFeatures );
      return this;
    }

    /**
     * The XRPermissionDescriptor dictionary's optionalFeatures property is used to specify a list of WebXR features which your app or site would like to use but can operate without if permission isn't granted to use them.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/optionalFeatures">XRPermissionDescriptor.optionalFeatures - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-optionalfeatures">XRPermissionDescriptor.optionalFeatures - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder optionalFeatures(@Nonnull final Any... optionalFeatures) {
      setOptionalFeatures( optionalFeatures );
      return this;
    }

    /**
     * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">XRPermissionDescriptor.requiredFeatures - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder requiredFeatures(@Nonnull final JsArray<Any> requiredFeatures) {
      setRequiredFeatures( requiredFeatures );
      return this;
    }

    /**
     * The XRPermissionDescriptor dictionary's requiredFeatures property should be set prior to calling navigator.permissions.query() to a list of WebXR features which must be supported for the app to work.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRPermissionDescriptor/requiredFeatures">XRPermissionDescriptor.requiredFeatures - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrpermissiondescriptor-requiredfeatures">XRPermissionDescriptor.requiredFeatures - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder requiredFeatures(@Nonnull final Any... requiredFeatures) {
      setRequiredFeatures( requiredFeatures );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder name(@PermissionName @Nonnull final String name) {
      setName( name );
      return this;
    }
  }
}
