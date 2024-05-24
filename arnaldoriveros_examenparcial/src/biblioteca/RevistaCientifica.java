// RevistaCientifica.java
package biblioteca;

public class RevistaCientifica extends Material {
    private String areaCientifica;

    // Getters and Setters
    public String getAreaCientifica() { return areaCientifica; }
    public void setAreaCientifica(String areaCientifica) { this.areaCientifica = areaCientifica; }

    @Override
    public String toString() {
        return "RevistaCientifica [areaCientifica=" + areaCientifica + ", " + super.toString() + "]";
    }
}