package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MimeType interface provides contains information about a MIME type associated with a particular plugin. Navigator.mimeTypes returns an array of this object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MimeType">MimeType - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/obsolete.html#mimetype">(HTML) # mimetype</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MimeType"
)
public class MimeType extends JsObject {
  protected MimeType() {
  }

  @JsProperty(
      name = "description"
  )
  @Nonnull
  public native String description();

  @JsProperty(
      name = "enabledPlugin"
  )
  @Nonnull
  public native Plugin enabledPlugin();

  @JsProperty(
      name = "suffixes"
  )
  @Nonnull
  public native String suffixes();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();
}
