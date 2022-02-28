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
    name = "XRCylinderLayerInit"
)
public interface XRCylinderLayerInit extends XRLayerInit {
  @JsOverlay
  @Nonnull
  static Step1 space(@Nonnull final XRSpace space) {
    final Builder $xrCylinderLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrCylinderLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrCylinderLayerInit );
  }

  @JsProperty(
      name = "aspectRatio"
  )
  float aspectRatio();

  @JsProperty
  void setAspectRatio(float aspectRatio);

  @JsProperty(
      name = "centralAngle"
  )
  float centralAngle();

  @JsProperty
  void setCentralAngle(float centralAngle);

  @JsProperty(
      name = "radius"
  )
  float radius();

  @JsProperty
  void setRadius(float radius);

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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRCylinderLayerInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 viewPixelWidth(int viewPixelWidth) {
      Js.<XRCylinderLayerInit>uncheckedCast( this ).setViewPixelWidth( viewPixelWidth );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRCylinderLayerInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Builder viewPixelHeight(int viewPixelHeight) {
      Js.<XRCylinderLayerInit>uncheckedCast( this ).setViewPixelHeight( viewPixelHeight );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRCylinderLayerInit"
  )
  interface Builder extends XRCylinderLayerInit {
    @JsOverlay
    @Nonnull
    default Builder aspectRatio(final float aspectRatio) {
      setAspectRatio( aspectRatio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder centralAngle(final float centralAngle) {
      setCentralAngle( centralAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder radius(final float radius) {
      setRadius( radius );
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
