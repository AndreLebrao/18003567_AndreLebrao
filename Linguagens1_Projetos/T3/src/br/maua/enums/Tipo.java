package br.maua.enums;

public enum Tipo {
    MANGA{
        @Override
        public String toString() {
            return "manga";
        }
    },
    ANIME{
        @Override
        public String toString() {
            return "anime";
        }
    }
}
