package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {

	private JMenu file, preferences, help;
	
	private JMenuItem saveItem, openItem;
	
	private SaveButtonListener saveListener;
	private OpenButtonListener openListener;

	public MenuBar() {
		setMenuBarPreferences();
		createMenus();
		addMenusToMenuBar(file, preferences, help);
	}

	private void setMenuBarPreferences() {
		setLayout(new FlowLayout(FlowLayout.LEADING));
		setPreferredSize(new Dimension(0, 30));
	}

	private void createMenus() {
		file = createFileMenu();
		preferences = createPreferencesMenu();
		help = createHelpMenu();
	}

	private void addMenusToMenuBar(JMenu file, JMenu preferences, JMenu help) {
		add(file);
		add(preferences);
		add(help);
	}

	private JMenu createHelpMenu() {
		JMenu help = new JMenu("Help");
		return help;
	}

	private JMenu createPreferencesMenu() {
		JMenu preferences = new JMenu("Preferences");
		return preferences;
	}

	private JMenu createFileMenu() {
		JMenu file = new JMenu("File");
		
		openItem = new JMenuItem("Open Profile..");
		saveItem = new JMenuItem("Save Profile..");
		
		file.add(openItem);
		file.add(saveItem);
		return file;
	}

	public void setSaveListener(SaveButtonListener listener){
		saveListener = listener;
		saveItem.addActionListener(listener);
	}

	public void setOpenListener(OpenButtonListener listener) {
		openListener = listener;
		openItem.addActionListener(listener);
		
	}

}
