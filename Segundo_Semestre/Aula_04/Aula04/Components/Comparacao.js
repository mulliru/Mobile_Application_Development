import { Text, View, Button } from "react-native";

function Comparacao({pNumeroCompar, sNumeroCompar, tNumeroCompar}){

    let MaiorNumero = pNumeroCompar;
    if (sNumeroCompar > MaiorNumero) {
        MaiorNumero = sNumeroCompar
    }
    if (tNumeroCompar > MaiorNumero) {
        MaiorNumero = tNumeroCompar 
    }
    return(
        <View>
            <Text>Comparador de Números</Text>
            <Text>Primeiro Número: {pNumeroCompar}</Text>
            <Text>Segundo Número: {sNumeroCompar}</Text>
            <Text>Terceiro Número: {tNumeroCompar}</Text>

            <Text>

                {pNumeroCompar > sNumeroCompar && "\nPrimeiro número é maior que o segundo número\n"}
                {pNumeroCompar > tNumeroCompar && "Primeiro número é maior que o terceiro número\n"}


                {sNumeroCompar > pNumeroCompar && "Segundo número é maior que o primeiro número\n"}
                {sNumeroCompar > tNumeroCompar && "Segundo número é maior que o terceiro número\n"}


                {tNumeroCompar > pNumeroCompar && "Terceiro número é maior que o primeiro número\n"}
                {tNumeroCompar > sNumeroCompar && "Terceiro número é maior que o segundo número\n\n\n"}

            </Text>

            <Text>O maior número é: {MaiorNumero}</Text>

            <Button title="Comparar" onProgress={()=>console.log("CLICADO")}/>
        </View>
    )
}

export default Comparacao



