package files;

import java.net.URL;
import java.util.ResourceBundle;

import client.Client;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button placeOrder;

    @FXML
    private Label coronaText;

    @FXML
    private Label exportGoldPrice;

    @FXML
    private TextField coronaAmount;

    @FXML
    private TextField heinekenAmount;

    @FXML
    private TextField tableNumber;

    @FXML
    private TextField lionBrownAmount;

    @FXML
    private Label export33Text;

    @FXML
    private Label lionBrownPrice;

    @FXML
    private Label speightsText;

    @FXML
    private TextField wakachangiLagerAmount;

    @FXML
    private TextField speightsAmount;

    @FXML
    private Label priceText;

    @FXML
    private Label macsGoldPrice;

    @FXML
    private Label tokyoDryText;

    @FXML
    private Label wakachangiLagerPrice;

    @FXML
    private Label lionBrownText;

    @FXML
    private TextField macsGoldAmount;

    @FXML
    private Label tokyoDryPrice;

    @FXML
    private TextField solAmount;

    @FXML
    private Label heinekenPrice;

    @FXML
    private Label wakachangiText;

    @FXML
    private Label tuiPrice;

    @FXML
    private Label beerText;

    @FXML
    private Label solText;

    @FXML
    private Label orderText;

    @FXML
    private Label heinekenText;

    @FXML
    private Label export33Price;

    @FXML
    private Label speightsPrice;

    @FXML
    private Label eportGoldText;

    @FXML
    private Label amountText;

    @FXML
    private Label coronaPrice;

    @FXML
    private TextField tokyoDryAmount;

    @FXML
    private TextField tuiAmount;

    @FXML
    private Label macsGoldText;

    @FXML
    private Label solPrice;

    @FXML
    private Label tuiText;

    @FXML
    private TextField exportGoldAmount;

    @FXML
    private Label tableNumberText;

    @FXML
    void initialize() {
        assert placeOrder != null : "fx:id=\"placeOrder\" was not injected: check your FXML file 'App.fxml'.";
        assert coronaText != null : "fx:id=\"coronaText\" was not injected: check your FXML file 'App.fxml'.";
        assert exportGoldPrice != null : "fx:id=\"exportGoldPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert coronaAmount != null : "fx:id=\"coronaAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert heinekenAmount != null : "fx:id=\"heinekenAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert tableNumber != null : "fx:id=\"tableNumber\" was not injected: check your FXML file 'App.fxml'.";
        assert lionBrownAmount != null : "fx:id=\"lionBrownAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert export33Text != null : "fx:id=\"export33Text\" was not injected: check your FXML file 'App.fxml'.";
        assert lionBrownPrice != null : "fx:id=\"lionBrownPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert speightsText != null : "fx:id=\"speightsText\" was not injected: check your FXML file 'App.fxml'.";
        assert wakachangiLagerAmount != null : "fx:id=\"wakachangiLagerAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert speightsAmount != null : "fx:id=\"speightsAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert priceText != null : "fx:id=\"priceText\" was not injected: check your FXML file 'App.fxml'.";
        assert macsGoldPrice != null : "fx:id=\"macsGoldPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert tokyoDryText != null : "fx:id=\"tokyoDryText\" was not injected: check your FXML file 'App.fxml'.";
        assert wakachangiLagerPrice != null : "fx:id=\"wakachangiLagerPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert lionBrownText != null : "fx:id=\"lionBrownText\" was not injected: check your FXML file 'App.fxml'.";
        assert macsGoldAmount != null : "fx:id=\"macsGoldAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert tokyoDryPrice != null : "fx:id=\"tokyoDryPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert solAmount != null : "fx:id=\"solAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert heinekenPrice != null : "fx:id=\"heinekenPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert wakachangiText != null : "fx:id=\"wakachangiText\" was not injected: check your FXML file 'App.fxml'.";
        assert tuiPrice != null : "fx:id=\"tuiPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert beerText != null : "fx:id=\"beerText\" was not injected: check your FXML file 'App.fxml'.";
        assert solText != null : "fx:id=\"solText\" was not injected: check your FXML file 'App.fxml'.";
        assert orderText != null : "fx:id=\"orderText\" was not injected: check your FXML file 'App.fxml'.";
        assert heinekenText != null : "fx:id=\"heinekenText\" was not injected: check your FXML file 'App.fxml'.";
        assert export33Price != null : "fx:id=\"export33Price\" was not injected: check your FXML file 'App.fxml'.";
        assert speightsPrice != null : "fx:id=\"speightsPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert eportGoldText != null : "fx:id=\"eportGoldText\" was not injected: check your FXML file 'App.fxml'.";
        assert amountText != null : "fx:id=\"amountText\" was not injected: check your FXML file 'App.fxml'.";
        assert coronaPrice != null : "fx:id=\"coronaPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert tokyoDryAmount != null : "fx:id=\"tokyoDryAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert tuiAmount != null : "fx:id=\"tuiAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert macsGoldText != null : "fx:id=\"macsGoldText\" was not injected: check your FXML file 'App.fxml'.";
        assert solPrice != null : "fx:id=\"solPrice\" was not injected: check your FXML file 'App.fxml'.";
        assert tuiText != null : "fx:id=\"tuiText\" was not injected: check your FXML file 'App.fxml'.";
        assert exportGoldAmount != null : "fx:id=\"exportGoldAmount\" was not injected: check your FXML file 'App.fxml'.";
        assert tableNumberText != null : "fx:id=\"tableNumberText\" was not injected: check your FXML file 'App.fxml'.";
        
       setupButton(); 
    }
        
        public void setupButton(){
        	placeOrder.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Client.sendToServer(getOrder());
                }

				private String getOrder() {
					
					return	"------------------------------------------------------------" + "\n" +
							"Order for Table " + tableNumber.getText() + ":\n" +
							"------------------------------------------------------------" + "\n" +
							"Wakachangi Lager: " + wakachangiLagerAmount.getText() + "\n" +
							"Tokyo Dry: " + tokyoDryAmount.getText() + "\n" +
							"Corona: " + coronaAmount.getText() + "\n" +
							"Heiniken: " + heinekenAmount.getText() + "\n" +
							"Mac's Gold: " + macsGoldAmount.getText() + "\n" +
							"Tui: " + tuiAmount.getText() + "\n" +
							"Export Gold: " + exportGoldAmount.getText() + "\n" +
							"Export 33: " + exportGoldAmount.getText() + "\n" +
							"Sol: " + solAmount.getText() + "\n" +
							"Speights: " + speightsAmount.getText() + "\n" +
							"Lion Brown: " + lionBrownAmount.getText() + "\n" +
							"------------------------------------------------------------"
							;
				}
            });}
}
