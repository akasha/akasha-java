package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CaretPosition interface represents the caret position, an indicator for the text insertion point. You can get a CaretPosition using the Document.caretPositionFromPoint() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CaretPosition">CaretPosition - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#caret-position">CaretPosition - CSS Object Model (CSSOM) View Module</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CaretPosition"
)
public class CaretPosition {
  protected CaretPosition() {
  }

  @JsProperty(
      name = "offset"
  )
  public native int offset();

  @JsProperty(
      name = "offsetNode"
  )
  @Nonnull
  public native Node offsetNode();

  @Nullable
  public native DOMRect getClientRect();
}
