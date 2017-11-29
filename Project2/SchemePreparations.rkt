#lang racket

; Question 1

(define first (lambda (x) (car x)))
(define second (lambda (x) (cadr x)))
(define rest (lambda (x) (cdr x)))

(define family '(josh sara erin sandy jon))
(first family)
(second family)
(third family)
(fourth family)
(fifth family)

; Question 2

(define list1 (list #t #f #t))

(define (true? b) (eq? b #t))
(define (truecount alist)
  (length (filter true? alist)))

(truecount list1)

; Question 3

(define alist(list 1 2 3 4))
(define (squarelist alist)
  (map (lambda (x) (* x x)) alist))
(squarelist alist)

; Question 4

(define list2 (list 3 300 45 200 765 34))
(define (hundreds? blist)
  (filter(lambda (x) (< 100 x)) blist))

(hundreds? list2)



  
