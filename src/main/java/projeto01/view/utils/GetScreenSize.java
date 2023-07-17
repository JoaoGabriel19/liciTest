package projeto01.view.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GetScreenSize {
	public static Dimension getScreenSize() {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		return size;
	}
}
