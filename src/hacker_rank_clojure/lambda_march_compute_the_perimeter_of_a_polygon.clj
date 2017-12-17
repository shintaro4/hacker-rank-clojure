(ns hacker-rank-clojure.lambda-march-compute-the-perimeter-of-a-polygon)


(defn distance
  [p1 p2]
  (let [[x1 y1] p1
        [x2 y2] p2
        x (- (Integer/parseInt x2) (Integer/parseInt x1))
        y (- (Integer/parseInt y2) (Integer/parseInt y1))]
    (Math/sqrt (+ (* x x) (* y y)))))

(defn perimeter
  "https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon/problem"
  [p]
  (let [q (concat (rest p) (vector (first p)))]
    (reduce + (map distance p q))))

;; entry point
(def n (Integer/parseInt (read-line)))
(def p (into [] (repeatedly n #(clojure.string/split (read-line) #" "))))
(println (perimeter p))
