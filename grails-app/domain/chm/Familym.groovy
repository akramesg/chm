package chm

class Familym {
    long family_id
    String name
    Date birth_date
    String mobile

    static belongsTo = [family:Family]

    static constraints = {
    }
}
