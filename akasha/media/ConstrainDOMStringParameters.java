package akasha.media;

import akasha.StringOrStringArrayUnion;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The ConstrainDOMString dictionary is used to specify a constraint for a property whose value is a string. It allows you to specify one or more exact string values from which one must be the parameter's value, or a set of ideal values which should be used if possible. You can also specify a single string (or an array of strings) which the user agent will do its best to match once all more stringent constraints have been applied.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainDOMStringParameters">ConstrainDOMStringParameters - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-constraindomstring"># dom-constraindomstring</a>
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
  void setExact(@Nonnull StringOrStringArrayUnion exact);

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
  void setIdeal(@Nonnull StringOrStringArrayUnion ideal);

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
   * The ConstrainDOMString dictionary is used to specify a constraint for a property whose value is a string. It allows you to specify one or more exact string values from which one must be the parameter's value, or a set of ideal values which should be used if possible. You can also specify a single string (or an array of strings) which the user agent will do its best to match once all more stringent constraints have been applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainDOMStringParameters">ConstrainDOMStringParameters - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-constraindomstring"># dom-constraindomstring</a>
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
