(defn p02 [valores] 
    (def aocontrario (reverse valores))
    (println 
        (second aocontrario) (first aocontrario)))