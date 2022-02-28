package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MimeTypeArray interface returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by Navigator.mimeTypes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MimeTypeArray">MimeTypeArray - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/obsolete.html#mimetypearray"># mimetypearray</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MimeTypeArray"
)
public class MimeTypeArray extends JsObject {
  protected MimeTypeArray() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @HasNoSideEffects
  @JsNullable
  public native MimeType item(int index);

  @HasNoSideEffects
  @JsNullable
  public native MimeType namedItem(@Nonnull String name);
}
