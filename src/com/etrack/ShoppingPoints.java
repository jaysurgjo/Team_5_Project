package com.etrack;

public enum ShoppingPoints implements Shopper {
    TEN {
        @Override
        public String toString() {
            return "10";
        }
    },
    TWENTY {
        @Override
        public String toString() {
            return "20";
        }
    },
    THIRTY {
        @Override
        public String toString() {
            return "30";
        }
    },
    FOURTY {
        @Override
        public String toString() {
            return "40";
        }
    },
    FIFTY {
        @Override
        public String toString() {
            return "50";
        }
    },
    SIXTY {
        @Override
        public String toString() {
            return "60";
        }
    },
    SEVENTY {
        @Override
        public String toString() {
            return "70";
        }
    },
    EIGHTY {
        @Override
        public String toString() {
            return "80";
        }
    },
    NINETY {
        @Override
        public String toString() {
            return "90";
        }
    },
    ONE_HUNDRED {
        @Override
        public String toString() {
            return "100";
        }
    };
}
