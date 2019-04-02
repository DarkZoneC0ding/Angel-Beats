package view;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import style.WindowStyles;

public class ViewManager {
	//Window Variables
	private static int ScreenWidth = 1280;
	private static int ScreenHeight = 720;
	private static String AppTitle = "Angel Beats!";
	private Stage stage;
	
	//Scenes
	private Scene MainScene;
	
	//Panes
	private AnchorPane MainPane;
	
	//Ctor
	public ViewManager() {
		InitUI();
		SetComponentStyle();
	}
	
	//Initializing the UI
	private void InitUI() {
		stage = new Stage();
		MainPane = new AnchorPane();
		MainScene = new Scene(MainPane, ScreenWidth, ScreenHeight);
		stage.setScene(MainScene);
		stage.setTitle(AppTitle);
	}
	
	//Styling all the Components
	private void SetComponentStyle() {
		WindowStyles windowstyle = new WindowStyles(MainPane, "rsc/Kanade.jpg");
	}
	
	//Returns the Current Stage
	public Stage GetCurrentStage() {
		return stage;
	}
}
