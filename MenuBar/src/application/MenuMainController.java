/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code is action event for close[Exit]Button.
 *   Project:  MenuMainController
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *	 Build id: 20240307-1437
 ********************************************************************************************/



package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class MenuMainController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void CloseApp(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		
	}

}
