package akasha.audio;

import akasha.core.JsObject;
import akasha.core.Symbol;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The AudioWorkletGlobalScope interface of the Web Audio API represents a global execution context for user-supplied code, which defines custom AudioWorkletProcessor-derived classes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletGlobalScope">AudioWorkletGlobalScope - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioWorkletGlobalScope"># AudioWorkletGlobalScope</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "goog.global"
)
public final class AudioWorkletGlobal {
  private AudioWorkletGlobal() {
  }

  @JsProperty(
      name = "currentFrame"
  )
  public static native int currentFrame();

  @JsProperty(
      name = "currentTime"
  )
  public static native double currentTime();

  @JsProperty(
      name = "sampleRate"
  )
  public static native float sampleRate();

  /**
   * The registerProcessor method of the AudioWorkletGlobalScope interface registers a class constructor derived from AudioWorkletProcessor interface under a specified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioWorkletGlobalScope/registerProcessor">AudioWorkletGlobalScope.registerProcessor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioworkletglobalscope-registerprocessor">registerProcessor() - Web Audio API</a>
   */
  public static native void registerProcessor(@Nonnull String name,
      @Nonnull AudioWorkletProcessorConstructor processorCtor);

  /**
   * The hasOwnProperty() method returns a boolean indicating whether the object has the specified property as its own property (as opposed to inheriting it).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwnProperty">Object.hasOwnProperty - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.hasownproperty">(ECMAScript) # sec-object.prototype.hasownproperty</a>
   */
  @HasNoSideEffects
  public static native boolean hasOwnProperty(@Nonnull Symbol prop);

  /**
   * The hasOwnProperty() method returns a boolean indicating whether the object has the specified property as its own property (as opposed to inheriting it).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/hasOwnProperty">Object.hasOwnProperty - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.hasownproperty">(ECMAScript) # sec-object.prototype.hasownproperty</a>
   */
  @HasNoSideEffects
  public static native boolean hasOwnProperty(@Nonnull String prop);

  /**
   * The propertyIsEnumerable() method returns a Boolean indicating whether the specified property is enumerable and is the object's own property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/propertyIsEnumerable">Object.propertyIsEnumerable - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.propertyisenumerable">(ECMAScript) # sec-object.prototype.propertyisenumerable</a>
   */
  @HasNoSideEffects
  public static native boolean propertyIsEnumerable(@Nonnull String prop);

  /**
   * The isPrototypeOf() method checks if an object exists in another object's prototype chain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/isPrototypeOf">Object.isPrototypeOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.isprototypeof">(ECMAScript) # sec-object.prototype.isprototypeof</a>
   */
  @HasNoSideEffects
  public static native boolean isPrototypeOf(@Nonnull JsObject obj);

  /**
   * The valueOf() method returns the primitive value of the specified object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/valueOf">Object.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.valueof">(ECMAScript) # sec-object.prototype.valueof</a>
   */
  @JsMethod(
      name = "valueOf"
  )
  @JsNullable
  public static native Any valueOf_();

  /**
   * The toString() method returns a string representing the object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/toString">Object.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/fundamental-objects.html#sec-object.prototype.tostring">(ECMAScript) # sec-object.prototype.tostring</a>
   */
  @JsMethod(
      name = "toString"
  )
  @HasNoSideEffects
  @JsNonNull
  public static native String toString_();
}
