package br.com.cicom.sisef;

import br.com.cicom.sisef.DAO.GuarnicaoDAO;
import br.com.cicom.sisef.model.Guarnicao;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
//        
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/styles/Styles.css");
//        
//        stage.setTitle("SISEF - CICOM");
//        stage.setScene(scene);
//        stage.show();
        
        Guarnicao guarnicao = new Guarnicao();
        GuarnicaoDAO daoGuarnicao = new GuarnicaoDAO();
        
        guarnicao.setCmd("TESTE 1");
        guarnicao.setMotorista("MOTORISTA 1");
        guarnicao.setPatrulheiro1("PATRULHEIRO 1");
        guarnicao.setPatrulheiro2("PATRULHEIRO 2");
        
        System.out.println("DADOS DA GUARNIÇÃO ANTES DA PERSISTENCIA: " + guarnicao);
        
        daoGuarnicao.salvar(guarnicao);
        
        System.out.println("DADOS DA GUARNIÇÃO DEPOIS DA PERSISTENCIA: " + guarnicao);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
