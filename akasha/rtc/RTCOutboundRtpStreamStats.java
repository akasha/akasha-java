package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCOutboundRtpStreamStats dictionary is the RTCStats-based object which provides metrics and statistics related to an outbound RTP stream being sent by an RTCRtpSender.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats">RTCOutboundRtpStreamStats - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#outboundrtpstats-dict*">RTCOutboundRtpStreamStats - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RTCOutboundRtpStreamStats extends RTCSentRtpStreamStats {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  /**
   * The averageRtcpInterval property of the RTCOutboundRtpStreamStats dictionary is a floating-point value indicating the average time that should pass between transmissions of RTCP packets on this stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/averageRtcpInterval">RTCOutboundRtpStreamStats.averageRtcpInterval - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-averagertcpinterval">RTCOutboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "averageRtcpInterval"
  )
  double averageRtcpInterval();

  /**
   * The averageRtcpInterval property of the RTCOutboundRtpStreamStats dictionary is a floating-point value indicating the average time that should pass between transmissions of RTCP packets on this stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/averageRtcpInterval">RTCOutboundRtpStreamStats.averageRtcpInterval - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-averagertcpinterval">RTCOutboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setAverageRtcpInterval(double averageRtcpInterval);

  @JsProperty(
      name = "bytesDiscardedOnSend"
  )
  int bytesDiscardedOnSend();

  @JsProperty
  void setBytesDiscardedOnSend(int bytesDiscardedOnSend);

  @JsProperty(
      name = "encoderImplementation"
  )
  String encoderImplementation();

  @JsProperty
  void setEncoderImplementation(@Nonnull String encoderImplementation);

  @JsProperty(
      name = "fecPacketsSent"
  )
  int fecPacketsSent();

  @JsProperty
  void setFecPacketsSent(int fecPacketsSent);

  /**
   * The firCount property of the RTCOutboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) that the remote RTCRtpReceiver has sent to this RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/firCount">RTCOutboundRtpStreamStats.firCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-fircount">RTCOutboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "firCount"
  )
  int firCount();

  /**
   * The firCount property of the RTCOutboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) that the remote RTCRtpReceiver has sent to this RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/firCount">RTCOutboundRtpStreamStats.firCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-fircount">RTCOutboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
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

  @JsProperty(
      name = "framesDiscardedOnSend"
  )
  int framesDiscardedOnSend();

  @JsProperty
  void setFramesDiscardedOnSend(int framesDiscardedOnSend);

  /**
   * The framesEncoded property of the RTCOutboundRtpStreamStats dictionary indicates the total number of frames that have been encoded by this RTCRtpSender for this media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/framesEncoded">RTCOutboundRtpStreamStats.framesEncoded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-framesencoded">RTCOutboundRtpStreamStats.framesEncoded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "framesEncoded"
  )
  int framesEncoded();

  /**
   * The framesEncoded property of the RTCOutboundRtpStreamStats dictionary indicates the total number of frames that have been encoded by this RTCRtpSender for this media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/framesEncoded">RTCOutboundRtpStreamStats.framesEncoded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-framesencoded">RTCOutboundRtpStreamStats.framesEncoded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFramesEncoded(int framesEncoded);

  @JsProperty(
      name = "framesPerSecond"
  )
  double framesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsProperty(
      name = "framesSent"
  )
  int framesSent();

  @JsProperty
  void setFramesSent(int framesSent);

  @JsProperty(
      name = "headerBytesSent"
  )
  int headerBytesSent();

  @JsProperty
  void setHeaderBytesSent(int headerBytesSent);

  @JsProperty(
      name = "hugeFramesSent"
  )
  int hugeFramesSent();

  @JsProperty
  void setHugeFramesSent(int hugeFramesSent);

  @JsProperty(
      name = "keyFramesEncoded"
  )
  int keyFramesEncoded();

  @JsProperty
  void setKeyFramesEncoded(int keyFramesEncoded);

  /**
   * The lastPacketSentTimestamp property of the RTCOutboundRtpStreamStats dictionary indicates the time at which the RTCRtpSender described by this RTCOutboundRtpStreamStats object last transmitted a packet to the remote receiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/lastPacketSentTimestamp">RTCOutboundRtpStreamStats.lastPacketSentTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-lastpacketsenttimestamp">RTCOutboundRtpStreamStats.lastPacketSentTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "lastPacketSentTimestamp"
  )
  double lastPacketSentTimestamp();

  /**
   * The lastPacketSentTimestamp property of the RTCOutboundRtpStreamStats dictionary indicates the time at which the RTCRtpSender described by this RTCOutboundRtpStreamStats object last transmitted a packet to the remote receiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/lastPacketSentTimestamp">RTCOutboundRtpStreamStats.lastPacketSentTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-lastpacketsenttimestamp">RTCOutboundRtpStreamStats.lastPacketSentTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setLastPacketSentTimestamp(double lastPacketSentTimestamp);

  @JsProperty(
      name = "mediaSourceId"
  )
  String mediaSourceId();

  @JsProperty
  void setMediaSourceId(@Nonnull String mediaSourceId);

  /**
   * The nackCount property of the RTCOutboundRtpStreamStats dictionary is a numeric value indicating the number of times the RTCRtpSender described by this object received a NACK packet from the remote receiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/nackCount">RTCOutboundRtpStreamStats.nackCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-nackcount">RTCOutboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "nackCount"
  )
  int nackCount();

  /**
   * The nackCount property of the RTCOutboundRtpStreamStats dictionary is a numeric value indicating the number of times the RTCRtpSender described by this object received a NACK packet from the remote receiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/nackCount">RTCOutboundRtpStreamStats.nackCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-nackcount">RTCOutboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setNackCount(int nackCount);

  @JsProperty(
      name = "packetsDiscardedOnSend"
  )
  int packetsDiscardedOnSend();

  @JsProperty
  void setPacketsDiscardedOnSend(int packetsDiscardedOnSend);

  /**
   * The perDscpPacketsSent property of the RTCOutboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets sent for that DCSP.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/perDscpPacketsSent">RTCOutboundRtpStreamStats.perDscpPacketsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-perDscpPacketsSent">RTCOutboundRtpStreamStats.perDscpPacketsSent - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "perDscpPacketsSent"
  )
  JsPropertyMap<Double> perDscpPacketsSent();

  /**
   * The perDscpPacketsSent property of the RTCOutboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets sent for that DCSP.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/perDscpPacketsSent">RTCOutboundRtpStreamStats.perDscpPacketsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-perDscpPacketsSent">RTCOutboundRtpStreamStats.perDscpPacketsSent - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPerDscpPacketsSent(@Nonnull JsPropertyMap<Double> perDscpPacketsSent);

  /**
   * The pliCount property of the RTCOutboundRtpStreamStats dictionary states the number of times the remote peer's RTCRtpReceiver sent a Picture Loss Indication (PLI) packet to the RTCRtpSender for which this object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/pliCount">RTCOutboundRtpStreamStats.pliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-plicount">RTCOutboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "pliCount"
  )
  int pliCount();

  /**
   * The pliCount property of the RTCOutboundRtpStreamStats dictionary states the number of times the remote peer's RTCRtpReceiver sent a Picture Loss Indication (PLI) packet to the RTCRtpSender for which this object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/pliCount">RTCOutboundRtpStreamStats.pliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-plicount">RTCOutboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPliCount(int pliCount);

  /**
   * The qpSum property of the RTCOutboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame this sender has produced to date on the video track corresponding to this RTCOutboundRtpStreamStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/qpSum">RTCOutboundRtpStreamStats.qpSum - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-qpsum">RTCOutboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "qpSum"
  )
  int qpSum();

  /**
   * The qpSum property of the RTCOutboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame this sender has produced to date on the video track corresponding to this RTCOutboundRtpStreamStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/qpSum">RTCOutboundRtpStreamStats.qpSum - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-qpsum">RTCOutboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setQpSum(int qpSum);

  @JsProperty(
      name = "qualityLimitationDurations"
  )
  JsPropertyMap<Double> qualityLimitationDurations();

  @JsProperty
  void setQualityLimitationDurations(@Nonnull JsPropertyMap<Double> qualityLimitationDurations);

  /**
   * The qualityLimitationReason property of the RTCOutboundRtpStreamStats dictionary is a string indicating the reason why the media quality in the stream is currently being reduced by the codec during encoding, or none if no quality reduction is being performed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason">RTCOutboundRtpStreamStats.qualityLimitationReason - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-qualityLimitationReason">RTCOutboundRtpStreamStats.qualityLimitationReason - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "qualityLimitationReason"
  )
  @RTCQualityLimitationReason
  String qualityLimitationReason();

  /**
   * The qualityLimitationReason property of the RTCOutboundRtpStreamStats dictionary is a string indicating the reason why the media quality in the stream is currently being reduced by the codec during encoding, or none if no quality reduction is being performed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason">RTCOutboundRtpStreamStats.qualityLimitationReason - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-qualityLimitationReason">RTCOutboundRtpStreamStats.qualityLimitationReason - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setQualityLimitationReason(
      @RTCQualityLimitationReason @Nonnull String qualityLimitationReason);

  @JsProperty(
      name = "qualityLimitationResolutionChanges"
  )
  int qualityLimitationResolutionChanges();

  @JsProperty
  void setQualityLimitationResolutionChanges(int qualityLimitationResolutionChanges);

  /**
   * The remoteId property of the RTCOutboundRtpStreamStats dictionary specifies the id of the RTCRemoteInboundRtpStreamStats object representing the remote peer's RTCRtpReceiver which is sending the media to the local peer for this SSRC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/remoteId">RTCOutboundRtpStreamStats.remoteId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-remoteid">RTCOutboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "remoteId"
  )
  String remoteId();

  /**
   * The remoteId property of the RTCOutboundRtpStreamStats dictionary specifies the id of the RTCRemoteInboundRtpStreamStats object representing the remote peer's RTCRtpReceiver which is sending the media to the local peer for this SSRC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/remoteId">RTCOutboundRtpStreamStats.remoteId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-remoteid">RTCOutboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setRemoteId(@Nonnull String remoteId);

  @JsProperty(
      name = "retransmittedBytesSent"
  )
  int retransmittedBytesSent();

  @JsProperty
  void setRetransmittedBytesSent(int retransmittedBytesSent);

  @JsProperty(
      name = "retransmittedPacketsSent"
  )
  int retransmittedPacketsSent();

  @JsProperty
  void setRetransmittedPacketsSent(int retransmittedPacketsSent);

  @JsProperty(
      name = "rid"
  )
  String rid();

  @JsProperty
  void setRid(@Nonnull String rid);

  @JsProperty(
      name = "rtxSsrc"
  )
  int rtxSsrc();

  @JsProperty
  void setRtxSsrc(int rtxSsrc);

  @JsProperty(
      name = "samplesEncodedWithCelt"
  )
  int samplesEncodedWithCelt();

  @JsProperty
  void setSamplesEncodedWithCelt(int samplesEncodedWithCelt);

  @JsProperty(
      name = "samplesEncodedWithSilk"
  )
  int samplesEncodedWithSilk();

  @JsProperty
  void setSamplesEncodedWithSilk(int samplesEncodedWithSilk);

  @JsProperty(
      name = "senderId"
  )
  String senderId();

  @JsProperty
  void setSenderId(@Nonnull String senderId);

  /**
   * The sliCount property of the RTCOutboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpSender received from the remote RTCRtpReceiver for the RTP stream described by this object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/sliCount">RTCOutboundRtpStreamStats.sliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-slicount">RTCOutboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "sliCount"
  )
  int sliCount();

  /**
   * The sliCount property of the RTCOutboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpSender received from the remote RTCRtpReceiver for the RTP stream described by this object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/sliCount">RTCOutboundRtpStreamStats.sliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-slicount">RTCOutboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setSliCount(int sliCount);

  @JsProperty(
      name = "targetBitrate"
  )
  double targetBitrate();

  @JsProperty
  void setTargetBitrate(double targetBitrate);

  @JsProperty(
      name = "totalEncodeTime"
  )
  double totalEncodeTime();

  @JsProperty
  void setTotalEncodeTime(double totalEncodeTime);

  @JsProperty(
      name = "totalEncodedBytesTarget"
  )
  int totalEncodedBytesTarget();

  @JsProperty
  void setTotalEncodedBytesTarget(int totalEncodedBytesTarget);

  @JsProperty(
      name = "totalPacketSendDelay"
  )
  double totalPacketSendDelay();

  @JsProperty
  void setTotalPacketSendDelay(double totalPacketSendDelay);

  @JsProperty(
      name = "totalSamplesSent"
  )
  int totalSamplesSent();

  @JsProperty
  void setTotalSamplesSent(int totalSamplesSent);

  @JsProperty(
      name = "voiceActivityFlag"
  )
  boolean voiceActivityFlag();

  @JsProperty
  void setVoiceActivityFlag(boolean voiceActivityFlag);

  /**
   * The trackId property of the RTCOutboundRtpStreamStats dictionary indicates the id of the RTCSenderAudioTrackAttachmentStats or RTCSenderVideoTrackAttachmentStats object representing the MediaStreamTrack which is being sent on this stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/trackId">RTCOutboundRtpStreamStats.trackId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-trackId">RTCOutboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "trackId"
  )
  String trackId();

  /**
   * The trackId property of the RTCOutboundRtpStreamStats dictionary indicates the id of the RTCSenderAudioTrackAttachmentStats or RTCSenderVideoTrackAttachmentStats object representing the MediaStreamTrack which is being sent on this stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/trackId">RTCOutboundRtpStreamStats.trackId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-trackId">RTCOutboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setTrackId(@Nonnull String trackId);

  /**
   * The RTCOutboundRtpStreamStats dictionary is the RTCStats-based object which provides metrics and statistics related to an outbound RTP stream being sent by an RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats">RTCOutboundRtpStreamStats - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#outboundrtpstats-dict*">RTCOutboundRtpStreamStats - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends RTCOutboundRtpStreamStats {
    /**
     * The averageRtcpInterval property of the RTCOutboundRtpStreamStats dictionary is a floating-point value indicating the average time that should pass between transmissions of RTCP packets on this stream.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/averageRtcpInterval">RTCOutboundRtpStreamStats.averageRtcpInterval - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-averagertcpinterval">RTCOutboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder averageRtcpInterval(final double averageRtcpInterval) {
      setAverageRtcpInterval( averageRtcpInterval );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bytesDiscardedOnSend(final int bytesDiscardedOnSend) {
      setBytesDiscardedOnSend( bytesDiscardedOnSend );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder encoderImplementation(@Nonnull final String encoderImplementation) {
      setEncoderImplementation( encoderImplementation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fecPacketsSent(final int fecPacketsSent) {
      setFecPacketsSent( fecPacketsSent );
      return this;
    }

    /**
     * The firCount property of the RTCOutboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) that the remote RTCRtpReceiver has sent to this RTCRtpSender.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/firCount">RTCOutboundRtpStreamStats.firCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-fircount">RTCOutboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
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

    @JsOverlay
    @Nonnull
    default Builder framesDiscardedOnSend(final int framesDiscardedOnSend) {
      setFramesDiscardedOnSend( framesDiscardedOnSend );
      return this;
    }

    /**
     * The framesEncoded property of the RTCOutboundRtpStreamStats dictionary indicates the total number of frames that have been encoded by this RTCRtpSender for this media source.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/framesEncoded">RTCOutboundRtpStreamStats.framesEncoded - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-framesencoded">RTCOutboundRtpStreamStats.framesEncoded - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder framesEncoded(final int framesEncoded) {
      setFramesEncoded( framesEncoded );
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
    default Builder framesSent(final int framesSent) {
      setFramesSent( framesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder headerBytesSent(final int headerBytesSent) {
      setHeaderBytesSent( headerBytesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder hugeFramesSent(final int hugeFramesSent) {
      setHugeFramesSent( hugeFramesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keyFramesEncoded(final int keyFramesEncoded) {
      setKeyFramesEncoded( keyFramesEncoded );
      return this;
    }

    /**
     * The lastPacketSentTimestamp property of the RTCOutboundRtpStreamStats dictionary indicates the time at which the RTCRtpSender described by this RTCOutboundRtpStreamStats object last transmitted a packet to the remote receiver.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/lastPacketSentTimestamp">RTCOutboundRtpStreamStats.lastPacketSentTimestamp - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-lastpacketsenttimestamp">RTCOutboundRtpStreamStats.lastPacketSentTimestamp - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder lastPacketSentTimestamp(final double lastPacketSentTimestamp) {
      setLastPacketSentTimestamp( lastPacketSentTimestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mediaSourceId(@Nonnull final String mediaSourceId) {
      setMediaSourceId( mediaSourceId );
      return this;
    }

    /**
     * The nackCount property of the RTCOutboundRtpStreamStats dictionary is a numeric value indicating the number of times the RTCRtpSender described by this object received a NACK packet from the remote receiver.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/nackCount">RTCOutboundRtpStreamStats.nackCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-nackcount">RTCOutboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder nackCount(final int nackCount) {
      setNackCount( nackCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder packetsDiscardedOnSend(final int packetsDiscardedOnSend) {
      setPacketsDiscardedOnSend( packetsDiscardedOnSend );
      return this;
    }

    /**
     * The perDscpPacketsSent property of the RTCOutboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets sent for that DCSP.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/perDscpPacketsSent">RTCOutboundRtpStreamStats.perDscpPacketsSent - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-perDscpPacketsSent">RTCOutboundRtpStreamStats.perDscpPacketsSent - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder perDscpPacketsSent(@Nonnull final JsPropertyMap<Double> perDscpPacketsSent) {
      setPerDscpPacketsSent( perDscpPacketsSent );
      return this;
    }

    /**
     * The pliCount property of the RTCOutboundRtpStreamStats dictionary states the number of times the remote peer's RTCRtpReceiver sent a Picture Loss Indication (PLI) packet to the RTCRtpSender for which this object provides statistics.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/pliCount">RTCOutboundRtpStreamStats.pliCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-plicount">RTCOutboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder pliCount(final int pliCount) {
      setPliCount( pliCount );
      return this;
    }

    /**
     * The qpSum property of the RTCOutboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame this sender has produced to date on the video track corresponding to this RTCOutboundRtpStreamStats object.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/qpSum">RTCOutboundRtpStreamStats.qpSum - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-qpsum">RTCOutboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder qpSum(final int qpSum) {
      setQpSum( qpSum );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder qualityLimitationDurations(
        @Nonnull final JsPropertyMap<Double> qualityLimitationDurations) {
      setQualityLimitationDurations( qualityLimitationDurations );
      return this;
    }

    /**
     * The qualityLimitationReason property of the RTCOutboundRtpStreamStats dictionary is a string indicating the reason why the media quality in the stream is currently being reduced by the codec during encoding, or none if no quality reduction is being performed.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason">RTCOutboundRtpStreamStats.qualityLimitationReason - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-qualityLimitationReason">RTCOutboundRtpStreamStats.qualityLimitationReason - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder qualityLimitationReason(
        @RTCQualityLimitationReason @Nonnull final String qualityLimitationReason) {
      setQualityLimitationReason( qualityLimitationReason );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder qualityLimitationResolutionChanges(
        final int qualityLimitationResolutionChanges) {
      setQualityLimitationResolutionChanges( qualityLimitationResolutionChanges );
      return this;
    }

    /**
     * The remoteId property of the RTCOutboundRtpStreamStats dictionary specifies the id of the RTCRemoteInboundRtpStreamStats object representing the remote peer's RTCRtpReceiver which is sending the media to the local peer for this SSRC.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/remoteId">RTCOutboundRtpStreamStats.remoteId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-remoteid">RTCOutboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder remoteId(@Nonnull final String remoteId) {
      setRemoteId( remoteId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder retransmittedBytesSent(final int retransmittedBytesSent) {
      setRetransmittedBytesSent( retransmittedBytesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder retransmittedPacketsSent(final int retransmittedPacketsSent) {
      setRetransmittedPacketsSent( retransmittedPacketsSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rid(@Nonnull final String rid) {
      setRid( rid );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rtxSsrc(final int rtxSsrc) {
      setRtxSsrc( rtxSsrc );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder samplesEncodedWithCelt(final int samplesEncodedWithCelt) {
      setSamplesEncodedWithCelt( samplesEncodedWithCelt );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder samplesEncodedWithSilk(final int samplesEncodedWithSilk) {
      setSamplesEncodedWithSilk( samplesEncodedWithSilk );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder senderId(@Nonnull final String senderId) {
      setSenderId( senderId );
      return this;
    }

    /**
     * The sliCount property of the RTCOutboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpSender received from the remote RTCRtpReceiver for the RTP stream described by this object.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/sliCount">RTCOutboundRtpStreamStats.sliCount - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-slicount">RTCOutboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder sliCount(final int sliCount) {
      setSliCount( sliCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder targetBitrate(final double targetBitrate) {
      setTargetBitrate( targetBitrate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalEncodeTime(final double totalEncodeTime) {
      setTotalEncodeTime( totalEncodeTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalEncodedBytesTarget(final int totalEncodedBytesTarget) {
      setTotalEncodedBytesTarget( totalEncodedBytesTarget );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalPacketSendDelay(final double totalPacketSendDelay) {
      setTotalPacketSendDelay( totalPacketSendDelay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder totalSamplesSent(final int totalSamplesSent) {
      setTotalSamplesSent( totalSamplesSent );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder voiceActivityFlag(final boolean voiceActivityFlag) {
      setVoiceActivityFlag( voiceActivityFlag );
      return this;
    }

    /**
     * The trackId property of the RTCOutboundRtpStreamStats dictionary indicates the id of the RTCSenderAudioTrackAttachmentStats or RTCSenderVideoTrackAttachmentStats object representing the MediaStreamTrack which is being sent on this stream.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOutboundRtpStreamStats/trackId">RTCOutboundRtpStreamStats.trackId - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-RTCOutboundRtpStreamStats-trackId">RTCOutboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder trackId(@Nonnull final String trackId) {
      setTrackId( trackId );
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
    default Builder packetsSent(final int packetsSent) {
      setPacketsSent( packetsSent );
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
     * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">RTCRtpStreamStats.kind - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder kind(@Nonnull final String kind) {
      setKind( kind );
      return this;
    }

    /**
     * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">RTCRtpStreamStats.ssrc - Identifiers for WebRTC's Statistics API</a>
     */
    @JsOverlay
    @Nonnull
    default Builder ssrc(final int ssrc) {
      setSsrc( ssrc );
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

    /**
     * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">RTCStats.id - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder id(@Nonnull final String id) {
      setId( id );
      return this;
    }

    /**
     * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">RTCStats.timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder timestamp(final double timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    /**
     * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
     * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">RTCStats.type - WebRTC 1.0: Real-time Communication Between Browsers</a>
     */
    @JsOverlay
    @Nonnull
    default Builder type(@RTCStatsType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
