package com.rtrack.client;

import com.rtrack.controller.RtrackController;

import java.io.FileNotFoundException;

public class Main {

        public static void main(String[] args) throws FileNotFoundException {
                RtrackController controller = new RtrackController();
                controller.execute();
        }
}
