package com.example.jetsnack.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import com.example.jetsnack.R
import kotlin.random.Random

@Immutable
data class Robot(
    val id: Long,
    val name: String,
    @DrawableRes
    val imageRes: Int,
    val price: Long,
    val tagline: String = "",
    val tags: Set<String> = emptySet()
)

/**
 * Static data
 */

val Robots = listOf(
    Robot(
        id = 1L,
        name = "Tesla Bot",
        tagline = "Optimus",
        imageRes = R.drawable.optimus,
        price = 299
    ),
    Robot(
        id = Random.nextLong(),
        name = "Moxie",
        tagline = "Robot Companion",
        imageRes = R.drawable.moxie,
        price = 299
    ),
    Robot(
        id = Random.nextLong(),
        name = "Robot Dog",
        tagline = "Weaponized Dog",
        imageRes = R.drawable.flamerobotdog,
        price = 299
    ),
    Robot(
        id = Random.nextLong(),
        name = "Portable Drone",
        tagline = "A Handy Drone",
        imageRes = R.drawable.portable_drone,
        price = 299
    ),
    Robot(
        id = Random.nextLong(),
        name = "Exoskeleton Leg",
        tagline = "Wearable Exoskeleton Leg",
        imageRes = R.drawable.wearable_exoskeleton_leg,
        price = 499
    ),
    Robot(
        id = Random.nextLong(),
        name = "Servo Motor",
        tagline = "Precision Motor for Robotics",
        imageRes = R.drawable.servo_motor,
        price = 249
    ),
    Robot(
        id = Random.nextLong(),
        name = "LiDAR Sensor",
        tagline = "High-Precision Distance Measurement",
        imageRes = R.drawable.lidar_sensor,
        price = 799
    ),
    Robot(
        id = Random.nextLong(),
        name = "Raspberry Pi 4",
        tagline = "Mini Computer for Automation",
        imageRes = R.drawable.raspberry_pi4,
        price = 499
    ),
    Robot(
        id = Random.nextLong(),
        name = "Microcontroller Kit",
        tagline = "Development Kit for Robotics",
        imageRes = R.drawable.microcontroller_kit,
        price = 399
    ),
    Robot(
        id = Random.nextLong(),
        name = "Stepper Motor",
        tagline = "Step Precision Motor",
        imageRes = R.drawable.stepper_motor,
        price = 199
    ),
    Robot(
        id = Random.nextLong(),
        name = "Ultrasonic Sensor",
        tagline = "Proximity Sensor",
        imageRes = R.drawable.ultrasonic_sensor,
        price = 149
    ),
    Robot(
        id = Random.nextLong(),
        name = "PCB Board",
        tagline = "Printed Circuit Board",
        imageRes = R.drawable.pcb_board,
        price = 99
    ),
    Robot(
        id = Random.nextLong(),
        name = "Voltage Regulator",
        tagline = "Stabilize Power Supply",
        imageRes = R.drawable.voltage_regulator,
        price = 79
    ),
    Robot(
        id = Random.nextLong(),
        name = "Battery Pack",
        tagline = "Rechargeable Power Source",
        imageRes = R.drawable.battery_pack,
        price = 199
    ),
    Robot(
        id = Random.nextLong(),
        name = "ESP32",
        tagline = "IoT Module",
        imageRes = R.drawable.esp32,
        price = 299
    ),
    Robot(
        id = Random.nextLong(),
        name = "Arduino Uno",
        tagline = "Open-Source Microcontroller",
        imageRes = R.drawable.arduinouno,
        price = 299
    ),
    Robot(
        id = Random.nextLong(),
        name = "Servo Controller",
        tagline = "Motor Control Unit",
        imageRes = R.drawable.servo_controller,
        price = 149
    ),
    Robot(
        id = Random.nextLong(),
        name = "IMU Sensor",
        tagline = "Inertial Measurement Unit",
        imageRes = R.drawable.imu_sensor,
        price = 199
    ),
    Robot(
        id = Random.nextLong(),
        name = "Gyroscope",
        tagline = "Angular Motion Sensor",
        imageRes = R.drawable.gyroscope,
        price = 249
    ),
    Robot(
        id = Random.nextLong(),
        name = "Robotic Arm",
        tagline = "Programmable Arm",
        imageRes = R.drawable.robotic_arm,
        price = 999
    ),
    Robot(
        id = Random.nextLong(),
        name = "Camera Module",
        tagline = "High-Resolution Camera",
        imageRes = R.drawable.camera_module,
        price = 299
    ),
    Robot(
        id = Random.nextLong(),
        name = "LED Matrix",
        tagline = "Programmable LED Display",
        imageRes = R.drawable.led_matrix,
        price = 199
    ),
    Robot(
        id = Random.nextLong(),
        name = "Heat Sink",
        tagline = "Cooling Component",
        imageRes = R.drawable.heat_sink,
        price = 99
    ),
    Robot(
        id = Random.nextLong(),
        name = "DC Motor",
        tagline = "Direct Current Motor",
        imageRes = R.drawable.dc_motor,
        price = 149
    ),
    Robot(
        id = Random.nextLong(),
        name = "Control Board",
        tagline = "Central Control System",
        imageRes = R.drawable.control_board,
        price = 599
    ),
    Robot(
        id = Random.nextLong(),
        name = "Torque Sensor",
        tagline = "Measure Force and Rotation",
        imageRes = R.drawable.torque_sensor,
        price = 349
    ),
    Robot(
        id = Random.nextLong(),
        name = "Robot Wheels",
        tagline = "Wheels for Movement",
        imageRes = R.drawable.robot_wheels,
        price = 249
    ),
    Robot(
        id = Random.nextLong(),
        name = "Power Module",
        tagline = "Power Management System",
        imageRes = R.drawable.power_module,
        price = 499
    )
)
