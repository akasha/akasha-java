package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The TextTrackCueList array-like object represents a dynamically updating list of TextTrackCue objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackCueList">TextTrackCueList - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/media.html#texttrackcuelist">(HTML) # texttrackcuelist</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextTrackCueList"
)
public class TextTrackCueList extends JsObject {
  protected TextTrackCueList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsNullable
  public native TextTrackCue getCueById(@Nonnull String id);

  @JsOverlay
  @JsNonNull
  public final TextTrackCue getAt(final int index) {
    return Js.<JsArrayLike<TextTrackCue>>cast( this ).getAt( index );
  }
}
