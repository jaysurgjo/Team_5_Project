package com.etrack;

import java.security.PublicKey;

public enum ShoppingRewards implements Shopper{
    TEN_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$10 gift card";
        }
    },
    TWENTY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$20 gift card";
        }
    },
    THIRTY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return " $30 gift card";
        }
    },
    FOURTY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$40 gift card";
        }
    },
    FIFTY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$50 gift card";
        }
    },
    SIXTY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$60 gift card";
        }
    },
    SEVENTY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$70 gift card";
        }
    },
    EIGHTY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "80 gift card";
        }
    },
    NINETY_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$90 gift card";
        }
    },
    ONEHUNDRED_DOLLAR_GIFT_CARD {
        @Override
        public String toString() {
            return "$100 gift card";
        }
    };
}
