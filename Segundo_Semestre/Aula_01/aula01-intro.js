// ===================== Funções Simples =====================
// Função simples que exibe uma mensagem
function mensagem(){
    console.log("Olá");
}
mensagem(); // Chama a função

// Função com parâmetro que exibe uma saudação personalizada
function mensagemProf(nomeProf){
    console.log("Olá, " + nomeProf);
}
mensagemProf("João");

// ===================== Funções com Retorno =====================
// Função que soma dois números
function soma(num1, num2){
    return num1 + num2;
}
console.log(soma(5, 5));

// ===================== Funções Anônimas =====================
// Função anônima autoexecutável (IIFE)
(function(){
    console.log("Olá, função anônima");
})();

// ===================== Arrow Functions =====================
// Arrow function simples
const mensagemArrow = () => console.log("Olá, função arrow");
mensagemArrow();

// ⚠️ DESAFIO: Arrow function com parâmetro, rest operator e testes
const rest = (...numeros) => numeros.length;
const numeros = [1, 2, 3, 4, 5];
console.log("REST", rest(...numeros));

// Testando Arrow Functions com operações matemáticas
const somar = (num1, num2) => num1 + num2;
const subtrair = (num1, num2) => num1 - num2;
const dividir = (num1, num2) => num1 / num2;
const multiplicar = (num1, num2) => num1 * num2;

console.log("Soma:", somar(5, 5));
console.log("Subtração:", subtrair(10, 5));
console.log("Divisão:", dividir(10, 2));
console.log("Multiplicação:", multiplicar(5, 3));

// ===================== Destructuring =====================
const pessoa = {
    nome: "João",
    idade: 30,
    peso: 80,
    endereco: {
        rua: "Rua do Bairro",
        numero: 123,
        cidade: "Cidade XYZ"
    }
};

// Destructuring para capturar a cidade
const { endereco: { cidade } } = pessoa;
console.log("Cidade:", cidade);
