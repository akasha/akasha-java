package akasha;

import akasha.core.BufferSource;
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
    name = "WriteParams"
)
public interface WriteParams {
  @JsOverlay
  @Nonnull
  static Builder type(@WriteCommandType @Nonnull final String type) {
    final Builder $writeParams = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $writeParams.setType( type );
    return Js.uncheckedCast( $writeParams );
  }

  @JsProperty(
      name = "type"
  )
  @WriteCommandType
  @JsNonNull
  String type();

  @JsProperty
  void setType(@WriteCommandType @JsNonNull String type);

  @JsProperty(
      name = "data"
  )
  @JsNullable
  BufferSourceOrBlobOrStringUnion data();

  @JsProperty
  void setData(@JsNullable BufferSourceOrBlobOrStringUnion data);

  @JsOverlay
  default void setData(@Nonnull final BufferSource data) {
    setData( BufferSourceOrBlobOrStringUnion.of( data ) );
  }

  @JsOverlay
  default void setData(@Nonnull final Blob data) {
    setData( BufferSourceOrBlobOrStringUnion.of( data ) );
  }

  @JsOverlay
  default void setData(@Nonnull final String data) {
    setData( BufferSourceOrBlobOrStringUnion.of( data ) );
  }

  @JsProperty(
      name = "position"
  )
  @JsNullable
  Double position();

  @JsProperty
  void setPosition(@JsNullable Double position);

  @JsProperty(
      name = "size"
  )
  @JsNullable
  Double size();

  @JsProperty
  void setSize(@JsNullable Double size);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "WriteParams"
  )
  interface Builder extends WriteParams {
    @JsOverlay
    @Nonnull
    default Builder data(@Nullable final BufferSourceOrBlobOrStringUnion data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final BufferSource data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final Blob data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final String data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder position(@Nullable final Double position) {
      setPosition( position );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder size(@Nullable final Double size) {
      setSize( size );
      return this;
    }
  }
}
