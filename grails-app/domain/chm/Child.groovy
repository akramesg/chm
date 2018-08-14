package chm

class Child {
    String name
    Date birthdate
    String mobile

    static belongsTo = [family:Family]

    static constraints = {
    }
}
