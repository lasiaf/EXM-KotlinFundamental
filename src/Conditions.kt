class Conditions {
    fun conIf(value : Int) : String{
        var res : String;
        if(value == 0){
            res = "Nol"
        }
        else if(value > 0){
            res = "Positive"
        }
        else {
            res = "Negative"
        }

        return res;
    }

    fun conWhen(value : Int) : String{
        var res : String;
        res = when {
            value == 1 -> "One"
            value == 2 -> "Two"
            value == 3 -> "Three"
            else -> "Others"
        }

        when (value) {
            // Checks whether obj equals to "1"
            1 -> res = "One"
            // Checks whether obj equals to "Hello"
            4 -> res = "Four"
            // Default statement
            else -> res = "Unknown"
        }

        return res;
    }
}