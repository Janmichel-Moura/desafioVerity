describe 'Cenario2' do
  before(:each) do
    @driver = Selenium::WebDriver.for(:remote, url: 'http://localhost:4444/wd/hub', desired_capabilities: Selenium::WebDriver::Remote::Capabilities.firefox)
    @vars = {}
  end
  after(:each) do
    @driver.quit
  end
  it 'cenario2' do
    @driver.get('https://www.verity.com.br/')
    @driver.manage.resize_to(1440, 875)
    @driver.find_element(:id, 'comp-kevyodnk6label').click
    @driver.find_element(:id, 'input_comp-kwz6tqej').send_keys('Janmichel Moura')
    @driver.find_element(:id, 'input_comp-kwz6tqf7').send_keys('janmichel07@gmail.com')
    @driver.find_element(:id, 'input_comp-kwz6tqfe').send_keys('85999621179')
    @driver.find_element(:id, 'textarea_comp-kwz6tqfr').send_keys('Desafio Verity Selelção')
    @driver.find_element(:css, '.cCdhN7').click
    @driver.find_element(:css, '.kuTaGy').click
    @driver.close
  end
end
