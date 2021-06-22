package akasha.gpu;

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
    name = "GPUBlendComponent"
)
public interface GPUBlendComponent {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "dstFactor"
  )
  @GPUBlendFactor
  String dstFactor();

  @JsProperty
  void setDstFactor(@GPUBlendFactor @Nonnull String dstFactor);

  @JsProperty(
      name = "operation"
  )
  @GPUBlendOperation
  String operation();

  @JsProperty
  void setOperation(@GPUBlendOperation @Nonnull String operation);

  @JsProperty(
      name = "srcFactor"
  )
  @GPUBlendFactor
  String srcFactor();

  @JsProperty
  void setSrcFactor(@GPUBlendFactor @Nonnull String srcFactor);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBlendComponent"
  )
  interface Builder extends GPUBlendComponent {
    @JsOverlay
    @Nonnull
    default Builder dstFactor(@GPUBlendFactor @Nonnull final String dstFactor) {
      setDstFactor( dstFactor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder operation(@GPUBlendOperation @Nonnull final String operation) {
      setOperation( operation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder srcFactor(@GPUBlendFactor @Nonnull final String srcFactor) {
      setSrcFactor( srcFactor );
      return this;
    }
  }
}