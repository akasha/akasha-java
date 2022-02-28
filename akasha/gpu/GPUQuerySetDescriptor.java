package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "GPUQuerySetDescriptor"
)
@ApiStatus.Experimental
public interface GPUQuerySetDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Step1 type(@GPUQueryType @Nonnull final String type) {
    final Builder $gpuQuerySetDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuQuerySetDescriptor.setType( type );
    return Js.uncheckedCast( $gpuQuerySetDescriptor );
  }

  @JsProperty(
      name = "type"
  )
  @GPUQueryType
  @JsNonNull
  String type();

  @JsProperty
  void setType(@GPUQueryType @JsNonNull String type);

  @JsProperty(
      name = "count"
  )
  int count();

  @JsProperty
  void setCount(int count);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUQuerySetDescriptor"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder count(int count) {
      Js.<GPUQuerySetDescriptor>uncheckedCast( this ).setCount( count );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUQuerySetDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUQuerySetDescriptor {
    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
