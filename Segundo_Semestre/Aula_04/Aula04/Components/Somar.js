import { Text, View, Button } from "react-native";

function Somar({pNumero, sNumero}){
    //console.log(props)

    function quandoClicado(){
        return(
            console.log("Outra forma")
        )
    }

    return(
        <View>
            <Text>Soma de Números</Text>
            <Text>Primeiro Número: {pNumero}</Text>
            <Text>Segundo Número: {sNumero}</Text>
            <Text>{pNumero+sNumero}</Text>
            <Button title="SOMAR" onProgress={()=>console.log("CLICADO")}/>
        </View>
    )
}

export default Somar