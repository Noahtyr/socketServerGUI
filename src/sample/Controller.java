package sample;

import javafx.event.ActionEvent;
import	java.io.*;
import	java.net.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Controller {

    @FXML
    public Button sendMsg;
    @FXML
    public TextArea chatWindow;
    @FXML
    public TextField text;



    public Socket s;
    public OutputStream oPut;
    public InputStream iPut;
    public PrintWriter pw;



    public void buttonPress(ActionEvent event){

        System.out.println("User Has logged in...");

    }
    @FXML
    public void send() {
        try {
            String message = text.getText();

            chatWindow.appendText("\n"+text.getText() );

        } catch (Exception ex){
            ex.printStackTrace();

        }
    }
}

