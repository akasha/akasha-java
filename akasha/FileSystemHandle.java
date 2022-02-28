package akasha;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The FileSystemHandle interface of the File System Access API is an object which represents a file or directory entry. Multiple handles can represent the same entry. For the most part you do not work with FileSystemHandle directly but rather its child interfaces FileSystemFileHandle and FileSystemDirectoryHandle.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileSystemHandle">FileSystemHandle - MDN</a>
 * @see <a href="https://wicg.github.io/file-system-access/#api-filesystemhandle"># api-filesystemhandle</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileSystemHandle"
)
public class FileSystemHandle extends JsObject {
  protected FileSystemHandle() {
  }

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  @FileSystemHandleKind
  public native String kind();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsNonNull
  public native Promise<Boolean> isSameEntry(@Nonnull FileSystemHandle other);
}
