package akasha;

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
    name = "SecurityPolicyViolationEventInit"
)
public interface SecurityPolicyViolationEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String documentURI, @Nonnull final String violatedDirective,
      @Nonnull final String effectiveDirective, @Nonnull final String originalPolicy,
      @SecurityPolicyViolationEventDisposition @Nonnull final String disposition,
      final int statusCode) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).documentURI( documentURI ).violatedDirective( violatedDirective ).effectiveDirective( effectiveDirective ).originalPolicy( originalPolicy ).disposition( disposition ).statusCode( statusCode );
  }

  @JsProperty(
      name = "documentURI"
  )
  @JsNonNull
  String documentURI();

  @JsProperty
  void setDocumentURI(@JsNonNull String documentURI);

  @JsProperty(
      name = "violatedDirective"
  )
  @JsNonNull
  String violatedDirective();

  @JsProperty
  void setViolatedDirective(@JsNonNull String violatedDirective);

  @JsProperty(
      name = "effectiveDirective"
  )
  @JsNonNull
  String effectiveDirective();

  @JsProperty
  void setEffectiveDirective(@JsNonNull String effectiveDirective);

  @JsProperty(
      name = "originalPolicy"
  )
  @JsNonNull
  String originalPolicy();

  @JsProperty
  void setOriginalPolicy(@JsNonNull String originalPolicy);

  @JsProperty(
      name = "disposition"
  )
  @SecurityPolicyViolationEventDisposition
  @JsNonNull
  String disposition();

  @JsProperty
  void setDisposition(@SecurityPolicyViolationEventDisposition @JsNonNull String disposition);

  @JsProperty(
      name = "statusCode"
  )
  int statusCode();

  @JsProperty
  void setStatusCode(int statusCode);

  @JsProperty(
      name = "blockedURI"
  )
  String blockedURI();

  @JsProperty
  void setBlockedURI(@JsNonNull String blockedURI);

  @JsProperty(
      name = "columnNumber"
  )
  int columnNumber();

  @JsProperty
  void setColumnNumber(int columnNumber);

  @JsProperty(
      name = "lineNumber"
  )
  int lineNumber();

  @JsProperty
  void setLineNumber(int lineNumber);

  @JsProperty(
      name = "referrer"
  )
  String referrer();

  @JsProperty
  void setReferrer(@JsNonNull String referrer);

  @JsProperty(
      name = "sample"
  )
  String sample();

  @JsProperty
  void setSample(@JsNonNull String sample);

  @JsProperty(
      name = "sourceFile"
  )
  String sourceFile();

  @JsProperty
  void setSourceFile(@JsNonNull String sourceFile);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Builder extends SecurityPolicyViolationEventInit {
    @JsOverlay
    @Nonnull
    default Builder documentURI(@Nonnull final String documentURI) {
      setDocumentURI( documentURI );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder violatedDirective(@Nonnull final String violatedDirective) {
      setViolatedDirective( violatedDirective );
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
    default Builder originalPolicy(@Nonnull final String originalPolicy) {
      setOriginalPolicy( originalPolicy );
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
    default Builder statusCode(final int statusCode) {
      setStatusCode( statusCode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder blockedURI(@Nonnull final String blockedURI) {
      setBlockedURI( blockedURI );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder columnNumber(final int columnNumber) {
      setColumnNumber( columnNumber );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lineNumber(final int lineNumber) {
      setLineNumber( lineNumber );
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
