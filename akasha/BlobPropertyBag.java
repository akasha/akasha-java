package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "BlobPropertyBag"
)
public interface BlobPropertyBag {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "endings"
  )
  @EndingType
  String endings();

  @JsProperty
  void setEndings(@EndingType @JsNonNull String endings);

  @JsProperty(
      name = "type"
  )
  String type();

  @JsProperty
  void setType(@JsNonNull String type);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BlobPropertyBag"
  )
  interface Builder extends BlobPropertyBag {
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
