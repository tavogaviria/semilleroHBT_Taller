import { Component, OnInit, Input } from '@angular/core';

import { ConsultaPedidosServicioComponent } from './servicios/consulta-pedidos-servicio/consulta-pedidos-servicio.component';
import { PlatoDTO } from './apoyo/modelo/PlatoDTO';
import { BebidaDTO } from './apoyo/modelo/BebidaDTO';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html'
})
export class MenuComponent implements OnInit {

  @Input() public nombrePlato:String;
  @Input() public descripcionPlato:String;
  @Input() public nombreBebida:String;

  public listaPlatosDTO: PlatoDTO[];
  public platoDTO: PlatoDTO;

  public listaBebidasDTO: BebidaDTO[];
  public bebidaDTO: BebidaDTO;

  constructor(private platosService: ConsultaPedidosServicioComponent, private bebidasService: ConsultaPedidosServicioComponent) { }

  ngOnInit() {
  }

  public consultarPlatos(){
    this.listaPlatosDTO = [];
    this.platosService.consultarPlatos().subscribe(
      pla => {
        this.nombrePlato = pla.plato_nombre;
        this.descripcionPlato = pla.plato_descripcion;
      },
      error => {
        console.log(error);
      }
    )
  }

  public consultarBebidas(){
    this.listaBebidasDTO = [];
    this.bebidasService.consultarBebidas().subscribe(
      beb => {
        this.nombreBebida = beb.bebida_nombre
      },
      error => {
        console.log(error);
      }
    )
  }

}
