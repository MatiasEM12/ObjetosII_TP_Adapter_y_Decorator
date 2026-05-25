package ejercicio_6;


public class BuilderTorta {

    private Torta torta;

    public BuilderTorta BuilderTortaDe(TortaChocolate torta){
        validarTortaIniciada(); //para no buildear una tortaX y sobre este buildearle otra tortaX
        this.torta= torta;
        return this;
    }

    public BuilderTorta BuilderTortaDe(TortaVainilla torta){
        validarTortaIniciada();
        this.torta= torta;
        return this;
    }

    public BuilderTorta BuilderTortaDe(TortaFrutilla torta){
        validarTortaIniciada();
        this.torta= torta;
        return this;
    }



    public BuilderTorta ConBañoChocolate(){
        this.torta= new BañoChocolate(this.torta);
        return this;
    }

    public BuilderTorta ConRocklets(){
        this.torta= new Rocklets(this.torta);
        return this;
    }

    public Torta build(){
        Torta tortaConstruida = this.torta;
        this.torta = null; //se reinicia el builder para poder construir otra torta
        return tortaConstruida;
    }

    private void validarTortaIniciada(){
        if(this.torta!=null)throw new IllegalStateException("Ya se ha iniciado una torta, no se puede iniciar otra");

    }
}
