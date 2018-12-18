package jan.mockupgui;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MockUpGui extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();

		pane.setLeft(createTreeView());
		pane.setTop(createMenuBar());
		pane.setCenter(createTableView());

		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Logistics Software");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Node createTableView() {
		TableView table = new TableView();

		TableColumn item = new TableColumn("Iteme");
		TableColumn location = new TableColumn("Location");
		TableColumn amount = new TableColumn("Amount");
		TableColumn category = new TableColumn("Category");
		TableColumn exrpess = new TableColumn("Express Deliverable");
		TableColumn color = new TableColumn("Color");

		table.getColumns().addAll(item, location, amount, category, exrpess, color);

		return table;
	}

	private TableColumn createTableColumn(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	private Node createMenuBar() {
		MenuBar bar = new MenuBar();
		Menu file = new Menu("File");
		Menu create = new Menu("Create");
		Menu view = new Menu("View");
		Menu help = new Menu("Help");
		bar.getMenus().addAll(file, create, view, help);

		return bar;
	}

	private Node createTreeView() {
		TreeView<String> tv = new TreeView<>();
		tv.setPrefWidth(150);
		tv.setShowRoot(false);

		TreeItem<String> root = createTreeItem("Root");

		TreeItem<String> warehouse1 = createTreeItem("Warehouse Linz");
		TreeItem<String> warehouse2 = createTreeItem("Warehouse Wien");
		TreeItem<String> warehouse3 = createTreeItem("Warehouse Graz");
		root.getChildren().addAll(warehouse1, warehouse2, warehouse3);

		// warehouse1
		TreeItem<String> electronics = createTreeItem("Electronics");
		TreeItem<String> sport = createTreeItem("Sports");
		TreeItem<String> entertainment = createTreeItem("Entertainment");
		TreeItem<String> vehicles = createTreeItem("Vehicles");

		warehouse1.getChildren().addAll(electronics, sport, entertainment, vehicles);

		TreeItem<String> telev = createTreeItem("TV");
		TreeItem<String> console = createTreeItem("Console");

		electronics.getChildren().addAll(telev, console);

		TreeItem<String> ps4 = createTreeItem("Playstation 4");
		TreeItem<String> xb1 = createTreeItem("XBox One");

		TreeItem<String> sony = createTreeItem("Sony");
		TreeItem<String> lg = createTreeItem("LG");

		telev.getChildren().addAll(sony, lg);
		console.getChildren().addAll(ps4, xb1);

		tv.setRoot(root);
		return tv;
	}

	private TreeItem<String> createTreeItem(String name) {
		TreeItem<String> item = new TreeItem<>(name);
		return item;
	}

}
