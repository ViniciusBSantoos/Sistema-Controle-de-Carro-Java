public class Carro {

    // ATRIBUTOS (estado do carro)
    private boolean ligado; // carro ligado ou desligado
    private int velocidade; // velocidade atual
    private int marcha;     // marcha atual (0 a 6)

    // CONSTRUTOR (estado inicial do carro)
    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0; // ponto morto
    }

    // LIGAR CARRO
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("Carro já está ligado.");
        }
    }

    // DESLIGAR CARRO
    public void desligar() {
        // só pode desligar se estiver parado e em ponto morto
        if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não pode desligar o carro em movimento ou com marcha engatada.");
        }
    }

    // ACELERAR
    public void acelerar() {
        if (!ligado) {
            System.out.println("Carro está desligado!");
            return;
        }
 
        if (marcha == 0) {
            System.out.println("Não pode acelerar em ponto morto!");
            return;
        }
 // Se chegou no limite da marcha
         if (velocidade == velocidadeMaxima(marcha)) {
        System.out.println("Troque para a próxima marcha para continuar acelerando!");
        return;
    }

    // acelera normalmente
    if (velocidade < 120) {
        velocidade++;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
    }

    // DIMINUIR VELOCIDADE
    public void frear() {
        if (!ligado) {
            System.out.println("Carro está desligado!");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Carro já está parado.");
        }
    }

    // TROCAR MARCHA
    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("Carro desligado!");
            return;
        }

        // não pode pular marcha
        if (Math.abs(novaMarcha - marcha) > 1) {
            System.out.println("Não pode pular marcha!");
            return;
        }

        // validar limites de velocidade por marcha
        if (velocidade >= velocidadeMinima(novaMarcha) &&
            velocidade <= velocidadeMaxima(novaMarcha)) {

            marcha = novaMarcha;
            System.out.println("Marcha alterada para: " + marcha);
        } else {
            System.out.println("Velocidade incompatível com a marcha!");
        }
    }

    // VIRAR
    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("Carro desligado!");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para " + direcao);
        } else {
            System.out.println("Velocidade não permite virar!");
        }
    }

    // CONSULTAR VELOCIDADE
    public void consultarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    // FUNÇÕES AUXILIARES (REGRAS DE MARCHA)

    private int velocidadeMinima(int marcha) {
        switch (marcha) {
            case 1: return 0;
            case 2: return 20;
            case 3: return 40;
            case 4: return 60;
            case 5: return 80;
            case 6: return 100;
            default: return 0;
        }
    }

    private int velocidadeMaxima(int marcha) {
        switch (marcha) {
            case 1: return 20;
            case 2: return 40;
            case 3: return 60;
            case 4: return 80;
            case 5: return 100;
            case 6: return 120;
            default: return 0;
        }
    }
}