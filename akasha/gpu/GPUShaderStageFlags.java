package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    flags = {
        GPUShaderStage.VERTEX,
        GPUShaderStage.FRAGMENT,
        GPUShaderStage.COMPUTE
    }
)
public @interface GPUShaderStageFlags {
  final class Util {
    private Util() {
    }

    @GPUShaderStageFlags
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@GPUShaderStageFlags annotated value must be one of [GPUShaderStage.VERTEX, GPUShaderStage.FRAGMENT, GPUShaderStage.COMPUTE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return GPUShaderStage.VERTEX == value || GPUShaderStage.FRAGMENT == value || GPUShaderStage.COMPUTE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return GPUShaderStage.VERTEX == value ? "VERTEX" : GPUShaderStage.FRAGMENT == value ? "FRAGMENT" : GPUShaderStage.COMPUTE == value ? "COMPUTE" : "Unknown value " + value;
    }
  }
}
