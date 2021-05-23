package akasha.rtc;

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
    name = "RTCErrorInit"
)
public interface RTCErrorInit {
  @JsOverlay
  @Nonnull
  static Builder create(@RTCErrorDetailType @Nonnull final String errorDetail) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).errorDetail( errorDetail );
  }

  @JsProperty(
      name = "errorDetail"
  )
  @RTCErrorDetailType
  @Nonnull
  String errorDetail();

  @JsProperty
  void setErrorDetail(@RTCErrorDetailType @Nonnull String errorDetail);

  @JsProperty(
      name = "receivedAlert"
  )
  int receivedAlert();

  @JsProperty
  void setReceivedAlert(int receivedAlert);

  @JsProperty(
      name = "sctpCauseCode"
  )
  int sctpCauseCode();

  @JsProperty
  void setSctpCauseCode(int sctpCauseCode);

  @JsProperty(
      name = "sdpLineNumber"
  )
  int sdpLineNumber();

  @JsProperty
  void setSdpLineNumber(int sdpLineNumber);

  @JsProperty(
      name = "sentAlert"
  )
  int sentAlert();

  @JsProperty
  void setSentAlert(int sentAlert);

  @JsProperty(
      name = "httpRequestStatusCode"
  )
  int httpRequestStatusCode();

  @JsProperty
  void setHttpRequestStatusCode(int httpRequestStatusCode);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCErrorInit"
  )
  interface Builder extends RTCErrorInit {
    @JsOverlay
    @Nonnull
    default Builder errorDetail(@RTCErrorDetailType @Nonnull final String errorDetail) {
      setErrorDetail( errorDetail );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder receivedAlert(final int receivedAlert) {
      setReceivedAlert( receivedAlert );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sctpCauseCode(final int sctpCauseCode) {
      setSctpCauseCode( sctpCauseCode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sdpLineNumber(final int sdpLineNumber) {
      setSdpLineNumber( sdpLineNumber );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sentAlert(final int sentAlert) {
      setSentAlert( sentAlert );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder httpRequestStatusCode(final int httpRequestStatusCode) {
      setHttpRequestStatusCode( httpRequestStatusCode );
      return this;
    }
  }
}
