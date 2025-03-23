class ComplexNumberDemo{
    public static void main(String[] args) {
        ComplexNumber cn1=new ComplexNumber(3,2);
        ComplexNumber cn2=new ComplexNumber(4,-2);

        ComplexNumber add= cn1.add(cn2);
        ComplexNumber mul=cn1.multply(cn2);

        System.out.println("Addition Operation");
        System.out.println(add);
        System.out.println("Multiplication Operation");
        System.out.println(mul);
    }
}

class ComplexNumber{
    private double real;
    private double imaginary;

    @Override
    public String toString() {
        return "ComplexNumber [real=" + real + ", imaginary=" + imaginary + "]";
    }

    public ComplexNumber(){
        this.real=0;
        this.imaginary=0;
    }

    public ComplexNumber(double real) {
        this.real = real;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber c){
        return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    public ComplexNumber multply(ComplexNumber c){
        double new_real=this.real*c.real - this.imaginary*c.imaginary;
        double new_imaginary=this.real*c.imaginary + this.imaginary*c.real;
        return new ComplexNumber(new_real, new_imaginary);
    }

    
}