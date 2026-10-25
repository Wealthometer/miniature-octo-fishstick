(ns hello.core)

(defn greet [name]
  (str "Hello, " name "!"))

(js/console.log (greet "Wealth"))
