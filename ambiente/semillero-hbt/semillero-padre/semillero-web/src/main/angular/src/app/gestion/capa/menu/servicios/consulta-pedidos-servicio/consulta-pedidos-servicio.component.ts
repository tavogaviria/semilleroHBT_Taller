import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import { PlatoDTO } from '../../apoyo/modelo/PlatoDTO';
import { BebidaDTO } from '../../apoyo/modelo/BebidaDTO';

@Injectable({
  providedIn: 'root'
})
export class ConsultaPedidosServicioComponent extends AbstractService {

  public plato: PlatoDTO;
  public bebida: BebidaDTO;

  constructor(injector: Injector) {
    super(injector);
  }

  //consulta de los platos disponibles en el sistema
  public consultarPlatos(): Observable<PlatoDTO> {
    return this.get<PlatoDTO>("/semillero-servicios", "/ConsultasRestaurante/consultarPlatos")
  }

  //consulta las bebidas que puede ofrecer el restaurante
  public consultarBebidas(): Observable<BebidaDTO> {
    return this.get<BebidaDTO>("/semillero-servicios", "/ConsultasRestaurante/consultarBebidas")
  }

}
