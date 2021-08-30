package akasha.rtc;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface GenerateAssertionCallback {
  @JsNonNull
  Promise<RTCIdentityAssertionResult> onInvoke(@Nonnull String contents, @Nonnull String origin,
      @Nonnull RTCIdentityProviderOptions options);
}
