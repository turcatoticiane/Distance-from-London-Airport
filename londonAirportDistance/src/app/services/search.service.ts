import { Postcode } from './../models/postcode.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class SearchService {

  private searchList: any[];
  private readonly API = 'http://localhost:8080/api/';

  constructor(private http: HttpClient) {
    this.searchList = [];
  }

  get searchHistory() {
    return this.searchList;
  }

  all(): Observable<Postcode[]> {
    return this.http.get<Postcode[]>(`${this.API}search-history`);
  }

  findPostcode(clientPostcode: string): Observable<Postcode>{
    return this.http.get<Postcode>(`${this.API} + ${clientPostcode}`);
  }


}
