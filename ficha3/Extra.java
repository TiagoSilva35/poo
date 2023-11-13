public class Extra {
    
    /** 
     * @param receipt
     * @param len
     */
    private static void print(String[][] receipt, int len){
        int totalVal = 0;
        int counter = 0;
        for (String[] line : receipt){
            if (counter == len) break;
            counter ++;
            int tempVal = Integer.parseInt(line[0]) * Integer.parseInt(line[2]);
            System.out.printf("%s x %s: %s\n", line[0], line[1], Integer.toString(tempVal));
            totalVal += tempVal;
        }
        System.out.printf("Total: %d Euro(s)\n", totalVal);
    }
    private static String[][] receipt (String[][] tabItems, String[][] tabRequests){
        String[][] receipt = new String[tabItems.length][3];
        int row = 0;
        for (String[] product : tabItems) {
            for (String[] request : tabRequests) {
                if (product[0].compareToIgnoreCase(request[0]) == 0){
                    receipt[row][1] = product[0];
                    receipt[row][0] = request[1];
                    receipt[row][2] = product[1];
                    row += 1;
                }
            }
        }
        return receipt;
    }
    private static String[][] tabledRequests (String txt){
        String[] products = txt.split(";");
        String[][] tabItems = new String [products.length][2];
        for (int i = 0; i < products.length; i++){
            String[] productAndPrice = products[i].split("@");
            tabItems[i][0] = productAndPrice[1];
            tabItems[i][1] = productAndPrice[0];
        }
        return tabItems;
    }
    private static String[][] tabledExistingItems (String txt){
        String[] products = txt.split(";");
        String[][] tabItems = new String [products.length][2];
        for (int i = 0; i < products.length; i++){
            String[] productAndPrice = products[i].split(":");
            tabItems[i][0] = productAndPrice[0];
            tabItems[i][1] = productAndPrice[1];
        }
        return tabItems;
    }
    public static void main(String[] args) {
        String produtos = "Mesa:30;Cadeira:25;Faca:2;Copo:3;" + "Fogão:255;Jarro:4;Prato:3";
        String encomenda = "20@copo;5@faca;4@Mesa;1@fogão";

        String[][] tabItems = tabledExistingItems(produtos);
        String[][] tabRequests = tabledRequests(encomenda);
        String[][] receipt = receipt(tabItems, tabRequests);
        print(receipt, tabRequests.length);
    }
}
