(def palindrome ["x" "a" "m" "a" "x"])

(defn p06 [valores]
    (print (= valores (reverse valores)))
    (print " " valores)
    (print "   |   ")
    (print (= palindrome (reverse palindrome)))
    (println " " palindrome))