package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOptional;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface EncodedVideoChunkOutputCallback {
  void onInvoke(@Nonnull EncodedVideoChunk chunk,
      @Nonnull @JsOptional EncodedVideoChunkMetadata metadata);
}
