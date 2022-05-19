package com.rtrack.client;

import com.rtrack.controller.EtrackController;

import java.io.FileNotFoundException;

public class Main {

        public static void main(String[] args) throws FileNotFoundException {
                EtrackController controller = new EtrackController();
                controller.execute();
        }
}
