package Model

class Camera{

    private var isOn:Boolean = false
    private var resolution: Int = 640

    fun setResolution(resolution : Int){
        this.resolution = resolution // Todos los elementos que esten dentro de nuestra clase
    }

    fun getResolution():Int{
        return this.resolution
    }

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getCameraStatus() : String {
       return if (isOn) "Camara is Turned" else "Camara is not Turned"
    }

    /*fun setCameraStatus(onoff: Boolean){
        isOn = onoff
    }*/
}