import { Component, OnInit } from '@angular/core';
import {User} from "../../model/User";
import {UserService} from "../../services/user.service";

@Component({
  selector: 'app-user-add',
  templateUrl: './user-add.component.html',
  styleUrls: ['./user-add.component.css']
})
export class UserAddComponent implements OnInit {
  user: User = new User();

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  save() {
    this.userService.saveUser(this.user);
  }
}
