# DANGER DANGER DANGER

### THIS ROBOT PROGRAM IS DESIGNED TO TRIGGER POTENTIALLY UNSAFE ROBOT BEHAVIOR AS A DEMONSTRATION OF A BUG

### DO *NOT* RUN THIS ON A ROBOT WITH MECHANISMS ATTACHED!

### USE MOTORS THAT ARE SECURELY FASTENED TO THE FRAME BUT DO NOT MOVE ANYTHING.

### HAVE THE POWER SWITCH READILY AND SAFELY ACCESSIBLE.

# YOU HAVE BEEN WARNED!


This program demonstrates an issue where an exception in a `VisionProcessor`'s `onDrawFrame` method can cause unstable and potentially unsafe robot behavior.

This program requires the following hardware to be configured:

- A DC motor called "Pivot"
- A DC motor called "Lift"
- A Webcam called "Webcam 1"

There is only one opmode, which is called "Teleop".

10 seconds after hitting play, the `ColorProcessor` vision processor will divide by 0 in `onDrawFrame`. After this point, you should not assume the robot is safe until it has been powered off and on again.
