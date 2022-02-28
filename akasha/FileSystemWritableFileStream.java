package akasha;

import akasha.core.BufferSource;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The FileSystemWritableFileStream interface of the File System Access API is a WritableStream object with additional convenience methods, which operates on a single file on disk. The interface is accessed through the FileSystemFileHandle.createWritable() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FileSystemWritableFileStream">FileSystemWritableFileStream - MDN</a>
 * @see <a href="https://wicg.github.io/file-system-access/#api-filesystemwritablefilestream"># api-filesystemwritablefilestream</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileSystemWritableFileStream"
)
public class FileSystemWritableFileStream extends WritableStream {
  protected FileSystemWritableFileStream() {
  }

  @JsNonNull
  public native Promise<Void> seek(int position);

  @JsNonNull
  public native Promise<Void> truncate(int size);

  @JsNonNull
  public native Promise<Void> write(@Nonnull FileSystemWriteChunkType data);

  @JsNonNull
  public native Promise<Void> write(@Nonnull BufferSource data);

  @JsNonNull
  public native Promise<Void> write(@Nonnull Blob data);

  @JsNonNull
  public native Promise<Void> write(@Nonnull String data);

  @JsNonNull
  public native Promise<Void> write(@Nonnull WriteParams data);
}
