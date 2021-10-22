package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
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
    name = "Transformer"
)
public interface Transformer {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "start"
  )
  TransformerStartCallback start();

  @JsProperty
  void setStart(@JsNonNull TransformerStartCallback start);

  @JsProperty(
      name = "transform"
  )
  TransformerTransformCallback transform();

  @JsProperty
  void setTransform(@JsNonNull TransformerTransformCallback transform);

  @JsProperty(
      name = "flush"
  )
  TransformerFlushCallback flush();

  @JsProperty
  void setFlush(@JsNonNull TransformerFlushCallback flush);

  @JsProperty(
      name = "readableType"
  )
  @JsNullable
  Any readableType();

  @JsProperty
  void setReadableType(@DoNotAutobox @JsNullable Object readableType);

  @JsProperty(
      name = "writableType"
  )
  @JsNullable
  Any writableType();

  @JsProperty
  void setWritableType(@DoNotAutobox @JsNullable Object writableType);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Transformer"
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
