import org.junit.jupiter.api.Test;

class PointTest {
  @Test
  void builder() {
    Point.builder()
        .x(1.0)
        .y(2.0)
        .build();
  }

  @Test
  void requiredArgsConstructor() {
    new Point(1.0, 2.0);
  }

  @Test
  void allArgsConstructor() {
    new Point(1.0, 2.0, 3.0);
  }

  @Test
  void noArgsConstructor() {
    Point point = new Point();
    point.setX(1.0);
    point.setY(2.0);
    point.setZ(3.0);
  }
}
