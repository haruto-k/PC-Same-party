import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;

public class Sample6 extends Application
{
   private Label[] lb = new Label[3];

   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage stage)throws Exception
   {
      //コントロールの作成
      for(int i=0; i<lb.length; i++){ 
         lb[i] = new Label("This is a car.");
      }
     
      //コントロールの設定
      lb[0].setTextFill(Color.BLACK);
      lb[1].setTextFill(Color.BLUE);
      lb[2].setTextFill(Color.RED);

      lb[0].setFont(Font.font("Serif", 12));
      lb[1].setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
      lb[2].setFont(Font.font("SansSerif", FontWeight.BLACK, 16));

      //ペインの作成
      BorderPane bp = new BorderPane();
      VBox vb = new VBox();

      //ペインへの追加
      for(int i=0; i<lb.length; i++){
         vb.getChildren().add(lb[i]);//変更
      }
      bp.setCenter(vb);

      //シーンの作成
      Scene sc = new Scene(bp, 300, 200);
      
      //ステージへの追加
      stage.setScene(sc);

      //ステージの表示
      stage.setTitle("サンプル");
      stage.show();
   }
}
