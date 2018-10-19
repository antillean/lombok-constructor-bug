import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
class Point {
  @NonNull private Double x;
  @NonNull private Double y;
  private Double z;
}
