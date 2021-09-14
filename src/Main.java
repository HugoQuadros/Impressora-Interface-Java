public class Main {

    public static void main(String[] args) {

        Contrato contrato1 = new Contrato("Primeiro Contrato", "Aluguel");
        Foto foto1 = new Foto("Foto de Férias", "Família");
        Documento documento1 = new Documento("Primeiro Documento", "Tipo 1");
        Impressora impressora1 = new Impressora();

        //Teste teste1 = new Teste("Não pode aparecer", "Nem isso aqui");

        impressora1.adicionarImprimivel(contrato1);
        impressora1.adicionarImprimivel(foto1);
        impressora1.adicionarImprimivel(documento1);
        //impressora1.adicionarImprimivel(teste1);

        impressora1.imprimirTudo();
    }
}
