(ns ninety-nine-lisp-problems.core
  (:gen-class))

(def valores ["A" "B" "C" "D"])

(load "p01" "p02" "p03" "p04" "p05" "p06" "p07" "p08")

(defn -main [& args]
  (println "Solution problem P01:")
  (p01 valores)
  (println "Solution problem P02:")
  (p02 valores)
  (println "Solution problem P03:")
  (p03 valores 3)
  (println "Solution problem P04:")
  (p04 valores)
  (println "Solution problem P05:")
  (p05 valores)
  (println "Solution problem P06:")
  (p06 valores)
  (println "Solution problem P07:")
  (p07 '(a (b (c d) e)))
  (println "Solution problem P08:")
  (p08 '(a a a a b c c a a d e e e e)))
