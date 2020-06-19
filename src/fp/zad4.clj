(ns fp.zad4)
(defonce persons-atom (atom {}))

(defn add-person!
  [email first-name last-name miasto ulica numer kodzik]
  (swap! persons-atom assoc
         email {:first-name first-name
                :last-name   last-name
                :miasto miasto
                :ulica ulica
                :numer numer
                :kodzik kodzik}))

(defn first-name
  [email]
  (:first-name (@persons-atom email)))

(defn last-name
  [email]
  (:last-name (@persons-atom email)))

;; wysweitlanie adresu

(defn adres
  [email]
  (str "Miasto: "
    (:miasto (@persons-atom email)) "\nulica: "
    (:ulica (@persons-atom email))  "\nnumer domu: "
    (:numer (@persons-atom email))  "\nkod pocztowy: "
    (:kodzik (@persons-atom email)))
  )

;
;(add-person!"ziomowy@mail.com" "Ziom" "Malek" "Random" "Jarkowa" "19" "15-200")
;
;(adres "ziomowy@mail.com")
