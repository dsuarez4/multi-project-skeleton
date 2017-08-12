package com.mechanitis.demo.sense.mood;

import javax.websocket.DeploymentException;
import java.io.IOException;


public class MoodService {
    private static final int PORT = 8082;
    private final Service service;

    public MoodService() {
        service = null;
    }

    @Override
    public void run() {
        service.run();
    }

    public void stop() throws Exception {
        service.stop();
    }

    public static void main(String[] args) throws IOException, DeploymentException {
        new MoodService().run();
    }
}
