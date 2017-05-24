# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP i.MX Linux kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on NXP 4.1.15-1.2.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

include linux-fslc.inc

PV .= "+git${SRCPV}"

SRCBRANCH = "4.1-1.0.x-imx"
SRCREV = "59b38c323bd9f4cc9661bde977ebb92a8c141244"

SRC_URI += "file://0001-Add-max7310-reset-support-for-imx6qdl-sabreauto.patch \
            file://0002-Enable-support-for-AR6003-firmware-hw2.1.1-3.4.patch \
            file://0003-Enable-ar6k_clock-module-parameter.patch \
            file://0004-Fix-crash-issue-during-WiFi-P2P-scan.patch \
            file://0005-ALSA-usb-audio-Fix-irq-process-data-synchronization.patch"

COMPATIBLE_MACHINE = "(mx6|mx7)"
