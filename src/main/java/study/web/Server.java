package study.web;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {

  private final int PORT = 8080;
  private static final Logger logger = LoggerFactory.getLogger(Server.class);

  public void run() {
    try (ServerSocket serverSocket = new ServerSocket(PORT)) {
      logger.info("WebServer Started. waiting for client...");

      Socket clientSocket;
      while ((clientSocket = serverSocket.accept())!=null) {
        logger.info("{} connected", clientSocket.getInetAddress());

      }
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
