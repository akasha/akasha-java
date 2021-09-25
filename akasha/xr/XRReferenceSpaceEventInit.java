package akasha.xr;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRReferenceSpaceEvent() constructor is used to create a new XRReferenceSpaceEvent object, which represents an event regarding the state of a WebXR reference space object, XRReferenceSpace.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit">XRReferenceSpaceEventInit - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-xrreferencespaceevent"># dom-xrreferencespaceevent-xrreferencespaceevent</a>
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
  static Builder referenceSpace(@Nonnull final XRReferenceSpace referenceSpace) {
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
  @JsNonNull
  XRReferenceSpace referenceSpace();

  /**
   * The XRReferenceSpaceEventInit property referenceSpace is used to establish the value of a newly-constructed XRReferenceSpaceEvent object when calling the XRReferenceSpaceEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/referenceSpace">XRReferenceSpaceEventInit.referenceSpace - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-referencespace">XRReferenceSpaceEventInit.referenceSpace - WebXR Device API</a>
   */
  @JsProperty
  void setReferenceSpace(@JsNonNull XRReferenceSpace referenceSpace);

  /**
   * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-transform">XRReferenceSpaceEventInit.transform - WebXR Device API</a>
   */
  @JsProperty(
      name = "transform"
  )
  @JsNullable
  XRRigidTransform transform();

  /**
   * The XRReferenceSpaceEventInit property transform indicates the position and orientation of the affected reference space's native origin after the changes the event represents are applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit/transform">XRReferenceSpaceEventInit.transform - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceeventinit-transform">XRReferenceSpaceEventInit.transform - WebXR Device API</a>
   */
  @JsProperty
  void setTransform(@JsNullable XRRigidTransform transform);

  /**
   * The XRReferenceSpaceEvent() constructor is used to create a new XRReferenceSpaceEvent object, which represents an event regarding the state of a WebXR reference space object, XRReferenceSpace.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit">XRReferenceSpaceEventInit - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrreferencespaceevent-xrreferencespaceevent"># dom-xrreferencespaceevent-xrreferencespaceevent</a>
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
