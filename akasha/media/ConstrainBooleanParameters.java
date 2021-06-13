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
 * The ConstrainBoolean dictionary is used to specify a constraint for a property whose value is a Boolean value. You can specify an exact value which must be matched, an ideal value that should be matched if at all possible, and a fallback value to attempt to match once all more specific constraints have been applied.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainBooleanParameters">ConstrainBooleanParameters - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-constrainboolean"># dom-constrainboolean</a>
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
  static Builder create() {
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
   * The ConstrainBoolean dictionary is used to specify a constraint for a property whose value is a Boolean value. You can specify an exact value which must be matched, an ideal value that should be matched if at all possible, and a fallback value to attempt to match once all more specific constraints have been applied.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainBooleanParameters">ConstrainBooleanParameters - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-constrainboolean"># dom-constrainboolean</a>
   */
  @Generated("org.realityforge.webtack")
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
