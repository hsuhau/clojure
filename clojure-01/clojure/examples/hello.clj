(ns clojure.examples.hello
  (:gen-class))


(defn hello-world []
  (println "Hello World"))
(hello-world)

(defn example []
  (println (str "Hello World"))
  (print (+ 1 2)))
(example)

;; This program displays Hello World
(defn Example []
  ;; The below code declares a integer variable
  (def x 1)

  ;; The below code declares a float variable
  (def y 1.25)

  ;; The below code declares a string variable
  (def str1 "Hello")
  (println x)
  (println y)
  (println str1))
(Example)

; 声明变量 (def var-name var-value)

(defn Example []
  ;; The below code declares a Boolean variable with the name of status
  (def status true)

  ;; The below code declares a Boolean variable with the name of STATUS
  (def STATUS false)

  ;; The below code declares a variable with an underscore character.
  (def _num1 2))
(Example)

