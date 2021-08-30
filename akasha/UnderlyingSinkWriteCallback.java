package akasha;

import akasha.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface UnderlyingSinkWriteCallback {
  @JsNonNull
  Promise<Void> onInvoke(@DoNotAutobox @Nullable Object chunk,
      @Nonnull WritableStreamDefaultController controller);
}
