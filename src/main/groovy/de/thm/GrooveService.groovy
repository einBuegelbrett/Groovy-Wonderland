package de.thm

/**
 * The funkiest service in Groovy-Wonderland!
 */
class GrooveService {
    static String greet(String name, String project) {
        return "Welcome to Groovy-Wonderland, $name! Project $project is ready to boogie! 🕺"
    }

    static String letsGroove() {
        return "Let's groovy tonight: https://www.youtube.com/watch?v=Lrle0x_DHBM"
    }

    static String boogieWonderland() {
        return "Dance, groovy wonderland: https://www.youtube.com/watch?v=god7hAPv8f0"
    }

    static String randomGroove() {
        def grooves = [
                letsGroove(),
                boogieWonderland()
        ]

        return grooves[new Random().nextInt(grooves.size())]
    }
}