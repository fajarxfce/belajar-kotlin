package data

class Note(title: String) {

    var title: String = title
        get(){return field}
        set(value) {
            if (value.isNotBlank()){
                field = value
            }
        }

}