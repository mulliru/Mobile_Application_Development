import { Text, View, Button } from "react-native";

function Salvar_dados({pNumero, sNumero}){
    //console.log(props)

    return(
        <View>
            <Text>O nome digitado foi: {pNumero}</Text>
            <Text>O Sobrenome digitado foi: {sNumero}</Text>
            <Text>O E-mail digitado foi: {sNumero}</Text>
            <Button title="Mostrar" onProgress={()=>console.log("CLICADO")}/>
        </View>
    )
}

export default Salvar_dados