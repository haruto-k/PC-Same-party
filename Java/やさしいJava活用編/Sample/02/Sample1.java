import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Sample1 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage stage)throws Exception
   {
      BorderPane bp = new BorderPane();

      Scene sc = new Scene(bp, 300, 200);
      
      stage.setScene(sc);      
      stage.setTitle("�T���v��");
      stage.show();
   }
}
