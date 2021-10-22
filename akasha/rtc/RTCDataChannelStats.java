package akasha.rtc;

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
    name = "RTCDataChannelStats"
)
public interface RTCDataChannelStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcDataChannelStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcDataChannelStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcDataChannelStats );
  }

  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsProperty(
      name = "bytesSent"
  )
  int bytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsProperty(
      name = "dataChannelIdentifier"
  )
  int dataChannelIdentifier();

  @JsProperty
  void setDataChannelIdentifier(int dataChannelIdentifier);

  @JsProperty(
      name = "label"
  )
  String label();

  @JsProperty
  void setLabel(@JsNonNull String label);

  @JsProperty(
      name = "messagesReceived"
  )
  int messagesReceived();

  @JsProperty
  void setMessagesReceived(int messagesReceived);

  @JsProperty(
      name = "messagesSent"
  )
  int messagesSent();

  @JsProperty
  void setMessagesSent(int messagesSent);

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@JsNonNull String protocol);

  @JsProperty(
      name = "state"
  )
  @RTCDataChannelState
  @JsNonNull
  String state();

  @JsProperty
  void setState(@RTCDataChannelState @JsNonNull String state);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDataChannelStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCDataChannelStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDataChannelStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCDataChannelStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDataChannelStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder state(@RTCDataChannelState @Nonnull String state) {
      Js.<RTCDataChannelStats>uncheckedCast( this ).setState( state );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDataChannelStats"
  )
  interface Builder extends RTCDataChannelStats {
    @JsOverlay
    @Nonnull
    default Builder bytesReceived(final int bytesReceived) {
      setBytesReceived( bytesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bytesSent(final int bytesSent) {
      setBytesSent( bytesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder dataChannelIdentifier(final int dataChannelIdentifier) {
      setDataChannelIdentifier( dataChannelIdentifier );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder messagesReceived(final int messagesReceived) {
      setMessagesReceived( messagesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder messagesSent(final int messagesSent) {
      setMessagesSent( messagesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }
  }
}
