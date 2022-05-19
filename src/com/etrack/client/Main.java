package com.etrack.client;

import com.etrack.Shopper;
import com.etrack.controller.EtrackController;

import java.io.FileNotFoundException;

public class Main {

        public static void main(String[] args) throws FileNotFoundException {
                EtrackController controller = new EtrackController();
                controller.execute();
        }
}
