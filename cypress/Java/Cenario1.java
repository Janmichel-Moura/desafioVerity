public class Cenario1Test {
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
  public void cenario1() {
    driver.get("https://www.verity.com.br/");
    driver.manage().window().setSize(new Dimension(1400, 836));
    vars.put("Somos Verity_", "css=#comp-lhp9lfxc1 > .font_2");
    vars.put("Nossos clientes", "css=#comp-lhp9lfyi1 > .font_2 > .wixui-rich-text__text");
    driver.close();
  }
}
