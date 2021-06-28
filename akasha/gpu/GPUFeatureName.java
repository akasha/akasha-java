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
    valuesFromClass = GPUFeatureName.class
)
public @interface GPUFeatureName {
  @Nonnull
  String depth_clamping = "depth-clamping";

  @Nonnull
  String depth24unorm_stencil8 = "depth24unorm-stencil8";

  @Nonnull
  String depth32float_stencil8 = "depth32float-stencil8";

  @Nonnull
  String pipeline_statistics_query = "pipeline-statistics-query";

  @Nonnull
  String texture_compression_bc = "texture-compression-bc";

  @Nonnull
  String timestamp_query = "timestamp-query";

  final class Util {
    private Util() {
    }

    @GPUFeatureName
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUFeatureName.depth_clamping.equals( value ) || GPUFeatureName.depth24unorm_stencil8.equals( value ) || GPUFeatureName.depth32float_stencil8.equals( value ) || GPUFeatureName.pipeline_statistics_query.equals( value ) || GPUFeatureName.texture_compression_bc.equals( value ) || GPUFeatureName.timestamp_query.equals( value );
    }
  }
}
