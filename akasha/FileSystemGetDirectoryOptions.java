package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileSystemGetDirectoryOptions"
)
public interface FileSystemGetDirectoryOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "create"
  )
  boolean create();

  @JsProperty
  void setCreate(boolean create);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FileSystemGetDirectoryOptions"
  )
  interface Builder extends FileSystemGetDirectoryOptions {
    @JsOverlay
    @Nonnull
    default Builder create(final boolean create) {
      setCreate( create );
      return this;
    }
  }
}
