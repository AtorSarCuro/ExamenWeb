import {Component} from '@angular/core';
import {User} from '@app/_models';
import {UserService} from '@app/_services';

@Component({templateUrl: 'home.component.html'})
export class HomeComponent {
  loading = false;
  user: User = {email: '', id: 0, name: '', password: '', username: ''};

  constructor(private userService: UserService) {
  }

  ngOnInit() {
    this.loading = true;
    const subscription = this.userService.getInfoMe(localStorage.getItem('username')).subscribe(user => {
      this.loading = false;
      this.user = user;
    });
  }
}
