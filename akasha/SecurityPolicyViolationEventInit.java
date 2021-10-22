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
  static Step1 documentURI(@Nonnull final String documentURI) {
    final Builder $securityPolicyViolationEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $securityPolicyViolationEventInit.setDocumentURI( documentURI );
    return Js.uncheckedCast( $securityPolicyViolationEventInit );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 violatedDirective(@Nonnull String violatedDirective) {
      Js.<SecurityPolicyViolationEventInit>uncheckedCast( this ).setViolatedDirective( violatedDirective );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 effectiveDirective(@Nonnull String effectiveDirective) {
      Js.<SecurityPolicyViolationEventInit>uncheckedCast( this ).setEffectiveDirective( effectiveDirective );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 originalPolicy(@Nonnull String originalPolicy) {
      Js.<SecurityPolicyViolationEventInit>uncheckedCast( this ).setOriginalPolicy( originalPolicy );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Step5 disposition(
        @SecurityPolicyViolationEventDisposition @Nonnull String disposition) {
      Js.<SecurityPolicyViolationEventInit>uncheckedCast( this ).setDisposition( disposition );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Step5 {
    @JsOverlay
    @Nonnull
    default Builder statusCode(int statusCode) {
      Js.<SecurityPolicyViolationEventInit>uncheckedCast( this ).setStatusCode( statusCode );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SecurityPolicyViolationEventInit"
  )
  interface Builder extends SecurityPolicyViolationEventInit {
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
