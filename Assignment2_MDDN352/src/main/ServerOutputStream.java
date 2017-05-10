package main;

import java.io.IOException;
import java.io.OutputStream;

import javafx.scene.control.TextArea;
 

 
/**
 * This class extends from OutputStream to redirect output to a JTextArrea
 * @author www.codejava.net
 *
 */
public class ServerOutputStream extends OutputStream {
    private TextArea textArea;
     
    public ServerOutputStream(TextArea textArea) {
        this.textArea = textArea;
    }
     
    @Override
    public void write(int b) throws IOException {
        // redirects data to the text area
        textArea.appendText(String.valueOf((char)b));
        // scrolls the text area to the end of data
        //textArea.setCaretPosition(textArea.getParent().getLength());
    }
}
