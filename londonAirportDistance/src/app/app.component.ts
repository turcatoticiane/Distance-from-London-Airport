import { Postcode } from './models/postcode.model';
import { SearchService } from './services/search.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'londonAirportDistance';

  searchHistory: Postcode[] = [];

  constructor(private service: SearchService) {}

}
