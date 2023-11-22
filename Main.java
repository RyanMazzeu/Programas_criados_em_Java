public class Main {
    public static void main(String[] args) {
        // testar todas as classes
        Missao missao = new Missao();
        missao.setDescricao("Atropelar o Roldao");
        missao.concluida = false;

        Objetivo objetivo = new Objetivo();
        objetivo.setDescricao("Rachar o bico");
        objetivo.setRecompensa(1000);

        Objetivo objetivo2 = new Objetivo();
        objetivo2.setDescricao("Rachar o bico mais ainda");
        objetivo2.setRecompensa(1000);

        missao.addProposito(objetivo);
        System.out.println("Missao: " + missao.getDescricao());
        System.out.println("Experiencia: " + missao.experiencia());
        System.out.println("Concluida: " + missao.concluida);

        missao.addProposito(objetivo2);
        System.out.println("Missao: " + missao.getDescricao());
        System.out.println("Experiencia: " + missao.experiencia());
        System.out.println("Concluida: " + missao.concluida);

        objetivo.concluida = true;
        objetivo2.concluida = true;
        missao.concluida = true;
        
        System.out.println("Missao: " + missao.getDescricao());
        System.out.println("Experiencia: " + missao.experiencia());
        System.out.println("Concluida: " + missao.concluida);


        
    }
}