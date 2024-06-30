package data

class User(var username : String, var password : String) {
    override fun toString(): String {
        return "user with username= $username, password = $password"
    }
}