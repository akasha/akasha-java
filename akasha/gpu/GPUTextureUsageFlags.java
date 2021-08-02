package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    flags = {
        GPUTextureUsage.COPY_SRC,
        GPUTextureUsage.COPY_DST,
        GPUTextureUsage.SHADER_READ,
        GPUTextureUsage.STORAGE,
        GPUTextureUsage.RENDER_ATTACHMENT
    }
)
public @interface GPUTextureUsageFlags {
  final class Util {
    private Util() {
    }

    @GPUTextureUsageFlags
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@GPUTextureUsageFlags annotated value must be one of [GPUTextureUsage.COPY_SRC, GPUTextureUsage.COPY_DST, GPUTextureUsage.SHADER_READ, GPUTextureUsage.STORAGE, GPUTextureUsage.RENDER_ATTACHMENT] but is " + value;
    }

    public static boolean isValid(final int value) {
      return GPUTextureUsage.COPY_SRC == value || GPUTextureUsage.COPY_DST == value || GPUTextureUsage.SHADER_READ == value || GPUTextureUsage.STORAGE == value || GPUTextureUsage.RENDER_ATTACHMENT == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return GPUTextureUsage.COPY_SRC == value ? "COPY_SRC" : GPUTextureUsage.COPY_DST == value ? "COPY_DST" : GPUTextureUsage.SHADER_READ == value ? "SHADER_READ" : GPUTextureUsage.STORAGE == value ? "STORAGE" : GPUTextureUsage.RENDER_ATTACHMENT == value ? "RENDER_ATTACHMENT" : "Unknown value " + value;
    }
  }
}
