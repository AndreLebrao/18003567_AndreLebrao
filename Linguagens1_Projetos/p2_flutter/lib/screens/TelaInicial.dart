import 'package:flutter/material.dart';
import 'package:p2_flutter/models/Heroi.dart';
import 'package:p2_flutter/models/RespostaAPI.dart';
import 'package:p2_flutter/screens/TelaPersonagem.dart';
import 'package:p2_flutter/utility/network_helper.dart';


class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  var _listaHerois = [];
  final _controlador = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(title: Text("BokuNoWiki"),centerTitle: true,),
        body: Column(
          children: [
            Expanded(child: Image.asset("lib/assets/logo.png")),
            customTextField(_controlador, "All Might, Shigaraki Tomura", "Character Search", Icons.search),
            FlatButton(onPressed: ()async{
              // erroNotFound(context);
              await procurarHeroi();
            }, child: Text("Search")),
            Expanded(
              child: ListView.builder(

                  itemBuilder: (context, index){
                    return ListTile(
                      title: Text(_listaHerois[index].apelido),
                      subtitle: Text(_listaHerois[index].individualidade),
                        leading: Image.network(_listaHerois[index].imagemURL),
                      onTap:() {
                        //tambem encontrei isso da documentação do flutter https://flutter.dev/docs/cookbook/navigation/passing-data
                        Navigator.push(
                          context,
                          MaterialPageRoute(builder: (context) =>
                              TelaPersonagem(heroiAtual: _listaHerois[index],)),
                        );
                      }
                    );

                  },
                itemCount: _listaHerois.length,
              ),
            )
          ],
        ),
      ),
    );
  }

  Future procurarHeroi() async {
    if(_controlador.text==null){
    var _req = NetworkHelper(url:"https://myheroacademiaapi.com/api/character?alias="+_controlador.text);
    var _json = RespostaAPI.fromJson(await _req.getData());
    print("");
    print(_json.toString());
    print(_json.result.isEmpty);
    if(_json.result.isEmpty){
      var _req = NetworkHelper(url:"https://myheroacademiaapi.com/api/character?name="+_controlador.text);
      _json = RespostaAPI.fromJson(await _req.getData());
    }
    if(_json!=null){
      setState(() {
        var novoHeroi = Heroi(
            _json.result.first.images.first,
            _json.result.first.name,
            _json.result.first.gender,
            _json.result.first.alias,
            _json.result.first.quirk,
            _json.result.first.affiliation,
            _json.result.first.birthday);

        if(!_listaHerois.contains(novoHeroi)){_listaHerois.add(novoHeroi);}
      });
    }
    }else{
      erroNotFound(context);
    }
  }

  Padding customTextField(TextEditingController controlador, String hint, String label, IconData icone) {
    return Padding(
      padding: const EdgeInsets.all(4.0),
      child: TextField(controller: controlador,decoration: InputDecoration(
          hintText: hint,
          labelText: label,
          icon: Icon(icone)
      ),),
    );
  }

  erroNotFound(BuildContext context) {
    Widget okButton = FlatButton(
      child: Text("OK"),
      onPressed: () {
        Navigator.of(context).pop();
      },
    );
    AlertDialog alerta = AlertDialog(
      title: Text("Search Error"),
      content: Text("Character not found..."),
      actions: [
        okButton,
      ],
    );
    // exibe o dialog
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return alerta;
      },
    );
  }
}
