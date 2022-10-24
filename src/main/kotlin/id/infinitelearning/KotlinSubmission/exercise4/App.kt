package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val result = ValidateAccount("Rer" ,"12345678")
        println(result)
    }catch (error: Exception) {
        println(error)
    } finally {
                println("Finish")
            }
        }

    fun ValidateAccount(name:String, password: String): String{
        if (name.count() < 3) {
            throw Exception ("nama harus lebih panjang dari 3 huruf")
        }
        if (password.count() < 8) {
            throw Exception ("Password harus lebih panjang daari 8 huruf")



        }
        return "Selamat Akun Anda Telah Terbuat"
    }

