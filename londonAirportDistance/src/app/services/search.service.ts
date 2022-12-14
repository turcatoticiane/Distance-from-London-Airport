import { Postcode } from './../models/postcode.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class SearchService {
  private readonly API = 'http://localhost:8080/api/';

  constructor(private http: HttpClient) {}

  all(): Observable<Postcode[]> {
    return this.http.get<Postcode[]>(this.API + 'search-history');
  }

  findPostcode(clientPostcode: string): Observable<Postcode> {
    console.log(this.API + clientPostcode);
    return this.http.get<Postcode>(this.API + clientPostcode);
  }
}
