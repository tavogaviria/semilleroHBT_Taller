import { Component, OnInit } from '@angular/core';
import { PlatoDTO } from './modelo/PlatoDTO';

@Component({
  selector: 'app-apoyo',
  templateUrl: './apoyo.component.html'
})
export class ApoyoComponent implements OnInit {

  public plato: PlatoDTO;
  public platos: PlatoDTO[];

  constructor() { }

  ngOnInit() {
    this.plato = {
      id: 0,
      plato_nombre: '',
      precio: 0,
      plato_descripcion: '',
    };
    this.platos = [];
  }

  public guardar() {
  	console.log('guardando....' + this.plato.plato_nombre);
    this.platos.push(this.plato);
    console.log('cantidad de platos....' + this.platos.length); 
  }

}
