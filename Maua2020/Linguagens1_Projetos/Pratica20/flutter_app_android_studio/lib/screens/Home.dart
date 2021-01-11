import 'dart:math';

import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  int _dado1 = 0, _dado2 = 0;

  var _imagens = ["assets/dices/dice1.png","assets/dices/dice2.png","assets/dices/dice3.png","assets/dices/dice4.png","assets/dices/dice5.png","assets/dices/dice6.png","assets/dices/mustache_face.jpg"];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.teal,
      appBar: AppBar(title: Text("Rolador de dados",style: GoogleFonts.pacifico(),),),
      body: Padding(
        padding: const EdgeInsets.all(8.0),
        child: Row(
          children: [
            Expanded(child: Image.asset(_imagens[_dado1])),
            SizedBox(width: 16,),
            Expanded(child: Image.asset(_imagens[_dado2]))
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.auto_awesome),
        onPressed: (){
          setState(() {
            rolarDados();
          });

        },
      ),
    );
  }

  void rolarDados() {
    _dado1 = (new Random().nextInt(_imagens.length));
    _dado2 = (new Random().nextInt(_imagens.length));
    print("Dado 1: ${_imagens[_dado1]}");
    print("Dado 2: ${_imagens[_dado2]}");
    print("Len: ${_imagens.length}");
  }
}
