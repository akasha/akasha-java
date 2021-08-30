package akasha.media;

import akasha.StringOrStringArrayUnion;
import akasha.lang.JsArray;
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
 * The MediaTrackConstraints dictionary is used to describe a set of capabilities and the value or values each can take on. A constraints dictionary is passed into applyConstraints() to allow a script to establish a set of exact (required) values or ranges and/or preferred values or ranges of values for the track, and the most recently-requested set of custom constraints can be retrieved by calling getConstraints().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainDOMStringParameters">ConstrainDOMStringParameters - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatrackconstraints"># dom-mediatrackconstraints</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ConstrainDOMStringParameters"
)
public interface ConstrainDOMStringParameters {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "exact"
  )
  StringOrStringArrayUnion exact();

  @JsProperty
  void setExact(@JsNonNull StringOrStringArrayUnion exact);

  @JsOverlay
  default void setExact(@Nonnull final String exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  default void setExact(@Nonnull final JsArray<String> exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  default void setExact(@Nonnull final String... exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsProperty(
      name = "ideal"
  )
  StringOrStringArrayUnion ideal();

  @JsProperty
  void setIdeal(@JsNonNull StringOrStringArrayUnion ideal);

  @JsOverlay
  default void setIdeal(@Nonnull final String ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  default void setIdeal(@Nonnull final JsArray<String> ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  default void setIdeal(@Nonnull final String... ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  /**
   * The MediaTrackConstraints dictionary is used to describe a set of capabilities and the value or values each can take on. A constraints dictionary is passed into applyConstraints() to allow a script to establish a set of exact (required) values or ranges and/or preferred values or ranges of values for the track, and the most recently-requested set of custom constraints can be retrieved by calling getConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainDOMStringParameters">ConstrainDOMStringParameters - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatrackconstraints"># dom-mediatrackconstraints</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ConstrainDOMStringParameters"
  )
  interface Builder extends ConstrainDOMStringParameters {
    @JsOverlay
    @Nonnull
    default Builder exact(@Nonnull final String exact) {
      setExact( exact );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder exact(@Nonnull final JsArray<String> exact) {
      setExact( exact );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder exact(@Nonnull final String... exact) {
      setExact( exact );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ideal(@Nonnull final String ideal) {
      setIdeal( ideal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ideal(@Nonnull final JsArray<String> ideal) {
      setIdeal( ideal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ideal(@Nonnull final String... ideal) {
      setIdeal( ideal );
      return this;
    }
  }
}
