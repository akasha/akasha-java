package akasha;

import akasha.core.ArrayBuffer;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The FileReaderSync interface allows to read File or Blob objects synchronously.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileReaderSync">FileReaderSync - MDN</a>
 * @see <a href="https://w3c.github.io/FileAPI/#FileReaderSync"># FileReaderSync</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileReaderSync"
)
public class FileReaderSync extends JsObject {
  public FileReaderSync() {
  }

  @JsNonNull
  public native ArrayBuffer readAsArrayBuffer(@Nonnull Blob blob);

  @JsNonNull
  public native String readAsBinaryString(@Nonnull Blob blob);

  @JsNonNull
  public native String readAsDataURL(@Nonnull Blob blob);

  @JsNonNull
  public native String readAsText(@Nonnull Blob blob, @Nonnull String encoding);

  @JsNonNull
  public native String readAsText(@Nonnull Blob blob);
}
