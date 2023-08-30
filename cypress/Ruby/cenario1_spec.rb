describe 'Cenario1' do
  before(:each) do
    @driver = Selenium::WebDriver.for(:remote, url: 'http://localhost:4444/wd/hub', desired_capabilities: Selenium::WebDriver::Remote::Capabilities.firefox)
    @vars = {}
  end
  after(:each) do
    @driver.quit
  end
  it 'cenario1' do
    @driver.get('https://www.verity.com.br/')
    @driver.manage.resize_to(1400, 836)
    @vars['Somos Verity_'] = 'css=#comp-lhp9lfxc1 > .font_2'
    @vars['Nossos clientes'] = 'css=#comp-lhp9lfyi1 > .font_2 > .wixui-rich-text__text'
    @driver.close
  end
end
