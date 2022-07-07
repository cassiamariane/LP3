package medias;

public class Media {

    double Av1, Av2;
    public Media(){
    }
    public Media(double Av1, double Av2){
        this.Av1 = Av1;
        this.Av2 = Av2;
    }
    public double calcularMedia(){
        return (Av1+Av2)/2;
    }
}
