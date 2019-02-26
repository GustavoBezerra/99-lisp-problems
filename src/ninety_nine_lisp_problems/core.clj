(ns ninety-nine-lisp-problems.core
  (:gen-class))

(def valores ["A" "B" "C" "D"])

(load "p01")
(load "p02")
(load "p03")

(defn -main [& args]
  (println "Solution problem P01:")
  (p01 valores)
  (println "Solution problem P02:")
  (p02 valores)
  (println "Solution problem P03:")
  (p03 valores 3))
