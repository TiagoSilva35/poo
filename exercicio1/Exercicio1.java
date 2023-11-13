public class Exercicio1 {
    
    /** 
     * @param quantidades
     * @param paises
     */
    //Just prints the result,checks for duplicates in 'paises' 
    private static void imprimeResultado(int[] quantidades, String[][] paises){
        boolean[] paisesVisitados = new boolean[paises.length];     //Keeps track of every country
        for (int i = 0; i < quantidades.length - 1; i++) {
            if (quantidades[i] != 0 && !paisesVisitados[i]){        //If the country is yet to visit and there's something to print
                paisesVisitados[i] = true;
                for (int j = 0; j < paisesVisitados.length; j++) {      //Loops through the visited array checking for the duplicates
                    if (paises[i][1].compareToIgnoreCase(paises[j][1]) == 0 && i != j){
                        quantidades[i]++;
                        paisesVisitados[j] = true;
                    }
                }
                System.out.printf("%s: %d\n", paises[i][1], quantidades[i]);
            }
        } 
        if (quantidades[quantidades.length - 1] != 0){      //Special case
            System.out.printf("Outro(s): %d\n", quantidades[quantidades.length - 1]);        
        }
    } 
    //Matches each key from the urls to the country
    private static int[] contaPaises(String[] keys, String paises[][]){
        boolean foundMatch = false;
        int[] quantidadePorPais = new int[paises.length + 1];
        for (String key : keys) {
            foundMatch = false;
            for (int row = 0; row < paises.length; row++){      //find the matching country
                if (key.compareToIgnoreCase(paises[row][0]) == 0){
                    foundMatch = true;
                    quantidadePorPais[row]++;
                    break;
                }
            }
            
            if (!foundMatch) {      //Special case
                quantidadePorPais[quantidadePorPais.length - 1]++;
            }
       }
       return quantidadePorPais;
    }
    //Cleans the urls. Extracts the keys
    private static String[] limpaURL(String[] urls){
        String[] cleaStrings = new String[urls.length];
        int counter = 0;
        for (String url : urls){
            String[] tempData = url.split("/")[2].split("\\.");
            cleaStrings[counter++] = tempData[tempData.length - 1];
        }
        return cleaStrings;
    }
    public static void main(String[] args) {
        String[] urls = {
            "https://www.dei.uc.pt/poao/exames",
            "http://www.scs.org/index.html",
            "https://www.nato.int/events",
            "https://www.btu.de/",
            "https://www.dei.uc.pt/poao/exames",
            "http://www.eth.ch/index.html",
            "http://www.osu.edu/",
        };
        String[][] paises = {
            
            {"pt", "Portugal"},
            {"org", "EUA"},
            {"fr", "França"},
            {"uk", "Reino Unido"},
            {"de", "Alemanha"},
            {"edu", "EUA"},
        };
        String[] keys = limpaURL(urls);
        int[] quantidadePorPais = contaPaises(keys, paises);
        imprimeResultado(quantidadePorPais, paises);
    }
}
