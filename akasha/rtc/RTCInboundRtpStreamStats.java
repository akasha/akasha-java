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

/**
 * The WebRTC API's RTCInboundRtpStreamStats dictionary, based upon RTCReceivedRtpStreamStats and RTCStats, contains statistics related to the receiving end of an RTP stream on the local end of the RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats">RTCInboundRtpStreamStats - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCInboundRtpStreamStats"
)
public interface RTCInboundRtpStreamStats extends RTCReceivedRtpStreamStats {
  @JsOverlay
  @Nonnull
  static Step1 timestamp(final double timestamp) {
    final Builder $rtcInboundRtpStreamStats = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $rtcInboundRtpStreamStats.setTimestamp( timestamp );
    return Js.uncheckedCast( $rtcInboundRtpStreamStats );
  }

  /**
   * The receiverId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCAudioReceiverStats or RTCVideoReceiverStats object representing the RTCRtpReceiver receiving the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/receiverId">RTCInboundRtpStreamStats.receiverId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-receiverid">RTCInboundRtpStreamStats.receiverId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "receiverId"
  )
  @JsNonNull
  String receiverId();

  /**
   * The receiverId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCAudioReceiverStats or RTCVideoReceiverStats object representing the RTCRtpReceiver receiving the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/receiverId">RTCInboundRtpStreamStats.receiverId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-receiverid">RTCInboundRtpStreamStats.receiverId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setReceiverId(@JsNonNull String receiverId);

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  /**
   * The averageRtcpInterval property of the RTCInboundRtpStreamStats dictionary is a floating-point value indicating the average RTCP transmission interval, in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/averageRtcpInterval">RTCInboundRtpStreamStats.averageRtcpInterval - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-averagertcpinterval">RTCInboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "averageRtcpInterval"
  )
  double averageRtcpInterval();

  /**
   * The averageRtcpInterval property of the RTCInboundRtpStreamStats dictionary is a floating-point value indicating the average RTCP transmission interval, in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/averageRtcpInterval">RTCInboundRtpStreamStats.averageRtcpInterval - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-averagertcpinterval">RTCInboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setAverageRtcpInterval(double averageRtcpInterval);

  /**
   * The RTCInboundRtpStreamStats dictionary's bytesReceived property is an integer value which indicates the total number of bytes received so far from this synchronization source (SSRC).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/bytesReceived">RTCInboundRtpStreamStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-bytesreceived">RTCInboundRtpStreamStats.bytesReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  /**
   * The RTCInboundRtpStreamStats dictionary's bytesReceived property is an integer value which indicates the total number of bytes received so far from this synchronization source (SSRC).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/bytesReceived">RTCInboundRtpStreamStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-bytesreceived">RTCInboundRtpStreamStats.bytesReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsProperty(
      name = "concealedSamples"
  )
  int concealedSamples();

  @JsProperty
  void setConcealedSamples(int concealedSamples);

  @JsProperty(
      name = "concealmentEvents"
  )
  int concealmentEvents();

  @JsProperty
  void setConcealmentEvents(int concealmentEvents);

  @JsProperty(
      name = "decoderImplementation"
  )
  String decoderImplementation();

  @JsProperty
  void setDecoderImplementation(@JsNonNull String decoderImplementation);

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  /**
   * The fecPacketsDiscarded property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of RTP Forward Error Correction (FEC) packets that have been discarded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsDiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsdiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "fecPacketsDiscarded"
  )
  int fecPacketsDiscarded();

  /**
   * The fecPacketsDiscarded property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of RTP Forward Error Correction (FEC) packets that have been discarded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsDiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsdiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFecPacketsDiscarded(int fecPacketsDiscarded);

  /**
   * The fecPacketsReceived property of the RTCInboundRtpStreamStats dictionary indicates how many Forward Error Correction (FEC) packets have been received by this RTP receiver from the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsReceived">RTCInboundRtpStreamStats.fecPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsreceived">RTCInboundRtpStreamStats.fecPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "fecPacketsReceived"
  )
  int fecPacketsReceived();

  /**
   * The fecPacketsReceived property of the RTCInboundRtpStreamStats dictionary indicates how many Forward Error Correction (FEC) packets have been received by this RTP receiver from the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsReceived">RTCInboundRtpStreamStats.fecPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsreceived">RTCInboundRtpStreamStats.fecPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFecPacketsReceived(int fecPacketsReceived);

  /**
   * The firCount property of the RTCInboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) packets have been sent by the receiver to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/firCount">RTCInboundRtpStreamStats.firCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fircount">RTCInboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "firCount"
  )
  int firCount();

  /**
   * The firCount property of the RTCInboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) packets have been sent by the receiver to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/firCount">RTCInboundRtpStreamStats.firCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fircount">RTCInboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFirCount(int firCount);

  @JsProperty(
      name = "frameBitDepth"
  )
  int frameBitDepth();

  @JsProperty
  void setFrameBitDepth(int frameBitDepth);

  @JsProperty(
      name = "frameHeight"
  )
  int frameHeight();

  @JsProperty
  void setFrameHeight(int frameHeight);

  @JsProperty(
      name = "frameWidth"
  )
  int frameWidth();

  @JsProperty
  void setFrameWidth(int frameWidth);

  /**
   * The framesDecoded property of the RTCInboundRtpStreamStats dictionary indicates the total number of frames which have been decoded successfully for this media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/framesDecoded">RTCInboundRtpStreamStats.framesDecoded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-framesdecoded">RTCInboundRtpStreamStats.framesDecoded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "framesDecoded"
  )
  int framesDecoded();

  /**
   * The framesDecoded property of the RTCInboundRtpStreamStats dictionary indicates the total number of frames which have been decoded successfully for this media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/framesDecoded">RTCInboundRtpStreamStats.framesDecoded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-framesdecoded">RTCInboundRtpStreamStats.framesDecoded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFramesDecoded(int framesDecoded);

  @JsProperty(
      name = "framesPerSecond"
  )
  double framesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsProperty(
      name = "framesReceived"
  )
  int framesReceived();

  @JsProperty
  void setFramesReceived(int framesReceived);

  @JsProperty(
      name = "headerBytesReceived"
  )
  int headerBytesReceived();

  @JsProperty
  void setHeaderBytesReceived(int headerBytesReceived);

  @JsProperty(
      name = "insertedSamplesForDeceleration"
  )
  int insertedSamplesForDeceleration();

  @JsProperty
  void setInsertedSamplesForDeceleration(int insertedSamplesForDeceleration);

  @JsProperty(
      name = "jitterBufferDelay"
  )
  double jitterBufferDelay();

  @JsProperty
  void setJitterBufferDelay(double jitterBufferDelay);

  @JsProperty(
      name = "jitterBufferEmittedCount"
  )
  int jitterBufferEmittedCount();

  @JsProperty
  void setJitterBufferEmittedCount(int jitterBufferEmittedCount);

  @JsProperty(
      name = "keyFramesDecoded"
  )
  int keyFramesDecoded();

  @JsProperty
  void setKeyFramesDecoded(int keyFramesDecoded);

  /**
   * The lastPacketReceivedTimestamp property of the RTCInboundRtpStreamStats dictionary indicates the time at which the most recently received packet arrived from this source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/lastPacketReceivedTimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-lastpacketreceivedtimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "lastPacketReceivedTimestamp"
  )
  double lastPacketReceivedTimestamp();

  /**
   * The lastPacketReceivedTimestamp property of the RTCInboundRtpStreamStats dictionary indicates the time at which the most recently received packet arrived from this source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/lastPacketReceivedTimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-lastpacketreceivedtimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setLastPacketReceivedTimestamp(double lastPacketReceivedTimestamp);

  /**
   * The nackCount property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of times the receiver sent a NACK packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/nackCount">RTCInboundRtpStreamStats.nackCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-nackcount">RTCInboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "nackCount"
  )
  int nackCount();

  /**
   * The nackCount property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of times the receiver sent a NACK packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/nackCount">RTCInboundRtpStreamStats.nackCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-nackcount">RTCInboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setNackCount(int nackCount);

  /**
   * The packetsDuplicated property of the RTCInboundRtpStreamStats dictionary indicates the total number of packets discarded because they were duplicates of previously-received packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsDuplicated">RTCInboundRtpStreamStats.packetsDuplicated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsduplicated">RTCInboundRtpStreamStats.packetsDuplicated - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "packetsDuplicated"
  )
  int packetsDuplicated();

  /**
   * The packetsDuplicated property of the RTCInboundRtpStreamStats dictionary indicates the total number of packets discarded because they were duplicates of previously-received packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsDuplicated">RTCInboundRtpStreamStats.packetsDuplicated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsduplicated">RTCInboundRtpStreamStats.packetsDuplicated - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPacketsDuplicated(int packetsDuplicated);

  /**
   * The packetsFailedDecryption property of the RTCInboundRtpStreamStats dictionary indicates the total number of RTP packets which failed to be decrypted successfully after being received by the local end of the connection during this session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsFailedDecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsfaileddecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "packetsFailedDecryption"
  )
  int packetsFailedDecryption();

  /**
   * The packetsFailedDecryption property of the RTCInboundRtpStreamStats dictionary indicates the total number of RTP packets which failed to be decrypted successfully after being received by the local end of the connection during this session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsFailedDecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsfaileddecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPacketsFailedDecryption(int packetsFailedDecryption);

  /**
   * The perDscpPacketsReceived property of the RTCInboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets received for that DCSP.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/perDscpPacketsReceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-perdscppacketsreceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "perDscpPacketsReceived"
  )
  JsPropertyMap<Double> perDscpPacketsReceived();

  /**
   * The perDscpPacketsReceived property of the RTCInboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets received for that DCSP.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/perDscpPacketsReceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-perdscppacketsreceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPerDscpPacketsReceived(@JsNonNull JsPropertyMap<Double> perDscpPacketsReceived);

  /**
   * The pliCount property of the RTCInboundRtpStreamStats dictionary states the number of times the RTCRtpReceiver described by these statistics sent a Picture Loss Indication (PLI) packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/pliCount">RTCInboundRtpStreamStats.pliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-plicount">RTCInboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "pliCount"
  )
  int pliCount();

  /**
   * The pliCount property of the RTCInboundRtpStreamStats dictionary states the number of times the RTCRtpReceiver described by these statistics sent a Picture Loss Indication (PLI) packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/pliCount">RTCInboundRtpStreamStats.pliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-plicount">RTCInboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPliCount(int pliCount);

  /**
   * The qpSum property of the RTCInboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame sent or received to date on the video track corresponding to this RTCInboundRtpStreamStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/qpSum">RTCInboundRtpStreamStats.qpSum - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-qpsum">RTCInboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "qpSum"
  )
  int qpSum();

  /**
   * The qpSum property of the RTCInboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame sent or received to date on the video track corresponding to this RTCInboundRtpStreamStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/qpSum">RTCInboundRtpStreamStats.qpSum - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-qpsum">RTCInboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setQpSum(int qpSum);

  /**
   * The remoteId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCRemoteOutboundRtpStreamStats object representing the remote peer's RTCRtpSender which is sending the media to the local peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/remoteId">RTCInboundRtpStreamStats.remoteId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-remoteid">RTCInboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "remoteId"
  )
  String remoteId();

  /**
   * The remoteId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCRemoteOutboundRtpStreamStats object representing the remote peer's RTCRtpSender which is sending the media to the local peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/remoteId">RTCInboundRtpStreamStats.remoteId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-remoteid">RTCInboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setRemoteId(@JsNonNull String remoteId);

  @JsProperty(
      name = "removedSamplesForAcceleration"
  )
  int removedSamplesForAcceleration();

  @JsProperty
  void setRemovedSamplesForAcceleration(int removedSamplesForAcceleration);

  @JsProperty(
      name = "samplesDecodedWithCelt"
  )
  int samplesDecodedWithCelt();

  @JsProperty
  void setSamplesDecodedWithCelt(int samplesDecodedWithCelt);

  @JsProperty(
      name = "samplesDecodedWithSilk"
  )
  int samplesDecodedWithSilk();

  @JsProperty
  void setSamplesDecodedWithSilk(int samplesDecodedWithSilk);

  @JsProperty(
      name = "silentConcealedSamples"
  )
  int silentConcealedSamples();

  @JsProperty
  void setSilentConcealedSamples(int silentConcealedSamples);

  /**
   * The sliCount property of the RTCInboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpReceiver for which this object provdes statistics sent to the remote RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/sliCount">RTCInboundRtpStreamStats.sliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-slicount">RTCInboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "sliCount"
  )
  int sliCount();

  /**
   * The sliCount property of the RTCInboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpReceiver for which this object provdes statistics sent to the remote RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/sliCount">RTCInboundRtpStreamStats.sliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-slicount">RTCInboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setSliCount(int sliCount);

  @JsProperty(
      name = "totalAudioEnergy"
  )
  double totalAudioEnergy();

  @JsProperty
  void setTotalAudioEnergy(double totalAudioEnergy);

  @JsProperty(
      name = "totalDecodeTime"
  )
  double totalDecodeTime();

  @JsProperty
  void setTotalDecodeTime(double totalDecodeTime);

  @JsProperty(
      name = "totalInterFrameDelay"
  )
  double totalInterFrameDelay();

  @JsProperty
  void setTotalInterFrameDelay(double totalInterFrameDelay);

  @JsProperty(
      name = "totalProcessingDelay"
  )
  double totalProcessingDelay();

  @JsProperty
  void setTotalProcessingDelay(double totalProcessingDelay);

  @JsProperty(
      name = "totalSamplesDecoded"
  )
  int totalSamplesDecoded();

  @JsProperty
  void setTotalSamplesDecoded(int totalSamplesDecoded);

  @JsProperty(
      name = "totalSamplesDuration"
  )
  double totalSamplesDuration();

  @JsProperty
  void setTotalSamplesDuration(double totalSamplesDuration);

  @JsProperty(
      name = "totalSamplesReceived"
  )
  int totalSamplesReceived();

  @JsProperty
  void setTotalSamplesReceived(int totalSamplesReceived);

  @JsProperty(
      name = "totalSquaredInterFrameDelay"
  )
  double totalSquaredInterFrameDelay();

  @JsProperty
  void setTotalSquaredInterFrameDelay(double totalSquaredInterFrameDelay);

  @JsProperty(
      name = "voiceActivityFlag"
  )
  boolean voiceActivityFlag();

  @JsProperty
  void setVoiceActivityFlag(boolean voiceActivityFlag);

  @JsProperty(
      name = "fractionLost"
  )
  double fractionLost();

  @JsProperty
  void setFractionLost(double fractionLost);

  /**
   * The trackId property of the RTCInboundRtpStreamStats dictionary indicates the id of the RTCReceiverAudioTrackAttachmentStats or RTCReceiverVideoTrackAttachmentStats object representing the MediaStreamTrack which is receiving the incoming media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/trackId">RTCInboundRtpStreamStats.trackId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-trackId">RTCInboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "trackId"
  )
  String trackId();

  /**
   * The trackId property of the RTCInboundRtpStreamStats dictionary indicates the id of the RTCReceiverAudioTrackAttachmentStats or RTCReceiverVideoTrackAttachmentStats object representing the MediaStreamTrack which is receiving the incoming media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/trackId">RTCInboundRtpStreamStats.trackId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-trackId">RTCInboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setTrackId(@JsNonNull String trackId);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCInboundRtpStreamStats"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 type(@RTCStatsType @Nonnull String type) {
      Js.<RTCInboundRtpStreamStats>uncheckedCast( this ).setType( type );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCInboundRtpStreamStats"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 id(@Nonnull String id) {
      Js.<RTCInboundRtpStreamStats>uncheckedCast( this ).setId( id );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCInboundRtpStreamStats"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 ssrc(int ssrc) {
      Js.<RTCInboundRtpStreamStats>uncheckedCast( this ).setSsrc( ssrc );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCInboundRtpStreamStats"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Step5 kind(@Nonnull String kind) {
      Js.<RTCInboundRtpStreamStats>uncheckedCast( this ).setKind( kind );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCInboundRtpStreamStats"
  )
  interface Step5 {
    @JsOverlay
    @Nonnull
    default Builder receiverId(@Nonnull String receiverId) {
      Js.<RTCInboundRtpStreamStats>uncheckedCast( this ).setReceiverId( receiverId );
      return Js.uncheckedCast( this );
    }
  }

  /**
   * The WebRTC API's RTCInboundRtpStreamStats dictionary, based upon RTCReceivedRtpStreamStats and RTCStats, contains statistics related to the receiving end of an RTP stream on the local end of the RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats">RTCInboundRtpStreamStats - MDN</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "RTCInboundRtpStreamStats"
  )
  interface Builder extends RTCInboundRtpStreamStats {
    @JsOverlay
    @Nonnull
    default Builder audioLevel(final double audioLevel) {
      setAudioLevel( audioLevel );
      return this;
    }

    /**
     * The averageRtcpInterval property of the RTCInboundRtpStreamStats dictionary is a floating-point value indicating the average RTCP transmission interval, in seconds.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/averageRtcpInterval">RTCInboundRtpStreamStats.averageRtcpInterval - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-averagertcpinterval">RTCInboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder averageRtcpInterval(final double averageRtcpInterval) {
      setAverageRtcpInterval( averageRtcpInterval );
      return this;
    }

    /**
     * The RTCInboundRtpStreamStats dictionary's bytesReceived property is an integer value which indicates the total number of bytes received so far from this synchronization source (SSRC).
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/bytesReceived">RTCInboundRtpStreamStats.bytesReceived - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-bytesreceived">RTCInboundRtpStreamStats.bytesReceived - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder bytesReceived(final int bytesReceived) {
      setBytesReceived( bytesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder concealedSamples(final int concealedSamples) {
      setConcealedSamples( concealedSamples );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder concealmentEvents(final int concealmentEvents) {
      setConcealmentEvents( concealmentEvents );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder decoderImplementation(@Nonnull final String decoderImplementation) {
      setDecoderImplementation( decoderImplementation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder estimatedPlayoutTimestamp(final double estimatedPlayoutTimestamp) {
      setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
      return this;
    }

    /**
     * The fecPacketsDiscarded property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of RTP Forward Error Correction (FEC) packets that have been discarded.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsDiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsdiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder fecPacketsDiscarded(final int fecPacketsDiscarded) {
      setFecPacketsDiscarded( fecPacketsDiscarded );
      return this;
    }

    /**
     * The fecPacketsReceived property of the RTCInboundRtpStreamStats dictionary indicates how many Forward Error Correction (FEC) packets have been received by this RTP receiver from the remote peer.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsReceived">RTCInboundRtpStreamStats.fecPacketsReceived - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsreceived">RTCInboundRtpStreamStats.fecPacketsReceived - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder fecPacketsReceived(final int fecPacketsReceived) {
      setFecPacketsReceived( fecPacketsReceived );
      return this;
    }

    /**
     * The firCount property of the RTCInboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) packets have been sent by the receiver to the sender.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/firCount">RTCInboundRtpStreamStats.firCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fircount">RTCInboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder firCount(final int firCount) {
      setFirCount( firCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameBitDepth(final int frameBitDepth) {
      setFrameBitDepth( frameBitDepth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameHeight(final int frameHeight) {
      setFrameHeight( frameHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameWidth(final int frameWidth) {
      setFrameWidth( frameWidth );
      return this;
    }

    /**
     * The framesDecoded property of the RTCInboundRtpStreamStats dictionary indicates the total number of frames which have been decoded successfully for this media source.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/framesDecoded">RTCInboundRtpStreamStats.framesDecoded - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-framesdecoded">RTCInboundRtpStreamStats.framesDecoded - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder framesDecoded(final int framesDecoded) {
      setFramesDecoded( framesDecoded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesPerSecond(final double framesPerSecond) {
      setFramesPerSecond( framesPerSecond );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesReceived(final int framesReceived) {
      setFramesReceived( framesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headerBytesReceived(final int headerBytesReceived) {
      setHeaderBytesReceived( headerBytesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder insertedSamplesForDeceleration(final int insertedSamplesForDeceleration) {
      setInsertedSamplesForDeceleration( insertedSamplesForDeceleration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder jitterBufferDelay(final double jitterBufferDelay) {
      setJitterBufferDelay( jitterBufferDelay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
      setJitterBufferEmittedCount( jitterBufferEmittedCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keyFramesDecoded(final int keyFramesDecoded) {
      setKeyFramesDecoded( keyFramesDecoded );
      return this;
    }

    /**
     * The lastPacketReceivedTimestamp property of the RTCInboundRtpStreamStats dictionary indicates the time at which the most recently received packet arrived from this source.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/lastPacketReceivedTimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-lastpacketreceivedtimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder lastPacketReceivedTimestamp(final double lastPacketReceivedTimestamp) {
      setLastPacketReceivedTimestamp( lastPacketReceivedTimestamp );
      return this;
    }

    /**
     * The nackCount property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of times the receiver sent a NACK packet to the sender.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/nackCount">RTCInboundRtpStreamStats.nackCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-nackcount">RTCInboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder nackCount(final int nackCount) {
      setNackCount( nackCount );
      return this;
    }

    /**
     * The packetsDuplicated property of the RTCInboundRtpStreamStats dictionary indicates the total number of packets discarded because they were duplicates of previously-received packets.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsDuplicated">RTCInboundRtpStreamStats.packetsDuplicated - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsduplicated">RTCInboundRtpStreamStats.packetsDuplicated - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder packetsDuplicated(final int packetsDuplicated) {
      setPacketsDuplicated( packetsDuplicated );
      return this;
    }

    /**
     * The packetsFailedDecryption property of the RTCInboundRtpStreamStats dictionary indicates the total number of RTP packets which failed to be decrypted successfully after being received by the local end of the connection during this session.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsFailedDecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsfaileddecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder packetsFailedDecryption(final int packetsFailedDecryption) {
      setPacketsFailedDecryption( packetsFailedDecryption );
      return this;
    }

    /**
     * The perDscpPacketsReceived property of the RTCInboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets received for that DCSP.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/perDscpPacketsReceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-perdscppacketsreceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder perDscpPacketsReceived(
        @Nonnull final JsPropertyMap<Double> perDscpPacketsReceived) {
      setPerDscpPacketsReceived( perDscpPacketsReceived );
      return this;
    }

    /**
     * The pliCount property of the RTCInboundRtpStreamStats dictionary states the number of times the RTCRtpReceiver described by these statistics sent a Picture Loss Indication (PLI) packet to the sender.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/pliCount">RTCInboundRtpStreamStats.pliCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-plicount">RTCInboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder pliCount(final int pliCount) {
      setPliCount( pliCount );
      return this;
    }

    /**
     * The qpSum property of the RTCInboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame sent or received to date on the video track corresponding to this RTCInboundRtpStreamStats object.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/qpSum">RTCInboundRtpStreamStats.qpSum - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-qpsum">RTCInboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder qpSum(final int qpSum) {
      setQpSum( qpSum );
      return this;
    }

    /**
     * The remoteId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCRemoteOutboundRtpStreamStats object representing the remote peer's RTCRtpSender which is sending the media to the local peer.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/remoteId">RTCInboundRtpStreamStats.remoteId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-remoteid">RTCInboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder remoteId(@Nonnull final String remoteId) {
      setRemoteId( remoteId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder removedSamplesForAcceleration(final int removedSamplesForAcceleration) {
      setRemovedSamplesForAcceleration( removedSamplesForAcceleration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder samplesDecodedWithCelt(final int samplesDecodedWithCelt) {
      setSamplesDecodedWithCelt( samplesDecodedWithCelt );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder samplesDecodedWithSilk(final int samplesDecodedWithSilk) {
      setSamplesDecodedWithSilk( samplesDecodedWithSilk );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder silentConcealedSamples(final int silentConcealedSamples) {
      setSilentConcealedSamples( silentConcealedSamples );
      return this;
    }

    /**
     * The sliCount property of the RTCInboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpReceiver for which this object provdes statistics sent to the remote RTCRtpSender.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/sliCount">RTCInboundRtpStreamStats.sliCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-slicount">RTCInboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder sliCount(final int sliCount) {
      setSliCount( sliCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalAudioEnergy(final double totalAudioEnergy) {
      setTotalAudioEnergy( totalAudioEnergy );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalDecodeTime(final double totalDecodeTime) {
      setTotalDecodeTime( totalDecodeTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalInterFrameDelay(final double totalInterFrameDelay) {
      setTotalInterFrameDelay( totalInterFrameDelay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalProcessingDelay(final double totalProcessingDelay) {
      setTotalProcessingDelay( totalProcessingDelay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSamplesDecoded(final int totalSamplesDecoded) {
      setTotalSamplesDecoded( totalSamplesDecoded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSamplesDuration(final double totalSamplesDuration) {
      setTotalSamplesDuration( totalSamplesDuration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSamplesReceived(final int totalSamplesReceived) {
      setTotalSamplesReceived( totalSamplesReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSquaredInterFrameDelay(final double totalSquaredInterFrameDelay) {
      setTotalSquaredInterFrameDelay( totalSquaredInterFrameDelay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder voiceActivityFlag(final boolean voiceActivityFlag) {
      setVoiceActivityFlag( voiceActivityFlag );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fractionLost(final double fractionLost) {
      setFractionLost( fractionLost );
      return this;
    }

    /**
     * The trackId property of the RTCInboundRtpStreamStats dictionary indicates the id of the RTCReceiverAudioTrackAttachmentStats or RTCReceiverVideoTrackAttachmentStats object representing the MediaStreamTrack which is receiving the incoming media.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/trackId">RTCInboundRtpStreamStats.trackId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-trackId">RTCInboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder trackId(@Nonnull final String trackId) {
      setTrackId( trackId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstDiscardCount(final int burstDiscardCount) {
      setBurstDiscardCount( burstDiscardCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstDiscardRate(final double burstDiscardRate) {
      setBurstDiscardRate( burstDiscardRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstLossCount(final int burstLossCount) {
      setBurstLossCount( burstLossCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstLossRate(final double burstLossRate) {
      setBurstLossRate( burstLossRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstPacketsDiscarded(final int burstPacketsDiscarded) {
      setBurstPacketsDiscarded( burstPacketsDiscarded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder burstPacketsLost(final int burstPacketsLost) {
      setBurstPacketsLost( burstPacketsLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder framesDropped(final int framesDropped) {
      setFramesDropped( framesDropped );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fullFramesLost(final int fullFramesLost) {
      setFullFramesLost( fullFramesLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder gapDiscardRate(final double gapDiscardRate) {
      setGapDiscardRate( gapDiscardRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder gapLossRate(final double gapLossRate) {
      setGapLossRate( gapLossRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder jitter(final double jitter) {
      setJitter( jitter );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsDiscarded(final int packetsDiscarded) {
      setPacketsDiscarded( packetsDiscarded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsLost(final int packetsLost) {
      setPacketsLost( packetsLost );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsReceived(final int packetsReceived) {
      setPacketsReceived( packetsReceived );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsRepaired(final int packetsRepaired) {
      setPacketsRepaired( packetsRepaired );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder partialFramesLost(final int partialFramesLost) {
      setPartialFramesLost( partialFramesLost );
      return this;
    }

    /**
     * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">RTCRtpStreamStats.codecId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder codecId(@Nonnull final String codecId) {
      setCodecId( codecId );
      return this;
    }

    /**
     * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">RTCRtpStreamStats.transportId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder transportId(@Nonnull final String transportId) {
      setTransportId( transportId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder averageRTCPInterval(final double averageRTCPInterval) {
      setAverageRTCPInterval( averageRTCPInterval );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mediaType(@Nonnull final String mediaType) {
      setMediaType( mediaType );
      return this;
    }
  }
}
