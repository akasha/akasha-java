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
    name = "SecurityPolicyViolationEventInit"
)
public interface SecurityPolicyViolationEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@SecurityPolicyViolationEventDisposition @Nonnull final String disposition,
      @Nonnull final String documentURL, @Nonnull final String effectiveDirective,
      @Nonnull final String originalPolicy, final int statusCode) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).disposition( disposition ).documentURL( documentURL ).effectiveDirective( effectiveDirective ).originalPolicy( originalPolicy ).statusCode( statusCode );
  }

  @JsProperty(
      name = "blockedURL"
  )
  String blockedURL();

  @JsProperty
  void setBlockedURL(@Nonnull String blockedURL);

  @JsProperty(
      name = "colno"
  )
  int colno();

  @JsProperty
  void setColno(int colno);

  @JsProperty(
      name = "disposition"
  )
  @SecurityPolicyViolationEventDisposition
  @Nonnull
  String disposition();

  @JsProperty
  void setDisposition(@SecurityPolicyViolationEventDisposition @Nonnull String disposition);

  @JsProperty(
      name = "documentURL"
  )
  @Nonnull
  String documentURL();

  @JsProperty
  void setDocumentURL(@Nonnull String documentURL);

  @JsProperty(
      name = "effectiveDirective"
  )
  @Nonnull
  String effectiveDirective();

  @JsProperty
  void setEffectiveDirective(@Nonnull String effectiveDirective);

  @JsProperty(
      name = "lineno"
  )
  int lineno();

  @JsProperty
  void setLineno(int lineno);

  @JsProperty(
      name = "originalPolicy"
  )
  @Nonnull
  String originalPolicy();

  @JsProperty
  void setOriginalPolicy(@Nonnull String originalPolicy);

  @JsProperty(
      name = "referrer"
  )
  String referrer();

  @JsProperty
  void setReferrer(@Nonnull String referrer);

  @JsProperty(
      name = "sample"
  )
  String sample();

  @JsProperty
  void setSample(@Nonnull String sample);

  @JsProperty(
      name = "sourceFile"
  )
  String sourceFile();

  @JsProperty
  void setSourceFile(@Nonnull String sourceFile);

  @JsProperty(
      name = "statusCode"
  )
  int statusCode();

  @JsProperty
  void setStatusCode(int statusCode);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Builder extends SecurityPolicyViolationEventInit {
    @JsOverlay
    @Nonnull
    default Builder blockedURL(@Nonnull final String blockedURL) {
      setBlockedURL( blockedURL );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder colno(final int colno) {
      setColno( colno );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder disposition(
        @SecurityPolicyViolationEventDisposition @Nonnull final String disposition) {
      setDisposition( disposition );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder documentURL(@Nonnull final String documentURL) {
      setDocumentURL( documentURL );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder effectiveDirective(@Nonnull final String effectiveDirective) {
      setEffectiveDirective( effectiveDirective );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lineno(final int lineno) {
      setLineno( lineno );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder originalPolicy(@Nonnull final String originalPolicy) {
      setOriginalPolicy( originalPolicy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder referrer(@Nonnull final String referrer) {
      setReferrer( referrer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sample(@Nonnull final String sample) {
      setSample( sample );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sourceFile(@Nonnull final String sourceFile) {
      setSourceFile( sourceFile );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder statusCode(final int statusCode) {
      setStatusCode( statusCode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
