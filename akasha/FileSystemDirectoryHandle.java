package akasha;

import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The FileSystemDirectoryHandle interface of the File System Access API provides a handle to a file system directory. The interface is accessed via the window.showDirectoryPicker() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileSystemDirectoryHandle">FileSystemDirectoryHandle - MDN</a>
 * @see <a href="https://wicg.github.io/file-system-access/#api-filesystemdirectoryhandle"># api-filesystemdirectoryhandle</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileSystemDirectoryHandle"
)
public class FileSystemDirectoryHandle extends FileSystemHandle {
  protected FileSystemDirectoryHandle() {
  }

  @JsNonNull
  public native Promise<FileSystemDirectoryHandle> getDirectoryHandle(@Nonnull String name,
      @Nonnull FileSystemGetDirectoryOptions options);

  @JsNonNull
  public native Promise<FileSystemDirectoryHandle> getDirectoryHandle(@Nonnull String name);

  @JsNonNull
  public native Promise<FileSystemFileHandle> getFileHandle(@Nonnull String name,
      @Nonnull FileSystemGetFileOptions options);

  @JsNonNull
  public native Promise<FileSystemFileHandle> getFileHandle(@Nonnull String name);

  @JsNonNull
  public native Promise<Void> removeEntry(@Nonnull String name,
      @Nonnull FileSystemRemoveOptions options);

  @JsNonNull
  public native Promise<Void> removeEntry(@Nonnull String name);

  @JsNonNull
  public native Promise<JsArray<String>> resolve(@Nonnull FileSystemHandle possibleDescendant);
}
