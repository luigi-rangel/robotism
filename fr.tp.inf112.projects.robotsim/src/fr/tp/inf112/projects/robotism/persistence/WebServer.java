package fr.tp.inf112.projects.robotism.persistence;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

import fr.tp.inf112.projects.robotsim.app.SimulatorApplication;

public class WebServer {
	private static final Logger LOGGER = Logger.getLogger(WebServer.class.getName());
	
	public static void main(String args[]) {
		try (
			ServerSocket serverSocket = new ServerSocket(80);
		) {
			do {
				Socket socket = serverSocket.accept();
				Runnable reqProcessor = new RequestProcessor(socket);
				new Thread(reqProcessor).start();
			} while (true);
		} catch (IOException e) {
            LOGGER.severe(e.getMessage());
		}
	}
}
