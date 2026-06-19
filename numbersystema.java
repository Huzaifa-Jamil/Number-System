import java.util.*;
public class numbersystema{
    public static void main(String[] args) {
        Scanner hu = new Scanner(System.in);
        char userchoice;
        do {
            System.out.println();
            System.out.println("\"WELCOME TO  NUMBER SYSTEM APP \"");
            System.out.println();
            System.out.println("MENU :");
            System.out.println("PLEASE SELECT A NUMBER SYSTEM ");
            System.out.println("1. BINARY NUMBER SYSTEM ");
            System.out.println("2. OCTAL NUMBER SYSTEM ");
            System.out.println("3. DECIMAL NUMBER SYSTEM  ");
            System.out.println("4. HEXA-DECIMAL NUMBER SYSTEM ");
            System.out.println();
            System.out.print("PLEASE ENTER YOUR CHOICE : ");
            int numbersystem = hu.nextInt();
            System.out.println();
            while ( numbersystem != 1 && numbersystem != 2 && numbersystem != 3 && numbersystem != 4 ) {
                System.out.println("YOUR CHOICE DOESNOT MEET ANY OF OPTIONS !! ");
                System.out.print("PLEASE ENTER YOUR CHOICE AGAIN : ");
                numbersystem = hu.nextInt();
            }

            switch (numbersystem) {
                case 1 : {
                    char binarychoice;
                    do {    
                        System.out.println();   
                        System.out.println("\"WELCOME TO BINARY NUMBER SYSTEM \"");
                        System.out.println();
                        System.out.println("PLEASE ENTER A BINARY VALUE TO START CONVERSION !");
                        System.out.print("GIVE YOUR INPUT BINARY VALUE HERE : ");
                        String binaryvalue = hu.next();

                        boolean binaryb;
                        do {
                            binaryb = true;
                            for (int i = 0; i < binaryvalue.length(); i++) {
                                char x = binaryvalue.charAt(i);
                                if (  x < '0' || x > '1' ) {
                                    binaryb = binaryb && false;
                                }
                            }
                            if (binaryb == false ) {
                                System.out.println("GIVEN VALUE IS NOT IN BINARY !!");
                                System.out.print("PLEASE GIVE YOUR INPUT BINARY VALUE HERE AGAIN : ");
                                binaryvalue = hu.next();
                            }
                        }
                        while ( binaryb == false );

                        System.out.println("NICE ! ");
                        System.out.println();
                        System.out.println("NOW IN WHICH NUMBER SYSTEM YOU LIKE TO CONVERT IT !");
                        System.out.println("1. BINARY TO OCTAL ");
                        System.out.println("2. BINARY TO DECIMAL ");
                        System.out.println("3. BINARY TO HEXA-DECIMAL ");
                        System.out.println("4. BINARY TO ALL NUMBER SYSTEMS ");
                        System.out.println();
                        System.out.print("PLEASE ENTER YOUR CHOICE : ");
                        int binaryconvechoice = hu.nextInt();
                        System.out.println();

                        while ( binaryconvechoice != 1 && binaryconvechoice != 2 && binaryconvechoice != 3 && binaryconvechoice != 4 ) {
                            System.out.println("YOUR CHOICE DOESNOT MEET ANY OF OPTIONS !! ");
                            System.out.print("PLEASE ENTER YOUR CHOICE AGAIN : ");
                            binaryconvechoice = hu.nextInt();
                        }

                        switch (binaryconvechoice) {
                            case 1 : {
                                System.out.println("BINARY TO OCTAL ");
                                binaryToOctal( binaryvalue );
                            }
                            break;
                            case 2 : {
                                System.out.println("BINARY TO DECIMAL ");
                                binaryToDecimal ( binaryvalue );
                            }
                            break;
                            case 3 : {
                                System.out.println("BINARY TO HEXA-DECIMAL ");
                                binaryToHexadecimal( binaryvalue );
                            }
                            break;
                            case 4 : {
                                System.out.println("BINARY TO ALL NUMBER SYSTEMS ");
                                System.out.println();
                                System.out.println("BINARY TO OCTAL ");
                                binaryToOctal( binaryvalue );
                                System.out.println();
                                System.out.println("BINARY TO DECIMAL ");
                                binaryToDecimal ( binaryvalue );
                                System.out.println();
                                System.out.println("BINARY TO HEXA-DECIMAL ");
                                binaryToHexadecimal( binaryvalue );
                                System.out.println();
                            }
                            break;
                        }
                        System.out.println();
                        System.out.println("\"YOUR APP YOUR CHOICE\"");
                        System.out.println("IF YOU WANT TO USE BINARY NS AGAIN \" ENTER Y OR y \" ");
                        System.out.println(" OR ");
                        System.out.println("IF YOU WANT TO EXIT FROM BINARY NS \" ENTER E OR e \" ");
                        System.out.println();
                        System.out.print("YOUR CHOICE : " );
                        binarychoice = hu.next().charAt(0);
                    }
                    while ( binarychoice == 'Y' || binarychoice == 'y' );
                }    
                break;
                case 2 : {
                    char octalchoice;
                    do {
                        System.out.println();
                        System.out.println("\"WELCOME TO OCTAL NUMBER SYSTEM \"");
                        System.out.println();
                        System.out.println("PLEASE ENTER A OCTAL VALUE TO START CONVERSION !");
                        System.out.print("GIVE YOUR INPUT OCTAL VALUE HERE : ");
                        String octalvalue = hu.next();

                        boolean octalb;
                        do {
                            octalb = true;
                            for (int i = 0; i < octalvalue.length(); i++) {
                                char x = octalvalue.charAt(i);
                                if (  x < '0' || x > '7' ) {
                                    octalb = octalb && false;
                                }
                            }
                            if (octalb == false ) {
                                System.out.println("GIVEN VALUE IS NOT IN OCTAL !!");
                                System.out.print("PLEASE GIVE YOUR INPUT OCTAL VALUE HERE AGAIN : ");
                                octalvalue = hu.next();
                            }
                        }
                        while ( octalb == false );
                        
                        System.out.println("NICE ! ");
                        System.out.println();
                        System.out.println("NOW IN WHICH NUMBER SYSTEM YOU LIKE TO CONVERT IT !");
                        System.out.println("1. OCTAL TO BINARY ");
                        System.out.println("2. OCTAL TO DECIMAL ");
                        System.out.println("3. OCTAL TO HEXA-DECIMAL ");
                        System.out.println("4. OCTAL TO ALL NUMBER SYSTEMS ");
                        System.out.println();
                        System.out.print("PLEASE ENTER YOUR CHOICE : ");
                        int octalconvechoice = hu.nextInt();
                        System.out.println();

                        while ( octalconvechoice != 1 && octalconvechoice != 2 && octalconvechoice != 3 && octalconvechoice != 4 ) {
                            System.out.println("YOUR CHOICE DOESNOT MEET ANY OF OPTIONS !! ");
                            System.out.print("PLEASE ENTER YOUR CHOICE AGAIN : ");
                            octalconvechoice = hu.nextInt();
                        }

                        switch (octalconvechoice) {
                            case 1 : {
                                System.out.println("OCTAL TO BINARY ");
                                octalToBinary( octalvalue );
                            }
                            break;
                            case 2 : {
                                System.out.println("OCTAL TO DECIMAL ");
                                octalToDecimal( octalvalue );
                            }
                            break;
                            case 3 : {
                                System.out.println("OCTAL TO HEXA-DECIMAL ");
                                octalToHexadecimal( octalvalue );
                            }
                            break;
                            case 4 : {
                                System.out.println("\"OCTAL TO ALL NUMBER SYSTEMS\" ");
                                System.out.println();
                                System.out.println("OCTAL TO BINARY ");
                                octalToBinary( octalvalue );
                                System.out.println();
                                System.out.println("OCTAL TO DECIMAL ");
                                octalToDecimal( octalvalue );
                                System.out.println();
                                System.out.println("OCTAL TO HEXA-DECIMAL ");
                                octalToHexadecimal( octalvalue );
                                System.out.println();
                            }
                            break;
                        }
                        System.out.println();
                        System.out.println("\"YOUR APP YOUR CHOICE\"");
                        System.out.println("IF YOU WANT TO USE OCTAL NS AGAIN \" ENTER Y OR y \" ");
                        System.out.println(" OR ");
                        System.out.println("IF YOU WANT TO EXIT FROM OCTAL NS \" ENTER E OR e \" ");
                        System.out.println();
                        System.out.print("YOUR CHOICE : " );
                        octalchoice = hu.next().charAt(0);
                    }
                    while ( octalchoice == 'Y' || octalchoice == 'y' );
                }
                break;
                case 3 : {
                    char decimalchoice;
                    do {
                        System.out.println();
                        System.out.println("\"WELCOME TO DECIMAL NUMBER SYSTEM\" ");
                        System.out.println();
                        System.out.println("PLEASE ENTER A DECIMAL VALUE TO START CONVERSION !");
                        System.out.print("GIVE YOUR INPUT DECIMAL VALUE HERE : ");
                        String decimalvalue = hu.next();
                        
                        boolean decimalb;
                        do {
                            decimalb = true;
                            for (int i = 0; i < decimalvalue.length(); i++) {
                                char x = decimalvalue.charAt(i);
                                if (  x < '0' || x > '9' ) {
                                    decimalb = decimalb && false;
                                }
                            }
                            if (decimalb == false ) {
                                System.out.println("GIVEN VALUE IS NOT IN DECIMAL !!");
                                System.out.print("PLEASE GIVE YOUR INPUT DECIMAL VALUE HERE AGAIN : ");
                                decimalvalue = hu.next();
                            }
                        }
                        while ( decimalb == false );
                        
                        System.out.println("NICE ! ");
                        System.out.println();
                        System.out.println("NOW IN WHICH NUMBER SYSTEM YOU LIKE TO CONVERT IT !");
                        System.out.println("1. DECIMAL TO BINARY ");
                        System.out.println("2. DECIMAL TO OCTAL ");
                        System.out.println("3. DECIMAL TO HEXA-DECIMAL ");
                        System.out.println("4. DECIMAL TO ALL NUMBER SYSTEMS ");
                        System.out.println();
                        System.out.print("PLEASE ENTER YOUR CHOICE : ");
                        int decimalconvechoice = hu.nextInt();
                        System.out.println();

                        while ( decimalconvechoice != 1 && decimalconvechoice != 2 && decimalconvechoice != 3 && decimalconvechoice != 4 ) {
                            System.out.println("YOUR CHOICE DOESNOT MEET ANY OF OPTIONS !! ");
                            System.out.print("PLEASE ENTER YOUR CHOICE AGAIN : ");
                            decimalconvechoice = hu.nextInt();
                        }

                        switch (decimalconvechoice) {
                            case 1 : {
                                System.out.println("DECIMAL TO BINARY ");
                                decimalToBinary( decimalvalue );
                            }
                            break;
                            case 2 : {
                                System.out.println("DECIMAL TO OCTAL ");
                                decimalToOctal( decimalvalue );
                            }
                            break;
                            case 3 : {
                                System.out.println("DECIMAL TO HEXA-DECIMAL ");
                                decimalToHexadecimal( decimalvalue );
                            }
                            break;
                            case 4 : {
                                System.out.println("DECIMAL TO ALL NUMBER SYSTEMS ");
                                System.out.println();
                                System.out.println("DECIMAL TO BINARY ");
                                decimalToBinary( decimalvalue );
                                System.out.println();
                                System.out.println("DECIMAL TO OCTAL ");
                                decimalToOctal( decimalvalue );
                                System.out.println();
                                System.out.println("DECIMAL TO HEXA-DECIMAL ");
                                decimalToHexadecimal( decimalvalue );
                                System.out.println();
                            }
                            break;
                        }
                        System.out.println();
                        System.out.println("\"YOUR APP YOUR CHOICE\"");
                        System.out.println("IF YOU WANT TO USE DECIMAL NS AGAIN \" ENTER Y OR y \" ");
                        System.out.println(" OR ");
                        System.out.println("IF YOU WANT TO EXIT FROM DECIMAL NS \" ENTER E OR e \" ");
                        System.out.println();
                        System.out.print("YOUR CHOICE : " );
                        decimalchoice = hu.next().charAt(0);
                    }
                    while ( decimalchoice == 'Y' || decimalchoice == 'y' );
                }
                break;
                case 4 : {
                    char hexadecimalchoice;
                    do {
                        System.out.println();
                        System.out.println("\"WELCOME TO HEXA-DECIMAL NUMBER SYSTEM\" ");
                        System.out.println();
                        System.out.println("PLEASE ENTER A HEXA-DECIMAL VALUE TO START CONVERSION ");
                        System.out.print("GIVE YOUR INPUT HERE : ");
                        String hexadecimalv = hu.next();
                        String hexadecimalvalue = hexadecimalv.toUpperCase();

                        boolean hexadecimalb;
                        do {
                            hexadecimalb = true;
                            for (int i = 0; i < hexadecimalvalue.length(); i++) {
                                char x = hexadecimalvalue.charAt(i);
                                if ( x != '0' && x != '1' && x != '2' && x != '3' && x != '4' && x != '5' && x != '6' && x != '7' && x != '8' && x != '9' && x != 'A' && x != 'B' && x != 'C' && x != 'D' && x != 'E' && x != 'F') {
                                    hexadecimalb = false;
                                    break;
                                }
                            }
                            if (!hexadecimalb ) {
                                System.out.println("GIVEN VALUE IS NOT IN HEXA-DECIMAL !!");
                                System.out.print("PLEASE GIVE YOUR INPUT HEXA-DECIMAL VALUE HERE AGAIN : ");
                                hexadecimalv = hu.next();
                                hexadecimalvalue = hexadecimalv.toUpperCase();
                            }
                        }
                        while ( !hexadecimalb);
                        
                        System.out.println("NICE ! ");
                        System.out.println();
                        System.out.println("NOW IN WHICH NUMBER SYSTEM YOU LIKE TO CONVERT IT !");
                        System.out.println("1. HEXA-DECIMAL TO BINARY ");
                        System.out.println("2. HEXA-DECIMAL TO OCTAL ");
                        System.out.println("3. HEXA-DECIMAL TO DECIMAL ");
                        System.out.println("4. HEXA-DECIMAL TO ALL NUMBER SYSTEMS ");
                        System.out.println();
                        System.out.print("PLEASE ENTER YOUR CHOICE : ");
                        int hexaconvechoice = hu.nextInt();
                        System.out.println();

                        while ( hexaconvechoice != 1 && hexaconvechoice != 2 && hexaconvechoice != 3 && hexaconvechoice != 4 ) {
                            System.out.println("YOUR CHOICE DOESNOT MEET ANY OF OPTIONS !! ");
                            System.out.print("PLEASE ENTER YOUR CHOICE AGAIN : ");
                            hexaconvechoice = hu.nextInt();
                        }

                        switch (hexaconvechoice) {
                            case 1 : {
                                System.out.println("HEXA-DECIMAL TO BINARY ");
                                hexadecimalToBinary( hexadecimalvalue );
                            }
                            break;
                            case 2 : {
                                System.out.println("HEXA-DECIMAL TO OCTAL ");
                                hexadecimalToOctal( hexadecimalvalue );
                            }
                            break;
                            case 3 : {
                                System.out.println("HEXA-DECIMAL TO DECIMAL ");
                                hexadecimalToDecimal( hexadecimalvalue );
                            }
                            break;
                            case 4 : {
                                System.out.println("HEXA-DECIMAL TO ALL NUMBER SYSTEMS ");
                                System.out.println();
                                System.out.println("HEXA-DECIMAL TO BINARY ");
                                hexadecimalToBinary( hexadecimalvalue );
                                System.out.println();
                                System.out.println("HEXA-DECIMAL TO OCTAL ");
                                hexadecimalToOctal( hexadecimalvalue );
                                System.out.println();
                                System.out.println("HEXA-DECIMAL TO DECIMAL ");
                                hexadecimalToDecimal( hexadecimalvalue );
                                System.out.println();
                            }
                            break;
                        }
                        System.out.println();
                        System.out.println("\"YOUR APP YOUR CHOICE\"");
                        System.out.println("IF YOU WANT TO USE HEXA-DECIMAL NS AGAIN \" ENTER Y OR y \" ");
                        System.out.println(" OR ");
                        System.out.println("IF YOU WANT TO EXIT FROM HEXA-DECIMAL NS \" ENTER E OR e \" ");
                        System.out.println();
                        System.out.print("YOUR CHOICE : " );
                        hexadecimalchoice = hu.next().charAt(0);
                    }
                    while ( hexadecimalchoice == 'Y' || hexadecimalchoice == 'y' );
                }
                break;
            }
            System.out.println();
            System.out.println("\"YOUR APP YOUR CHOICE\"");
            System.out.println("IF YOU WANT TO USE THIS APP AGAIN \" ENTER Y OR y \" ");
            System.out.println(" OR ");
            System.out.println("IF YOU WANT TO EXIT FROM THIS APP \" ENTER E OR e \" ");
            System.out.println();
            System.out.print("YOUR CHOICE : " );
            userchoice = hu.next().charAt(0);
        }
        while ( userchoice == 'Y' || userchoice == 'y' );
        System.out.println("EXIXTNG NUMBER SYSTEM WEB APP ");
        System.out.println("THANK YOU !! ");

        hu.close();
    }
   
    public static void binaryToOctal( String binary ) {
        String octalvalue = "";

        for (int i = binary.length() - 1; i >= 0; i = i-3 ) {
            String binaryvalue = "";
            
            for (int j = i; j >= i - 2 && j >=0 ; j--) {
                char y = binary.charAt(j);
                binaryvalue =  y + binaryvalue;
            }

            if ( binaryvalue.length() == 1){
                binaryvalue = "00" + binaryvalue;
            }
            else if ( binaryvalue.length() == 2){
                binaryvalue = "0" + binaryvalue;
            }
            else if ( binaryvalue.length() >= 3){
                binaryvalue = "" + binaryvalue;
            }

            if (binaryvalue.equals("000")) {
                octalvalue = "0" + octalvalue;
            }
            else if (binaryvalue.equals("001")) {
                octalvalue = "1" + octalvalue;
            }
            else if (binaryvalue.equals("010")) {
                octalvalue = "2" + octalvalue;
                }
            else if (binaryvalue.equals("011")) {
                octalvalue = "3" + octalvalue;
            }
            else if (binaryvalue.equals("100")) {
                octalvalue = "4" + octalvalue;
            }
            else if (binaryvalue.equals("101")) {
                octalvalue = "5" + octalvalue;
            }
            else if (binaryvalue.equals("110")) {
                octalvalue = "6" + octalvalue;
            }
            else if (binaryvalue.equals("111")) {
                octalvalue = "7" + octalvalue;
            }
        }
        System.out.println("BINARY (" + binary +") => " + "OCTAL " + "\"" + octalvalue + "\"" );
    }
    public static void binaryToDecimal( String binary ) {
        long decimalvalue = 0;
        int j = 0;
        
        for(int i = binary.length() - 1; i >= 0 ; i--) {
            char z = binary.charAt(i);
            long x = z -'0';
            decimalvalue = (decimalvalue + ((long)( x * Math.pow(2, j))));
            j++;
        }
        System.out.println("BINARY (" + binary + ") => " + "DECIMAL " + "\"" + decimalvalue + "\"" );
    }
    public static void binaryToHexadecimal( String binary ) {
        String hexadecimalvalue = "";

        for (int i = binary.length() - 1; i >= 0; i = i-4 ) {
            String hexadecimal = "";
           
            for (int j = i; j >= i - 3 && j >=0 ; j--) {
                char x = binary.charAt(j);
               hexadecimal =  x + hexadecimal;
            }

            if ( hexadecimal.length() == 1){
                hexadecimal = "000" + hexadecimal;
            }
            else if ( hexadecimal.length() == 2){
                hexadecimal = "00" + hexadecimal;
            }
            else if ( hexadecimal.length() == 3){
                hexadecimal = "0" + hexadecimal;
            }
            else if ( hexadecimal.length() >= 4){
                hexadecimal = "" + hexadecimal;
            }

            if (hexadecimal.equals("0000")) {
                hexadecimalvalue = "0" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("0001")) {
                hexadecimalvalue = "1" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("0010")) {
                hexadecimalvalue = "2" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("0011")) {
                hexadecimalvalue = "3" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("0100")) {
                hexadecimalvalue = "4" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("0101")) {
                hexadecimalvalue = "5" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("0110")) {
                hexadecimalvalue = "6" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("0111")) {
                hexadecimalvalue = "7" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1000")) {
                hexadecimalvalue = "8" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1001")) {
                hexadecimalvalue = "9" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1010")) {
                hexadecimalvalue = "A" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1011")) {
                hexadecimalvalue = "B" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1100")) {
                hexadecimalvalue = "C" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1101")) {
                hexadecimalvalue = "D" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1110")) {
                hexadecimalvalue = "E" + hexadecimalvalue;
            }
            else if (hexadecimal.equals("1111")) {
                hexadecimalvalue = "F" + hexadecimalvalue;
            }
        }
        System.out.println("BINARY (" + binary + ") => " + "HEXA-DECIMAL " + "\"" + hexadecimalvalue + "\"" );
    }
    public static void octalToBinary( String octal ) {
        String binaryvalue = "";

        for ( int i = 0; i < octal.length(); i++ ) {
            char o =  octal.charAt(i);

            if ( o == '0') {
                binaryvalue = binaryvalue + "000" ;
            }
            else if (o == '1') {
                binaryvalue = binaryvalue + "001" ;
            }
            else if (o == '2') {
                binaryvalue = binaryvalue + "010" ;
            }
            else if (o == '3') {
                binaryvalue = binaryvalue + "011" ;
            }
            else if (o == '4') {
                binaryvalue = binaryvalue + "100" ;
            }
            else if (o == '5') {
                binaryvalue = binaryvalue + "101" ;
            }
            else if (o == '6') {
                binaryvalue = binaryvalue + "110" ;
            }
            else if (o == '7') {
                binaryvalue = binaryvalue + "111" ;
            }
        }
        System.out.println("OCTAL (" + octal + ") => " + "BINARY " + "\"" + binaryvalue + "\"" );
    }
    public static void octalToDecimal( String octal ) {
        long decimalvalue = 0;
        int j = 0;

        for ( int i = octal.length()-1 ; i >=0; i-- ) {
            char o = octal.charAt(i);
            int digit = Character.getNumericValue(o);
            decimalvalue = (long)(decimalvalue + (digit * Math.pow(8,j)));
            j++;
        }

        System.out.println("OCTAL (" + octal + ") => " + "BINARY " + "\"" + decimalvalue + "\"" );
    }
    public static void octalToHexadecimal( String octal ) {
        String binaryvalue = "";

        for(int i =  octal.length()-1; i >= 0; i--) {
            char o = octal.charAt(i);
            String binary = "";
            if ( o == '0') {
                binary = "000" ;
            }
            else if (o == '1') {
                binary = "001" ;
            }
            else if (o == '2') {
                binary = "010" ;
            }
            else if (o == '3') {
                binary = "011" ;
            }
            else if (o == '4') {
                binary = "100" ;
            }
            else if (o == '5') {
                binary = "101" ;
            }
            else if (o == '6') {
                binary = "110" ;
            }
            else if (o == '7') {
                binary = "111" ;
            }
            binaryvalue = binary + binaryvalue;
        }

        long decimalvalue = 0;
        int j = 0;

        for(int i = binaryvalue.length()-1; i >= 0; i--) {
            int v = Character.getNumericValue (binaryvalue.charAt(i));
            decimalvalue = decimalvalue + (long)((v) *  Math.pow(2, j));
            j++;
        }

        String hexadecimalvalue = "";

        while( decimalvalue > 0 ) {
            long reminder;
             reminder = decimalvalue % 16;
            if ( reminder == 0 ) {
                hexadecimalvalue = '0' + hexadecimalvalue;
            }
            else if ( reminder == 1 ) {
                hexadecimalvalue = '1' + hexadecimalvalue;;
            }
            else if ( reminder == 2 ) {
                hexadecimalvalue = '2' + hexadecimalvalue;
            }
            else if ( reminder == 3 ) {
                hexadecimalvalue = '3' + hexadecimalvalue;
            }
            else if ( reminder == 4 ) {
                hexadecimalvalue = '4' + hexadecimalvalue;
            }
            else if (reminder == 5 ) {
                hexadecimalvalue = '5' + hexadecimalvalue;
            }
            else if ( reminder == 6 ) {
                hexadecimalvalue = '6' + hexadecimalvalue;
            }
            else if ( reminder == 7 ) {
                hexadecimalvalue = '7' + hexadecimalvalue;
            }
            else if ( reminder == 8 ) {
                hexadecimalvalue = '8' + hexadecimalvalue;
            }
            else if ( reminder == 9 ) {
                hexadecimalvalue = '9' + hexadecimalvalue;
            }
            else if ( reminder == 10 ) {
                hexadecimalvalue = 'A' + hexadecimalvalue;
            }
            else if ( reminder == 11 ) {
                hexadecimalvalue = 'B' + hexadecimalvalue;
            }
            else if ( reminder == 12 ) {
                hexadecimalvalue = 'C' + hexadecimalvalue;
            }
            else if ( reminder == 13 ) {
                hexadecimalvalue = 'D' + hexadecimalvalue;
            }
            else if ( reminder == 14 ) {
                hexadecimalvalue = 'E' + hexadecimalvalue;
            }
            else if ( reminder == 15 ) {
                hexadecimalvalue = 'F' + hexadecimalvalue;
            }
            decimalvalue = decimalvalue/16;
        }        
        System.out.println("OCTAL (" + octal + ") => " + "HEXA-DECIMAL " + "\"" + hexadecimalvalue + "\"" );
    }
    public static void decimalToBinary( String Decimal ) {
        int decimal = Integer.parseInt(Decimal);
        String binaryvalue = "";

        while ( decimal > 0) {
            int reminder;
            reminder = decimal % 2;
            binaryvalue = reminder + binaryvalue;
            decimal = decimal/2;
        }
        System.out.println("DECIMAL (" + Decimal + ") => " + "BINARY " + "\"" + binaryvalue + "\"" );
    }
    public static void decimalToOctal( String Decimal ) {
        int decimal = Integer.parseInt(Decimal);
        String octalvalue = "";

        while ( decimal > 0) {
            int reminder;
            reminder = decimal % 8;

            if (reminder == 0) {
                octalvalue = '0' + octalvalue;
            }
            else if (reminder == 1) {
                octalvalue = '1' + octalvalue;
            }
            else if (reminder == 2) {
                octalvalue = '2' + octalvalue;
            }
            else if (reminder == 3) {
                octalvalue = '3' + octalvalue;
            }
            else if (reminder == 4) {
                octalvalue = '4' + octalvalue;
            }
            else if (reminder == 5) {
                octalvalue = '5' + octalvalue;
            }
            else if (reminder== 6) {
                octalvalue = '6' + octalvalue;
            }
            else if (reminder== 7) {
                octalvalue = '7' + octalvalue;
            }
            decimal = decimal/8;
        }
        System.out.println("DECIMAL (" + Decimal + ") => " + "OCTAL " + "\"" + octalvalue + "\"" );
    }
    public static void decimalToHexadecimal(  String Decimal ) {
        int decimal = Integer.parseInt(Decimal);
        String hexadecimalvalue = "";
        while ( decimal > 0) {
            int reminder;
            reminder = decimal % 16;

            if ( reminder == 0 ) {
                hexadecimalvalue = '0' + hexadecimalvalue;
            }
            else if ( reminder == 1 ) {
                hexadecimalvalue = '1' + hexadecimalvalue;
            }
            else if ( reminder == 2 ) {
                hexadecimalvalue = '2' + hexadecimalvalue;
            }
            else if ( reminder == 3 ) {
                hexadecimalvalue = '3' + hexadecimalvalue;
            }
            else if ( reminder == 4 ) {
                hexadecimalvalue = '4' + hexadecimalvalue;
            }
            else if ( reminder == 5 ) {
                hexadecimalvalue = '5' + hexadecimalvalue;
            }
            else if ( reminder == 6 ) {
                hexadecimalvalue = '6' + hexadecimalvalue;
            }
            else if ( reminder == 7 ) {
                hexadecimalvalue = '7' + hexadecimalvalue;
            }
            else if ( reminder == 8 ) {
                hexadecimalvalue = '8' + hexadecimalvalue;
            }
            else if ( reminder == 9 ) {
                hexadecimalvalue = '9' + hexadecimalvalue;
            }
            else if ( reminder == 10 ) {
                hexadecimalvalue = 'A' + hexadecimalvalue;
            }
            else if ( reminder == 11 ) {
                hexadecimalvalue = 'B' + hexadecimalvalue;
            }
            else if ( reminder == 12 ) {
                hexadecimalvalue = 'C' + hexadecimalvalue;
            }
            else if ( reminder == 13 ) {
                hexadecimalvalue = 'D' + hexadecimalvalue;
            }
            else if ( reminder == 14 ) {
                hexadecimalvalue = 'E' + hexadecimalvalue;
            }
            else if ( reminder == 15 ) {
                hexadecimalvalue = 'F' + hexadecimalvalue;
            }
            decimal = decimal/16;
        }
        System.out.println("DECIMAL (" + Decimal + ") => " + "HEXA-DECIMAL " + "\"" + hexadecimalvalue + "\"" );
    }
    public static void hexadecimalToBinary(String hexadecimal) {
        String decimalvalue = "";
        String binaryvalue = "";

        for(int i = 0; i <= hexadecimal.length()-1;i++) {
            char h = hexadecimal.charAt(i);
            String decimal = "";

            if (h == '0') {
                decimal = "0";
            }
            else if (h == '1') {
               decimal = "1";
            }
            else if (h == '2') {
                decimal = "2";
            }
            else if (h == '3') {
                decimal = "3";
            }
            else if (h == '4') {
                decimal = "4";
            }
            else if (h == '5') {
                decimal = "5";
            }
            else if (h == '6') {
                decimal = "6";
            }
            else if (h == '7') {
                decimal = "7";
            }
            else if (h == '8') {
                decimal = "8";
            }
            else if (h == '9') {
                decimal = "9";
            }
            else if (h == 'A') {
                decimal = "10";
            }
            else if (h == 'B') {
                decimal = "11";
            }
            else if (h == 'C') {
                decimal = "12";
            }
            else if (h == 'D') {
                decimal = "13";
            }
            else if (h == 'E') {
                decimal = "14";
            }
            else if (h == 'F') {
                decimal = "15";
            }

            decimalvalue = decimalvalue + decimal;
            String binary = "";

            int Decimal = Integer.parseInt(decimal);

            while ( Decimal > 0){
                int reminder;
                reminder = Decimal % 2;
                String Reminder = Integer.toString(reminder);
                binary = Reminder + binary;
                Decimal = Decimal / 2;
            }

            if (binary.length() == 1) {
                binary = "000" + binary;
            }
            else if (binary.length() == 2) {
                binary = "00" + binary;
            }
            else if (binary.length() == 3) {
            binary = "0" + binary;
            }
            else if (binary.length() > 3) {
            binary = "" + binary;
            }

            binaryvalue = binaryvalue + binary;
        }
        System.out.println("HEXA-DECIMAL (" + hexadecimal + ") => " + "BINARY " + "\"" + binaryvalue + "\"" );

    }
    public static void hexadecimalToOctal( String hexadecimal ) {
        String decimalvalue = "";
        String binaryvalue = "";

        for(int i = 0; i <= hexadecimal.length()-1;i++) {
            char h = hexadecimal.charAt(i);
            String binary = "";
            String decimal = "";

            if (h == '0') {
                decimal = "0";
            }
            else if (h == '1') {
               decimal = "1";
            }
            else if (h == '2') {
                decimal = "2";
            }
            else if (h == '3') {
                decimal = "3";
            }
            else if (h == '4') {
                decimal = "4";
            }
            else if (h == '5') {
                decimal = "5";
            }
            else if (h == '6') {
                decimal = "6";
            }
            else if (h == '7') {
                decimal = "7";
            }
            else if (h == '8') {
                decimal = "8";
            }
            else if (h == '9') {
                decimal = "9";
            }
            else if (h == 'A') {
                decimal = "10";
            }
            else if (h == 'B') {
                decimal = "11";
            }
            else if (h == 'C') {
                decimal = "12";
            }
            else if (h == 'D') {
                decimal = "13";
            }
            else if (h == 'E') {
                decimal = "14";
            }
            else if (h == 'F') {
                decimal = "15";
            }

            decimalvalue = decimalvalue + decimal;
            int Decimal = Integer.parseInt(decimal);

            while ( Decimal > 0){
                int reminder;
                reminder = Decimal % 2;
                String Reminder = Integer.toString(reminder);
                binary = Reminder + binary;
                Decimal = Decimal / 2;
            }

            if (binary.length() == 1) {
                binary = "000" + binary;
            }
            else if (binary.length() == 2) {
                binary = "00" + binary;
            }
            else if (binary.length() == 3) {
                binary = "0" + binary;
            }
            else if (binary.length() > 3) {
                binary = "" + binary;
            }

            binaryvalue = binaryvalue + binary;
        }
       
       String octalvalue = "";

        for (int i = binaryvalue.length() - 1; i >= 0; i = i-3 ) {
            String octal = "";
           
            for (int j = i; j >= i - 2 && j >=0 ; j--) {
                char x = binaryvalue.charAt(j);
                octal =  x + octal  ;
            }

            if ( octal.length() == 1) {
                octal = "00" + octal;
            }
            else if ( octal.length() == 2) {
                octal = "0" + octal;
            }
            else if ( octal.length() >= 3) {
                octal = "" + octal;
            }

            if (octal.equals("000")) {
                octalvalue = "0" + octalvalue;
            }
            else if (octal.equals("001")) {
                octalvalue = "1" + octalvalue;
            }
            else if (octal.equals("010")) {
                octalvalue = "2" + octalvalue;
            }
            else if (octal.equals("011")) {
                octalvalue = "3" + octalvalue;
            }
            else if (octal.equals("100")) {
                octalvalue = "4" + octalvalue;
            }
            else if (octal.equals("101")) {
                octalvalue = "5" + octalvalue;
            }
            else if (octal.equals("110")) {
                octalvalue = "6" + octalvalue;
            }
            else if (octal.equals("111")) {
                octalvalue = "7" + octalvalue;
            }
        }
        System.out.println("HEXA-DECIMAL (" + hexadecimal + ") => " + "OCTAL " + "\"" + octalvalue + "\"" );
    }
    public static void hexadecimalToDecimal( String hexadecimal ) {
        
        long finaldecimalvalue = 0;
        int j = 0;
        for(int i = hexadecimal.length() - 1 ; i >= 0 ;i--) {
            char h = hexadecimal.charAt(i);
            long decimal = 0;

            if (h == '0') {
                decimal = 0;
            }
            else if (h == '1') {
               decimal = 1;
            }
            else if (h == '2') {
                decimal = 2;
            }
            else if (h == '3') {
                decimal = 3;
            }
            else if (h == '4') {
                decimal = 4;
            }
            else if (h == '5') {
                decimal = 5;
            }
            else if (h == '6') {
                decimal = 6;
            }
            else if (h == '7') {
                decimal = 7;
            }
            else if (h == '8') {
                decimal = 8;
            }
            else if (h == '9') {
                decimal = 9;
            }
            else if (h == 'A') {
                decimal = 10;
            }
            else if (h == 'B') {
                decimal = 11;
            }
            else if (h == 'C') {
                decimal = 12;
            }
            else if (h == 'D') {
                decimal = 13;
            }
            else if (h == 'E') {
                decimal = 14;
            }
            else if (h == 'F') {
                decimal = 15;
            }
            
            finaldecimalvalue = finaldecimalvalue + (long)(decimal * Math.pow(16, j));
            j++;
        }
        System.out.println("HEXA-DECIMAL (" + hexadecimal + ") => " + "DECIMAL " + "\"" + finaldecimalvalue + "\"" );
    }
}