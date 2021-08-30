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
 * The Plugin interface provides information about a browser plugin.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Plugin">Plugin - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/obsolete.html#dom-plugin">(HTML) # dom-plugin</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Plugin"
)
public class Plugin extends JsObject {
  protected Plugin() {
  }

  @JsProperty(
      name = "description"
  )
  @Nonnull
  public native String description();

  @JsProperty(
      name = "filename"
  )
  @Nonnull
  public native String filename();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @HasNoSideEffects
  @JsNullable
  public native MimeType item(int index);

  @HasNoSideEffects
  @JsNullable
  public native MimeType namedItem(@Nonnull String name);
}
