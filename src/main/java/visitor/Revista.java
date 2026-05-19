package visitor;

public class Revista implements ItemBiblioteca{
    private String nome;

    public Revista(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String aceitar(Visitor visitor){
        return visitor.visitarRevista(this);
    }
}
