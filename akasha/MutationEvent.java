package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MutationEvent interface provides event properties that are specific to modifications to the Document Object Model (DOM) hierarchy and nodes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationEvent">MutationEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MutationEvent"
)
public class MutationEvent extends Event {
  @JsOverlay
  public static final int ADDITION = 2;

  @JsOverlay
  public static final int MODIFICATION = 1;

  @JsOverlay
  public static final int REMOVAL = 3;

  protected MutationEvent() {
    super( null );
  }

  @JsProperty(
      name = "attrChange"
  )
  public native int attrChange();

  @JsProperty(
      name = "attrName"
  )
  @Nonnull
  public native String attrName();

  @JsProperty(
      name = "newValue"
  )
  @Nonnull
  public native String newValue();

  @JsProperty(
      name = "prevValue"
  )
  @Nonnull
  public native String prevValue();

  @JsProperty(
      name = "relatedNode"
  )
  @Nullable
  public native Node relatedNode();

  public native void initMutationEvent(@Nonnull String typeArg, boolean bubblesArg,
      boolean cancelableArg, @Nullable Node relatedNodeArg, @Nonnull String prevValueArg,
      @Nonnull String newValueArg, @Nonnull String attrNameArg, int attrChangeArg);

  public native void initMutationEvent(@Nonnull String typeArg, boolean bubblesArg,
      boolean cancelableArg, @Nullable Node relatedNodeArg, @Nonnull String prevValueArg,
      @Nonnull String newValueArg, @Nonnull String attrNameArg);

  public native void initMutationEvent(@Nonnull String typeArg, boolean bubblesArg,
      boolean cancelableArg, @Nullable Node relatedNodeArg, @Nonnull String prevValueArg,
      @Nonnull String newValueArg);

  public native void initMutationEvent(@Nonnull String typeArg, boolean bubblesArg,
      boolean cancelableArg, @Nullable Node relatedNodeArg, @Nonnull String prevValueArg);

  public native void initMutationEvent(@Nonnull String typeArg, boolean bubblesArg,
      boolean cancelableArg, @Nullable Node relatedNodeArg);

  public native void initMutationEvent(@Nonnull String typeArg, boolean bubblesArg,
      boolean cancelableArg);

  public native void initMutationEvent(@Nonnull String typeArg, boolean bubblesArg);

  public native void initMutationEvent(@Nonnull String typeArg);
}
