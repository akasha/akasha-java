package akasha;

import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOptional;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface UnderlyingSinkAbortCallback {
  @Nonnull
  Promise<Void> onInvoke(@DoNotAutobox @Nullable @JsOptional Object reason);
}
