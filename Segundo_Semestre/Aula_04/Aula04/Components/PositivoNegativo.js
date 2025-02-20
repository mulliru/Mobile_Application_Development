import { Text, View, Button } from "react-native";

function PositivoNegativo({Numero}){
    return(
        <View>
            <Text>Informe o número se é positivo ou negativo</Text>
            <Text>Número: {Numero}</Text>
            <Text>{Numero > 0 ? 'Positivo' : Numero < 0 ? 'Negativo' : 'Zero' }</Text>
            <Button title="Verificar" onProgress={()=>console.log("CLICADO")}/>
        </View>
    )
}

export default PositivoNegativo