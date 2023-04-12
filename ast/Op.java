package ast;

public enum Op {
    MOINS{
        @Override
        public String toString() {
            return "-";
        }
    },
    DIV{
        @Override
        public String toString() {
            return "/";
        }
    },

    PLUS{
        @Override
        public String toString() {
            return "+";
        }
    },

    PRODUIT{
        @Override
        public String toString() {
            return "*";
        }
    },
    OU{
        @Override
        public String toString() {
            return "||";
        }
    },
    ET{
        @Override
        public String toString() {
            return "&&";
        }
    },
    INF{
        @Override
        public String toString() {
            return "<";
        }
    },
    NEG{
        @Override
        public String toString() {
            return "not";
        }
    },
    VALEURABSOLUE{
        @Override
        public String toString() {
            return "abs";
        }
    },
    EGALEGAL{
        @Override
        public String toString() {
            return "==";
        }
    },
    SUP{
        @Override
        public String toString() {
            return ">";
        }
    }
}
