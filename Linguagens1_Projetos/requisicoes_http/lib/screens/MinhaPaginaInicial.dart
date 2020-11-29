import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:requisicoes_http/models/via_cep.dart';
import 'package:requisicoes_http/utility/network_helper.dart';

class MinhaPaginaInicial extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Minhas Requisições"),),
      body: Text(""),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.send),
        onPressed: ()async{
          var _requisicao = NetworkHelper(url: "https://viacep.com.br/ws/09080320/json/");
          var _dados = ViaCEP.fromJson(await _requisicao.getData());
          print(_dados.logradouro);
        },
      ),
    );
  }
}
