package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPUBindGroupDescriptor"
)
@ApiStatus.Experimental
public interface GPUBindGroupDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Step1 layout(@Nonnull final GPUBindGroupLayout layout) {
    final Builder $gpuBindGroupDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuBindGroupDescriptor.setLayout( layout );
    return Js.uncheckedCast( $gpuBindGroupDescriptor );
  }

  @JsProperty(
      name = "layout"
  )
  @JsNonNull
  GPUBindGroupLayout layout();

  @JsProperty
  void setLayout(@JsNonNull GPUBindGroupLayout layout);

  @JsProperty(
      name = "entries"
  )
  @JsNonNull
  JsArray<GPUBindGroupEntry> entries();

  @JsProperty
  void setEntries(@JsNonNull JsArray<GPUBindGroupEntry> entries);

  @JsOverlay
  default void setEntries(@Nonnull final GPUBindGroupEntry... entries) {
    setEntries( Js.<JsArray<GPUBindGroupEntry>>uncheckedCast( entries ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupDescriptor"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder entries(@Nonnull JsArray<GPUBindGroupEntry> entries) {
      Js.<GPUBindGroupDescriptor>uncheckedCast( this ).setEntries( entries );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Builder entries(@Nonnull GPUBindGroupEntry... entries) {
      Js.<GPUBindGroupDescriptor>uncheckedCast( this ).setEntries( entries );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBindGroupDescriptor {
    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
