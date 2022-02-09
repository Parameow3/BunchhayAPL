/**
 * Trigonometry.java    :    This class is created for scientific calculator
 * Created on Monday, January 10th 2022      by Tan Bunchhay
 */
public class Trigonometry {
    /**
     * The method for find sin value in Radian
     * @param radian The input parameter in radian
     * @return the result of sin radian
     */
    public double sin(double radian){
        return Math.sin(radian);
    }

    /**
     * The method for find sin value in Degree
     * @param degree The input parameter in degree
     * @return the result of sin degree
     */
    public double sind(double degree){
        return Math.sin(degree);
    }

    /**
     * The method for find cos value in Radian
     * @param radian The input parameter in radian
     * @return the result of cos radian
     */
    public double cos(double radian){
        return Math.cos(radian);
    }

    /**
     * The method for find cos value in Degree
     * @param degree The input parameter in degree
     * @return the result of cos degree
     */
    public double cosd(double degree){
        return Math.cos(degree);
    }

    /**
     * The method for find tan value in Radian
     * @param radian The input parameter in radian
     * @return the result of tan radian
     */
    public double tan(double radian){
        return Math.tan(radian);
    }

    /**
     * The method for find tan value in Degree
     * @param degree The input parameter in degree
     * @return the result of tan degree
     */
    public double tand(double degree){
        return Math.tan(degree);
    }

    /**
     * The method for find square in integer
     * @param x the base parameter of square power in integer
     * @return the result of square value integer
     */
    public long square2int(double x){
        return (long) Math.pow(x, 2);
    }

    /**
     * The method for find square in floating-point
     * @param x the base parameter of square power int floating-point
     * @return the result of square value floating-point
     */

    public double square2(double x){
        return Math.pow(x, 2);
    }

    /**
     * The method for find cubic in integer
     * @param x the base parameter of cubic power in integer
     * @return the result of cubic value integer
     */
    public long square3int(double x){
        return (long) Math.pow(x, 3);
    }

    /**
     * The method for find cubic in floating-point
     * @param x the base parameter of cubic power int floating-point
     * @return the result of cubic value floating-point
     */
    public double square3(double x){
        return Math.pow(x, 3);
    }

    /**
     * The method for convert Degree to Radian, We use java library
     * @param degree The input parameter in degree
     * @return Radian from degree
     */
    public double degree2Radian(double degree){
        return Math.toRadians(degree);
    }
}
