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
  static Builder create(@Nonnull final GPUBindGroupLayout layout,
      @Nonnull final JsArray<GPUBindGroupEntry> entries) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).layout( layout ).entries( entries );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUBindGroupLayout layout,
      @Nonnull final GPUBindGroupEntry[] entries) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).layout( layout ).entries( entries );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBindGroupDescriptor {
    @JsOverlay
    @Nonnull
    default Builder layout(@Nonnull final GPUBindGroupLayout layout) {
      setLayout( layout );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder entries(@Nonnull final JsArray<GPUBindGroupEntry> entries) {
      setEntries( entries );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder entries(@Nonnull final GPUBindGroupEntry... entries) {
      setEntries( entries );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
