package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
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
    name = "XRQuadLayerInit"
)
public interface XRQuadLayerInit extends XRLayerInit {
  @JsOverlay
  @Nonnull
  static Step1 space(@Nonnull final XRSpace space) {
    final Builder $xrQuadLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrQuadLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrQuadLayerInit );
  }

  @JsProperty(
      name = "height"
  )
  float height();

  @JsProperty
  void setHeight(float height);

  @JsProperty(
      name = "textureType"
  )
  @XRTextureType
  String textureType();

  @JsProperty
  void setTextureType(@XRTextureType @JsNonNull String textureType);

  @JsProperty(
      name = "transform"
  )
  @JsNullable
  XRRigidTransform transform();

  @JsProperty
  void setTransform(@JsNullable XRRigidTransform transform);

  @JsProperty(
      name = "width"
  )
  float width();

  @JsProperty
  void setWidth(float width);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRQuadLayerInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 viewPixelWidth(int viewPixelWidth) {
      Js.<XRQuadLayerInit>uncheckedCast( this ).setViewPixelWidth( viewPixelWidth );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRQuadLayerInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder viewPixelHeight(int viewPixelHeight) {
      Js.<XRQuadLayerInit>uncheckedCast( this ).setViewPixelHeight( viewPixelHeight );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRQuadLayerInit"
  )
  interface Builder extends XRQuadLayerInit {
    @JsOverlay
    @Nonnull
    default Builder height(final float height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder textureType(@XRTextureType @Nonnull final String textureType) {
      setTextureType( textureType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transform(@Nullable final XRRigidTransform transform) {
      setTransform( transform );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(final float width) {
      setWidth( width );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder colorFormat(final int colorFormat) {
      setColorFormat( colorFormat );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthFormat(final int depthFormat) {
      setDepthFormat( depthFormat );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder isStatic(final boolean isStatic) {
      setIsStatic( isStatic );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layout(@XRLayerLayout @Nonnull final String layout) {
      setLayout( layout );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mipLevels(final int mipLevels) {
      setMipLevels( mipLevels );
      return this;
    }
  }
}
