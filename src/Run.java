import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import model.Model;
import view.View;
import controller.Controller;



public class Run {

	public static void main (String [] args) throws Exception {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				try {
				            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				    }
				 catch (Exception e) {
					 e.printStackTrace();
				 }


				Model model = new Model();
				Controller controller = new Controller(model);
				View view = new View(controller);
			}

	});

	}
}
