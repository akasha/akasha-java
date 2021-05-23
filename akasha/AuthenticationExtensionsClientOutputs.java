package akasha;

import akasha.core.ArrayBuffer;
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
    name = "AuthenticationExtensionsClientOutputs"
)
public interface AuthenticationExtensionsClientOutputs {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "appid"
  )
  boolean appid();

  @JsProperty
  void setAppid(boolean appid);

  @JsProperty(
      name = "txAuthSimple"
  )
  String txAuthSimple();

  @JsProperty
  void setTxAuthSimple(@Nonnull String txAuthSimple);

  @JsProperty(
      name = "txAuthGeneric"
  )
  ArrayBuffer txAuthGeneric();

  @JsProperty
  void setTxAuthGeneric(@Nonnull ArrayBuffer txAuthGeneric);

  @JsProperty(
      name = "authnSel"
  )
  boolean authnSel();

  @JsProperty
  void setAuthnSel(boolean authnSel);

  @JsProperty(
      name = "exts"
  )
  JsArray<String> exts();

  @JsProperty
  void setExts(@Nonnull JsArray<String> exts);

  @JsOverlay
  default void setExts(@Nonnull final String... exts) {
    setExts( Js.<JsArray<String>>uncheckedCast( exts ) );
  }

  @JsProperty(
      name = "uvi"
  )
  ArrayBuffer uvi();

  @JsProperty
  void setUvi(@Nonnull ArrayBuffer uvi);

  @JsProperty(
      name = "loc"
  )
  Coordinates loc();

  @JsProperty
  void setLoc(@Nonnull Coordinates loc);

  @JsProperty(
      name = "uvm"
  )
  JsArray<JsArray<Double>> uvm();

  @JsProperty
  void setUvm(@Nonnull JsArray<JsArray<Double>> uvm);

  @JsOverlay
  @SuppressWarnings("unchecked")
  default void setUvm(@Nonnull final JsArray<Double>... uvm) {
    setUvm( Js.<JsArray<JsArray<Double>>>uncheckedCast( uvm ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AuthenticationExtensionsClientOutputs"
  )
  interface Builder extends AuthenticationExtensionsClientOutputs {
    @JsOverlay
    @Nonnull
    default Builder appid(final boolean appid) {
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
    default Builder txAuthGeneric(@Nonnull final ArrayBuffer txAuthGeneric) {
      setTxAuthGeneric( txAuthGeneric );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder authnSel(final boolean authnSel) {
      setAuthnSel( authnSel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder exts(@Nonnull final JsArray<String> exts) {
      setExts( exts );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder exts(@Nonnull final String... exts) {
      setExts( exts );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uvi(@Nonnull final ArrayBuffer uvi) {
      setUvi( uvi );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loc(@Nonnull final Coordinates loc) {
      setLoc( loc );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder uvm(@Nonnull final JsArray<JsArray<Double>> uvm) {
      setUvm( uvm );
      return this;
    }

    @JsOverlay
    @Nonnull
    @SuppressWarnings("unchecked")
    default Builder uvm(@Nonnull final JsArray<Double>... uvm) {
      setUvm( uvm );
      return this;
    }
  }
}
