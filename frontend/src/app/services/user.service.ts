import { Injectable } from '@angular/core';
import {User} from "../model/User";
import {Http} from '@angular/http';

import 'rxjs/add/operator/toPromise';

@Injectable()
export class UserService {

  constructor(private http: Http) { }

  getUsers(): Promise<User[]> {
    return Promise.resolve(this.http.get('http://localhost:8080/api/users')
      .toPromise().then(resp => resp.json()))
  }

  saveUser(user: User): Promise<any> {
    return Promise.resolve(this.http.post('http://localhost:8080/api/users', user)
      .toPromise())
  }
}
