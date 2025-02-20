import { StatusBar } from 'expo-status-bar';
import Somar from './Components/Somar';
import PositivoNegativo from './Components/PositivoNegativo';
import Comparacao from './Components/Comparacao';
import Estilo2 from './Components/Estilo2';
import { View } from 'react-native';

export default function App() {
  return (
    <View Estilo={Estilo2.container}>
      <Somar pNumero={20} sNumero={30}/>
      <Comparacao pNumeroCompar={15} sNumeroCompar={10} tNumeroCompar={5} />
      <PositivoNegativo Numero={0}/>

    </View>
  );
}


