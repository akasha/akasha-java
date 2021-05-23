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
    name = "RTCDataChannelInit"
)
public interface RTCDataChannelInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "id"
  )
  int id();

  @JsProperty
  void setId(int id);

  @JsProperty(
      name = "maxPacketLifeTime"
  )
  int maxPacketLifeTime();

  @JsProperty
  void setMaxPacketLifeTime(int maxPacketLifeTime);

  @JsProperty(
      name = "maxRetransmits"
  )
  int maxRetransmits();

  @JsProperty
  void setMaxRetransmits(int maxRetransmits);

  @JsProperty(
      name = "negotiated"
  )
  boolean negotiated();

  @JsProperty
  void setNegotiated(boolean negotiated);

  @JsProperty(
      name = "ordered"
  )
  boolean ordered();

  @JsProperty
  void setOrdered(boolean ordered);

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@Nonnull String protocol);

  @JsProperty(
      name = "priority"
  )
  @RTCPriorityType
  String priority();

  @JsProperty
  void setPriority(@RTCPriorityType @Nonnull String priority);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCDataChannelInit"
  )
  interface Builder extends RTCDataChannelInit {
    @JsOverlay
    @Nonnull
    default Builder id(final int id) {
      setId( id );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maxPacketLifeTime(final int maxPacketLifeTime) {
      setMaxPacketLifeTime( maxPacketLifeTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maxRetransmits(final int maxRetransmits) {
      setMaxRetransmits( maxRetransmits );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder negotiated(final boolean negotiated) {
      setNegotiated( negotiated );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ordered(final boolean ordered) {
      setOrdered( ordered );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder protocol(@Nonnull final String protocol) {
      setProtocol( protocol );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder priority(@RTCPriorityType @Nonnull final String priority) {
      setPriority( priority );
      return this;
    }
  }
}
