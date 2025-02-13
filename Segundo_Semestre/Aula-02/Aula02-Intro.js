
// Concat - Concatenação de strings
const nome = "Murillo"
const sobrenome = "Ferreira"

// Concatenação de strings com o método concat 
const nomeCompleto = nome.concat(sobrenome)
console.log(nomeCompleto)


//Concat - Concatenação de arrays
const nomes = ["Fernando, ", "João, ", "Maria, ", "Pedro"]
const professores = ["Murillo, ", "Lucas, ", "João, ", "Maria"]

const todos = nomes.concat(professores)
console.log(todos)

//metodo pra adicionar elementos no array
professores.push("Ana")
console.log(professores)

//metodo pra alterar elementos no array no caso estamos alterando o professor joão por francisco
professores[1] = "Francisco"



const alunos1 = ["Fernando, ", "João, ", "Maria, ", "Pedro"]

//utilizando o metodo sort para ordenar os elementos do array
alunos.sort()
console.log(alunos)


const alunos2 = ["Fernando, ", "João, ", "Maria, ", "Pedro"]

//metodo para deletar um elemento do array informando a posição do elemento
delete alunos2[0]


constalunos3 = ["Fernando, ", "João, ", "Maria, ", "Pedro"]

//metodo para remover o ultimo elemento do array
alunos3.pop()


const alunos4 = ["Fernando, ", "João, ", "Maria, ", "Pedro"]

//metodo para remover o primeiro elemento do array
alunos4.shift()


const alunos5 = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"]

//metodo pra remover elementos do array informando a posição do elemento e a quantidade de elementos a serem removidos
alunos.splice(2, 3)
console.log(alunos)




const alunos6 = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"]

//metodo pra adicionar elementos no array informando a posição do elemento e a quantidade de elementos a serem removidos
alunos6.splice(2, 0, "Murillo", "Francisco")
console.log(alunos6)


//desafio - Adicionar um novo aluno no final do array
const alunos = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"]

alunos.push("Murillo")
console.log(alunos)
//ou
alunos.splice(6, 0, "Murillo")
console.log(alunos)



const alunos7 = ["Fernando, ", "João, ", "Maria, ", "Pedro", "Ana", "Lucas"]

//metodo forEach para percorrer o array e exibir os elementos
alunos7.forEach(function(nome, indice){
    
    console.log(indice, nome)
})


//Concat - Concatenação de arrays
const alunos = [
    {nomeAluni: "Murillo", nota: 9, participativo: true},
    {nomeAluni: "Lucas", nota: 6, participativo: false},
    {nomeAluni: "Larissa", nota: 8, participativo: false},
    {nomeAluni: "Fabiola", nota: 7, participativo: true}
]

//metodo filter para filtrar os elementos do array e exibir apenas os alunos que tem nota maior ou igual a 8
console.log(alunos.filter(function(RetornaNotasBoas){

    return RetornaNotasBoas.nota >= 8
}))

//metodo filter para filtrar os elementos do array e exibir apenas os alunos que são participativos
console.log(alunos.filter(function(RetornaParticipativos){

    return RetornaParticipativos.participativo == true
}))




//DESAFIO PARA USAR DOIS FILTROS NO MESMO ARRAY E EXIBIR OS ALUNOS QUE TEM NOTA MAIOR OU IGUAL A 8 E QUE SÃO PARTICIPATIVOS

//Concat - Concatenação de arrays
const alunos = [
    {nomeAluni: "Murillo", nota: 9, participativo: true},
    {nomeAluni: "Lucas", nota: 6, participativo: false},
    {nomeAluni: "Larissa", nota: 8, participativo: false},
    {nomeAluni: "Fabiola", nota: 7, participativo: true}
]

//metodo filter para filtrar os elementos do array e exibir apenas os alunos que tem nota maior ou igual a 8
console.log(alunos.filter(function(RetornaNotasBoasParticipativos){

    return RetornaNotasBoasParticipativos.nota >= 8 && RetornaNotasBoasParticipativos.participativo == true

}))


//metodo filter para filtrar os elementos do array e exibir apenas os alunos que são participativos mas usando arrow function
console.log(alunos.filter((RetornaParticipativos) => RetornaParticipativos.participativo == true))



//DESAFIO: crie uma aerrow funcion que recebe dois números como  parâmetros e retorne o produto desses números
const multplicar = (num1, num2) => num1 * num2

console.log(multplicar(5, 5))


//Desafio: crie uma função que recebe dois numeros e retorna a soma, subtração, multiplicação e divisão desses números em um objeto
function operaçõesMatematica (num1, num2){
    return {
        soma: num1 + num2,
        subtracao: num1 - num2,
        multiplicacao: num1 * num2,
        divisao: num1 / num2,
    } 
}

console.log(operaçõesMatematica(10, 5))



//Dsafio: crie uma função que receba um número e retorne "Positivo" se o número for maior que zero e "Negativo" se o número for menor que zero e caso seja zero retorne zero
function positivoOuNegativo (numero){
    return  numero < 0? 'positivo':  numero> 0? 'negativo': 'zero'
    
}   
console.log(positivoOuNegativo(10))


