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
    name = "FileSystemCreateWritableOptions"
)
public interface FileSystemCreateWritableOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "keepExistingData"
  )
  boolean keepExistingData();

  @JsProperty
  void setKeepExistingData(boolean keepExistingData);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FileSystemCreateWritableOptions"
  )
  interface Builder extends FileSystemCreateWritableOptions {
    @JsOverlay
    @Nonnull
    default Builder keepExistingData(final boolean keepExistingData) {
      setKeepExistingData( keepExistingData );
      return this;
    }
  }
}
