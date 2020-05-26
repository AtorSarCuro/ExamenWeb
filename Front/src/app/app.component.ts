import {Component} from '@angular/core';
import {Router} from '@angular/router';
import {AuthenticationService} from './_services';
import {User} from './_models';
import {TranslateService} from '@ngx-translate/core';

@Component({selector: 'app', templateUrl: 'app.component.html'})
export class AppComponent {
  currentUser: User;
  langs = ['en', 'fr'];

  constructor(
    private router: Router,
    private authenticationService: AuthenticationService,
    public translateService: TranslateService) {
    translateService.addLangs(['en', 'es']);
    translateService.setDefaultLang('en');

    this.authenticationService.currentUser.subscribe(x => this.currentUser = x);
  }

  public ngOnInit(): void {
    let browserlang = this.translateService.getBrowserLang();
    if (this.langs.indexOf(browserlang) > -1) {
      this.translateService.setDefaultLang(browserlang);
    } else {
      this.translateService.setDefaultLang('en');
    }
  }

  switchLang(lang: string) {
    this.translateService.use(lang);
  }

  logout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
  }

  public useLanguage(lang: string): void {
    this.translateService.setDefaultLang(lang);
  }

}
