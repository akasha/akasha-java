package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPUBindGroupDescriptor"
)
public interface GPUBindGroupDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<GPUBindGroupEntry> entries,
      @Nonnull final GPUBindGroupLayout layout) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entries( entries ).layout( layout );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUBindGroupEntry[] entries,
      @Nonnull final GPUBindGroupLayout layout) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entries( entries ).layout( layout );
  }

  @JsProperty(
      name = "entries"
  )
  @Nonnull
  JsArray<GPUBindGroupEntry> entries();

  @JsProperty
  void setEntries(@Nonnull JsArray<GPUBindGroupEntry> entries);

  @JsOverlay
  default void setEntries(@Nonnull final GPUBindGroupEntry... entries) {
    setEntries( Js.<JsArray<GPUBindGroupEntry>>uncheckedCast( entries ) );
  }

  @JsProperty(
      name = "layout"
  )
  @Nonnull
  GPUBindGroupLayout layout();

  @JsProperty
  void setLayout(@Nonnull GPUBindGroupLayout layout);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupDescriptor"
  )
  interface Builder extends GPUBindGroupDescriptor {
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
    default Builder layout(@Nonnull final GPUBindGroupLayout layout) {
      setLayout( layout );
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
