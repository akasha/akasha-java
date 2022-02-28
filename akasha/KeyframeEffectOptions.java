package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also allows you to clone an existing keyframe effect object instance.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffectOptions">KeyframeEffectOptions - MDN</a>
 * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-keyframeeffect"># dom-keyframeeffect-keyframeeffect</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "KeyframeEffectOptions"
)
public interface KeyframeEffectOptions extends EffectTiming {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "composite"
  )
  @CompositeOperation
  String composite();

  @JsProperty
  void setComposite(@CompositeOperation @JsNonNull String composite);

  @JsProperty(
      name = "pseudoElement"
  )
  @JsNullable
  String pseudoElement();

  @JsProperty
  void setPseudoElement(@JsNullable String pseudoElement);

  /**
   * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also allows you to clone an existing keyframe effect object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffectOptions">KeyframeEffectOptions - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-keyframeeffect"># dom-keyframeeffect-keyframeeffect</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "KeyframeEffectOptions"
  )
  interface Builder extends KeyframeEffectOptions {
    @JsOverlay
    @Nonnull
    default Builder composite(@CompositeOperation @Nonnull final String composite) {
      setComposite( composite );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder pseudoElement(@Nonnull final String pseudoElement) {
      setPseudoElement( pseudoElement );
      return this;
    }

    /**
     * The EffectTiming dictionary's delay property in the Web Animations API represents the number of milliseconds to delay the start of the animation.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/delay">EffectTiming.delay - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-effecttiming-delay">delay - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder delay(final double delay) {
      setDelay( delay );
      return this;
    }

    /**
     * The direction property of the Web Animations API dictionary EffectTiming indicates an animation's playback direction along its timeline, as well as its behavior when it reaches the end of an iteration
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/direction">EffectTiming.direction - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#enumdef-playbackdirection">direction - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder direction(@PlaybackDirection @Nonnull final String direction) {
      setDirection( direction );
      return this;
    }

    /**
     * The duration property of the dictionary EffectTiming in the Web Animations API specifies the duration in milliseconds that a single iteration (from beginning to end) the animation should take to complete.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/duration">EffectTiming.duration - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#iteration-duration">duration - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder duration(@Nonnull final UnrestrictedDoubleOrStringUnion duration) {
      setDuration( duration );
      return this;
    }

    /**
     * The duration property of the dictionary EffectTiming in the Web Animations API specifies the duration in milliseconds that a single iteration (from beginning to end) the animation should take to complete.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/duration">EffectTiming.duration - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#iteration-duration">duration - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder duration(final double duration) {
      setDuration( duration );
      return this;
    }

    /**
     * The duration property of the dictionary EffectTiming in the Web Animations API specifies the duration in milliseconds that a single iteration (from beginning to end) the animation should take to complete.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/duration">EffectTiming.duration - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#iteration-duration">duration - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder duration(@Nonnull final String duration) {
      setDuration( duration );
      return this;
    }

    /**
     * The EffectTiming dictionary's easing property in the Web Animations API specifies the timing function used to scale the time to produce easing effects, where easing is the rate of the animation's change over time.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/easing">EffectTiming.easing - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#time-transformations">easing - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder easing(@Nonnull final String easing) {
      setEasing( easing );
      return this;
    }

    /**
     * The endDelay property of the EffectTiming dictionary (part of the Web Animations API) indicates the number of milliseconds to delay after the active period of an animation sequence. The animation's end time&mdash;the time at which an iteration is considered to have finished&mdash;is the time at which the animation finishes an iteration (its initial delay, AnimationEffectTimingReadOnly.delay, plus its duration,duration, plus its end delay.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/endDelay">EffectTiming.endDelay - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#end-delay">endDelay - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder endDelay(final double endDelay) {
      setEndDelay( endDelay );
      return this;
    }

    /**
     * The Web Animations API's EffectTiming dictionary's fill property specifies a fill mode, which defines how the element to which the animation is applied should look when the animation sequence is not actively running, such as before the time specified by iterationStart or after animation's end time.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/fill">EffectTiming.fill - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#enumdef-fillmode">fill - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder fill(@FillMode @Nonnull final String fill) {
      setFill( fill );
      return this;
    }

    /**
     * Web Animations API's EffectTiming dictionary's  iterationStart property specifies the repetition number which repetition the animation begins at and its progress through it.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/iterationStart">EffectTiming.iterationStart - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#iteration-start">iterationStart - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder iterationStart(final double iterationStart) {
      setIterationStart( iterationStart );
      return this;
    }

    /**
     * The Web Animations API dictionary EffectTiming's iterations property specifies the number of times the animation should repeat. The default value is 1, indicating that it should only play once, but you can set it to any floating-point value (including positive Infinity defaults to 1, and can also take a value of Infinity to make it loop infinitely.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EffectTiming/iterations">EffectTiming.iterations - MDN</a>
     * @see <a href="https://drafts.csswg.org/web-animations-1/#iteration-count">iterations - Web Animations</a>
     */
    @JsOverlay
    @Nonnull
    default Builder iterations(final double iterations) {
      setIterations( iterations );
      return this;
    }
  }
}
