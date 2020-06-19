(ns fp.zad1)

(defn square
  [x]
  (* x x))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

;; (defn good-enough?
;;   [y x]
;;   (< (abs (- x (square y))) 0.00001))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [y x]
  (avg y (/ x y)))

(defn kroki?
  [a]
  (= 0 a))

(defn heron-sqrt
  [y x a]
  ;;(if (good-enough? y x)
  (if (kroki? a)
    y
    (heron-sqrt(improve y x) x (dec a))
    )
  )