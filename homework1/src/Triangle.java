
import java.lang.Math;
public class Triangle {
    private double s1;
    private double s2;
    private double s3;



    public Triangle(double s1, double s2, double s3){
        super();
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

    }

    public Triangle(){
        super();
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }



    public void setS3(double s3) {
        this.s3 = s3;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }




    public Boolean checkTriangle() {
        if ((this.s1 + this.s2 > this.s3) &&
                (this.s2 + this.s3 > this.s1) &&
                (this.s3 + this.s1 > this.s2)) {
            return true;
        } else {
            return false;
        }
    }

    public double perimetrTriangle(){
        if (this.checkTriangle() == true) {
            return this.s1 + this.s2 + this.s3;
        }else{
            System.out.println("ТРЕУГОЛЬНИК СО СТОРОНАМИ " + this.s1 + "  " + this.s2 + "  " + this.s3 + " НЕВЕРНЫЙ");
            System.out.println("Сума двох сторон треугольника должна быть больше чем третья сторона");
            throw new ArithmeticException("Сума двох сторон треугольника должна быть больше чем третья сторона");
        }
    }

    public double areaTriangle(){
        double p = this.perimetrTriangle();
        double half_p = p / 2;
        double a = half_p * (half_p - this.s1) * (half_p - this.s2) * (half_p - this.s3);

        return Math.sqrt(a);

    }





    @Override
    public String toString() {
        return "Triangle{" +
                "len_s1=" + s1 +
                ", len_s2=" + s2 +
                ", len_s3=" + s3 +
                '}';
    }
}
