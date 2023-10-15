
import java.lang.Math;
public class Triangle {
    private float len_s1;
    private float len_s2;
    private float len_s3;



    public Triangle(float len_s1, float len_s2, float len_s3){
        super();
        this.len_s1 = len_s1;
        this.len_s2 = len_s2;
        this.len_s3 = len_s3;

    }

    public Triangle(){
        super();
    }

    public float getLen_s1() {
        return len_s1;
    }

    public float getLen_s2() {
        return len_s2;
    }

    public float getLen_s3() {
        return len_s3;
    }



    public void setLen_s3(float len_s3) {
        this.len_s3 = len_s3;
    }

    public void setLen_s2(float len_s2) {
        this.len_s2 = len_s2;
    }

    public void setLen_s1(float len_s1) {
        this.len_s1 = len_s1;
    }




    public Boolean checkTriangle() {
        if ((this.len_s1 + this.len_s2 > this.len_s3) &&
                (this.len_s2 + this.len_s3 > this.len_s1) &&
                (this.len_s3 + this.len_s1 > this.len_s2)) {
            return true;
        } else {
            return false;
        }
    }

    public float PerimetrTriangle(){
        if (this.checkTriangle() == true) {
            return this.len_s1 + this.len_s2 + this.len_s3;
        }else{
            System.out.println("ТРЕУГОЛЬНИК СО СТОРОНАМИ " + this.len_s1 + "  " + this.len_s2 + "  " + this.len_s3 + " НЕВЕРНЫЙ");
            System.out.println("Сума двох сторон треугольника должна быть больше чем третья сторона");
            throw new ArithmeticException("Сума двох сторон треугольника должна быть больше чем третья сторона");
        }
    }

    public double AreaTriangle(){
        float p = this.PerimetrTriangle();
        float half_p = p / 2;
        float a = half_p * (half_p - this.len_s1) * (half_p - this.len_s2) * (half_p - this.len_s3);

        return Math.sqrt(a);

    }









    @Override
    public String toString() {
        return "Triangle{" +
                "len_s1=" + len_s1 +
                ", len_s2=" + len_s2 +
                ", len_s3=" + len_s3 +
                '}';
    }
}
