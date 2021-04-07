package akasha;

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
    name = "Object"
)
public interface BoxQuadOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "box"
  )
  @CSSBoxType
  String box();

  @JsProperty
  void setBox(@CSSBoxType @Nonnull String box);

  @JsProperty(
      name = "relativeTo"
  )
  GeometryNode relativeTo();

  @JsProperty
  void setRelativeTo(@Nonnull GeometryNode relativeTo);

  @JsOverlay
  default void setRelativeTo(@Nonnull final Text relativeTo) {
    setRelativeTo( GeometryNode.of( relativeTo ) );
  }

  @JsOverlay
  default void setRelativeTo(@Nonnull final Element relativeTo) {
    setRelativeTo( GeometryNode.of( relativeTo ) );
  }

  @JsOverlay
  default void setRelativeTo(@Nonnull final CSSPseudoElement relativeTo) {
    setRelativeTo( GeometryNode.of( relativeTo ) );
  }

  @JsOverlay
  default void setRelativeTo(@Nonnull final Document relativeTo) {
    setRelativeTo( GeometryNode.of( relativeTo ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends BoxQuadOptions {
    @JsOverlay
    @Nonnull
    default Builder box(@CSSBoxType @Nonnull final String box) {
      setBox( box );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder relativeTo(@Nonnull final GeometryNode relativeTo) {
      setRelativeTo( relativeTo );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder relativeTo(@Nonnull final Text relativeTo) {
      setRelativeTo( relativeTo );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder relativeTo(@Nonnull final Element relativeTo) {
      setRelativeTo( relativeTo );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder relativeTo(@Nonnull final CSSPseudoElement relativeTo) {
      setRelativeTo( relativeTo );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder relativeTo(@Nonnull final Document relativeTo) {
      setRelativeTo( relativeTo );
      return this;
    }
  }
}
