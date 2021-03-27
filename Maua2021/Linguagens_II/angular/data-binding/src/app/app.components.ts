import {Component} from '@angular/core';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})

export class AppComponent{
    nome: string = "jose";
    idade:number = 20;

    //double lancarDado(){}
    lancarDado():number {
        return Math.floor(Math.random()*6)+1
    }
    adicionar():void{
        console.log("Adicionando...")
    }
}