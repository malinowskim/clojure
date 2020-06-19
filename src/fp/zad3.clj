(ns fp.zad3)

(def przedzial (range 1 20))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn nwd
  [a b]
  (last
    (filter
      #(and (zero? (mod b %)) (zero? (mod a %)))
      (range 1 (inc (min a b))))))

(defn nww
  [a b]
  (/ (abs (* a b)) (nwd a b)))

(defn euler5
  []
  (println "Rozwiazanie problemu Euler 5 to: "
           (reduce nww przedzial)))

