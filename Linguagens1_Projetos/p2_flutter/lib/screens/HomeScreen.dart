import 'package:flutter/material.dart';


class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  final controlador = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(title: Text("AniFinder"),centerTitle: true,),
        body: Column(
          children: [
          myTextField(controlador, "", "URL:", Icons.search),
            FlatButton(onPressed: (){
            }, child: Text("Buscar"))
          ],
        ),
      ),
    );
  }

  Padding myTextField(TextEditingController controlador, String hint, String label, IconData icone) {
    return Padding(
      padding: const EdgeInsets.all(4.0),
      child: TextField(controller: controlador,decoration: InputDecoration(
          hintText: hint,
          labelText: label,
          icon: Icon(icone)
      ),),
    );
  }
}
