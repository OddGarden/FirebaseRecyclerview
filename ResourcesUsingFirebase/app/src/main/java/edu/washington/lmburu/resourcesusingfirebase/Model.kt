package edu.washington.lmburu.resourcesusingfirebase

class Model {
    var desc: String? = null
    var link : String? = null


    constructor():this("","") {

    }


    constructor(title: String?, link: String?) {
        this.desc = title
        this.link = link
    }
}