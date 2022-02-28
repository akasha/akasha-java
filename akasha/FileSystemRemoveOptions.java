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
    name = "FileSystemRemoveOptions"
)
public interface FileSystemRemoveOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "recursive"
  )
  boolean recursive();

  @JsProperty
  void setRecursive(boolean recursive);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FileSystemRemoveOptions"
  )
  interface Builder extends FileSystemRemoveOptions {
    @JsOverlay
    @Nonnull
    default Builder recursive(final boolean recursive) {
      setRecursive( recursive );
      return this;
    }
  }
}
