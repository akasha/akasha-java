package akasha;

import akasha.core.BufferSource;
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
    name = "Object"
)
public interface AuthenticationExtensionsClientInputs {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "appid"
  )
  String appid();

  @JsProperty
  void setAppid(@Nonnull String appid);

  @JsProperty(
      name = "txAuthSimple"
  )
  String txAuthSimple();

  @JsProperty
  void setTxAuthSimple(@Nonnull String txAuthSimple);

  @JsProperty(
      name = "txAuthGeneric"
  )
  TxAuthGenericArg txAuthGeneric();

  @JsProperty
  void setTxAuthGeneric(@Nonnull TxAuthGenericArg txAuthGeneric);

  @JsProperty(
      name = "authnSel"
  )
  JsArray<BufferSource> authnSel();

  @JsProperty
  void setAuthnSel(@Nonnull JsArray<BufferSource> authnSel);

  @JsOverlay
  default void setAuthnSel(@Nonnull final BufferSource... authnSel) {
    setAuthnSel( Js.<JsArray<BufferSource>>uncheckedCast( authnSel ) );
  }

  @JsProperty(
      name = "exts"
  )
  boolean exts();

  @JsProperty
  void setExts(boolean exts);

  @JsProperty(
      name = "uvi"
  )
  boolean uvi();

  @JsProperty
  void setUvi(boolean uvi);

  @JsProperty(
      name = "loc"
  )
  boolean loc();

  @JsProperty
  void setLoc(boolean loc);

  @JsProperty(
      name = "uvm"
  )
  boolean uvm();

  @JsProperty
  void setUvm(boolean uvm);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends AuthenticationExtensionsClientInputs {
    @JsOverlay
    @Nonnull
    default Builder appid(@Nonnull final String appid) {
      setAppid( appid );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder txAuthSimple(@Nonnull final String txAuthSimple) {
      setTxAuthSimple( txAuthSimple );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder txAuthGeneric(@Nonnull final TxAuthGenericArg txAuthGeneric) {
      setTxAuthGeneric( txAuthGeneric );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder authnSel(@Nonnull final JsArray<BufferSource> authnSel) {
      setAuthnSel( authnSel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder authnSel(@Nonnull final BufferSource... authnSel) {
      setAuthnSel( authnSel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder exts(final boolean exts) {
      setExts( exts );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uvi(final boolean uvi) {
      setUvi( uvi );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loc(final boolean loc) {
      setLoc( loc );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uvm(final boolean uvm) {
      setUvm( uvm );
      return this;
    }
  }
}
