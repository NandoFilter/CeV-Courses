package Outros;

/** @author  NandoFilter
 *  @since   08/07/2020 */

import java.util.Locale;

public class Idioma {
    public static void main(String[] args){

        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage()); // imprime "Português"
        System.out.println(loc.getLanguage()); // imprime "pt"

    }
}