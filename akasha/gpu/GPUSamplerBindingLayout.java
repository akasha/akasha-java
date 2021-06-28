package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUSamplerBindingLayout"
)
@ApiStatus.Experimental
public interface GPUSamplerBindingLayout {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "type"
  )
  @GPUSamplerBindingType
  String type();

  @JsProperty
  void setType(@GPUSamplerBindingType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUSamplerBindingLayout"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUSamplerBindingLayout {
    @JsOverlay
    @Nonnull
    default Builder type(@GPUSamplerBindingType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
