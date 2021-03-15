(ns avantqui.practice
  (:gen-class))

;; Fizzbuzz

(defn- fizzbuzz [start finish]
  (map (fn [n]
         (cond (zero? (mod n 15)) "FizzBuzz"
               (zero? (mod n 3)) "Fizz"
               (zero? (mod n 5)) "Buzz"
               :else n))
       (range start finish)))

(fizzbuzz 1 100)

(def square (fn [x] (* x x)))

(defn square
  "Return the square of a given number."
  [x]
  (* x x))

(defn myinc
  "Self defined version of parameterized `inc`."
  ([x] (myinc x 1))
  ([x increment]
   (+ x increment)))

(myinc 1)

(myinc 1 3)

;; ClojureScript also comes with the ability to define functions with arbitratry number of arguments. (The term arity means the number of arguments that a function takes.) The syntax is almost the same as for defining an ordinary function, with the difference that it has more than one body.

(filter odd? [1 2 3 4])

(reduce + 0 [1 2 3 4])


(defn sum-squares
  [accumulator item]
  (+ accumulator (* item item)))

(reduce (fn [acc item] (+ acc (* item item))) 0 [3 4 5])

(reduce (fn [acc word] (+ acc (count word))) 0 ["ant" "bee" "crab" "duck"])
;; We have not used the short syntax here because, although it requires less typing, it can be less readable, and when you are starting with a new language

(defn sum-squares
  [accumulator item]
  (+ accumulator (* item item)))


;; for is used differently in Clojure
(into [] (for [x  [1 2 3]]
           [x (* x x)]))

(for [x [1 2 3]
      y [4 5]]
  '(x y))
