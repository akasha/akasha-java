package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The MediaTrackConstraints dictionary is used to describe a set of capabilities and the value or values each can take on. A constraints dictionary is passed into applyConstraints() to allow a script to establish a set of exact (required) values or ranges and/or preferred values or ranges of values for the track, and the most recently-requested set of custom constraints can be retrieved by calling getConstraints().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainBooleanParameters">ConstrainBooleanParameters - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatrackconstraints"># dom-mediatrackconstraints</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ConstrainBooleanParameters"
)
public interface ConstrainBooleanParameters {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "exact"
  )
  boolean exact();

  @JsProperty
  void setExact(boolean exact);

  @JsProperty(
      name = "ideal"
  )
  boolean ideal();

  @JsProperty
  void setIdeal(boolean ideal);

  /**
   * The MediaTrackConstraints dictionary is used to describe a set of capabilities and the value or values each can take on. A constraints dictionary is passed into applyConstraints() to allow a script to establish a set of exact (required) values or ranges and/or preferred values or ranges of values for the track, and the most recently-requested set of custom constraints can be retrieved by calling getConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainBooleanParameters">ConstrainBooleanParameters - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatrackconstraints"># dom-mediatrackconstraints</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ConstrainBooleanParameters"
  )
  interface Builder extends ConstrainBooleanParameters {
    @JsOverlay
    @Nonnull
    default Builder exact(final boolean exact) {
      setExact( exact );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ideal(final boolean ideal) {
      setIdeal( ideal );
      return this;
    }
  }
}
