import 'package:flutter/material.dart';
import 'package:p2_flutter/models/Heroi.dart';

class TelaPersonagem extends StatelessWidget {
  Heroi heroiAtual;
  //Encontrei isso da documentação do flutter https://flutter.dev/docs/cookbook/navigation/passing-data
  TelaPersonagem({Key key, @required this.heroiAtual}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(title: Text("BokuNoWiki"),centerTitle: true,),
        body: Column(
          mainAxisAlignment : MainAxisAlignment.center,
          mainAxisSize: MainAxisSize.max,
          children: [
            Expanded(child: Align(child: Image.network(heroiAtual.imagemURL))),
            Column(
              children: [
                Text(heroiAtual.nome.toString(),style: TextStyle(fontSize: 30,fontWeight: FontWeight.bold)),
                Text(heroiAtual.genero.toString(),style: TextStyle(fontSize: 24)),
                Text(heroiAtual.apelido.toString(),style: TextStyle(fontSize: 24)),
                Text(heroiAtual.individualidade.toString(),style: TextStyle(fontSize: 24)),
                Text(heroiAtual.afiliacao.toString(),style: TextStyle(fontSize: 24)),
                Text(heroiAtual.aniversario.toString(),style: TextStyle(fontSize: 24)),
              ],
            ),

        ]
        ),
      ),
    );
  }
}
