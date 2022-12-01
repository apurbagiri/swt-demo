package com.apurbagiri.swtdemo;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.apurbagiri.swtdemo.Application;

public class Application {

	public void run() {

		Display display = new Display();
		Shell shell = createApplicationShell(display);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
		System.exit(0);
	}
	

	/**
	 * Method to create and return base SWT Shell for the Display
	 * 
	 * @param display
	 * @return Shell
	 */
	private Shell createApplicationShell(final Display display) {
		final Shell shell = new Shell(display);
		shell.setText("TEST LABEL");
		GridLayout shellGridLayout = new GridLayout();
		shellGridLayout.numColumns = 3;
		shell.setLayout(shellGridLayout);
		return shell;
	}
	
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Application().run();
	}
}
