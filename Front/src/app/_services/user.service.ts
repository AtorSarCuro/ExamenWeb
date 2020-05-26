import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {User} from '@app/_models';

@Injectable({providedIn: 'root'})
export class UserService {
  constructor(private http: HttpClient) {
  }

  getInfoMe(username: string) {
    console.log('get all');
    return this.http.get<User>(`/v1/me/${username}`);
  }
}
