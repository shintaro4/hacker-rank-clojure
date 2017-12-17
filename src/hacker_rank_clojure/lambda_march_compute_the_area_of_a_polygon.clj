(ns hacker-rank-clojure.lambda-march-compute-the-area-of-a-polygon)


(defn f
  [p1 p2]
  (let [[x1 y1] p1
        [x2 y2] p2
        x (- (Integer/parseInt x2) (Integer/parseInt x1))
        y (+ (Integer/parseInt y2) (Integer/parseInt y1))]
    (* x y)))

(defn area
  "https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem"
  [p]
  (let [q (concat (rest p) (vector (first p)))
        s (reduce + (map f p q))]
    (* (Math/abs s) 0.5)))

;; entry point
(def n (Integer/parseInt (read-line)))
(def p (into [] (repeatedly n #(clojure.string/split (read-line) #" "))))
(println (area p))
