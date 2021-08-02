package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    flags = {
        GPUBufferUsage.MAP_READ,
        GPUBufferUsage.MAP_WRITE,
        GPUBufferUsage.COPY_SRC,
        GPUBufferUsage.COPY_DST,
        GPUBufferUsage.INDEX,
        GPUBufferUsage.VERTEX,
        GPUBufferUsage.UNIFORM,
        GPUBufferUsage.STORAGE,
        GPUBufferUsage.INDIRECT,
        GPUBufferUsage.QUERY_RESOLVE
    }
)
public @interface GPUBufferUsageFlags {
  final class Util {
    private Util() {
    }

    @GPUBufferUsageFlags
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@GPUBufferUsageFlags annotated value must be one of [GPUBufferUsage.MAP_READ, GPUBufferUsage.MAP_WRITE, GPUBufferUsage.COPY_SRC, GPUBufferUsage.COPY_DST, GPUBufferUsage.INDEX, GPUBufferUsage.VERTEX, GPUBufferUsage.UNIFORM, GPUBufferUsage.STORAGE, GPUBufferUsage.INDIRECT, GPUBufferUsage.QUERY_RESOLVE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return GPUBufferUsage.MAP_READ == value || GPUBufferUsage.MAP_WRITE == value || GPUBufferUsage.COPY_SRC == value || GPUBufferUsage.COPY_DST == value || GPUBufferUsage.INDEX == value || GPUBufferUsage.VERTEX == value || GPUBufferUsage.UNIFORM == value || GPUBufferUsage.STORAGE == value || GPUBufferUsage.INDIRECT == value || GPUBufferUsage.QUERY_RESOLVE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return GPUBufferUsage.MAP_READ == value ? "MAP_READ" : GPUBufferUsage.MAP_WRITE == value ? "MAP_WRITE" : GPUBufferUsage.COPY_SRC == value ? "COPY_SRC" : GPUBufferUsage.COPY_DST == value ? "COPY_DST" : GPUBufferUsage.INDEX == value ? "INDEX" : GPUBufferUsage.VERTEX == value ? "VERTEX" : GPUBufferUsage.UNIFORM == value ? "UNIFORM" : GPUBufferUsage.STORAGE == value ? "STORAGE" : GPUBufferUsage.INDIRECT == value ? "INDIRECT" : GPUBufferUsage.QUERY_RESOLVE == value ? "QUERY_RESOLVE" : "Unknown value " + value;
    }
  }
}
