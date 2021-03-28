package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChannelMergerNode">ChannelMergerNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#channelmergernode">ChannelMergerNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ChannelMergerNode"
)
public class ChannelMergerNode extends AudioNode {
  /**
   * The ChannelMergerNode() constructor creates a new ChannelMergerNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChannelMergerNode/ChannelMergerNode">ChannelMergerNode.ChannelMergerNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#channelmergernode">ChannelMergerNode - Web Audio API</a>
   */
  public ChannelMergerNode(@Nonnull final BaseAudioContext context,
      @Nonnull final ChannelMergerOptions options) {
  }

  /**
   * The ChannelMergerNode() constructor creates a new ChannelMergerNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChannelMergerNode/ChannelMergerNode">ChannelMergerNode.ChannelMergerNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#channelmergernode">ChannelMergerNode - Web Audio API</a>
   */
  public ChannelMergerNode(@Nonnull final BaseAudioContext context) {
  }
}
