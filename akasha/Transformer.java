package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface Transformer {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "start"
  )
  TransformerStartCallback start();

  @JsProperty
  void setStart(@Nonnull TransformerStartCallback start);

  @JsProperty(
      name = "transform"
  )
  TransformerTransformCallback transform();

  @JsProperty
  void setTransform(@Nonnull TransformerTransformCallback transform);

  @JsProperty(
      name = "flush"
  )
  TransformerFlushCallback flush();

  @JsProperty
  void setFlush(@Nonnull TransformerFlushCallback flush);

  @JsProperty(
      name = "readableType"
  )
  @Nullable
  Any readableType();

  @JsProperty
  void setReadableType(@DoNotAutobox @Nullable Object readableType);

  @JsProperty(
      name = "writableType"
  )
  @Nullable
  Any writableType();

  @JsProperty
  void setWritableType(@DoNotAutobox @Nullable Object writableType);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends Transformer {
    @JsOverlay
    @Nonnull
    default Builder start(@Nonnull final TransformerStartCallback start) {
      setStart( start );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transform(@Nonnull final TransformerTransformCallback transform) {
      setTransform( transform );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder flush(@Nonnull final TransformerFlushCallback flush) {
      setFlush( flush );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder readableType(@DoNotAutobox @Nullable final Object readableType) {
      setReadableType( readableType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder writableType(@DoNotAutobox @Nullable final Object writableType) {
      setWritableType( writableType );
      return this;
    }
  }
}
