package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Comment interface represents textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Comment">Comment - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-comment">(DOM) # interface-comment</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Comment"
)
public class Comment extends CharacterData {
  /**
   * The Comment() constructor returns a newly created Comment object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Comment/Comment">Comment.Comment - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-comment-comment">Comment: Comment - DOM</a>
   */
  public Comment(@Nonnull final String data) {
  }

  /**
   * The Comment() constructor returns a newly created Comment object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Comment/Comment">Comment.Comment - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-comment-comment">Comment: Comment - DOM</a>
   */
  public Comment() {
  }
}
