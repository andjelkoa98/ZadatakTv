public class Televizor {
    private int jacinaTona = 0;
    private boolean ukljucen = false;

    public Televizor(int jacinaTona, boolean ukljucen) {
        this.jacinaTona = jacinaTona;
        this.ukljucen = ukljucen;
    }

    public Televizor(int jacinaTona) {
        this.jacinaTona = jacinaTona;
        this.ukljucen = false;
    }

    public Televizor(boolean ukljucen) {
        this.jacinaTona = 0;
        this.ukljucen = ukljucen;
    }

    public Televizor() {
        this.jacinaTona = 0;
        this.ukljucen = false;
    }

    public void pojacajTon(){
        if (this.jacinaTona < 20){
            this.jacinaTona++;
        }
        System.out.println("Jacina tona " + this.jacinaTona);
    }

    public void smanjiTon(){
        if (this.jacinaTona > 0){
            this.jacinaTona--;
        }
        System.out.println("Jacina tona " + this.jacinaTona);
    }

    public void ukljuci(){
        this.ukljucen = true;
        System.out.println("Televizor je ukljucen");
    }

    public void iskljuci(){
        this.ukljucen = false;
        System.out.println("Televizor je iskljucen");
    }

    public void daLiJeIskljucen(){
        if (this.ukljucen){
            System.out.println("Televizor je ukljucen");
        }else{
            System.out.println("Televizor je iskljucen");
        }
    }

    public void vratiJacinuTona(){
        System.out.println("Jacina tona je " + this.jacinaTona);
    }


    public void TvOpis() {
        System.out.println(
                "Televizor{" +
                        "jacinaTona=" + this.jacinaTona +
                        ", ukljucen=" + this.ukljucen +
                        '}'
        );
    }
}
