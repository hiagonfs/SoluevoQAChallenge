package utils;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ImageUtil {

	public static final String PATH_DIRECTORY = System.getProperty("user.dir") + "//reports";

	private static Screenshot captureImage() {
		return new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(UtilWebDriver.getDriver());
	}

	public static void createAndCaptureImage(String namePicture) {
		Screenshot screen = captureImage();
		createReportDirectory();
		try {
			ImageIO.write(screen.getImage(), "PNG", new File(PATH_DIRECTORY + "/" + namePicture + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createReportDirectory() {
		File file = new File(PATH_DIRECTORY);
		if (!file.exists()) {
			file.mkdirs();
			// Files.createDirectories(Paths.get(PATH_DIRECTORY));
		}
	}

}
