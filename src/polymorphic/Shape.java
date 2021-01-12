package polymorphic;

public class Shape {
    public abstract class shape{
        //特征：周长、面积
        private float area;
        private float circumference;
        //行为：计算面积呢、周长
        public abstract float calcArea();
        public abstract float calccircumference();
    }
}
