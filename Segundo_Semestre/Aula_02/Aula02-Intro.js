// ===================== Concatenação de Strings =====================
const nome1 = "Murillo";
const sobrenome1 = "Ferreira";

// Concatena nome e sobrenome
const nomeCompleto1 = nome1.concat(sobrenome1);
console.log(nomeCompleto1);


// ===================== Concatenação de Arrays =====================
const nomes1 = ["Fernando, ", "João, ", "Maria, ", "Pedro"];
const professores1 = ["Murillo, ", "Lucas, ", "João, ", "Maria"];

// Concatena arrays
const todos1 = nomes1.concat(professores1);
console.log(todos1);

// Método para adicionar elementos
professores1.push("Ana");
console.log(professores1);

// Método para alterar um elemento (substitui "João" por "Francisco")
professores1[1] = "Francisco";


// ===================== Ordenação e Remoção =====================
// Método para ordenar
const alunos1 = ["Fernando, ", "João, ", "Maria, ", "Pedro"];
alunos1.sort();
console.log(alunos1);

// Método para deletar usando delete
const alunos2 = ["Fernando, ", "João, ", "Maria, ", "Pedro"];
delete alunos2[0];
console.log(alunos2);

// Método para remover o último
const alunos3 = ["Fernando, ", "João, ", "Maria, ", "Pedro"];
alunos3.pop();
console.log(alunos3);

// Método para remover o primeiro
const alunos4 = ["Fernando, ", "João, ", "Maria, ", "Pedro"];
alunos4.shift();
console.log(alunos4);


// ===================== Métodos com Splice =====================
const alunos5 = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"];
// Remove 3 elementos a partir da posição 2
alunos5.splice(2, 3);
console.log(alunos5);

const alunos6 = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"];
// Adiciona 2 novos alunos a partir da posição 2
alunos6.splice(2, 0, "Murillo", "Francisco");
console.log(alunos6);


// ⚠️ DESAFIO: Adicionar um novo aluno ao final do array
const alunos7 = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"];
alunos7.push("Murillo");
console.log(alunos7);

// Alternativa com splice
alunos7.splice(alunos7.length, 0, "Murillo");
console.log(alunos7);


// ===================== Percorrendo Arrays =====================
const alunos8 = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"];
// Método forEach para exibir índice e nome
alunos8.forEach((nome, indice) => {
    console.log(indice, nome);
});


// ===================== Filtrando Arrays =====================
const alunos9 = [
    {nomeAluno: "Murillo", nota: 9, participativo: true},
    {nomeAluno: "Lucas", nota: 6, participativo: false},
    {nomeAluno: "Larissa", nota: 8, participativo: false},
    {nomeAluno: "Fabiola", nota: 7, participativo: true}
];

// Filtra alunos com nota >= 8
console.log(alunos9.filter(aluno => aluno.nota >= 8));

// Filtra alunos participativos
console.log(alunos9.filter(aluno => aluno.participativo));


// ⚠️ DESAFIO: Usar dois filtros (nota >= 8 e participativos)
console.log(alunos9.filter(aluno => aluno.nota >= 8 && aluno.participativo));


// ===================== Desafios com Funções =====================
// ⚠️ DESAFIO: Arrow function para multiplicação
const multiplicar = (num1, num2) => num1 * num2;
console.log(multiplicar(5, 5));

// ⚠️ DESAFIO: Função para 4 operações matemáticas
function operacoesMatematica(num1, num2) {
    return {
        soma: num1 + num2,
        subtracao: num1 - num2,
        multiplicacao: num1 * num2,
        divisao: num2 !== 0 ? (num1 / num2) : 'Divisão por zero'
    };
}
console.log(operacoesMatematica(10, 5));

// ⚠️ DESAFIO: Função para identificar positivo, negativo ou zero
function positivoOuNegativo(numero) {
    return numero > 0 ? 'Positivo' : numero < 0 ? 'Negativo' : 'Zero';
}
console.log(positivoOuNegativo(10));
console.log(positivoOuNegativo(-5));
console.log(positivoOuNegativo(0));
