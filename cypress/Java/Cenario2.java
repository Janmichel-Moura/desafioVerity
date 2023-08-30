public class Cenario2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cenario2() {
    driver.get("https://www.verity.com.br/");
    driver.manage().window().setSize(new Dimension(1440, 875));
    driver.findElement(By.id("comp-kevyodnk6label")).click();
    driver.findElement(By.id("input_comp-kwz6tqej")).sendKeys("Janmichel Moura");
    driver.findElement(By.id("input_comp-kwz6tqf7")).sendKeys("janmichel07@gmail.com");
    driver.findElement(By.id("input_comp-kwz6tqfe")).sendKeys("85999621179");
    driver.findElement(By.id("textarea_comp-kwz6tqfr")).sendKeys("Desafio Verity Selelção");
    driver.findElement(By.cssSelector(".cCdhN7")).click();
    driver.findElement(By.cssSelector(".kuTaGy")).click();
    driver.close();
  }
}
