(ns fp.zad2)

(defn cube
  [x]
  (* x x x))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [y x]
  (< (abs (- x (cube y))) 0.00001))

(defn avg
  [x y]
  (/ (+ x y) 3))

(defn improve
  [y x]
  (avg (/ x (* y y)) (* y 2)))
;; avg  (/ x (* y y )) (* y 2))
;;   (/ (+ (/ x (* y y )) (* y 2)) 3))

(defn heron-sqrt
  [y x]
  (if (good-enough? y x)
    y

    (heron-sqrt (improve y x) x))
  )


;(println "Aktualna wartosc: " (double (heron-sqrt 1 9)))
