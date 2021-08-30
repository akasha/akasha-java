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
    name = "GPURenderPassDescriptor"
)
@ApiStatus.Experimental
public interface GPURenderPassDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<GPURenderPassColorAttachment> colorAttachments) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).colorAttachments( colorAttachments );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPURenderPassColorAttachment[] colorAttachments) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).colorAttachments( colorAttachments );
  }

  @JsProperty(
      name = "colorAttachments"
  )
  @JsNonNull
  JsArray<GPURenderPassColorAttachment> colorAttachments();

  @JsProperty
  void setColorAttachments(@JsNonNull JsArray<GPURenderPassColorAttachment> colorAttachments);

  @JsOverlay
  default void setColorAttachments(
      @Nonnull final GPURenderPassColorAttachment... colorAttachments) {
    setColorAttachments( Js.<JsArray<GPURenderPassColorAttachment>>uncheckedCast( colorAttachments ) );
  }

  @JsProperty(
      name = "depthStencilAttachment"
  )
  GPURenderPassDepthStencilAttachment depthStencilAttachment();

  @JsProperty
  void setDepthStencilAttachment(
      @JsNonNull GPURenderPassDepthStencilAttachment depthStencilAttachment);

  @JsProperty(
      name = "occlusionQuerySet"
  )
  GPUQuerySet occlusionQuerySet();

  @JsProperty
  void setOcclusionQuerySet(@JsNonNull GPUQuerySet occlusionQuerySet);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPassDescriptor {
    @JsOverlay
    @Nonnull
    default Builder colorAttachments(
        @Nonnull final JsArray<GPURenderPassColorAttachment> colorAttachments) {
      setColorAttachments( colorAttachments );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder colorAttachments(
        @Nonnull final GPURenderPassColorAttachment... colorAttachments) {
      setColorAttachments( colorAttachments );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthStencilAttachment(
        @Nonnull final GPURenderPassDepthStencilAttachment depthStencilAttachment) {
      setDepthStencilAttachment( depthStencilAttachment );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder occlusionQuerySet(@Nonnull final GPUQuerySet occlusionQuerySet) {
      setOcclusionQuerySet( occlusionQuerySet );
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
