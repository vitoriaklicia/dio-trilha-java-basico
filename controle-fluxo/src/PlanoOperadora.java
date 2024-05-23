public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // M /T

        switch (plano) {
            case "T": {
                System.out.println("5 GB para assistir YouTube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }

            default:
                break;
        }
    }
}
