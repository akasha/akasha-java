package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface TransformerFlushCallback {
  @JsNonNull
  Promise<Void> onInvoke(@Nonnull TransformStreamDefaultController controller);
}
