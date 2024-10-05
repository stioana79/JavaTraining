package animal;

public abstract class Animal {

    private String culoare;
    private int varsta;

    public abstract void makeSound();

     public void mananca(int varsta){
        if(varsta < 5){
            System.out.println("Vreau lapte");
        }
        else {
            System.out.println("Vreau bobite");
        }
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
