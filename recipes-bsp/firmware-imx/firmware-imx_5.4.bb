# Copyright (C) 2012-2016 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=8cf95184c220e247b9917e7244124c5a"

SRC_URI[md5sum] = "dae846ca2fc4504067f725f501491adf"
SRC_URI[sha256sum] = "c5bd4bff48cce9715a5d6d2c190ff3cd2262c7196f7facb9b0eda231c92cc223"

#BRCM firmware git
SRCREV = "6beb28fb947f9c6fcf7fa46c708a3e1d05370955"

COMPATIBLE_MACHINE = "(mx5|mx6|mx6ul|mx7)"
