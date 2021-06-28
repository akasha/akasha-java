package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@Documented
@MagicConstant(
    valuesFromClass = GPUPipelineStatisticName.class
)
public @interface GPUPipelineStatisticName {
  @Nonnull
  String clipper_invocations = "clipper-invocations";

  @Nonnull
  String clipper_primitives_out = "clipper-primitives-out";

  @Nonnull
  String compute_shader_invocations = "compute-shader-invocations";

  @Nonnull
  String fragment_shader_invocations = "fragment-shader-invocations";

  @Nonnull
  String vertex_shader_invocations = "vertex-shader-invocations";

  final class Util {
    private Util() {
    }

    @GPUPipelineStatisticName
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUPipelineStatisticName.clipper_invocations.equals( value ) || GPUPipelineStatisticName.clipper_primitives_out.equals( value ) || GPUPipelineStatisticName.compute_shader_invocations.equals( value ) || GPUPipelineStatisticName.fragment_shader_invocations.equals( value ) || GPUPipelineStatisticName.vertex_shader_invocations.equals( value );
    }
  }
}
