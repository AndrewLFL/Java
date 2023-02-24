public class Controle implements Controlador {

    //atributos

    boolean ligado;
    boolean tocando;
    int volume;

    //metodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(isLigado())
        {
            System.out.println("---- MENU ----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu... ");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado())
        {
            this.setVolume(this.getVolume() + 5);
        }
        else
        {
            System.out.println("Impossivel aumentar o volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado())
        {
            this.setVolume(this.getVolume() - 5);
        }
        else
        {
            System.out.println("Impossivel diminuir o volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0)
        {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando())
        {
            this.setTocando(true);
        }
        else
        {
            System.out.println("Impossivel reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando())
        {
            this.setTocando(false);
        }
        else
        {
            System.out.println("Impossivel pausar");
        }
    }

    //metodos especiais
    public Controle ()
    {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }


    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
