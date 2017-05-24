# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP i.MX6 Linux kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on Freescale 3.14.52-1.1.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX6 based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

include linux-fslc.inc

PV .= "+git${SRCPV}"

SRC_URI += "file://0001-Enable-support-for-AR6003-firmware-hw2.1.1-3.4.patch \
            file://0002-Fix-crash-issue-during-WiFi-P2P-scan.patch \
            file://0003-ALSA-usb-audio-Fix-irq-process-data-synchronization.patch \
            file://0004-Revert-usb-hub-do-not-clear-BOS-field-during-reset-d.patch"

SRCBRANCH = "3.14-1.1.x-imx"
SRCREV = "327d5c9063b715c91a88655533d5e477a0afe218"

COMPATIBLE_MACHINE = "(mx6|mx7)"
