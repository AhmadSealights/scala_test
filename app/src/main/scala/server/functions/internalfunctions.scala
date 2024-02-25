package server.functions

object  internalfunctions{//functions meant fot Unit tests only
    trait t {
    def s(): String = "pew pew pew"
    }
    class pew extends t
    def traitexample(): String = {
        val mohsen = new pew
        return mohsen.s()
    }


}