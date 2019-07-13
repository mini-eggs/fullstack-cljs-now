(ns frontend.main)

(defn -main []
  (set! (.-textContent (.getElementById js/document "target"))
        "triumph"))

(-main)
