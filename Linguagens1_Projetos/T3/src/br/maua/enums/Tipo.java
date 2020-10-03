package br.maua.enums;

/**
 *
 * Arquivo enum que representa as opcoes que a pesquisa pode adotar: anime ou manga
 *
 * @author Andre Lebrao 18.00356-7
 * @author Joao Guilherme Jatoba 18.01790-8
 * @since 15/09/2020
 */

public enum Tipo {
    /**
     * Tipo manga
     */
    MANGA{
        /**
         * @return String que representa o tipo manga
         */
        @Override
        public String toString() {
            return "manga";
        }
    },
    /**
     * Tipo anime
     */
    ANIME{
        /**
         * @return String que representa o tipo anime
         */
        @Override
        public String toString() {
            return "anime";
        }
    }
}
