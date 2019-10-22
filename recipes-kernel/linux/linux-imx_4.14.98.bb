# Copyright 2013-2016 (C) Freescale Semiconductor
# Copyright 2017-2019 (C) NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by NXP"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.14.98_2.0.0_ga"
LOCALVERSION = "-imx"
SRCREV = "1175b59611537b0b451e0d1071b1666873a8ec32"
SRC_URI += "file://0001-compiler-attributes-add-support-for-copy-gcc-9.patch \
            file://0002-include-linux-module.h-copy-init-exit-attrs-to-.patch \
            file://0001-staging-android-ion-Support-cpu-access-during-dma_bu.patch \
            file://0002-staging-android-ion-fix-sys-heap-pool-s-gfp_flags.patch \
            file://0003-MA-12602-Add-ION-carveout-heap-support-on-4.14-kerne.patch \
            file://0004-MA-12602-2-Add-ION-carveout-heap-support-on-4.14-ker.patch \
            file://0005-MA-12602-3-Add-ION-carveout-heap-support-on-4.14-ker.patch \
            file://0006-MA-12122-Enlarge-ION-carveout-memory-address-alignme.patch \
            file://0007-MA-12702-Add-vmap-and-vunmap-to-ION-driver.patch \
            file://0008-uapi-Add-ion.h-to-userspace.patch \
            file://0009-ion-unmapped-heap-for-secure-data-path.patch \
            file://0010-staging-ion-ARM64-supports-ION_UNMAPPED_HEAP.patch \
            file://0011-staging-ion-add-a-no-map-property-to-ion-dmabuf-atta.patch \
            file://0012-staging-android-ion-do-not-clear-dma_address-of-unma.patch \
            file://0013-MMIOT-157-Secure-Data-Path-update-ion-buffer-definit.patch \
            file://0014-MMIOT-157-Ion-unmapped-reservedmem-instantiantion.patch \
            file://0015-MMIOT-157-Ion-support-multiple-unmapped-ion-heap.patch \
            file://0016-MMIOT-152-imx8mm-drm-device-tree.patch \
            file://0017-MMIOT-152-imx8mm-update-SDP-physical-memory-space.patch \
            file://0018-MMIOT-152-imx8mm-RDC-configuration-update.patch \
            file://0019-MMIOT-30-MA-13967-1-Add-secure_ion.h.patch \
            file://0020-MMIOT-152-Update-Secure-Data-Path-physical-address.patch \
            file://0021-MMIOT-153-Enable-ION-unmapped-heap-support-on-4.14-k.patch \
           "

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
