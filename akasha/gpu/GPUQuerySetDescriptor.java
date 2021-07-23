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
  static Builder create(@GPUQueryType @Nonnull final String type, final int count) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).type( type ).count( count );
  }

  @JsProperty(
      name = "type"
  )
  @GPUQueryType
  @Nonnull
  String type();

  @JsProperty
  void setType(@GPUQueryType @Nonnull String type);

  @JsProperty(
      name = "count"
  )
  int count();

  @JsProperty
  void setCount(int count);

  @JsProperty(
      name = "pipelineStatistics"
  )
  JsArray<String> pipelineStatistics();

  @JsProperty
  void setPipelineStatistics(@Nonnull JsArray<String> pipelineStatistics);

  @JsOverlay
  default void setPipelineStatistics(@Nonnull final String... pipelineStatistics) {
    setPipelineStatistics( Js.<JsArray<String>>uncheckedCast( pipelineStatistics ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUQuerySetDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUQuerySetDescriptor {
    @JsOverlay
    @Nonnull
    default Builder type(@GPUQueryType @Nonnull final String type) {
      setType( type );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder count(final int count) {
      setCount( count );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder pipelineStatistics(@Nonnull final JsArray<String> pipelineStatistics) {
      setPipelineStatistics( pipelineStatistics );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder pipelineStatistics(@Nonnull final String... pipelineStatistics) {
      setPipelineStatistics( pipelineStatistics );
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
