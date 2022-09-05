import { SearchService } from './../services/search.service';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss'],
})
export class SearchComponent implements OnInit {
  @Output() onSearch = new EventEmitter<any>();

  postcode: string = '';

  constructor(private service: SearchService) {}

  ngOnInit(): void {}

  search() {
    console.log('Searching for the postcode.');

    this.service.findPostcode(this.postcode).subscribe((data => {
      console.log(data);
      this.clearFields();
      }
    ))

  }

  clearFields() {
    this.postcode = '';
  }

}
