package akasha.core;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ParseReviverFn {
  @Nullable
  Any onInvoke(@Nonnull String key, @DoNotAutobox @Nullable Object value);
}
