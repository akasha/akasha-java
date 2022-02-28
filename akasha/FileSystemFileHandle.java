package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The FileSystemFileHandle interface of the File System Access API represents a handle to a file system entry. The interface is accessed through the window.showOpenFilePicker() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileSystemFileHandle">FileSystemFileHandle - MDN</a>
 * @see <a href="https://wicg.github.io/file-system-access/#api-filesystemfilehandle"># api-filesystemfilehandle</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileSystemFileHandle"
)
public class FileSystemFileHandle extends FileSystemHandle {
  protected FileSystemFileHandle() {
  }

  @JsNonNull
  public native Promise<FileSystemWritableFileStream> createWritable(
      @Nonnull FileSystemCreateWritableOptions options);

  @JsNonNull
  public native Promise<FileSystemWritableFileStream> createWritable();

  @JsNonNull
  public native Promise<File> getFile();
}
