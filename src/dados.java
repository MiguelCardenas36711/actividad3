import java.security.SecureRandom;

public class dados {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int lanzamientos = 60000000;

        int frecuencia1 = 0, frecuencia2 = 0, frecuencia3 = 0, frecuencia4 = 0, frecuencia5 = 0, frecuencia6 = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int resultado = random.nextInt(6) + 1;

            switch (resultado) {
                case 1: frecuencia1++;
                case 2: frecuencia2++;
                case 3: frecuencia3++;
                case 4: frecuencia4++;
                case 5: frecuencia5++;
                case 6: frecuencia6++;
            }
        }

        // Imprimir la tabla de resultados
        System.out.println("Cara Frecuencia");
        System.out.println("1: " + frecuencia1);
        System.out.println("2: " + frecuencia2);
        System.out.println("3: " + frecuencia3);
        System.out.println("4: " + frecuencia4);
        System.out.println("5: " + frecuencia5);
        System.out.println("6: " + frecuencia6);
    }
}