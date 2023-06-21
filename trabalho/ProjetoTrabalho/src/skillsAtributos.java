public class skillsAtributos extends App {
    String[] racaHumano = new String[3];

    String[] racaElfo = new String[3];

    String[] racaAnao = new String[3];

    public String[] getRacaHumano() {
            System.out.println("Atributos da raça humana:");
        racaHumano[0] = "100 pontos de vida";
        racaHumano[1] = "expectativa de vida maxima de 70 anos";
        racaHumano[2] = "porcentagem de afinidade com magia aleatoria";

        for (String ra : racaHumano) {
            System.out.println(ra);
        }
        return racaHumano;
    }

    public void setRacaHumano(String[] racaHumano) {
        this.racaHumano = racaHumano;
    }

    public String[] getRacaElfo() {
            System.out.println("Atributos da raça Elfo:");
        racaElfo[0] = "350 pontos de vida";
        racaElfo[1] = "expectativa de vida maxima 900 anos";
        racaElfo[2] = "alta afinidade com magia";
        for (String ra : racaElfo) {
            System.out.println(ra);
        }
        return racaElfo;
    }

    public void setRacaElfo(String[] racaElfo) {
        this.racaElfo = racaElfo;
    }

    public String[] getRacaAnao() {
            System.out.println("Atributos da raça anao:");
        racaAnao[0] = "500 pontos de vida";
        racaAnao[1] = "expectativa de vida 500 anos";
        racaAnao[2] = "baixa afinidade com magia";
        for (String ra : racaAnao) {
            System.out.println(ra);
        }
        return racaAnao;
    }

    public void setRacaAnao(String[] racaAnao) {
        this.racaAnao = racaAnao;
    }

}
