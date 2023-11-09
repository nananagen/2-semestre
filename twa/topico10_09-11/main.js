//import { User } from "./User.js";

/* console.log(user.name);

user.curso = "Analise e desenvolvimento de sistemas"

console.log(user.curso); */

import SchoolUser from "./school/User";
import SecurityUser from "./school/User"; //Defaut nao contem {} (do import)

let user1 = new SchoolUser('luiz');
let user2 = new SchoolUser('hugo');

user1.displayName()
user2.displayName()

let security = new SecurityUser('admin', '123456');

console.log(security);


