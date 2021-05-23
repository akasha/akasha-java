package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MimeTypeArray interface returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MimeTypeArray">MimeTypeArray - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#mimetypearray">MimeTypeArray - HTML Living Standard</a>
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

  @Nullable
  public native JsObject namedItem(@Nonnull String name);

  @HasNoSideEffects
  @Nullable
  public native JsObject item(int index);
}
