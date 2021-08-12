package com.bridgelabz;

public class Stopwatch {

        private long startTime = 0;
        private long stopTime = 0;
        private boolean running = false;


        public void start() {
            this.startTime = System.nanoTime();
            this.running = true;
        }


        public void stop() {
            this.stopTime = System.nanoTime();
            this.running = false;
        }


        //elaspsed time in milliseconds
        public long getElapsedTime() {
            long elapsed;
            if (running) {
                elapsed = (System.nanoTime() - startTime);
            }
            else {
                elapsed = (stopTime - startTime);
            }
            return elapsed;
        }


        //elaspsed time in seconds
        public long getElapsedTimeSecs() {
            long elapsed;
            if (running) {
                elapsed = ((System.nanoTime() - startTime) / 1000);
            }
            else {
                elapsed = ((stopTime - startTime) / 1000);
            }
            return elapsed;
        }




        //sample usage
        public static void main(String[] args) {
            Stopwatch s = new Stopwatch();
            s.start();
            //code you want to time goes here
            s.stop();
            System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
        }
    }

