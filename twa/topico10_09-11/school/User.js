/*export let user = {
    name : 'luiz',
    curso: 'ADS'
}*/
class User {
    name;

    constructor (name){
        this.name = name;
    }
    displayName(){
        console.log(this.name);
    }
}
export default User;