package akasha.xr;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRReferenceSpaceEventInit dictionary is used when calling the XRReferenceSpaceEvent() constructor to provide the values for its properties. Since the properties are read-only, this is the only opportunity available to set their values.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit">XRReferenceSpaceEventInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrreferencespaceeventinit">XRReferenceSpaceEventInit - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRReferenceSpaceEventInit"
)
public interface XRReferenceSpaceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final XRReferenceSpace referenceSpace) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).referenceSpace( referenceSpace );
  }

  /**
   * The XRReferenceSpaceEventInit property referenceSpace is used to establish the value of a newly-constructed XRReferenceSpaceEvent object when calling the XRReferenceSpaceEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/referenceSpace">XRReferenceSpaceEventInit.referenceSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-referencespace">XRReferenceSpaceEventInit.referenceSpace - WebXR Device API</a>
   */
  @JsProperty(
      name = "referenceSpace"
  )
  @Nonnull
  XRReferenceSpace referenceSpace();

  /**
   * The XRReferenceSpaceEventInit property referenceSpace is used to establish the value of a newly-constructed XRReferenceSpaceEvent object when calling the XRReferenceSpaceEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/referenceSpace">XRReferenceSpaceEventInit.referenceSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-referencespace">XRReferenceSpaceEventInit.referenceSpace - WebXR Device API</a>
   */
  @JsProperty
  void setReferenceSpace(@Nonnull XRReferenceSpace referenceSpace);

  /**
   * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-transform">XRReferenceSpaceEventInit.transform - WebXR Device API</a>
   */
  @JsProperty(
      name = "transform"
  )
  @Nullable
  XRRigidTransform transform();

  /**
   * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-transform">XRReferenceSpaceEventInit.transform - WebXR Device API</a>
   */
  @JsProperty
  void setTransform(@Nullable XRRigidTransform transform);

  /**
   * The XRReferenceSpaceEventInit dictionary is used when calling the XRReferenceSpaceEvent() constructor to provide the values for its properties. Since the properties are read-only, this is the only opportunity available to set their values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit">XRReferenceSpaceEventInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dictdef-xrreferencespaceeventinit">XRReferenceSpaceEventInit - WebXR Device API</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRReferenceSpaceEventInit"
  )
  interface Builder extends XRReferenceSpaceEventInit {
    /**
     * The XRReferenceSpaceEventInit property referenceSpace is used to establish the value of a newly-constructed XRReferenceSpaceEvent object when calling the XRReferenceSpaceEvent() constructor.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/referenceSpace">XRReferenceSpaceEventInit.referenceSpace - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-referencespace">XRReferenceSpaceEventInit.referenceSpace - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder referenceSpace(@Nonnull final XRReferenceSpace referenceSpace) {
      setReferenceSpace( referenceSpace );
      return this;
    }

    /**
     * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
     * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-transform">XRReferenceSpaceEventInit.transform - WebXR Device API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder transform(@Nullable final XRRigidTransform transform) {
      setTransform( transform );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
