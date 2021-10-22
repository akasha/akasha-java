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
    name = "FilePropertyBag"
)
public interface FilePropertyBag extends BlobPropertyBag {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "lastModified"
  )
  int lastModified();

  @JsProperty
  void setLastModified(int lastModified);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FilePropertyBag"
  )
  interface Builder extends FilePropertyBag {
    @JsOverlay
    @Nonnull
    default Builder lastModified(final int lastModified) {
      setLastModified( lastModified );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder endings(@EndingType @Nonnull final String endings) {
      setEndings( endings );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
