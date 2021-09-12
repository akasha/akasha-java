package akasha.codecs;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOptional;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface EncodedAudioChunkOutputCallback {
  void onInvoke(@Nonnull EncodedAudioChunk output,
      @Nonnull @JsOptional EncodedAudioChunkMetadata metadata);
}
