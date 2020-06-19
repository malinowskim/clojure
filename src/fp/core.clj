(ns fp.core
  (:gen-class)
  (:require [fp.zad1 :as heron])
  (:require [fp.zad2 :as szescian])
  (:require [fp.zad3 :as euler])
  (:require [fp.zad4 :as baza]))

;; Zadanie 1
;; Zmień procedurę heron znajdującą się w pliku: (plik z zajec)
;; uzależniając ilość kroków algorytmu od
;; pewnej stałej wartości n oznaczającej tę ilość.
(println "Zadanie 1: ")
(println "Pierwiastek z liczby 16: " (double(heron/heron-sqrt 1 16 7)))
(newline)

;; Zadanie 2
;; Napisz procedurę obliczającą pierwiastek stopnia 3.
;; Wzoruj się na metodzie Herona.
(println "Zadanie 2: ")
(println "Pierwiastek stopnia 3 dla liczby 9: "
         (double (szescian/heron-sqrt 1 9)))
(newline)

;; Zadanie 3
;; Proszę zrealizować https://projecteuler.net/problem=5
;; posługując się operatorami map, reduce oraz filter w Clojure
(println "Zadanie 3: ")
(euler/euler5)
(newline)

;; Zadanie 4
;; Proszę skorzystać z bazy danych osób w naszym projekcie
;; i dodać możliwość określania adresów osób.
;; Adres powinien zawierać miasto, ulicę, numer i kod pocztowy.
(println "Zadanie 4: ")
(baza/add-person!"ziomowy@mail.com" "Ziom" "Malek" "Random" "Jarkowa" "19" "15-200")
(println "Imie: " (baza/first-name "ziomowy@mail.com"))
(println "Nazwisko: " (baza/last-name "ziomowy@mail.com"))
(println (baza/adres "ziomowy@mail.com"))

