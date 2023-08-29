// Define o bloco de teste com a descrição "cenario1"
describe('cenario1', () => {
    // Define o caso de teste com a descrição "Should visit a page and assert elements"
    it('Should visit a page and assert elements', () => {
    
    // Visita o URL da página 'https://verity.com.br'
    cy.visit('https://verity.com.br')

    // Click no Menu Contato
    cy.get('#comp-kevyodnk6label').click()

    //preenche o campo nome
    cy.get('[name="nome"]').type('Janmichel Moura')
    
    //preenche o campo email
    cy.get('[name="email"]').type('janmichel07@gmail.com')
    
    //preenche o campo telefone / celular
    cy.get('[name="phone"]').type('85999621179')
    
    //preenche a area de testo nos conte o desafio
    cy.get('#textarea_comp-kwz6tqfr').type('desafio de seleção Verity')
    
    //seleciono o checkbox
    cy.get('[data-testid="checkbox"]').click()

    //click no botão enviar
    cy.get('[data-testid="buttonElement"]').click()

    })
})