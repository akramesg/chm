package chm

class Family {
    long id
    String name
    String spouse
    String address1
    String address2
    int region1_id
    int region2_id
    String phone1
    String phone2
    String blood_type
    String sblood_type
    String mobile1
    String mobile2
    String smobile1
    String smobile2
    String job
    String sjob
    Date birth_date
    Date sbirth_date
    Date marriage_date
    String father
    String church
    String father_phone
    String sfather
    String schurch
    String sfather_phone
    String donation
    String remarks

    Familym familym
    static hasMany = [familym:Familym]

    static constraints = {
    }
}
