package akasha.crypto;

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
  void setAlg(@Nonnull String alg);

  @JsProperty(
      name = "crv"
  )
  String crv();

  @JsProperty
  void setCrv(@Nonnull String crv);

  @JsProperty(
      name = "d"
  )
  String d();

  @JsProperty
  void setD(@Nonnull String d);

  @JsProperty(
      name = "dp"
  )
  String dp();

  @JsProperty
  void setDp(@Nonnull String dp);

  @JsProperty(
      name = "dq"
  )
  String dq();

  @JsProperty
  void setDq(@Nonnull String dq);

  @JsProperty(
      name = "e"
  )
  String e();

  @JsProperty
  void setE(@Nonnull String e);

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
  void setK(@Nonnull String k);

  @JsProperty(
      name = "key_ops"
  )
  JsArray<String> key_ops();

  @JsProperty
  void setKey_ops(@Nonnull JsArray<String> key_ops);

  @JsOverlay
  default void setKey_ops(@Nonnull final String... key_ops) {
    setKey_ops( Js.<JsArray<String>>uncheckedCast( key_ops ) );
  }

  @JsProperty(
      name = "kty"
  )
  String kty();

  @JsProperty
  void setKty(@Nonnull String kty);

  @JsProperty(
      name = "n"
  )
  String n();

  @JsProperty
  void setN(@Nonnull String n);

  @JsProperty(
      name = "oth"
  )
  JsArray<RsaOtherPrimesInfo> oth();

  @JsProperty
  void setOth(@Nonnull JsArray<RsaOtherPrimesInfo> oth);

  @JsOverlay
  default void setOth(@Nonnull final RsaOtherPrimesInfo... oth) {
    setOth( Js.<JsArray<RsaOtherPrimesInfo>>uncheckedCast( oth ) );
  }

  @JsProperty(
      name = "p"
  )
  String p();

  @JsProperty
  void setP(@Nonnull String p);

  @JsProperty(
      name = "q"
  )
  String q();

  @JsProperty
  void setQ(@Nonnull String q);

  @JsProperty(
      name = "qi"
  )
  String qi();

  @JsProperty
  void setQi(@Nonnull String qi);

  @JsProperty(
      name = "use"
  )
  String use();

  @JsProperty
  void setUse(@Nonnull String use);

  @JsProperty(
      name = "x"
  )
  String x();

  @JsProperty
  void setX(@Nonnull String x);

  @JsProperty(
      name = "y"
  )
  String y();

  @JsProperty
  void setY(@Nonnull String y);

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
