(ns hacker-rank-clojure.area-under-curves-and-volume-of-revolving-a-curv)


(def n 1000)
(def invert-n (double (/ 1 n)))

(defn area
  [a b x]
  (reduce + (map #(* %1 (Math/pow x %2)) a b)))

(defn volume
  [a b x]

  )

(defn summation
  "https://www.hackerrank.com/challenges/area-under-curves-and-volume-of-revolving-a-curv/problem"
  [f l r a b]
  (/ (reduce + (map #(f a b %) (range l r invert-n))) n))

(range 1 4 (double (/ 1 n)))
;; entry point
(summation area 1 4 [1 2 3 4 5] [6 7 8 9 10])
(summation volume 1 4 [1 2 3 4 5] [6 7 8 9 10])
