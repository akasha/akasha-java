package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOM CompositionEvent represents events that occur due to the user indirectly entering text.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent">CompositionEvent - MDN</a>
 * @see <a href="https://w3c.github.io/uievents/#interface-compositionevent"># interface-compositionevent</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CompositionEvent"
)
public class CompositionEvent extends UIEvent {
  /**
   * The CompositionEvent() constructor creates a new CompositionEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/CompositionEvent">CompositionEvent.CompositionEvent - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#dom-compositionevent-compositionevent">CompositionEvent() - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  public CompositionEvent(@Nonnull final String type,
      @Nonnull final CompositionEventInit eventInitDict) {
    super( null );
  }

  /**
   * The CompositionEvent() constructor creates a new CompositionEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/CompositionEvent">CompositionEvent.CompositionEvent - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#dom-compositionevent-compositionevent">CompositionEvent() - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  public CompositionEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The data read-only property of the CompositionEvent interface returns the characters generated by the input method that raised the event; its exact nature varies depending on the type of event that generated the CompositionEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent/data">CompositionEvent.data - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#dom-compositionevent-data">data - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native String data();
}
