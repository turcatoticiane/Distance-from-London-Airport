import { Postcode } from './../models/postcode.model';
import { SearchService } from './../services/search.service';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss'],
})
export class SearchComponent implements OnInit {

  postcodeInfo: Partial<Postcode> = {};

  constructor(private service: SearchService) {}

  ngOnInit(): void {}

  search(postcode: string) {
    console.log('Searching for the postcode.');

    this.service.findPostcode(postcode).subscribe((data) => {
      this.postcodeInfo = data;
    });
  }


}
