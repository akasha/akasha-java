package akasha.crypto;

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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "JsonWebKey"
)
public interface JsonWebKey {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alg"
  )
  String alg();

  @JsProperty
  void setAlg(@JsNonNull String alg);

  @JsProperty(
      name = "crv"
  )
  String crv();

  @JsProperty
  void setCrv(@JsNonNull String crv);

  @JsProperty(
      name = "d"
  )
  String d();

  @JsProperty
  void setD(@JsNonNull String d);

  @JsProperty(
      name = "dp"
  )
  String dp();

  @JsProperty
  void setDp(@JsNonNull String dp);

  @JsProperty(
      name = "dq"
  )
  String dq();

  @JsProperty
  void setDq(@JsNonNull String dq);

  @JsProperty(
      name = "e"
  )
  String e();

  @JsProperty
  void setE(@JsNonNull String e);

  @JsProperty(
      name = "ext"
  )
  boolean ext();

  @JsProperty
  void setExt(boolean ext);

  @JsProperty(
      name = "k"
  )
  String k();

  @JsProperty
  void setK(@JsNonNull String k);

  @JsProperty(
      name = "key_ops"
  )
  JsArray<String> key_ops();

  @JsProperty
  void setKey_ops(@JsNonNull JsArray<String> key_ops);

  @JsOverlay
  default void setKey_ops(@Nonnull final String... key_ops) {
    setKey_ops( Js.<JsArray<String>>uncheckedCast( key_ops ) );
  }

  @JsProperty(
      name = "kty"
  )
  String kty();

  @JsProperty
  void setKty(@JsNonNull String kty);

  @JsProperty(
      name = "n"
  )
  String n();

  @JsProperty
  void setN(@JsNonNull String n);

  @JsProperty(
      name = "oth"
  )
  JsArray<RsaOtherPrimesInfo> oth();

  @JsProperty
  void setOth(@JsNonNull JsArray<RsaOtherPrimesInfo> oth);

  @JsOverlay
  default void setOth(@Nonnull final RsaOtherPrimesInfo... oth) {
    setOth( Js.<JsArray<RsaOtherPrimesInfo>>uncheckedCast( oth ) );
  }

  @JsProperty(
      name = "p"
  )
  String p();

  @JsProperty
  void setP(@JsNonNull String p);

  @JsProperty(
      name = "q"
  )
  String q();

  @JsProperty
  void setQ(@JsNonNull String q);

  @JsProperty(
      name = "qi"
  )
  String qi();

  @JsProperty
  void setQi(@JsNonNull String qi);

  @JsProperty(
      name = "use"
  )
  String use();

  @JsProperty
  void setUse(@JsNonNull String use);

  @JsProperty(
      name = "x"
  )
  String x();

  @JsProperty
  void setX(@JsNonNull String x);

  @JsProperty(
      name = "y"
  )
  String y();

  @JsProperty
  void setY(@JsNonNull String y);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "JsonWebKey"
  )
  interface Builder extends JsonWebKey {
    @JsOverlay
    @Nonnull
    default Builder alg(@Nonnull final String alg) {
      setAlg( alg );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder crv(@Nonnull final String crv) {
      setCrv( crv );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder d(@Nonnull final String d) {
      setD( d );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dp(@Nonnull final String dp) {
      setDp( dp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dq(@Nonnull final String dq) {
      setDq( dq );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder e(@Nonnull final String e) {
      setE( e );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ext(final boolean ext) {
      setExt( ext );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder k(@Nonnull final String k) {
      setK( k );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder key_ops(@Nonnull final JsArray<String> key_ops) {
      setKey_ops( key_ops );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder key_ops(@Nonnull final String... key_ops) {
      setKey_ops( key_ops );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder kty(@Nonnull final String kty) {
      setKty( kty );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder n(@Nonnull final String n) {
      setN( n );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder oth(@Nonnull final JsArray<RsaOtherPrimesInfo> oth) {
      setOth( oth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder oth(@Nonnull final RsaOtherPrimesInfo... oth) {
      setOth( oth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder p(@Nonnull final String p) {
      setP( p );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder q(@Nonnull final String q) {
      setQ( q );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder qi(@Nonnull final String qi) {
      setQi( qi );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder use(@Nonnull final String use) {
      setUse( use );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder x(@Nonnull final String x) {
      setX( x );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder y(@Nonnull final String y) {
      setY( y );
      return this;
    }
  }
}
