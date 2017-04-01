import {Component, OnInit} from '@angular/core';
import {User} from "../../model/User";
import {UserService} from "../../services/user.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  users: User[];

  constructor(private userService: UserService) {
  }

  ngOnInit() {
    this.getUsers();
    this.userService.userCreatedEmitter.subscribe(user =>
      this.getUsers());
  }

  getUsers() {
    this.userService.getUsersOrderedByCreatedOn().then(users =>
      this.users = users)
  }
}
