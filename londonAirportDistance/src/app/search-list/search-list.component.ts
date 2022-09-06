import { Postcode } from './../models/postcode.model';
import { Component, Input, OnInit } from '@angular/core';
import { SearchService } from '../services/search.service';

@Component({
  selector: 'app-search-list',
  templateUrl: './search-list.component.html',
  styleUrls: ['./search-list.component.scss'],
})
export class SearchListComponent implements OnInit {

  postcodes: Postcode[] = [];

  constructor(private service: SearchService) {}

  ngOnInit(): void {
    this.service.all().subscribe((data) => (this.postcodes = data));
  }

}
