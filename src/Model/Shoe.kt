package Model

class Shoe{
    var size: Int = 34 // Minimo 34
        set(value) {
            if (value >= 34)
                field = value
            else
                field = 34
        }
    var color: String = "White"
    var model: String = "Boots" // No se puede tenes
        set(value){
            if(value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }
        get() = field
}