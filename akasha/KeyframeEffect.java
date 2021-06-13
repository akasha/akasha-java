package akasha;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The KeyframeEffect interface of the Web Animations API lets us create sets of animatable properties and values, called keyframes. These can then be played using the Animation() constructor.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect">KeyframeEffect - MDN</a>
 * @see <a href="https://drafts.csswg.org/web-animations-1/#the-keyframeeffect-interface">KeyframeEffect - Web Animations</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "KeyframeEffect"
)
public class KeyframeEffect extends AnimationEffect {
  /**
   * The composite property of a KeyframeEffect resolves how an element's animation impacts its underlying property values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/composite">KeyframeEffect.composite - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-composite">KeyframeEffect.composite - Web Animations</a>
   */
  @Nonnull
  @CompositeOperation
  public String composite;

  @Nullable
  public String pseudoElement;

  /**
   * The target property of a KeyframeEffect interface represents the element or pseudo-element being animated. It may be null for animations that do not target a specific element. It performs as both a getter and a setter, except with animations and transitions generated by CSS.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/target">KeyframeEffect.target - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-target">keyframeEffect - Web Animations</a>
   */
  @Nullable
  public Element target;

  /**
   * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also allows you to clone an existing keyframe effect object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/KeyframeEffect">KeyframeEffect.KeyframeEffect - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-2/#dom-keyframeeffect-iterationcomposite">KeyframeEffectOptions.iterationComposite - Web Animations Level 2</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-keyframeeffect">keyframeEffect() - Web Animations</a>
   */
  public KeyframeEffect(@Nullable final Element target, @Nullable final JsObject keyframes,
      final double options) {
  }

  /**
   * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also allows you to clone an existing keyframe effect object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/KeyframeEffect">KeyframeEffect.KeyframeEffect - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-2/#dom-keyframeeffect-iterationcomposite">KeyframeEffectOptions.iterationComposite - Web Animations Level 2</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-keyframeeffect">keyframeEffect() - Web Animations</a>
   */
  public KeyframeEffect(@Nullable final Element target, @Nullable final JsObject keyframes,
      @Nonnull final KeyframeEffectOptions options) {
  }

  /**
   * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also allows you to clone an existing keyframe effect object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/KeyframeEffect">KeyframeEffect.KeyframeEffect - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-2/#dom-keyframeeffect-iterationcomposite">KeyframeEffectOptions.iterationComposite - Web Animations Level 2</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-keyframeeffect">keyframeEffect() - Web Animations</a>
   */
  public KeyframeEffect(@Nullable final Element target, @Nullable final JsObject keyframes) {
  }

  /**
   * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also allows you to clone an existing keyframe effect object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/KeyframeEffect">KeyframeEffect.KeyframeEffect - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-2/#dom-keyframeeffect-iterationcomposite">KeyframeEffectOptions.iterationComposite - Web Animations Level 2</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-keyframeeffect">keyframeEffect() - Web Animations</a>
   */
  public KeyframeEffect(@Nonnull final KeyframeEffect source) {
  }

  /**
   * The getKeyframes() method of a KeyframeEffect returns an Array of the computed keyframes that make up this animation along with their computed offsets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/getKeyframes">KeyframeEffect.getKeyframes - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-getkeyframes">KeyframeEffect.getKeyframes() - Web Animations</a>
   */
  @Nonnull
  public native JsArray<JsObject> getKeyframes();

  /**
   * The setKeyframes() method of the KeyframeEffect interface replaces the keyframes that make up the affected KeyframeEffect with a new set of keyframes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/KeyframeEffect/setKeyframes">KeyframeEffect.setKeyframes - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-keyframeeffect-setkeyframes">KeyframeEffect.setKeyframes() - Web Animations</a>
   */
  public native void setKeyframes(@Nullable JsObject keyframes);
}
