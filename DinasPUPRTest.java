import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DinasPUPRTest {

    public static void main(String[] args) throws InterruptedException {

    	// Inisialisasi driver dan buka website Dinas PUPR Banda Aceh
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();    
        driver.manage().window().maximize();        
        driver.get("https://dinaspupr.bandaacehkota.go.id/");
        
     // Maximalkan window
        driver.manage().window().maximize();

        // Test case 1: Mengakses halaman profil
        WebElement profileLink = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/nav/div/ul/li[2]"));
        profileLink.click();
        Thread.sleep(3000); // Tunggu hingga halaman profil selesai loading

        // Test case 2: Mengakses search
        WebElement searchInput=driver.findElement(By.cssSelector("[placeholder='Search …']"));
		 searchInput.sendKeys("Banda Aceh");
		 searchInput.sendKeys(Keys.ENTER);
		 Thread.sleep(5000); // Tunggu hingga kata yang dicari selesai loading
		 

        // Test case 3: Muat Artikel teratas
		 WebElement artikelLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/article[1]/div/header/h3/a"));
	        artikelLink.click();
	        Thread.sleep(3000); // Tunggu hingga halaman artikel selesai loading
	        
	        
	    // Test case 4: Mengakses Halaman Pengaduan
	        WebElement pengaduanLink = driver.findElement(By.linkText("Pengaduan"));
	        pengaduanLink.click();
        Thread.sleep(3000); // Tunggu hingga halaman beranda selesai loading

        // Test case 5: Mengakses halaman beranda
        WebElement berandaLink = driver.findElement(By.linkText("Beranda"));
        berandaLink.click();
        Thread.sleep(3000); // Tunggu hingga halaman beranda selesai loading
        
        
        
        // Tutup browser
        driver.quit();
    }
}
