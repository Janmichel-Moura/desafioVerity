// Define o bloco de teste com a descrição "cenario1"
describe('cenario1', () => {
  // Define o caso de teste com a descrição "Should visit a page and assert elements"
  it('Should visit a page and assert elements', () => {
  
  // Visita o URL da página 'https://verity.com.br'
  cy.visit('https://verity.com.br')

  //Seleciona o Elemento
  cy.get('h2.font_2.wixui-rich-text__text')
    //Captura o texto do elemento selecionado
    .invoke('text')
    // Verifica se o texto capturado inclui a string "Somos Verity_"
    .should('include', 'Somos Verity_')


  //Seleciona o Elemento
  cy.get('#comp-lhp9lfyg2 > [data-testid="inline-content"] > [data-testid="mesh-container-content"] > [data-testid="richTextElement"] > .font_2')  
    // Verifica se o texto capturado no elemento é "Nossos clientes_"
    .should('have.text', 'Nossos clientes_')
  })
})